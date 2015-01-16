package jpa;

import java.util.ArrayList;
import java.util.List;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.persistence.EntityTransaction;
//import jpa.*;
//import ashu.sqlconnection.MySqlConnectionSetup;

import javax.persistence.EntityManagerFactory;
//import oracle.toplink.essentials.ejb.cmp3.EntityManager;
/**
 * Session Bean implementation class Students_Records_EJB
 */

@Stateless
//@EJB(mappedName="Students_Records_EJB")

public class Students_Records_EJB implements Students_Records_EJBRemote{

    /**
     * Default constructor. 
     */
	 protected EntityManagerFactory emf;
	 // @PersistenceContext(unitName="Students_Records_EJB")
	   EntityManager em;
	  //See more at: http://middlewaremagic.com/jboss/?tag=toplink#sthash.fn8OB1oF.dpuf'
	  String sql;
    public Students_Records_EJB() {
        // TODO Auto-generated constructor stub
    }
   // protected EntityManagerFactory emf;
    
    public EntityManagerFactory getEMF (){
       if (emf == null){
           emf = Persistence.createEntityManagerFactory("default", new java.util.HashMap());
       }
       return emf;
   }

    
    public String getEchoString(String clientString) {
        return clientString + " - from local session bean";
    }
	
	public   List<StudentSurveyBean> getStudentRecords(StudentSurveyBean searchBean) {
		// TODO Auto-generated method stub
		//inputBean.setFirstName(inputBean.getFirstName()+"Added On Server");
		// 
		Query query = em.createQuery(prepareWildCardSearchString(searchBean));
		String queryString =prepareWildCardSearchString(searchBean);
		System.out.println("Query inside getStudentRecords ::"+queryString);
	      if(searchBean.getFirstName()!=null)
	      {
	    	  String s1="",s2="",s3="",s4="";
	    	  if(searchBean.getFirstName().isEmpty()==false && searchBean.getFirstName()!=null)
	    	  {
	    		  String s=searchBean.getFirstName();
	    		  if(s.indexOf("*") > 0)
	    		  {
	    			  s=  s.replace("*", "");
	    			  query.setParameter("fname", "%" + s.toUpperCase() + "%");
	    		  }
	    		  else
	    		  {
	    			 query.setParameter("fname",s );
	    		  }    		  
	    		  System.out.println("s1 first_name "+s1);
	    	  }
	    	  if(searchBean.getLastName().isEmpty()==false  && searchBean.getLastName()!=null)
	    	  {
	    		  String s=searchBean.getLastName();
	    		  if(s.indexOf("*") > 0)
	    		  {
	    			  s=  s.replace("*", "");
	    			query.setParameter("lname", "%" + s.toUpperCase() + "%");
	    		  }
	    		  else
	    		  {
	    			  query.setParameter("lname", s );
	    		  }
	    		  }
	    		  //System.out.println("s2 lastname "+s2);
	    	  }
	    	  if(searchBean.getCityName().isEmpty()==false && searchBean.getCityName()!=null)
	    	  {
	    		  String s=searchBean.getCityName();
	    		  if(s.indexOf("*") > 0)
	    		  {
	    			  s=  s.replace("*", "");
	    			 query.setParameter("searchcity", "%" + s.toUpperCase() + "%");
	    		  
	    		  }
	    		  else
	    		  {
	    			 query.setParameter("searchcity", s);
	    		  }
	    		  //System.out.println("s3 city "+s3);
	    	  }
	    	  if(searchBean.getStateName().isEmpty()==false && searchBean.getStateName()!=null)
	    	  {
	    		  String s=searchBean.getStateName();
	    		  if(s.indexOf("*") > 0)
	    		  {
	    			  s=  s.replace("*", "");
	    			 query.setParameter("searchState", "%" + s.toUpperCase() + "%");
	    		  }
	    		  else
	    		  {
	    			  query.setParameter("searchState", s);
	    		  }
	    		  //System.out.println("s4 STATE "+s4);
	    	  }
	    	  	  List<StudentSurveyBean> records =query.getResultList();
	    	  	  return records;
		//return MySqlConnectionSetup.getStudentSurveyRecords(searchBean);
		//return inputBean;
	}
	private String prepareWildCardSearchString(StudentSurveyBean searchBean)
	{
		
	      sql = "SELECT i FROM Student_Survey_Bean i";
	      if(searchBean.getFirstName()==null)
	      {
	    	  System.out.println("Inside Test statement...");
	    		  
	      }
	      else
	      {
	      String whereCluase="";
	      if(searchBean !=null)
	      {
	    	  String s1="",s2="",s3="",s4="";
	    	  if(searchBean.getFirstName().isEmpty()==false && searchBean.getFirstName()!=null)
	    	  {
	    		  String s=searchBean.getFirstName();
	    		  if(s.indexOf("*") > 0)
	    		  {
	    			  s=  s.replace("*", "");
	    			  s1="  UPPER(i.firstName) LIKE :fname ";//+s+"%' ";
	    			  //query.setParameter("fname", "%" + s.toUpperCase() + "%");
	    		  }
	    		  else
	    		  {
	    			  s1="    i.firstName=:fname ";
	    		      //query.setParameter("fname", searchBean.getFirstName() );
	    		  }    		  
	    		  System.out.println("s1 first_name "+s1);
	    	  }
	    	  if(searchBean.getLastName().isEmpty()==false  && searchBean.getLastName()!=null)
	    	  {
	    		  String s=searchBean.getLastName();
	    		  if(s.indexOf("*") > 0)
	    		  {
	    			  s=  s.replace("*", "");
	    		     //s2="   last_name     LIKE '"+s+"%' ";
	    		     s2="  UPPER(i.lastName) LIKE :lname ";//+s+"%' ";
	    			 //query.setParameter("lname", "%" + s.toUpperCase() + "%");
	    		  }
	    		  else
	    		  {
	    			 //s2=" last_name ='"+s+"'";
	    			 s2="    i.lastName=:lname ";
	    		      //query.setParameter("lname", s );
	    		  }
	    		  System.out.println("s2 lastname "+s2);
	    	  }
	    	  if(searchBean.getCityName().isEmpty()==false && searchBean.getCityName()!=null)
	    	  {
	    		  String s=searchBean.getCityName();
	    		  if(s.indexOf("*") > 0)
	    		  {
	    			  s=  s.replace("*", "");
	    		 // s3="   city     LIKE '"+s+"%' ";
	    		     s3="  UPPER(i.cityName) LIKE :searchcity ";//+s+"%' ";
	    			 //query.setParameter("searchcity", "%" + s.toUpperCase() + "%");
	    		  
	    		  }
	    		  else
	    		  {
	    			  //s3="  city ='"+s+"'";
	    			  s3="    i.cityName=:searchcity ";
	    		      //query.setParameter("searchcity", s);
	    		  }
	    		  System.out.println("s3 city "+s3);
	    	  }
	    	  if(searchBean.getStateName().isEmpty()==false && searchBean.getStateName()!=null)
	    	  {
	    		  String s=searchBean.getStateName();
	    		  if(s.indexOf("*") > 0)
	    		  {
	    			  s=  s.replace("*", "");
	    		    // s4="   STATE     LIKE '"+s+"%' ";
	    		     s4="  UPPER(i.stateName) LIKE :searchState ";//+s+"%' ";
	    			 //query.setParameter("searchState", "%" + s.toUpperCase() + "%");
	    		  }
	    		  else
	    		  {
	    			  //s4="  STATE ='"+s+"'";

	    			  s4="    i.stateName=:searchState ";
	    		      //query.setParameter("searchState", s);
	    		  }
	    		  System.out.println("s4 STATE "+s4);
	    	  }
	    	  if(s1.isEmpty()==false)
	    	  {
	    		  whereCluase=" where " +s1;
	    		  if(s2.isEmpty()==false)
	    			  whereCluase= whereCluase +" and  " +s2;
	    		  if(s3.isEmpty()==false)
	    			  whereCluase= whereCluase+" and  " +s3;
	    		  if(s4.isEmpty()==false)
	    			  whereCluase=whereCluase+ " and  " +s4;
	    		  System.out.println(" if(s1!= "+whereCluase);
	    	  }
	    	  else if (s2.isEmpty()==false)
	    	  {
	    		  
	    		  whereCluase=" where " +s2;
	    		 
	    		  if(s3.isEmpty()==false)
	    			  whereCluase= whereCluase + " and  " +s3;
	    		  if(s4.isEmpty()==false)
	    			  whereCluase= whereCluase +  " and  " +s4;
	    		  System.out.println("else if (s2 "+whereCluase);
	    	  }
	    	  else if (s3.isEmpty()==false)
	    	  {
	    		  
	    		  whereCluase=" where " +s3;
	    		 
	    		  if(s4.isEmpty()==false)
	    			  whereCluase= whereCluase +  " and  " +s4;
	    		  System.out.println( "else if (s3! "+whereCluase);
	    	  }
	    	  else if(s4.isEmpty()==false)
	    	  {
  			  whereCluase= " where  " +s4;
  			  System.out.println( " else if(s4! "+whereCluase);
	    	  }
	    	  
	      }
	      sql=sql+whereCluase;
	      System.out.println("Testing :"+sql);
	      }
	      
	      return sql;
	}
	public StudentSurveyBean findStudent_Survey_Bean(Integer id) {
		    System.out.println("\n\t Inside findEmployee("+id+")");
		    return em.find(StudentSurveyBean.class, id);
	 }
		
	
	public void removeStudentRecord(StudentSurveyBean inputBean) 
	{
		
		StudentSurveyBean record = findStudent_Survey_Bean(inputBean.getSurvey_id());
	    if (record != null) {
	       try{
		            em.getTransaction().begin();
		            em.remove(record);
		            em.getTransaction().commit();
		          }
		       catch(Exception e)
		          {
		             e.printStackTrace();
	             
				 }
				 }
		
	}
	public void saveStudentRecord(StudentSurveyBean inputBean) 
	{
		
		 System.out.println("Calling JPA for save student bean ");
	     em.getTransaction().begin();
         em.persist(inputBean);
         em.getTransaction().commit();
         System.out.println("All Saved...");
		
	}

	
	public void savePerson(Person person1) {
		
		System.out.println("Calling JPA ");
		   
	     em.getTransaction().begin();
        Person person = new Person();
        person.setId(30);
        person.setFirstName("Sachin Tendulkar");
        em.persist(person);
        em.getTransaction().commit();
        System.out.println("All Saved...");
		
		
	}

}

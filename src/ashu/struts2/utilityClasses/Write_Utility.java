

package ashu.struts2.utilityClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.io.PrintWriter;
import java.io.FileWriter;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
//my imports
import ashu.struts2.model.*;
import jpa.*;
//import ashu.beans.Student_Survey_Bean;
//import ashu.beans.Students_Records_EJB;
//import ashu.beans.Students_Records_EJBRemote;

public class Write_Utility {
	
	private static  Context context =null;
	private static String name ="";
	public static Context getInitialContext() throws NamingException
	{
    	   System.out.println("Lookup started: " );
    	   final Hashtable jndiProps = new Hashtable();
    	 jndiProps.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
    	   //jndiProperties.put("jboss.naming.client.ejb.context", true);	
    	   //jndiProps.put(Context.INITIAL_CONTEXT_FACTORY,"org.jnp.interfaces.NamingContextFactory");
    	//	jndiProps.put(Context.PROVIDER_URL, "remote://localhost:1099");
    		//jndiProps.put(Context.URL_PKG_PREFIXES,  "org.jboss.naming.org.jnp.interfaces");
           //jndiProps.put("java.naming.factory.initial", "org.jboss.naming.remote.client.InitialContextFactory");
          //// jndiProps.put(InitialContext.PROVIDER_URL, "remote://localhost:4447");
           //jndiProps.put("jboss.naming.client.ejb.context", true);
    	   // needed for remote access - remember to run add-user.bat
    	   //jndiProps.put(Context.SECURITY_PRINCIPAL, "user123");
    	   //jndiProps.put(Context.SECURITY_CREDENTIALS, "12345");
         	//jndiProps.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
    	    context   = new InitialContext(jndiProps);
    	   //InitialContext context=new InitialContext();
    	    System.out.println("Context  Initialized: " );
    	   String appName = "HW5_JPA_EAR";    		 
    	        /* The module name is the JAR name of the deployed EJB 
    	        without the .jar suffix.
    	        */
    	    String moduleName = "JPA_Persistance";
    	       /*AS7 allows each deployment to have an (optional) distinct name. 
    	       This can be an empty string if distinct name is not specified.
    	       */
    	    String distinctName = "";
    	      // The EJB bean implementation class name
    	    String beanName = Students_Records_EJB.class.getSimpleName();
    	      // Fully qualified remote interface name
    	    final String interfaceName = Students_Records_EJBRemote.class.getName();
    	      // Create a look up string name
    	    name = "ejb:" + appName + "/" + moduleName + "/" +  distinctName    + "/" + beanName + "!" + interfaceName;
    	    System.out.println("name :  "+name);
    	    return context;    	        
		
	}
	
	public void deleteStudentSurvey(jpa.StudentSurveyBean record) throws IOException,NamingException
	{
		getInitialContext();
		System.out.println("Calling delete with : " + record.getSurvey_id());
		Students_Records_EJBRemote bean =(Students_Records_EJBRemote)context.lookup(name);
		bean.removeStudentRecord(record);
		
	}
	public void saveStudentSurvey(jpa.StudentSurveyBean record) throws IOException,NamingException
	{
		getInitialContext();
		Students_Records_EJBRemote bean =(Students_Records_EJBRemote)context.lookup(name);
		bean.saveStudentRecord(record);
		
	}
	// get the mean
	public int  getMean(int [] data)
    {
        int sum = 0;
        for(double a : data)
            sum += a;
        return sum/data.length;
    }
	double getVariance(int [] data)
    {
        double mean = getMean( data);
        double temp = 0;
        for(double a :data)
            temp += (mean-a)*(mean-a);
        return temp/data.length;
    }
	//get StdDev
	public double getStdDev(int [] data)
    {
        return Math.sqrt(getVariance(data));
    }
	//read a file for student surveys
	public List<jpa.StudentSurveyBean>   getStudentSurveys(jpa.StudentSurveyBean record) throws IOException,NamingException
	{
	    getInitialContext();
	    System.out.println("getFirstName:"+record.getFirstName());
		System.out.println("getLastName :"+record.getLastName());
		System.out.println("getStateName:"+record.getStateName());
		System.out.println("getCityName:"+record.getCityName());
		// created string to  send for search method  ...
		
		String searcString =record.getFirstName()+"/"+record.getLastName()+"/"+record.getCityName()+"/"+record.getStateName();
	    List<StudentSurveyBean> studentRecordList=new  ArrayList<StudentSurveyBean> ();
		Students_Records_EJBRemote bean =(Students_Records_EJBRemote)context.lookup(name);
      	//Students_Records_EJBRemote bean = doLookup();
    	       // Student_Survey_Bean test=new Student_Survey_Bean();
    	       // test.setFirstName("Sent From Server ::");
		Survey_Web_ServiceProxy webServiceProxy = new Survey_Web_ServiceProxy();
		System.out.println("Before calling web method in write utility");
		try
		{
		StudentSurveyBean[] objectArray=webServiceProxy.getStudentRecords(searcString);
		for(StudentSurveyBean s:objectArray)
		{
			studentRecordList.add(s);
		}
		}
		catch(Exception exe)
		{
			
		}
		 studentRecordList=  bean.getStudentRecords(record);

		    return studentRecordList;
		
	}

}

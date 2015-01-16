package ashu.struts2.action;

//Java Imports
import java.io.FileWriter;
//import ashu.beans;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
//import javax.servlet.http.HttpServletRequest;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.*;
import org.apache.struts2.interceptor.validation.SkipValidation;
//Srtuts 2 imports
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

//import ashu.beans.Student_Survey_Bean;
//import ashu.beans.Students_Records_EJB;
import jpa.*;//beans.Students_Records_EJBRemote;
//import ashu.beans.Student_Survey_Bean;
//My Imports
//import ashu.struts2.model.*;
import ashu.struts2.utilityClasses.*;

public class Student_Survey_Action extends ActionSupport implements ModelDriven, ServletRequestAware 
{
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/test";
	   private javax.servlet.http.HttpServletRequest request;
	   public HttpServletRequest getServletRequest() {
		return request;
	}
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	//  Database credentials
	   static final String USER = "root";
	   static final String PASS = "1234";
	private String name ="";
private static final long serialVersionUID = 1L;
private List<jpa.StudentSurveyBean> students = new ArrayList<jpa.StudentSurveyBean>();
Write_Utility utility=new Write_Utility();
jpa.StudentSurveyBean record=new jpa.StudentSurveyBean();
//Winning_Result_Model winningResult=new Winning_Result_Model();
//Model driven architecture
private int survey_id;

public int getSurvey_id() {
	return survey_id;
}
public void setSurvey_id(int survey_id) {
	this.survey_id = survey_id;
}
public int getId() {
	return survey_id;
}
public void setId(int id) {
	//this.id = survey_id;
}
public jpa.StudentSurveyBean getRecord()
{
	   return record;
}
public void setRecord(jpa.StudentSurveyBean inputRecord)
{
	   this.record=inputRecord;
}
// skips this method from validation
@SkipValidation
public String execute() throws Exception 
{	  

    return "success";
}
@SkipValidation
public String deleteRecord() throws Exception 
{	   
	
	String param = getServletRequest().getParameter("survey_id");//ServletActionContext.getRequest().getParameter("paramName");
	System.out.println("Calling delete with : " + param);
	int foo = Integer.parseInt(param);
	 if(foo>0)
	 {
		 System.out.println("Inside the if loop : " + param);
		record =new StudentSurveyBean();
		record.setSurvey_id(foo);
		
	      utility.deleteStudentSurvey(record);       
	    
	 }
	 fetchStudentList();
	  return "success";
         
}
//Get the success page if student info saved successfully
public String getSuccessPage() throws Exception 
{	  
	
	  if(record.getFirstName()!="")
        {
	    utility.saveStudentSurvey(record);  
	     
	     
	     		   
        }
      
	  return "success";
         
}
@SkipValidation
public String getSearchform() throws Exception 
{
    //utility.saveStudentSurvey(record);
   //students=utility.getStudentSurveys(record);
   System.out.println("getSearchform!");
 	return "success";
}
@SkipValidation
public String fetchStudentList() throws Exception 
	{
	    //utility.saveStudentSurvey(record);
	System.out.println("getFirstName:"+record.getFirstName());
	System.out.println("getLastName :"+record.getLastName());
	System.out.println("getStateName:"+record.getStateName());
	System.out.println("getCityName:"+record.getCityName());
	   students=utility.getStudentSurveys(record);
	    System.out.println("Goodbye!");
     	return SUCCESS;
	}
    public List<jpa.StudentSurveyBean> getStudents() 
    {
	return students;
    }

public void setStudents(List<jpa.StudentSurveyBean> students) 
{
	this.students = students;
}

public Object getModel() {
	// TODO Auto-generated method stub
	return record;
}
//validation function

public void validate(){
			if(record!=null)
			{
			
		    if ( record.getFirstName().length() == 0 ){ 
		 
		        addFieldError( "firstName", "First name is required." );
		         
		    }
		     		             
		    if ( record.getLastName().length() == 0 ){ 
		 
		        addFieldError( "lastName", "Last Name is required." );
		         
		    }
		    if ( record.getZipCode().length() == 0 )
		    { 
				 
		      addFieldError( "zipCode", "Please enter the Zip Code." );
		    }
		  
		    if ( record.getCityName().length() == 0 ){ 
		 
		        addFieldError( "cityName", "City Name cannot be empty" );
		         
		    }//cityName,zipCode,streeAddress
		     
		    if ( record.getStateName().length()==0 ){ 
		 
		        addFieldError( "stateName", "State Name is required" );
		         
		    }
		}
		     
     
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}

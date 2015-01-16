package jpa;

import java.util.List;
import java.util.ArrayList;

import javax.ejb.Remote;



@Remote
public interface Students_Records_EJBRemote {
	
	   public   List<StudentSurveyBean> getStudentRecords(StudentSurveyBean inputBean);
	   public void saveStudentRecord(StudentSurveyBean inputBean);
	   public String getEchoString(String clientString);
	   public void removeStudentRecord(StudentSurveyBean inputBean) ;
		
	   public void  savePerson(Person person);
}

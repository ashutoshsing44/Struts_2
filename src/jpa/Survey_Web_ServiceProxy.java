package jpa;

public class Survey_Web_ServiceProxy implements jpa.Survey_Web_Service {
  private String _endpoint = null;
  private jpa.Survey_Web_Service survey_Web_Service = null;
  
  public Survey_Web_ServiceProxy() {
    _initSurvey_Web_ServiceProxy();
  }
  
  public Survey_Web_ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSurvey_Web_ServiceProxy();
  }
  
  private void _initSurvey_Web_ServiceProxy() {
    try {
      survey_Web_Service = (new jpa.Survey_Web_ServiceServiceLocator()).getSurvey_Web_ServicePort();
      if (survey_Web_Service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)survey_Web_Service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)survey_Web_Service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (survey_Web_Service != null)
      ((javax.xml.rpc.Stub)survey_Web_Service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public jpa.Survey_Web_Service getSurvey_Web_Service() {
    if (survey_Web_Service == null)
      _initSurvey_Web_ServiceProxy();
    return survey_Web_Service;
  }
  
  public jpa.StudentSurveyBean[] getStudentRecords(java.lang.String arg0) throws java.rmi.RemoteException{
    if (survey_Web_Service == null)
      _initSurvey_Web_ServiceProxy();
    return survey_Web_Service.getStudentRecords(arg0);
  }
  
  
}
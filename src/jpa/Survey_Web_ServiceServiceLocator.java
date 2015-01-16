/**
 * Survey_Web_ServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jpa;

public class Survey_Web_ServiceServiceLocator extends org.apache.axis.client.Service implements jpa.Survey_Web_ServiceService {

    public Survey_Web_ServiceServiceLocator() {
    }


    public Survey_Web_ServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Survey_Web_ServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Survey_Web_ServicePort
    private java.lang.String Survey_Web_ServicePort_address = "http://localhost:8080/JPA_Persistance/Survey_Web_Service";

    public java.lang.String getSurvey_Web_ServicePortAddress() {
        return Survey_Web_ServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Survey_Web_ServicePortWSDDServiceName = "Survey_Web_ServicePort";

    public java.lang.String getSurvey_Web_ServicePortWSDDServiceName() {
        return Survey_Web_ServicePortWSDDServiceName;
    }

    public void setSurvey_Web_ServicePortWSDDServiceName(java.lang.String name) {
        Survey_Web_ServicePortWSDDServiceName = name;
    }

    public jpa.Survey_Web_Service getSurvey_Web_ServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Survey_Web_ServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSurvey_Web_ServicePort(endpoint);
    }

    public jpa.Survey_Web_Service getSurvey_Web_ServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            jpa.Survey_Web_ServiceServiceSoapBindingStub _stub = new jpa.Survey_Web_ServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSurvey_Web_ServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSurvey_Web_ServicePortEndpointAddress(java.lang.String address) {
        Survey_Web_ServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (jpa.Survey_Web_Service.class.isAssignableFrom(serviceEndpointInterface)) {
                jpa.Survey_Web_ServiceServiceSoapBindingStub _stub = new jpa.Survey_Web_ServiceServiceSoapBindingStub(new java.net.URL(Survey_Web_ServicePort_address), this);
                _stub.setPortName(getSurvey_Web_ServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Survey_Web_ServicePort".equals(inputPortName)) {
            return getSurvey_Web_ServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jpa/", "Survey_Web_ServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jpa/", "Survey_Web_ServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Survey_Web_ServicePort".equals(portName)) {
            setSurvey_Web_ServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

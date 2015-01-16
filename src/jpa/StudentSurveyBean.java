/**
 * StudentSurveyBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jpa;

public class StudentSurveyBean  implements java.io.Serializable {
    private java.lang.String cityName;

    private java.lang.String description;

    private java.lang.String email_id;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String plusPoint;

    private java.lang.String recommend;

    private java.lang.String stateName;

    private int survey_id;

    private java.lang.String telephoneNumber;

    private java.lang.String zipCode;

    public StudentSurveyBean() {
    }

    public StudentSurveyBean(
           java.lang.String cityName,
           java.lang.String description,
           java.lang.String email_id,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String plusPoint,
           java.lang.String recommend,
           java.lang.String stateName,
           int survey_id,
           java.lang.String telephoneNumber,
           java.lang.String zipCode) {
           this.cityName = cityName;
           this.description = description;
           this.email_id = email_id;
           this.firstName = firstName;
           this.lastName = lastName;
           this.plusPoint = plusPoint;
           this.recommend = recommend;
           this.stateName = stateName;
           this.survey_id = survey_id;
           this.telephoneNumber = telephoneNumber;
           this.zipCode = zipCode;
    }


    /**
     * Gets the cityName value for this StudentSurveyBean.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this StudentSurveyBean.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the description value for this StudentSurveyBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this StudentSurveyBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the email_id value for this StudentSurveyBean.
     * 
     * @return email_id
     */
    public java.lang.String getEmail_id() {
        return email_id;
    }


    /**
     * Sets the email_id value for this StudentSurveyBean.
     * 
     * @param email_id
     */
    public void setEmail_id(java.lang.String email_id) {
        this.email_id = email_id;
    }


    /**
     * Gets the firstName value for this StudentSurveyBean.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this StudentSurveyBean.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this StudentSurveyBean.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this StudentSurveyBean.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the plusPoint value for this StudentSurveyBean.
     * 
     * @return plusPoint
     */
    public java.lang.String getPlusPoint() {
        return plusPoint;
    }


    /**
     * Sets the plusPoint value for this StudentSurveyBean.
     * 
     * @param plusPoint
     */
    public void setPlusPoint(java.lang.String plusPoint) {
        this.plusPoint = plusPoint;
    }


    /**
     * Gets the recommend value for this StudentSurveyBean.
     * 
     * @return recommend
     */
    public java.lang.String getRecommend() {
        return recommend;
    }


    /**
     * Sets the recommend value for this StudentSurveyBean.
     * 
     * @param recommend
     */
    public void setRecommend(java.lang.String recommend) {
        this.recommend = recommend;
    }


    /**
     * Gets the stateName value for this StudentSurveyBean.
     * 
     * @return stateName
     */
    public java.lang.String getStateName() {
        return stateName;
    }


    /**
     * Sets the stateName value for this StudentSurveyBean.
     * 
     * @param stateName
     */
    public void setStateName(java.lang.String stateName) {
        this.stateName = stateName;
    }


    /**
     * Gets the survey_id value for this StudentSurveyBean.
     * 
     * @return survey_id
     */
    public int getSurvey_id() {
        return survey_id;
    }


    /**
     * Sets the survey_id value for this StudentSurveyBean.
     * 
     * @param survey_id
     */
    public void setSurvey_id(int survey_id) {
        this.survey_id = survey_id;
    }


    /**
     * Gets the telephoneNumber value for this StudentSurveyBean.
     * 
     * @return telephoneNumber
     */
    public java.lang.String getTelephoneNumber() {
        return telephoneNumber;
    }


    /**
     * Sets the telephoneNumber value for this StudentSurveyBean.
     * 
     * @param telephoneNumber
     */
    public void setTelephoneNumber(java.lang.String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    /**
     * Gets the zipCode value for this StudentSurveyBean.
     * 
     * @return zipCode
     */
    public java.lang.String getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this StudentSurveyBean.
     * 
     * @param zipCode
     */
    public void setZipCode(java.lang.String zipCode) {
        this.zipCode = zipCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudentSurveyBean)) return false;
        StudentSurveyBean other = (StudentSurveyBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.email_id==null && other.getEmail_id()==null) || 
             (this.email_id!=null &&
              this.email_id.equals(other.getEmail_id()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.plusPoint==null && other.getPlusPoint()==null) || 
             (this.plusPoint!=null &&
              this.plusPoint.equals(other.getPlusPoint()))) &&
            ((this.recommend==null && other.getRecommend()==null) || 
             (this.recommend!=null &&
              this.recommend.equals(other.getRecommend()))) &&
            ((this.stateName==null && other.getStateName()==null) || 
             (this.stateName!=null &&
              this.stateName.equals(other.getStateName()))) &&
            this.survey_id == other.getSurvey_id() &&
            ((this.telephoneNumber==null && other.getTelephoneNumber()==null) || 
             (this.telephoneNumber!=null &&
              this.telephoneNumber.equals(other.getTelephoneNumber()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmail_id() != null) {
            _hashCode += getEmail_id().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getPlusPoint() != null) {
            _hashCode += getPlusPoint().hashCode();
        }
        if (getRecommend() != null) {
            _hashCode += getRecommend().hashCode();
        }
        if (getStateName() != null) {
            _hashCode += getStateName().hashCode();
        }
        _hashCode += getSurvey_id();
        if (getTelephoneNumber() != null) {
            _hashCode += getTelephoneNumber().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudentSurveyBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jpa/", "studentSurveyBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plusPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plusPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommend");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recommend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("survey_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "survey_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telephoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

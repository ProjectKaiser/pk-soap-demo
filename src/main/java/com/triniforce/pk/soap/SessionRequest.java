/**
 * SessionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class SessionRequest  extends com.triniforce.pk.soap.BasicRequest  implements java.io.Serializable {
    private com.triniforce.pk.soap.AuthScheme scheme;

    public SessionRequest() {
    }

    public SessionRequest(
           com.triniforce.pk.soap.MapEntryObjectByString[] headers,
           com.triniforce.pk.soap.AuthScheme scheme) {
        super(
            headers);
        this.scheme = scheme;
    }


    /**
     * Gets the scheme value for this SessionRequest.
     * 
     * @return scheme
     */
    public com.triniforce.pk.soap.AuthScheme getScheme() {
        return scheme;
    }


    /**
     * Sets the scheme value for this SessionRequest.
     * 
     * @param scheme
     */
    public void setScheme(com.triniforce.pk.soap.AuthScheme scheme) {
        this.scheme = scheme;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SessionRequest)) return false;
        SessionRequest other = (SessionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.scheme==null && other.getScheme()==null) || 
             (this.scheme!=null &&
              this.scheme.equals(other.getScheme())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getScheme() != null) {
            _hashCode += getScheme().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SessionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "SessionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheme");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "scheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "AuthScheme"));
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

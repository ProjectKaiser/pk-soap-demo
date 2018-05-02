/**
 * BasicResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class BasicResponse  implements java.io.Serializable {
    private com.triniforce.pk.soap.MapEntryObjectByString[] headers;

    private int sourceStatus;

    public BasicResponse() {
    }

    public BasicResponse(
           com.triniforce.pk.soap.MapEntryObjectByString[] headers,
           int sourceStatus) {
           this.headers = headers;
           this.sourceStatus = sourceStatus;
    }


    /**
     * Gets the headers value for this BasicResponse.
     * 
     * @return headers
     */
    public com.triniforce.pk.soap.MapEntryObjectByString[] getHeaders() {
        return headers;
    }


    /**
     * Sets the headers value for this BasicResponse.
     * 
     * @param headers
     */
    public void setHeaders(com.triniforce.pk.soap.MapEntryObjectByString[] headers) {
        this.headers = headers;
    }


    /**
     * Gets the sourceStatus value for this BasicResponse.
     * 
     * @return sourceStatus
     */
    public int getSourceStatus() {
        return sourceStatus;
    }


    /**
     * Sets the sourceStatus value for this BasicResponse.
     * 
     * @param sourceStatus
     */
    public void setSourceStatus(int sourceStatus) {
        this.sourceStatus = sourceStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BasicResponse)) return false;
        BasicResponse other = (BasicResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.headers==null && other.getHeaders()==null) || 
             (this.headers!=null &&
              java.util.Arrays.equals(this.headers, other.getHeaders()))) &&
            this.sourceStatus == other.getSourceStatus();
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
        if (getHeaders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHeaders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHeaders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSourceStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BasicResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "BasicResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "headers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "MapEntryObjectByString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "sourceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

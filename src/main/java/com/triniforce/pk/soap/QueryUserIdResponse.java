/**
 * QueryUserIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class QueryUserIdResponse  implements java.io.Serializable {
    private java.lang.Long queryUserIdResult;

    public QueryUserIdResponse() {
    }

    public QueryUserIdResponse(
           java.lang.Long queryUserIdResult) {
           this.queryUserIdResult = queryUserIdResult;
    }


    /**
     * Gets the queryUserIdResult value for this QueryUserIdResponse.
     * 
     * @return queryUserIdResult
     */
    public java.lang.Long getQueryUserIdResult() {
        return queryUserIdResult;
    }


    /**
     * Sets the queryUserIdResult value for this QueryUserIdResponse.
     * 
     * @param queryUserIdResult
     */
    public void setQueryUserIdResult(java.lang.Long queryUserIdResult) {
        this.queryUserIdResult = queryUserIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryUserIdResponse)) return false;
        QueryUserIdResponse other = (QueryUserIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryUserIdResult==null && other.getQueryUserIdResult()==null) || 
             (this.queryUserIdResult!=null &&
              this.queryUserIdResult.equals(other.getQueryUserIdResult())));
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
        if (getQueryUserIdResult() != null) {
            _hashCode += getQueryUserIdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryUserIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">queryUserIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryUserIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "queryUserIdResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

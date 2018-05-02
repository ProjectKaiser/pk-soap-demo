/**
 * LongListRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class LongListRequest  extends com.triniforce.pk.soap.SessionRequest  implements java.io.Serializable {
    private java.lang.Object[] args;

    private int startFrom;

    private int limit;

    private com.triniforce.pk.soap.MapEntryObjectByString[] namedParams;

    public LongListRequest() {
    }

    public LongListRequest(
           com.triniforce.pk.soap.MapEntryObjectByString[] headers,
           com.triniforce.pk.soap.AuthScheme scheme,
           java.lang.Object[] args,
           int startFrom,
           int limit,
           com.triniforce.pk.soap.MapEntryObjectByString[] namedParams) {
        super(
            headers,
            scheme);
        this.args = args;
        this.startFrom = startFrom;
        this.limit = limit;
        this.namedParams = namedParams;
    }


    /**
     * Gets the args value for this LongListRequest.
     * 
     * @return args
     */
    public java.lang.Object[] getArgs() {
        return args;
    }


    /**
     * Sets the args value for this LongListRequest.
     * 
     * @param args
     */
    public void setArgs(java.lang.Object[] args) {
        this.args = args;
    }


    /**
     * Gets the startFrom value for this LongListRequest.
     * 
     * @return startFrom
     */
    public int getStartFrom() {
        return startFrom;
    }


    /**
     * Sets the startFrom value for this LongListRequest.
     * 
     * @param startFrom
     */
    public void setStartFrom(int startFrom) {
        this.startFrom = startFrom;
    }


    /**
     * Gets the limit value for this LongListRequest.
     * 
     * @return limit
     */
    public int getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this LongListRequest.
     * 
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }


    /**
     * Gets the namedParams value for this LongListRequest.
     * 
     * @return namedParams
     */
    public com.triniforce.pk.soap.MapEntryObjectByString[] getNamedParams() {
        return namedParams;
    }


    /**
     * Sets the namedParams value for this LongListRequest.
     * 
     * @param namedParams
     */
    public void setNamedParams(com.triniforce.pk.soap.MapEntryObjectByString[] namedParams) {
        this.namedParams = namedParams;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LongListRequest)) return false;
        LongListRequest other = (LongListRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.args==null && other.getArgs()==null) || 
             (this.args!=null &&
              java.util.Arrays.equals(this.args, other.getArgs()))) &&
            this.startFrom == other.getStartFrom() &&
            this.limit == other.getLimit() &&
            ((this.namedParams==null && other.getNamedParams()==null) || 
             (this.namedParams!=null &&
              java.util.Arrays.equals(this.namedParams, other.getNamedParams())));
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
        if (getArgs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArgs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArgs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getStartFrom();
        _hashCode += getLimit();
        if (getNamedParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNamedParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNamedParams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LongListRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "LongListRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("args");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "args"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "startFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedParams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "namedParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "MapEntryObjectByString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
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

/**
 * LongListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class LongListResponse  extends com.triniforce.pk.soap.BasicResponse  implements java.io.Serializable {
    private java.lang.String[] colNames;

    private java.lang.Object[] values;

    public LongListResponse() {
    }

    public LongListResponse(
           com.triniforce.pk.soap.MapEntryObjectByString[] headers,
           int sourceStatus,
           java.lang.String[] colNames,
           java.lang.Object[] values) {
        super(
            headers,
            sourceStatus);
        this.colNames = colNames;
        this.values = values;
    }


    /**
     * Gets the colNames value for this LongListResponse.
     * 
     * @return colNames
     */
    public java.lang.String[] getColNames() {
        return colNames;
    }


    /**
     * Sets the colNames value for this LongListResponse.
     * 
     * @param colNames
     */
    public void setColNames(java.lang.String[] colNames) {
        this.colNames = colNames;
    }


    /**
     * Gets the values value for this LongListResponse.
     * 
     * @return values
     */
    public java.lang.Object[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this LongListResponse.
     * 
     * @param values
     */
    public void setValues(java.lang.Object[] values) {
        this.values = values;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LongListResponse)) return false;
        LongListResponse other = (LongListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.colNames==null && other.getColNames()==null) || 
             (this.colNames!=null &&
              java.util.Arrays.equals(this.colNames, other.getColNames()))) &&
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getColNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
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
        new org.apache.axis.description.TypeDesc(LongListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "LongListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("colNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "colNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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

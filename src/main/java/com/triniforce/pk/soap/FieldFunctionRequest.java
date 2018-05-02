/**
 * FieldFunctionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class FieldFunctionRequest  implements java.io.Serializable {
    private java.lang.String functionName;

    private java.lang.String fieldName;

    private java.lang.String resultName;

    private com.triniforce.pk.soap.MapEntryObjectByString[] params;

    public FieldFunctionRequest() {
    }

    public FieldFunctionRequest(
           java.lang.String functionName,
           java.lang.String fieldName,
           java.lang.String resultName,
           com.triniforce.pk.soap.MapEntryObjectByString[] params) {
           this.functionName = functionName;
           this.fieldName = fieldName;
           this.resultName = resultName;
           this.params = params;
    }


    /**
     * Gets the functionName value for this FieldFunctionRequest.
     * 
     * @return functionName
     */
    public java.lang.String getFunctionName() {
        return functionName;
    }


    /**
     * Sets the functionName value for this FieldFunctionRequest.
     * 
     * @param functionName
     */
    public void setFunctionName(java.lang.String functionName) {
        this.functionName = functionName;
    }


    /**
     * Gets the fieldName value for this FieldFunctionRequest.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this FieldFunctionRequest.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the resultName value for this FieldFunctionRequest.
     * 
     * @return resultName
     */
    public java.lang.String getResultName() {
        return resultName;
    }


    /**
     * Sets the resultName value for this FieldFunctionRequest.
     * 
     * @param resultName
     */
    public void setResultName(java.lang.String resultName) {
        this.resultName = resultName;
    }


    /**
     * Gets the params value for this FieldFunctionRequest.
     * 
     * @return params
     */
    public com.triniforce.pk.soap.MapEntryObjectByString[] getParams() {
        return params;
    }


    /**
     * Sets the params value for this FieldFunctionRequest.
     * 
     * @param params
     */
    public void setParams(com.triniforce.pk.soap.MapEntryObjectByString[] params) {
        this.params = params;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FieldFunctionRequest)) return false;
        FieldFunctionRequest other = (FieldFunctionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.functionName==null && other.getFunctionName()==null) || 
             (this.functionName!=null &&
              this.functionName.equals(other.getFunctionName()))) &&
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.resultName==null && other.getResultName()==null) || 
             (this.resultName!=null &&
              this.resultName.equals(other.getResultName()))) &&
            ((this.params==null && other.getParams()==null) || 
             (this.params!=null &&
              java.util.Arrays.equals(this.params, other.getParams())));
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
        if (getFunctionName() != null) {
            _hashCode += getFunctionName().hashCode();
        }
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getResultName() != null) {
            _hashCode += getResultName().hashCode();
        }
        if (getParams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParams(), i);
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
        new org.apache.axis.description.TypeDesc(FieldFunctionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "FieldFunctionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "functionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "resultName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("params");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "params"));
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

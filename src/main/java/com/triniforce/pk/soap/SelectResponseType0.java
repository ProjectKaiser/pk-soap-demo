/**
 * SelectResponseType0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class SelectResponseType0  implements java.io.Serializable {
    private com.triniforce.pk.soap.SelectResponse selectResult;

    public SelectResponseType0() {
    }

    public SelectResponseType0(
           com.triniforce.pk.soap.SelectResponse selectResult) {
           this.selectResult = selectResult;
    }


    /**
     * Gets the selectResult value for this SelectResponseType0.
     * 
     * @return selectResult
     */
    public com.triniforce.pk.soap.SelectResponse getSelectResult() {
        return selectResult;
    }


    /**
     * Sets the selectResult value for this SelectResponseType0.
     * 
     * @param selectResult
     */
    public void setSelectResult(com.triniforce.pk.soap.SelectResponse selectResult) {
        this.selectResult = selectResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SelectResponseType0)) return false;
        SelectResponseType0 other = (SelectResponseType0) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.selectResult==null && other.getSelectResult()==null) || 
             (this.selectResult!=null &&
              this.selectResult.equals(other.getSelectResult())));
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
        if (getSelectResult() != null) {
            _hashCode += getSelectResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SelectResponseType0.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">selectResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "selectResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "SelectResponse"));
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

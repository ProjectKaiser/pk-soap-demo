/**
 * DoCollectionViewResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class DoCollectionViewResponse  implements java.io.Serializable {
    private com.triniforce.pk.soap.LongListResponse doCollectionViewResult;

    public DoCollectionViewResponse() {
    }

    public DoCollectionViewResponse(
           com.triniforce.pk.soap.LongListResponse doCollectionViewResult) {
           this.doCollectionViewResult = doCollectionViewResult;
    }


    /**
     * Gets the doCollectionViewResult value for this DoCollectionViewResponse.
     * 
     * @return doCollectionViewResult
     */
    public com.triniforce.pk.soap.LongListResponse getDoCollectionViewResult() {
        return doCollectionViewResult;
    }


    /**
     * Sets the doCollectionViewResult value for this DoCollectionViewResponse.
     * 
     * @param doCollectionViewResult
     */
    public void setDoCollectionViewResult(com.triniforce.pk.soap.LongListResponse doCollectionViewResult) {
        this.doCollectionViewResult = doCollectionViewResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCollectionViewResponse)) return false;
        DoCollectionViewResponse other = (DoCollectionViewResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doCollectionViewResult==null && other.getDoCollectionViewResult()==null) || 
             (this.doCollectionViewResult!=null &&
              this.doCollectionViewResult.equals(other.getDoCollectionViewResult())));
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
        if (getDoCollectionViewResult() != null) {
            _hashCode += getDoCollectionViewResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCollectionViewResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">doCollectionViewResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doCollectionViewResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "doCollectionViewResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "LongListResponse"));
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

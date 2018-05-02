/**
 * ExprIn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class ExprIn  extends com.triniforce.pk.soap.ColumnExpr  implements java.io.Serializable {
    private java.lang.Object[] vals;

    public ExprIn() {
    }

    public ExprIn(
           boolean not,
           java.lang.String columnName,
           java.lang.Object[] vals) {
        super(
            not,
            columnName);
        this.vals = vals;
    }


    /**
     * Gets the vals value for this ExprIn.
     * 
     * @return vals
     */
    public java.lang.Object[] getVals() {
        return vals;
    }


    /**
     * Sets the vals value for this ExprIn.
     * 
     * @param vals
     */
    public void setVals(java.lang.Object[] vals) {
        this.vals = vals;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExprIn)) return false;
        ExprIn other = (ExprIn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.vals==null && other.getVals()==null) || 
             (this.vals!=null &&
              java.util.Arrays.equals(this.vals, other.getVals())));
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
        if (getVals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVals(), i);
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
        new org.apache.axis.description.TypeDesc(ExprIn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprIn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "vals"));
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

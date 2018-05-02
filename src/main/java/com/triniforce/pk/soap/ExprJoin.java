/**
 * ExprJoin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class ExprJoin  extends com.triniforce.pk.soap.AbstractExprJoin  implements java.io.Serializable {
    private boolean andJoin;

    private com.triniforce.pk.soap.WhereExpr[] exprs;

    public ExprJoin() {
    }

    public ExprJoin(
           boolean not,
           boolean andJoin,
           com.triniforce.pk.soap.WhereExpr[] exprs) {
        super(
            not);
        this.andJoin = andJoin;
        this.exprs = exprs;
    }


    /**
     * Gets the andJoin value for this ExprJoin.
     * 
     * @return andJoin
     */
    public boolean isAndJoin() {
        return andJoin;
    }


    /**
     * Sets the andJoin value for this ExprJoin.
     * 
     * @param andJoin
     */
    public void setAndJoin(boolean andJoin) {
        this.andJoin = andJoin;
    }


    /**
     * Gets the exprs value for this ExprJoin.
     * 
     * @return exprs
     */
    public com.triniforce.pk.soap.WhereExpr[] getExprs() {
        return exprs;
    }


    /**
     * Sets the exprs value for this ExprJoin.
     * 
     * @param exprs
     */
    public void setExprs(com.triniforce.pk.soap.WhereExpr[] exprs) {
        this.exprs = exprs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExprJoin)) return false;
        ExprJoin other = (ExprJoin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.andJoin == other.isAndJoin() &&
            ((this.exprs==null && other.getExprs()==null) || 
             (this.exprs!=null &&
              java.util.Arrays.equals(this.exprs, other.getExprs())));
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
        _hashCode += (isAndJoin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExprs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExprs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExprs(), i);
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
        new org.apache.axis.description.TypeDesc(ExprJoin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprJoin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("andJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "andJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exprs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "exprs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "WhereExpr"));
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

/**
 * SimpleSelect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class SimpleSelect  implements java.io.Serializable {
    private java.lang.String arg0;

    private long arg1;

    private java.lang.String arg2;

    private java.lang.String[] arg3;

    private java.lang.Object[] arg4;

    private java.lang.Object[] arg5;

    public SimpleSelect() {
    }

    public SimpleSelect(
           java.lang.String arg0,
           long arg1,
           java.lang.String arg2,
           java.lang.String[] arg3,
           java.lang.Object[] arg4,
           java.lang.Object[] arg5) {
           this.arg0 = arg0;
           this.arg1 = arg1;
           this.arg2 = arg2;
           this.arg3 = arg3;
           this.arg4 = arg4;
           this.arg5 = arg5;
    }


    /**
     * Gets the arg0 value for this SimpleSelect.
     * 
     * @return arg0
     */
    public java.lang.String getArg0() {
        return arg0;
    }


    /**
     * Sets the arg0 value for this SimpleSelect.
     * 
     * @param arg0
     */
    public void setArg0(java.lang.String arg0) {
        this.arg0 = arg0;
    }


    /**
     * Gets the arg1 value for this SimpleSelect.
     * 
     * @return arg1
     */
    public long getArg1() {
        return arg1;
    }


    /**
     * Sets the arg1 value for this SimpleSelect.
     * 
     * @param arg1
     */
    public void setArg1(long arg1) {
        this.arg1 = arg1;
    }


    /**
     * Gets the arg2 value for this SimpleSelect.
     * 
     * @return arg2
     */
    public java.lang.String getArg2() {
        return arg2;
    }


    /**
     * Sets the arg2 value for this SimpleSelect.
     * 
     * @param arg2
     */
    public void setArg2(java.lang.String arg2) {
        this.arg2 = arg2;
    }


    /**
     * Gets the arg3 value for this SimpleSelect.
     * 
     * @return arg3
     */
    public java.lang.String[] getArg3() {
        return arg3;
    }


    /**
     * Sets the arg3 value for this SimpleSelect.
     * 
     * @param arg3
     */
    public void setArg3(java.lang.String[] arg3) {
        this.arg3 = arg3;
    }


    /**
     * Gets the arg4 value for this SimpleSelect.
     * 
     * @return arg4
     */
    public java.lang.Object[] getArg4() {
        return arg4;
    }


    /**
     * Sets the arg4 value for this SimpleSelect.
     * 
     * @param arg4
     */
    public void setArg4(java.lang.Object[] arg4) {
        this.arg4 = arg4;
    }


    /**
     * Gets the arg5 value for this SimpleSelect.
     * 
     * @return arg5
     */
    public java.lang.Object[] getArg5() {
        return arg5;
    }


    /**
     * Sets the arg5 value for this SimpleSelect.
     * 
     * @param arg5
     */
    public void setArg5(java.lang.Object[] arg5) {
        this.arg5 = arg5;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SimpleSelect)) return false;
        SimpleSelect other = (SimpleSelect) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arg0==null && other.getArg0()==null) || 
             (this.arg0!=null &&
              this.arg0.equals(other.getArg0()))) &&
            this.arg1 == other.getArg1() &&
            ((this.arg2==null && other.getArg2()==null) || 
             (this.arg2!=null &&
              this.arg2.equals(other.getArg2()))) &&
            ((this.arg3==null && other.getArg3()==null) || 
             (this.arg3!=null &&
              java.util.Arrays.equals(this.arg3, other.getArg3()))) &&
            ((this.arg4==null && other.getArg4()==null) || 
             (this.arg4!=null &&
              java.util.Arrays.equals(this.arg4, other.getArg4()))) &&
            ((this.arg5==null && other.getArg5()==null) || 
             (this.arg5!=null &&
              java.util.Arrays.equals(this.arg5, other.getArg5())));
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
        if (getArg0() != null) {
            _hashCode += getArg0().hashCode();
        }
        _hashCode += new Long(getArg1()).hashCode();
        if (getArg2() != null) {
            _hashCode += getArg2().hashCode();
        }
        if (getArg3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArg3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArg3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArg4() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArg4());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArg4(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArg5() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArg5());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArg5(), i);
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
        new org.apache.axis.description.TypeDesc(SimpleSelect.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">simpleSelect"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg0");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arg5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg5"));
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

/**
 * SelectRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class SelectRequest  implements java.io.Serializable {
    private java.lang.Object[] args;

    private java.lang.Object[] namedParams;

    private java.lang.Long parentId;

    private java.lang.String filetype;

    private java.lang.String[] columns;

    private java.lang.Object[] simpleWhere;

    private com.triniforce.pk.soap.WhereExpr[] whereExprs;

    private java.lang.Object[] orderBy;

    public SelectRequest() {
    }

    public SelectRequest(
           java.lang.Object[] args,
           java.lang.Object[] namedParams,
           java.lang.Long parentId,
           java.lang.String filetype,
           java.lang.String[] columns,
           java.lang.Object[] simpleWhere,
           com.triniforce.pk.soap.WhereExpr[] whereExprs,
           java.lang.Object[] orderBy) {
           this.args = args;
           this.namedParams = namedParams;
           this.parentId = parentId;
           this.filetype = filetype;
           this.columns = columns;
           this.simpleWhere = simpleWhere;
           this.whereExprs = whereExprs;
           this.orderBy = orderBy;
    }


    /**
     * Gets the args value for this SelectRequest.
     * 
     * @return args
     */
    public java.lang.Object[] getArgs() {
        return args;
    }


    /**
     * Sets the args value for this SelectRequest.
     * 
     * @param args
     */
    public void setArgs(java.lang.Object[] args) {
        this.args = args;
    }


    /**
     * Gets the namedParams value for this SelectRequest.
     * 
     * @return namedParams
     */
    public java.lang.Object[] getNamedParams() {
        return namedParams;
    }


    /**
     * Sets the namedParams value for this SelectRequest.
     * 
     * @param namedParams
     */
    public void setNamedParams(java.lang.Object[] namedParams) {
        this.namedParams = namedParams;
    }


    /**
     * Gets the parentId value for this SelectRequest.
     * 
     * @return parentId
     */
    public java.lang.Long getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this SelectRequest.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.Long parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the filetype value for this SelectRequest.
     * 
     * @return filetype
     */
    public java.lang.String getFiletype() {
        return filetype;
    }


    /**
     * Sets the filetype value for this SelectRequest.
     * 
     * @param filetype
     */
    public void setFiletype(java.lang.String filetype) {
        this.filetype = filetype;
    }


    /**
     * Gets the columns value for this SelectRequest.
     * 
     * @return columns
     */
    public java.lang.String[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this SelectRequest.
     * 
     * @param columns
     */
    public void setColumns(java.lang.String[] columns) {
        this.columns = columns;
    }


    /**
     * Gets the simpleWhere value for this SelectRequest.
     * 
     * @return simpleWhere
     */
    public java.lang.Object[] getSimpleWhere() {
        return simpleWhere;
    }


    /**
     * Sets the simpleWhere value for this SelectRequest.
     * 
     * @param simpleWhere
     */
    public void setSimpleWhere(java.lang.Object[] simpleWhere) {
        this.simpleWhere = simpleWhere;
    }


    /**
     * Gets the whereExprs value for this SelectRequest.
     * 
     * @return whereExprs
     */
    public com.triniforce.pk.soap.WhereExpr[] getWhereExprs() {
        return whereExprs;
    }


    /**
     * Sets the whereExprs value for this SelectRequest.
     * 
     * @param whereExprs
     */
    public void setWhereExprs(com.triniforce.pk.soap.WhereExpr[] whereExprs) {
        this.whereExprs = whereExprs;
    }


    /**
     * Gets the orderBy value for this SelectRequest.
     * 
     * @return orderBy
     */
    public java.lang.Object[] getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this SelectRequest.
     * 
     * @param orderBy
     */
    public void setOrderBy(java.lang.Object[] orderBy) {
        this.orderBy = orderBy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SelectRequest)) return false;
        SelectRequest other = (SelectRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.args==null && other.getArgs()==null) || 
             (this.args!=null &&
              java.util.Arrays.equals(this.args, other.getArgs()))) &&
            ((this.namedParams==null && other.getNamedParams()==null) || 
             (this.namedParams!=null &&
              java.util.Arrays.equals(this.namedParams, other.getNamedParams()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.filetype==null && other.getFiletype()==null) || 
             (this.filetype!=null &&
              this.filetype.equals(other.getFiletype()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.simpleWhere==null && other.getSimpleWhere()==null) || 
             (this.simpleWhere!=null &&
              java.util.Arrays.equals(this.simpleWhere, other.getSimpleWhere()))) &&
            ((this.whereExprs==null && other.getWhereExprs()==null) || 
             (this.whereExprs!=null &&
              java.util.Arrays.equals(this.whereExprs, other.getWhereExprs()))) &&
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              java.util.Arrays.equals(this.orderBy, other.getOrderBy())));
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
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getFiletype() != null) {
            _hashCode += getFiletype().hashCode();
        }
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSimpleWhere() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimpleWhere());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimpleWhere(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWhereExprs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWhereExprs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWhereExprs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderBy(), i);
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
        new org.apache.axis.description.TypeDesc(SelectRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "SelectRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("args");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "args"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namedParams");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "namedParams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filetype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "filetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simpleWhere");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "simpleWhere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereExprs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "whereExprs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "WhereExpr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "orderBy"));
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

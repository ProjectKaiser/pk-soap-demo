/**
 * CollectionViewRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class CollectionViewRequest  extends com.triniforce.pk.soap.LongListRequest  implements java.io.Serializable {
    private java.lang.String target;

    private java.lang.Long parentOf;

    private java.lang.Long parentId;

    private java.lang.String[] columns;

    private com.triniforce.pk.soap.MapEntryObjectByString[] where;

    private java.lang.Object[] orderBy;

    private com.triniforce.pk.soap.WhereExpr[] whereExprs;

    private com.triniforce.pk.soap.FieldFunctionRequest[] functions;

    private boolean dbValue;

    private com.triniforce.pk.soap.WhereExpr[] afterOrderWhereExprs;

    public CollectionViewRequest() {
    }

    public CollectionViewRequest(
           com.triniforce.pk.soap.MapEntryObjectByString[] headers,
           com.triniforce.pk.soap.AuthScheme scheme,
           java.lang.Object[] args,
           int startFrom,
           int limit,
           com.triniforce.pk.soap.MapEntryObjectByString[] namedParams,
           java.lang.String target,
           java.lang.Long parentOf,
           java.lang.Long parentId,
           java.lang.String[] columns,
           com.triniforce.pk.soap.MapEntryObjectByString[] where,
           java.lang.Object[] orderBy,
           com.triniforce.pk.soap.WhereExpr[] whereExprs,
           com.triniforce.pk.soap.FieldFunctionRequest[] functions,
           boolean dbValue,
           com.triniforce.pk.soap.WhereExpr[] afterOrderWhereExprs) {
        super(
            headers,
            scheme,
            args,
            startFrom,
            limit,
            namedParams);
        this.target = target;
        this.parentOf = parentOf;
        this.parentId = parentId;
        this.columns = columns;
        this.where = where;
        this.orderBy = orderBy;
        this.whereExprs = whereExprs;
        this.functions = functions;
        this.dbValue = dbValue;
        this.afterOrderWhereExprs = afterOrderWhereExprs;
    }


    /**
     * Gets the target value for this CollectionViewRequest.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this CollectionViewRequest.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the parentOf value for this CollectionViewRequest.
     * 
     * @return parentOf
     */
    public java.lang.Long getParentOf() {
        return parentOf;
    }


    /**
     * Sets the parentOf value for this CollectionViewRequest.
     * 
     * @param parentOf
     */
    public void setParentOf(java.lang.Long parentOf) {
        this.parentOf = parentOf;
    }


    /**
     * Gets the parentId value for this CollectionViewRequest.
     * 
     * @return parentId
     */
    public java.lang.Long getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this CollectionViewRequest.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.Long parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the columns value for this CollectionViewRequest.
     * 
     * @return columns
     */
    public java.lang.String[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this CollectionViewRequest.
     * 
     * @param columns
     */
    public void setColumns(java.lang.String[] columns) {
        this.columns = columns;
    }


    /**
     * Gets the where value for this CollectionViewRequest.
     * 
     * @return where
     */
    public com.triniforce.pk.soap.MapEntryObjectByString[] getWhere() {
        return where;
    }


    /**
     * Sets the where value for this CollectionViewRequest.
     * 
     * @param where
     */
    public void setWhere(com.triniforce.pk.soap.MapEntryObjectByString[] where) {
        this.where = where;
    }


    /**
     * Gets the orderBy value for this CollectionViewRequest.
     * 
     * @return orderBy
     */
    public java.lang.Object[] getOrderBy() {
        return orderBy;
    }


    /**
     * Sets the orderBy value for this CollectionViewRequest.
     * 
     * @param orderBy
     */
    public void setOrderBy(java.lang.Object[] orderBy) {
        this.orderBy = orderBy;
    }


    /**
     * Gets the whereExprs value for this CollectionViewRequest.
     * 
     * @return whereExprs
     */
    public com.triniforce.pk.soap.WhereExpr[] getWhereExprs() {
        return whereExprs;
    }


    /**
     * Sets the whereExprs value for this CollectionViewRequest.
     * 
     * @param whereExprs
     */
    public void setWhereExprs(com.triniforce.pk.soap.WhereExpr[] whereExprs) {
        this.whereExprs = whereExprs;
    }


    /**
     * Gets the functions value for this CollectionViewRequest.
     * 
     * @return functions
     */
    public com.triniforce.pk.soap.FieldFunctionRequest[] getFunctions() {
        return functions;
    }


    /**
     * Sets the functions value for this CollectionViewRequest.
     * 
     * @param functions
     */
    public void setFunctions(com.triniforce.pk.soap.FieldFunctionRequest[] functions) {
        this.functions = functions;
    }


    /**
     * Gets the dbValue value for this CollectionViewRequest.
     * 
     * @return dbValue
     */
    public boolean isDbValue() {
        return dbValue;
    }


    /**
     * Sets the dbValue value for this CollectionViewRequest.
     * 
     * @param dbValue
     */
    public void setDbValue(boolean dbValue) {
        this.dbValue = dbValue;
    }


    /**
     * Gets the afterOrderWhereExprs value for this CollectionViewRequest.
     * 
     * @return afterOrderWhereExprs
     */
    public com.triniforce.pk.soap.WhereExpr[] getAfterOrderWhereExprs() {
        return afterOrderWhereExprs;
    }


    /**
     * Sets the afterOrderWhereExprs value for this CollectionViewRequest.
     * 
     * @param afterOrderWhereExprs
     */
    public void setAfterOrderWhereExprs(com.triniforce.pk.soap.WhereExpr[] afterOrderWhereExprs) {
        this.afterOrderWhereExprs = afterOrderWhereExprs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CollectionViewRequest)) return false;
        CollectionViewRequest other = (CollectionViewRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.parentOf==null && other.getParentOf()==null) || 
             (this.parentOf!=null &&
              this.parentOf.equals(other.getParentOf()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.where==null && other.getWhere()==null) || 
             (this.where!=null &&
              java.util.Arrays.equals(this.where, other.getWhere()))) &&
            ((this.orderBy==null && other.getOrderBy()==null) || 
             (this.orderBy!=null &&
              java.util.Arrays.equals(this.orderBy, other.getOrderBy()))) &&
            ((this.whereExprs==null && other.getWhereExprs()==null) || 
             (this.whereExprs!=null &&
              java.util.Arrays.equals(this.whereExprs, other.getWhereExprs()))) &&
            ((this.functions==null && other.getFunctions()==null) || 
             (this.functions!=null &&
              java.util.Arrays.equals(this.functions, other.getFunctions()))) &&
            this.dbValue == other.isDbValue() &&
            ((this.afterOrderWhereExprs==null && other.getAfterOrderWhereExprs()==null) || 
             (this.afterOrderWhereExprs!=null &&
              java.util.Arrays.equals(this.afterOrderWhereExprs, other.getAfterOrderWhereExprs())));
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getParentOf() != null) {
            _hashCode += getParentOf().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
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
        if (getWhere() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWhere());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWhere(), i);
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
        if (getFunctions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFunctions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFunctions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isDbValue() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAfterOrderWhereExprs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAfterOrderWhereExprs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAfterOrderWhereExprs(), i);
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
        new org.apache.axis.description.TypeDesc(CollectionViewRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "CollectionViewRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentOf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "parentOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "parentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("where");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "where"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "MapEntryObjectByString"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("whereExprs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "whereExprs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "WhereExpr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("functions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "functions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "FieldFunctionRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "dbValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afterOrderWhereExprs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "afterOrderWhereExprs"));
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

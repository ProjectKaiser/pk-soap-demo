/**
 * PKApiSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class PKApiSoapStub extends org.apache.axis.client.Stub implements com.triniforce.pk.soap.PKApiSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("select");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "SelectRequest"), com.triniforce.pk.soap.SelectRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "SelectResponse"));
        oper.setReturnClass(com.triniforce.pk.soap.SelectResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "selectResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryUserId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(java.lang.Long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "queryUserIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfObject"), java.lang.Object[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "createResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("doCollectionView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "CollectionViewRequest"), com.triniforce.pk.soap.CollectionViewRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "LongListResponse"));
        oper.setReturnClass(com.triniforce.pk.soap.LongListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "doCollectionViewResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("simpleSelect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfString"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfObject"), java.lang.Object[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfObject"), java.lang.Object[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "SelectResponse"));
        oper.setReturnClass(com.triniforce.pk.soap.SelectResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "simpleSelectResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfObject"), java.lang.Object[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "loginResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

    }

    public PKApiSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public PKApiSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public PKApiSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">create");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.Create.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">createResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.CreateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">doCollectionView");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.DoCollectionView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">doCollectionViewResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.DoCollectionViewResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">login");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.Login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">loginResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">logout");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.Logout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">logoutResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.LogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">queryUserId");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.QueryUserId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">queryUserIdResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.QueryUserIdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">select");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.Select.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">selectResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.SelectResponseType0.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">simpleSelect");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.SimpleSelect.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">simpleSelectResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.SimpleSelectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">update");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.Update.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", ">updateResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.UpdateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "AbstractExprJoin");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.AbstractExprJoin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfArrayOfObject");
            cachedSerQNames.add(qName);
            cls = java.lang.Object[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfObject");
            qName2 = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfColumnExpr");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ColumnExpr[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ColumnExpr");
            qName2 = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfFieldFunctionRequest");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.FieldFunctionRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "FieldFunctionRequest");
            qName2 = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfObject");
            cachedSerQNames.add(qName);
            cls = java.lang.Object[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType");
            qName2 = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfStackTraceElement");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.StackTraceElement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "StackTraceElement");
            qName2 = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ArrayOfWhereExpr");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.WhereExpr[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "WhereExpr");
            qName2 = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "AuthScheme");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.AuthScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "BasicRequest");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.BasicRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "BasicResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.BasicResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ClientId");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ClientId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "CLOBValue");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.CLOBValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "CollectionViewRequest");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.CollectionViewRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ColumnExpr");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ColumnExpr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ColumnExprValued");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ColumnExprValued.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "DescField");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.DescField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "EParentIdMustHaveValue");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.EParentIdMustHaveValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprBetween");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprBetween.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprColumnOr");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprColumnOr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprContains");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprContains.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprContainsId");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprContainsId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprContainsWord");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprContainsWord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprEquals");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprEquals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprGE");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprGE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprGT");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprGT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprIn");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprIn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprJoin");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprJoin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprLE");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprLE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprLT");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprLT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "ExprNotNull");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.ExprNotNull.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "FieldFunctionRequest");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.FieldFunctionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "GoogleTokenScheme");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.GoogleTokenScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "LongListRequest");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.LongListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "LongListResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.LongListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "MapEntryObjectByString");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.MapEntryObjectByString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "MapOfObjectByString");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.MapEntryObjectByString[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "MapEntryObjectByString");
            qName2 = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "PlainAuthScheme");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.PlainAuthScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "SelectRequest");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.SelectRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "SelectResponse");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.SelectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "SessionAuthScheme");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.SessionAuthScheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "SessionRequest");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.SessionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "StackTraceElement");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.StackTraceElement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "TextFieldsQuery");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.TextFieldsQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "VNone");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.VNone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "VUnknown");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.VUnknown.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "WhereExpr");
            cachedSerQNames.add(qName);
            cls = com.triniforce.pk.soap.WhereExpr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.triniforce.pk.soap.SelectResponse select(java.lang.String arg0, com.triniforce.pk.soap.SelectRequest arg1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://triniforce.com/pk/soap/select");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "select"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.triniforce.pk.soap.SelectResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.triniforce.pk.soap.SelectResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.triniforce.pk.soap.SelectResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.Long queryUserId(java.lang.String arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://triniforce.com/pk/soap/queryUserId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "queryUserId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Long) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Long.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void logout(java.lang.String arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://triniforce.com/pk/soap/logout");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public long create(java.lang.String arg0, long arg1, java.lang.String arg2, java.lang.Object[] arg3) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://triniforce.com/pk/soap/create");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Long(arg1), arg2, arg3});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.triniforce.pk.soap.LongListResponse doCollectionView(com.triniforce.pk.soap.CollectionViewRequest arg0) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://triniforce.com/pk/soap/doCollectionView");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "doCollectionView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.triniforce.pk.soap.LongListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.triniforce.pk.soap.LongListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.triniforce.pk.soap.LongListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.triniforce.pk.soap.SelectResponse simpleSelect(java.lang.String arg0, long arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.Object[] arg4, java.lang.Object[] arg5) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://triniforce.com/pk/soap/simpleSelect");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "simpleSelect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Long(arg1), arg2, arg3, arg4, arg5});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.triniforce.pk.soap.SelectResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.triniforce.pk.soap.SelectResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.triniforce.pk.soap.SelectResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void update(java.lang.String arg0, long arg1, java.lang.Object[] arg2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://triniforce.com/pk/soap/update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Long(arg1), arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://triniforce.com/pk/soap/login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}

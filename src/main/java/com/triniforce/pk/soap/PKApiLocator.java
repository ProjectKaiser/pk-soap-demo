/**
 * PKApiLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public class PKApiLocator extends org.apache.axis.client.Service implements com.triniforce.pk.soap.PKApi {

    public PKApiLocator() {
    }


    public PKApiLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PKApiLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PKApiSoap
    private java.lang.String PKApiSoap_address = "http://localhost:8080/alpha/soap";

    public java.lang.String getPKApiSoapAddress() {
        return PKApiSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PKApiSoapWSDDServiceName = "PKApiSoap";

    public java.lang.String getPKApiSoapWSDDServiceName() {
        return PKApiSoapWSDDServiceName;
    }

    public void setPKApiSoapWSDDServiceName(java.lang.String name) {
        PKApiSoapWSDDServiceName = name;
    }

    public com.triniforce.pk.soap.PKApiSoap getPKApiSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PKApiSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPKApiSoap(endpoint);
    }

    public com.triniforce.pk.soap.PKApiSoap getPKApiSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.triniforce.pk.soap.PKApiSoapStub _stub = new com.triniforce.pk.soap.PKApiSoapStub(portAddress, this);
            _stub.setPortName(getPKApiSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPKApiSoapEndpointAddress(java.lang.String address) {
        PKApiSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.triniforce.pk.soap.PKApiSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.triniforce.pk.soap.PKApiSoapStub _stub = new com.triniforce.pk.soap.PKApiSoapStub(new java.net.URL(PKApiSoap_address), this);
                _stub.setPortName(getPKApiSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PKApiSoap".equals(inputPortName)) {
            return getPKApiSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "PKApi");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://triniforce.com/pk/soap/", "PKApiSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PKApiSoap".equals(portName)) {
            setPKApiSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

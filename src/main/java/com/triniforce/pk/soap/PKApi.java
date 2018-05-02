/**
 * PKApi.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public interface PKApi extends javax.xml.rpc.Service {
    public java.lang.String getPKApiSoapAddress();

    public com.triniforce.pk.soap.PKApiSoap getPKApiSoap() throws javax.xml.rpc.ServiceException;

    public com.triniforce.pk.soap.PKApiSoap getPKApiSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

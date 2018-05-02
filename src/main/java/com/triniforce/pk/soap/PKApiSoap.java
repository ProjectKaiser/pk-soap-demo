/**
 * PKApiSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.triniforce.pk.soap;

public interface PKApiSoap extends java.rmi.Remote {
    public com.triniforce.pk.soap.SelectResponse select(java.lang.String arg0, com.triniforce.pk.soap.SelectRequest arg1) throws java.rmi.RemoteException;
    public java.lang.Long queryUserId(java.lang.String arg0) throws java.rmi.RemoteException;
    public void logout(java.lang.String arg0) throws java.rmi.RemoteException;
    public long create(java.lang.String arg0, long arg1, java.lang.String arg2, java.lang.Object[] arg3) throws java.rmi.RemoteException;
    public com.triniforce.pk.soap.LongListResponse doCollectionView(com.triniforce.pk.soap.CollectionViewRequest arg0) throws java.rmi.RemoteException;
    public com.triniforce.pk.soap.SelectResponse simpleSelect(java.lang.String arg0, long arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.Object[] arg4, java.lang.Object[] arg5) throws java.rmi.RemoteException;
    public void update(java.lang.String arg0, long arg1, java.lang.Object[] arg2) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
}

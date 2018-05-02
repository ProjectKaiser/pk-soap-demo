package com.triniforce.pk.soap;

public class PKApiSoapProxy implements com.triniforce.pk.soap.PKApiSoap {
  private String _endpoint = null;
  private com.triniforce.pk.soap.PKApiSoap pKApiSoap = null;
  
  public PKApiSoapProxy() {
    _initPKApiSoapProxy();
  }
  
  public PKApiSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initPKApiSoapProxy();
  }
  
  private void _initPKApiSoapProxy() {
    try {
      pKApiSoap = (new com.triniforce.pk.soap.PKApiLocator()).getPKApiSoap();
      if (pKApiSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pKApiSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pKApiSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pKApiSoap != null)
      ((javax.xml.rpc.Stub)pKApiSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.triniforce.pk.soap.PKApiSoap getPKApiSoap() {
    if (pKApiSoap == null)
      _initPKApiSoapProxy();
    return pKApiSoap;
  }
  
  public com.triniforce.pk.soap.SelectResponse select(java.lang.String arg0, com.triniforce.pk.soap.SelectRequest arg1) throws java.rmi.RemoteException{
    if (pKApiSoap == null)
      _initPKApiSoapProxy();
    return pKApiSoap.select(arg0, arg1);
  }
  
  public java.lang.Long queryUserId(java.lang.String arg0) throws java.rmi.RemoteException{
    if (pKApiSoap == null)
      _initPKApiSoapProxy();
    return pKApiSoap.queryUserId(arg0);
  }
  
  public void logout(java.lang.String arg0) throws java.rmi.RemoteException{
    if (pKApiSoap == null)
      _initPKApiSoapProxy();
    pKApiSoap.logout(arg0);
  }
  
  public long create(java.lang.String arg0, long arg1, java.lang.String arg2, java.lang.Object[] arg3) throws java.rmi.RemoteException{
    if (pKApiSoap == null)
      _initPKApiSoapProxy();
    return pKApiSoap.create(arg0, arg1, arg2, arg3);
  }
  
  public com.triniforce.pk.soap.LongListResponse doCollectionView(com.triniforce.pk.soap.CollectionViewRequest arg0) throws java.rmi.RemoteException{
    if (pKApiSoap == null)
      _initPKApiSoapProxy();
    return pKApiSoap.doCollectionView(arg0);
  }
  
  public com.triniforce.pk.soap.SelectResponse simpleSelect(java.lang.String arg0, long arg1, java.lang.String arg2, java.lang.String[] arg3, java.lang.Object[] arg4, java.lang.Object[] arg5) throws java.rmi.RemoteException{
    if (pKApiSoap == null)
      _initPKApiSoapProxy();
    return pKApiSoap.simpleSelect(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public void update(java.lang.String arg0, long arg1, java.lang.Object[] arg2) throws java.rmi.RemoteException{
    if (pKApiSoap == null)
      _initPKApiSoapProxy();
    pKApiSoap.update(arg0, arg1, arg2);
  }
  
  public java.lang.String login(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (pKApiSoap == null)
      _initPKApiSoapProxy();
    return pKApiSoap.login(arg0, arg1);
  }
  
  
}
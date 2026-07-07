package android.net;

public class LinkProperties {
    public LinkProperties() {}
    public LinkProperties(android.net.LinkProperties p0) {}
    public android.os.Parcelable.Creator CREATOR = null;
    public java.util.List getLinkAddresses() { return null; }
    public java.util.List getAllLinkAddresses() { return null; }
    public java.util.List getAddresses() { return null; }
    public java.util.List getDnsServers() { return null; }
    public java.lang.String getDomains() { return null; }
    public android.net.ProxyInfo getHttpProxy() { return null; }
    public java.lang.String getInterfaceName() { return null; }
    public java.util.List getRoutes() { return null; }
    public void setDnsServers(java.util.Collection p0) {}
    public void setInterfaceName(java.lang.String p0) {}
    public boolean removeLinkAddress(android.net.LinkAddress p0) { return false; }
    public boolean addLinkAddress(android.net.LinkAddress p0) { return false; }
    public void clear() {}
    public boolean removeRoute(android.net.RouteInfo p0) { return false; }
    public boolean addRoute(android.net.RouteInfo p0) { return false; }
}

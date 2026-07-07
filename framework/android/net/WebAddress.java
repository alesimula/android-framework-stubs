package android.net;

@android.annotation.SystemApi
public class WebAddress {
    static final int MATCH_GROUP_AUTHORITY = 2;
    static final int MATCH_GROUP_HOST = 3;
    static final int MATCH_GROUP_PATH = 5;
    static final int MATCH_GROUP_PORT = 4;
    static final int MATCH_GROUP_SCHEME = 1;
    static java.util.regex.Pattern sAddressPattern;
    private java.lang.String mAuthInfo;
    private java.lang.String mHost;
    private java.lang.String mPath;
    private int mPort;
    private java.lang.String mScheme;
    public WebAddress(java.lang.String p0) throws android.net.ParseException {}
    public java.lang.String getAuthInfo() { return null; }
    public java.lang.String getHost() { return null; }
    public java.lang.String getPath() { return null; }
    public int getPort() { return 0; }
    public java.lang.String getScheme() { return null; }
    public void setAuthInfo(java.lang.String p0) {}
    public void setHost(java.lang.String p0) {}
    public void setPath(java.lang.String p0) {}
    public void setPort(int p0) {}
    public void setScheme(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
}

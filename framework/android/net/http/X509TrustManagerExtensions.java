package android.net.http;

public class X509TrustManagerExtensions {
    private static final java.lang.String TAG = "X509TrustManager";
    private final java.lang.reflect.Method mCheckServerTrusted = null;
    private final java.lang.reflect.Method mCheckServerTrustedOcspAndTlsData = null;
    private final java.lang.reflect.Method mIsSameTrustConfiguration = null;
    private final javax.net.ssl.X509TrustManager mTrustManager = null;
    public X509TrustManagerExtensions(javax.net.ssl.X509TrustManager p0) throws java.lang.IllegalArgumentException {}
    public java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] p0, java.lang.String p1, java.lang.String p2) throws java.security.cert.CertificateException { return null; }
    public java.util.List<java.security.cert.X509Certificate> checkServerTrusted(java.security.cert.X509Certificate[] p0, byte[] p1, byte[] p2, java.lang.String p3, java.lang.String p4) throws java.security.cert.CertificateException { return null; }
    public boolean isSameTrustConfiguration(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean isUserAddedCertificate(java.security.cert.X509Certificate p0) { return false; }
    public void setNetworkSecurityPolicy(android.security.NetworkSecurityPolicy p0) {}
    public void setNetworkSecurityPolicy(com.android.org.conscrypt.ConscryptNetworkSecurityPolicy p0) {}
}

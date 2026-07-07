package android.webkit;

public abstract class ClientCertRequest {
    public ClientCertRequest() {}
    public abstract void cancel();
    public abstract java.lang.String getHost();
    public abstract java.lang.String[] getKeyTypes();
    public abstract int getPort();
    public abstract java.security.Principal[] getPrincipals();
    public abstract void ignore();
    public abstract void proceed(java.security.PrivateKey p0, java.security.cert.X509Certificate[] p1);
}

package android.security;

@android.annotation.RestrictedForEnvironment(environments="SDK Runtime", from=34)
public final class FileIntegrityManager {
    private final android.content.Context mContext = null;
    private final android.security.IFileIntegrityService mService = null;
    public FileIntegrityManager(android.content.Context p0, android.security.IFileIntegrityService p1) {}
    @android.annotation.SystemApi
    public byte[] getFsVerityDigest(java.io.File p0) throws java.io.IOException { return null; }
    public boolean isApkVeritySupported() { return false; }
    @java.lang.Deprecated
    public boolean isAppSourceCertificateTrusted(java.security.cert.X509Certificate p0) throws java.security.cert.CertificateEncodingException { return false; }
    @android.annotation.SystemApi
    public void setupFsVerity(java.io.File p0) throws java.io.IOException {}
}

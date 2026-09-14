package android.security;

public final class KeyChainManager {
    public static final int KEYPAIR_SCOPE_DEVICE = 1;
    public static final int KEYPAIR_SCOPE_USER = 2;
    private static final java.lang.String TAG = "KeyChainManager";
    private final android.content.Context mContext = null;
    private final android.security.IKeyChainManager mService = null;
    public KeyChainManager(android.content.Context p0, android.security.IKeyChainManager p1) {}
    public java.util.List<java.security.cert.X509Certificate> getCertificateChain(java.lang.String p0, int p1) { return null; }
    public java.util.List<android.security.GrantedKeyInfo> getGrantedKeyPairs(int p0) { return null; }
    public java.security.PrivateKey getPrivateKey(java.lang.String p0, int p1) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getWifiKeyGrant(java.lang.String p0, int p1) { return null; }
    @android.annotation.SystemApi
    public boolean hasWifiKeyGrant(java.lang.String p0, int p1) { return false; }
    public java.lang.String requestDevicePrivateKey(java.lang.String p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KeyPairScope {
    }
}

package android.security;

public final class KeyChainManager {
    public static final int KEYPAIR_SCOPE_DEVICE = 1;
    public static final int KEYPAIR_SCOPE_USER = 2;
    private static final java.lang.String TAG = "KeyChainManager";
    private final android.security.IKeyChainManager mService = null;
    public KeyChainManager(android.security.IKeyChainManager p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KeyPairScope {
    }
}

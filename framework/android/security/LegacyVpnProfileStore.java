package android.security;

public class LegacyVpnProfileStore {
    private static final java.lang.String LEGACY_KEYSTORE_SERVICE_NAME = "android.security.legacykeystore";
    public static final int PROFILE_NOT_FOUND = 7;
    public static final int SYSTEM_ERROR = 4;
    private static final java.lang.String TAG = "LegacyVpnProfileStore";
    public LegacyVpnProfileStore() {}
    public static byte[] get(java.lang.String p0) { return null; }
    private static android.security.legacykeystore.ILegacyKeystore getService() { return null; }
    public static java.lang.String[] list(java.lang.String p0) { return null; }
    public static boolean put(java.lang.String p0, byte[] p1) { return false; }
    public static boolean remove(java.lang.String p0) { return false; }
}

package android.net.wifi;

public class WifiBlobStore extends com.android.internal.net.ConnectivityBlobStore {
    private static final java.lang.String DB_NAME = "WifiBlobStore.db";
    private static final java.lang.String LEGACY_KEYSTORE_SERVICE_NAME = "android.security.legacykeystore";
    private static final java.lang.String TAG = "WifiBlobStore";
    private static android.net.wifi.WifiBlobStore sInstance;
    private static final boolean sIsVendorApiLevelGreaterThanT = Boolean.valueOf(false);
    private WifiBlobStore() { super((java.io.File)null); }
    public static android.net.wifi.WifiBlobStore getInstance() { return null; }
    public static android.security.legacykeystore.ILegacyKeystore getLegacyKeystore() { return null; }
    private static boolean isVendorApiLevelGreaterThanT() { return false; }
    public static boolean supplicantCanAccessBlobstore() { return false; }
}

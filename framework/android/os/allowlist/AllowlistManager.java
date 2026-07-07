package android.os.allowlist;

@android.annotation.SystemApi
public final class AllowlistManager {
    public static final int[] ALLOWLIST_IDS = null;
    public static final int ALLOWLIST_ID_APP_FUNCTION = 2;
    public static final int ALLOWLIST_ID_COMPUTER_CONTROL = 3;
    public static final int ALLOWLIST_ID_COMPUTER_CONTROL_AGENTS = 4;
    public static final int ALLOWLIST_ID_COMPUTER_CONTROL_DENIED_TARGETS = 5;
    public static final int ALLOWLIST_ID_TEST = 1;
    public static final java.lang.String KEY_ALLOWLIST_RESPONSE = "allowlist_response";
    public static final java.lang.String REQUEST_KEY_FILTER_PACKAGES = "android.allowlist.request.key.FILTER_PACKAGES";
    public static final java.lang.String REQUEST_KEY_FILTER_TARGETS = "android.allowlist.request.key.FILTER_TARGETS";
    public static final java.lang.String REQUEST_KEY_INSTALLED_PACKAGES_ONLY = "android.allowlist.request.key.INSTALLED_PACKAGES_ONLY";
    public static final java.lang.String REQUEST_KEY_TEST_RESPONSE_STATUS = "android.allowlist.request.key.TEST_RESPONSE_STATUS";
    public static final java.lang.String RESPONSE_KEY_ALLOWED_PACKAGES = "android.allowlist.response.key.ALLOWED_PACKAGES";
    public static final java.lang.String RESPONSE_KEY_ALLOWED_PACKAGE_MULTI_MAP = "android.allowlist.response.key.ALLOWED_PACKAGE_MULTI_MAP";
    public static final int RESPONSE_STATUS_ERROR_INVALID_REQUEST = 3;
    public static final int RESPONSE_STATUS_ERROR_NETWORK = 4;
    public static final int RESPONSE_STATUS_ERROR_PROVIDER = 2;
    public static final int RESPONSE_STATUS_ERROR_UNKNOWN = 1;
    public static final int RESPONSE_STATUS_SUCCESS = 0;
    private final android.content.Context mContext = null;
    private final android.util.ArrayMap<java.util.function.Consumer<android.os.allowlist.AllowlistRequest>, android.os.allowlist.IOnAllowlistChangedListener> mRemoteListeners = null;
    private final android.os.allowlist.IAllowlistService mService = null;
    public AllowlistManager(android.content.Context p0, android.os.allowlist.IAllowlistService p1) {}
    public void addOnAllowlistChangedListener(android.os.allowlist.AllowlistRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.os.allowlist.AllowlistRequest> p2) {}
    @java.lang.Deprecated
    public void notifyAllowlistChangedListenersForTestProvider(java.util.List<android.os.allowlist.AllowlistRequest> p0) {}
    public void queryAllowlist(android.os.allowlist.AllowlistRequest p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.os.allowlist.AllowlistResponse> p2) {}
    public void removeOnAllowlistChangedListener(java.util.function.Consumer<android.os.allowlist.AllowlistRequest> p0) {}
    public void setTestAllowlistProvider(java.lang.String p0) {}
    @java.lang.Deprecated
    public void setTestProviderEnabled(boolean p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AllowlistId {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResponseStatus {
    }
}

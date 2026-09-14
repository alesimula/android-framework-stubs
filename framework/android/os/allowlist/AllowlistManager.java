package android.os.allowlist;

@android.annotation.SystemApi
public final class AllowlistManager {
    public static final java.util.Set<java.lang.String> ALLOWED_PACKAGES_RESPONSE_KEYS = null;
    public static final int[] ALLOWLIST_IDS = null;
    public static final int ALLOWLIST_ID_APP_FUNCTION = 2;
    public static final int ALLOWLIST_ID_COMPANION_CROSS_DEVICE_AUTHENTICATION = 8;
    public static final int ALLOWLIST_ID_COMPUTER_CONTROL = 3;
    public static final int ALLOWLIST_ID_COMPUTER_CONTROL_DENIED_TARGETS = 5;
    public static final int ALLOWLIST_ID_COMPUTER_CONTROL_INTERACTOR = 4;
    public static final int ALLOWLIST_ID_REGISTERED_STORE = 6;
    public static final int ALLOWLIST_ID_SEARCH_ENGINE = 7;
    public static final int ALLOWLIST_ID_TEST = 1;
    public static final java.lang.String KEY_ALLOWLIST_RESPONSE = "allowlist_response";
    public static final java.lang.String METADATA_KEY_APP_FUNCTION_TYPE_DOWNLOADED = "android.allowlist.metadata.key.APP_FUNCTION_TYPE_DOWNLOADED";
    public static final java.lang.String METADATA_KEY_APP_FUNCTION_TYPE_PREINSTALLED = "android.allowlist.metadata.key.APP_FUNCTION_TYPE_PREINSTALLED";
    public static final java.lang.String METADATA_KEY_COMPUTER_CONTROL_EXPIRATION_TIME_MILLIS = "android.allowlist.metadata.key.COMPUTER_CONTROL_EXPIRATION_TIME_MILLIS";
    public static final java.lang.String METADATA_KEY_COMPUTER_CONTROL_TYPE_DEVELOPMENT = "android.allowlist.metadata.key.COMPUTER_CONTROL_TYPE_DEVELOPMENT";
    public static final java.lang.String METADATA_KEY_COMPUTER_CONTROL_TYPE_DOWNLOADED = "android.allowlist.metadata.key.COMPUTER_CONTROL_TYPE_DOWNLOADED";
    public static final java.lang.String METADATA_KEY_COMPUTER_CONTROL_TYPE_PREINSTALLED = "android.allowlist.metadata.key.COMPUTER_CONTROL_TYPE_PREINSTALLED";
    public static final java.lang.String METADATA_KEY_REGISTERED_STORE_DEVELOPER_NAME = "android.allowlist.metadata.key.REGISTERED_STORE_DEVELOPER_NAME";
    public static final java.lang.String METADATA_KEY_REGISTERED_STORE_DEVELOPER_URL = "android.allowlist.metadata.key.REGISTERED_STORE_DEVELOPER_URL";
    public static final java.lang.String METADATA_KEY_REGISTERED_STORE_IS_RESTRICTED = "android.allowlist.metadata.key.REGISTERED_STORE_IS_RESTRICTED";
    public static final java.lang.String REQUEST_KEY_FILTER_PACKAGES = "android.allowlist.request.key.FILTER_PACKAGES";
    public static final java.lang.String REQUEST_KEY_FILTER_TARGETS = "android.allowlist.request.key.FILTER_TARGETS";
    public static final java.lang.String REQUEST_KEY_INSTALLED_PACKAGES_ONLY = "android.allowlist.request.key.INSTALLED_PACKAGES_ONLY";
    public static final java.lang.String REQUEST_KEY_TEST_RESPONSE_STATUS = "android.allowlist.request.key.TEST_RESPONSE_STATUS";
    public static final java.lang.String REQUEST_KEY_USER = "android.allowlist.request.key.USER";
    public static final java.lang.String RESPONSE_KEY_ALLOWED_PACKAGES = "android.allowlist.response.key.ALLOWED_PACKAGES";
    public static final java.lang.String RESPONSE_KEY_ALLOWED_PACKAGES_WITH_METADATA = "android.allowlist.response.key.ALLOWED_PACKAGES_WITH_METADATA";
    public static final java.lang.String RESPONSE_KEY_ALLOWED_PACKAGE_MULTI_MAP = "android.allowlist.response.key.ALLOWED_PACKAGE_MULTI_MAP";
    public static final java.lang.String RESPONSE_KEY_ALLOWED_PACKAGE_WITH_METADATA_MULTI_MAP = "android.allowlist.response.key.ALLOWED_PACKAGE_WITH_METADATA_MULTI_MAP";
    public static final java.lang.String RESPONSE_KEY_REGISTERED_STORE_REGION_SUPPORTED = "android.allowlist.response.key.REGISTERED_STORE_REGION_SUPPORTED";
    public static final int RESPONSE_STATUS_ERROR_INVALID_REQUEST = 3;
    public static final int RESPONSE_STATUS_ERROR_NETWORK = 4;
    public static final int RESPONSE_STATUS_ERROR_PROVIDER = 2;
    public static final int RESPONSE_STATUS_ERROR_UNKNOWN = 1;
    public static final int RESPONSE_STATUS_SUCCESS = 0;
    public static final android.util.SparseBooleanArray ROOT_DEBUGGABLE_ALLOWLISTS = null;
    public static final android.util.SparseBooleanArray SHELL_DEBUGGABLE_ALLOWLISTS = null;
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

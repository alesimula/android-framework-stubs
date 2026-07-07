package android.content.res;

public class Element {
    private static final java.lang.String BAD_COMPONENT_NAME_CHARS = ";,[](){}:?%^*|/\\";
    private static final int DEFAULT_MAX_STRING_ATTR_LENGTH = 32768;
    private static final int MAX_ATTR_LEN_MIMETYPE = 255;
    private static final int MAX_ATTR_LEN_NAME = 1024;
    private static final int MAX_ATTR_LEN_PACKAGE = 256;
    private static final int MAX_ATTR_LEN_PATH = 4000;
    private static final int MAX_ATTR_LEN_PERMISSION_GROUP = 256;
    private static final int MAX_ATTR_LEN_URL_COMPONENT = 256;
    private static final int MAX_ATTR_LEN_VALUE = 32768;
    private static final int MAX_POOL_SIZE = 128;
    private static final int MAX_TOTAL_META_DATA_SIZE = 262144;
    private static final java.lang.String TAG = "PackageParsing";
    protected static final java.lang.String TAG_ACTION = "action";
    protected static final java.lang.String TAG_ACTIVITY = "activity";
    protected static final java.lang.String TAG_ACTIVITY_ALIAS = "activity-alias";
    protected static final java.lang.String TAG_ADOPT_PERMISSIONS = "adopt-permissions";
    protected static final java.lang.String TAG_APPLICATION = "application";
    protected static final java.lang.String TAG_ATTRIBUTION = "attribution";
    protected static final java.lang.String TAG_ATTR_BACKUP_AGENT = "backupAgent";
    protected static final java.lang.String TAG_ATTR_CATEGORY = "category";
    protected static final java.lang.String TAG_ATTR_FRAGMENT = "fragment";
    protected static final java.lang.String TAG_ATTR_FRAGMENT_ADVANCED_PATTERN = "fragmentAdvancedPattern";
    protected static final java.lang.String TAG_ATTR_FRAGMENT_PATTERN = "fragmentPattern";
    protected static final java.lang.String TAG_ATTR_FRAGMENT_PREFIX = "fragmentPrefix";
    protected static final java.lang.String TAG_ATTR_FRAGMENT_SUFFIX = "fragmentSuffix";
    protected static final java.lang.String TAG_ATTR_HOST = "host";
    protected static final java.lang.String TAG_ATTR_MANAGE_SPACE_ACTIVITY = "manageSpaceActivity";
    protected static final java.lang.String TAG_ATTR_MIMEGROUP = "mimeGroup";
    protected static final java.lang.String TAG_ATTR_MIMETYPE = "mimeType";
    protected static final java.lang.String TAG_ATTR_NAME = "name";
    protected static final java.lang.String TAG_ATTR_PACKAGE = "package";
    protected static final java.lang.String TAG_ATTR_PARENT_ACTIVITY_NAME = "parentActivityName";
    protected static final java.lang.String TAG_ATTR_PATH = "path";
    protected static final java.lang.String TAG_ATTR_PATH_ADVANCED_PATTERN = "pathAdvancedPattern";
    protected static final java.lang.String TAG_ATTR_PATH_PATTERN = "pathPattern";
    protected static final java.lang.String TAG_ATTR_PATH_PREFIX = "pathPrefix";
    protected static final java.lang.String TAG_ATTR_PATH_SUFFIX = "pathSuffix";
    protected static final java.lang.String TAG_ATTR_PERMISSION = "permission";
    protected static final java.lang.String TAG_ATTR_PERMISSION_GROUP = "permissionGroup";
    protected static final java.lang.String TAG_ATTR_PORT = "port";
    protected static final java.lang.String TAG_ATTR_PROCESS = "process";
    protected static final java.lang.String TAG_ATTR_QUERY = "query";
    protected static final java.lang.String TAG_ATTR_QUERY_ADVANCED_PATTERN = "queryAdvancedPattern";
    protected static final java.lang.String TAG_ATTR_QUERY_PATTERN = "queryPattern";
    protected static final java.lang.String TAG_ATTR_QUERY_PREFIX = "queryPrefix";
    protected static final java.lang.String TAG_ATTR_QUERY_SUFFIX = "querySuffix";
    protected static final java.lang.String TAG_ATTR_READ_PERMISSION = "readPermission";
    protected static final java.lang.String TAG_ATTR_REQUIRED_ACCOUNT_TYPE = "requiredAccountType";
    protected static final java.lang.String TAG_ATTR_REQUIRED_SYSTEM_PROPERTY_NAME = "requiredSystemPropertyName";
    protected static final java.lang.String TAG_ATTR_REQUIRED_SYSTEM_PROPERTY_VALUE = "requiredSystemPropertyValue";
    protected static final java.lang.String TAG_ATTR_RESTRICTED_ACCOUNT_TYPE = "restrictedAccountType";
    protected static final java.lang.String TAG_ATTR_SCHEME = "scheme";
    protected static final java.lang.String TAG_ATTR_SHARED_USER_ID = "sharedUserId";
    protected static final java.lang.String TAG_ATTR_TARGET_ACTIVITY = "targetActivity";
    protected static final java.lang.String TAG_ATTR_TARGET_NAME = "targetName";
    protected static final java.lang.String TAG_ATTR_TARGET_PACKAGE = "targetPackage";
    protected static final java.lang.String TAG_ATTR_TARGET_PROCESSES = "targetProcesses";
    protected static final java.lang.String TAG_ATTR_TASK_AFFINITY = "taskAffinity";
    protected static final java.lang.String TAG_ATTR_VALUE = "value";
    protected static final java.lang.String TAG_ATTR_VERSION_NAME = "versionName";
    protected static final java.lang.String TAG_ATTR_WRITE_PERMISSION = "writePermission";
    protected static final java.lang.String TAG_ATTR_ZYGOTE_PRELOAD_NAME = "zygotePreloadName";
    protected static final java.lang.String TAG_ATTR_ZYGOTE_PRELOAD_NATIVE_FUNC = "zygotePreloadNativeFunc";
    protected static final java.lang.String TAG_ATTR_ZYGOTE_PRELOAD_NATIVE_LIB = "zygotePreloadNativeLib";
    protected static final java.lang.String TAG_CATEGORY = "category";
    protected static final java.lang.String TAG_COMPATIBLE_SCREENS = "compatible-screens";
    protected static final java.lang.String TAG_DATA = "data";
    protected static final java.lang.String TAG_EAT_COMMENT = "eat-comment";
    protected static final java.lang.String TAG_FEATURE_GROUP = "feature-group";
    protected static final java.lang.String TAG_GRANT_URI_PERMISSION = "grant-uri-permission";
    protected static final java.lang.String TAG_INSTRUMENTATION = "instrumentation";
    protected static final java.lang.String TAG_INTENT = "intent";
    protected static final java.lang.String TAG_INTENT_FILTER = "intent-filter";
    protected static final java.lang.String TAG_KEY_SETS = "key-sets";
    protected static final java.lang.String TAG_LAYOUT = "layout";
    protected static final java.lang.String TAG_MANIFEST = "manifest";
    protected static final java.lang.String TAG_META_DATA = "meta-data";
    protected static final java.lang.String TAG_ORIGINAL_PACKAGE = "original-package";
    protected static final java.lang.String TAG_OVERLAY = "overlay";
    protected static final java.lang.String TAG_PACKAGE = "package";
    protected static final java.lang.String TAG_PACKAGE_VERIFIER = "package-verifier";
    protected static final java.lang.String TAG_PATH_PERMISSION = "path-permission";
    protected static final java.lang.String TAG_PERMISSION = "permission";
    protected static final java.lang.String TAG_PERMISSION_GROUP = "permission-group";
    protected static final java.lang.String TAG_PERMISSION_TREE = "permission-tree";
    protected static final java.lang.String TAG_PROCESS = "process";
    protected static final java.lang.String TAG_PROCESSES = "processes";
    protected static final java.lang.String TAG_PROFILEABLE = "profileable";
    protected static final java.lang.String TAG_PROPERTY = "property";
    protected static final java.lang.String TAG_PROTECTED_BROADCAST = "protected-broadcast";
    protected static final java.lang.String TAG_PROVIDER = "provider";
    protected static final java.lang.String TAG_QUERIES = "queries";
    protected static final java.lang.String TAG_RECEIVER = "receiver";
    protected static final java.lang.String TAG_RESTRICT_UPDATE = "restrict-update";
    protected static final java.lang.String TAG_SCREEN = "screen";
    protected static final java.lang.String TAG_SERVICE = "service";
    protected static final java.lang.String TAG_SUPPORTS_GL_TEXTURE = "supports-gl-texture";
    protected static final java.lang.String TAG_SUPPORTS_INPUT = "supports-input";
    protected static final java.lang.String TAG_SUPPORTS_SCREENS = "supports-screens";
    protected static final java.lang.String TAG_SUPPORT_SCREENS = "supports-screens";
    protected static final java.lang.String TAG_URI_RELATIVE_FILTER_GROUP = "uri-relative-filter-group";
    protected static final java.lang.String TAG_USES_CONFIGURATION = "uses-configuration";
    protected static final java.lang.String TAG_USES_FEATURE = "uses-feature";
    protected static final java.lang.String TAG_USES_GL_TEXTURE = "uses-gl-texture";
    protected static final java.lang.String TAG_USES_LIBRARY = "uses-library";
    protected static final java.lang.String TAG_USES_NATIVE_LIBRARY = "uses-native-library";
    protected static final java.lang.String TAG_USES_PERMISSION = "uses-permission";
    protected static final java.lang.String TAG_USES_PERMISSION_SDK_23 = "uses-permission-sdk-23";
    protected static final java.lang.String TAG_USES_PERMISSION_SDK_M = "uses-permission-sdk-m";
    protected static final java.lang.String TAG_USES_SDK = "uses-sdk";
    protected static final java.lang.String TAG_USES_SPLIT = "uses-split";
    private static final java.lang.ThreadLocal<android.util.Pools.SimplePool<android.content.res.Element>> sPool = null;
    private long mChildTagMask;
    java.lang.String mTag;
    private final android.content.res.TagCounter[] mTagCounters = null;
    private int mTotalComponentMetadataSize;
    public Element() {}
    private static int getActionResStrMaxLen(int p0) { return 0; }
    private static int getActivityAliasResStrMaxLen(int p0) { return 0; }
    private static int getActivityResStrMaxLen(int p0) { return 0; }
    private static int getApplicationResStrMaxLen(int p0) { return 0; }
    private static int getAttrStrMaxLen(java.lang.String p0) { return 0; }
    private static int getCategoryResStrMaxLen(int p0) { return 0; }
    private static int getCounterIdx(java.lang.String p0) { return 0; }
    private static int getDataResStrMaxLen(int p0) { return 0; }
    private static int getGrantUriPermissionResStrMaxLen(int p0) { return 0; }
    private static int getInstrumentationResStrMaxLen(int p0) { return 0; }
    private static int getManifestResStrMaxLen(int p0) { return 0; }
    private static int getMetaDataResStrMaxLen(int p0) { return 0; }
    private static int getOverlayResStrMaxLen(int p0) { return 0; }
    private static int getPathPermissionResStrMaxLen(int p0) { return 0; }
    private static int getPermissionGroupResStrMaxLen(int p0) { return 0; }
    private static int getPermissionResStrMaxLen(int p0) { return 0; }
    private static int getPermissionTreeResStrMaxLen(int p0) { return 0; }
    private static int getProcessResStrMaxLen(int p0) { return 0; }
    private static int getPropertyResStrMaxLen(int p0) { return 0; }
    private static int getProviderResStrMaxLen(int p0) { return 0; }
    private static int getReceiverResStrMaxLen(int p0) { return 0; }
    private int getResStrMaxLen(int p0) { return 0; }
    private static int getServiceResStrMaxLen(int p0) { return 0; }
    private static int getUsesFeatureResStrMaxLen(int p0) { return 0; }
    private static int getUsesLibraryResStrMaxLen(int p0) { return 0; }
    private static int getUsesNativeLibraryResStrMaxLen(int p0) { return 0; }
    private static int getUsesPermissionResStrMaxLen(int p0) { return 0; }
    private void init(java.lang.String p0) {}
    private void initializeCounter(java.lang.String p0, int p1) {}
    private boolean isComponentNameAttr(int p0) { return false; }
    private boolean isComponentNameAttr(java.lang.String p0) { return false; }
    static android.content.res.Element obtain(java.lang.String p0) { return null; }
    static boolean shouldValidate(java.lang.String p0) { return false; }
    boolean hasChild(java.lang.String p0) { return false; }
    void recycle() {}
    void seen(android.content.res.Element p0) {}
    void validateComponentMetadata(java.lang.String p0) {}
    void validateComponentName(java.lang.CharSequence p0) {}
    void validateResStrAttr(int p0, java.lang.CharSequence p1) {}
    void validateStrAttr(java.lang.String p0, java.lang.String p1) {}
}

package com.android.internal.pm.pkg.parsing;

public class ParsingPackageUtils {
    public static final java.lang.String ANDROID_MANIFEST_FILENAME = "AndroidManifest.xml";
    public static final float ASPECT_RATIO_NOT_SET = -1.0f;
    public static final boolean DEBUG_BACKUP = false;
    public static final boolean DEBUG_JAR = false;
    public static final float DEFAULT_PRE_O_MAX_ASPECT_RATIO = 1.8600000143051147f;
    public static final java.lang.String METADATA_ACTIVITY_LAUNCH_MODE = "android.activity.launch_mode";
    public static final java.lang.String METADATA_ACTIVITY_WINDOW_LAYOUT_AFFINITY = "android.activity_window_layout_affinity";
    public static final java.lang.String METADATA_CAN_DISPLAY_ON_REMOTE_DEVICES = "android.can_display_on_remote_devices";
    public static final java.lang.String METADATA_MAX_ASPECT_RATIO = "android.max_aspect";
    public static final java.lang.String METADATA_SUPPORTS_SIZE_CHANGES = "android.supports_size_changes";
    public static final java.lang.String MNT_EXPAND = "/mnt/expand/";
    public static final int PARSE_APEX = 1024;
    public static final int PARSE_APK_IN_APEX = 512;
    public static final int PARSE_CHATTY = -2147483648;
    public static final int PARSE_COLLECT_CERTIFICATES = 32;
    public static final int PARSE_DEFAULT_INSTALL_LOCATION = -1;
    public static final int PARSE_DEFAULT_TARGET_SANDBOX = 1;
    public static final int PARSE_ENFORCE_CODE = 64;
    public static final int PARSE_EXTERNAL_STORAGE = 8;
    public static final int PARSE_IGNORE_OVERLAY_REQUIRED_SYSTEM_PROPERTY = 128;
    public static final int PARSE_IGNORE_PROCESSES = 2;
    public static final int PARSE_IS_SYSTEM_DIR = 16;
    public static final int PARSE_MUST_BE_APK = 1;
    public static final boolean RIGID_PARSER = false;
    public static final java.lang.String[] SDK_CODENAMES = null;
    public static final int SDK_VERSION = Integer.valueOf(0);
    private static final java.lang.String TAG = "PackageParsing";
    public static final java.lang.String TAG_ADOPT_PERMISSIONS = "adopt-permissions";
    public static final java.lang.String TAG_ALLOW_COMPONENT_ACCESS = "allow-component-access";
    public static final java.lang.String TAG_APPLICATION = "application";
    public static final java.lang.String TAG_ATTRIBUTION = "attribution";
    public static final java.lang.String TAG_COMPATIBLE_SCREENS = "compatible-screens";
    public static final java.lang.String TAG_EAT_COMMENT = "eat-comment";
    public static final java.lang.String TAG_FEATURE_GROUP = "feature-group";
    public static final java.lang.String TAG_INSTALL_CONSTRAINTS = "install-constraints";
    public static final java.lang.String TAG_INSTRUMENTATION = "instrumentation";
    public static final java.lang.String TAG_KEY_SETS = "key-sets";
    public static final java.lang.String TAG_MANIFEST = "manifest";
    public static final java.lang.String TAG_ORIGINAL_PACKAGE = "original-package";
    public static final java.lang.String TAG_OVERLAY = "overlay";
    public static final java.lang.String TAG_PACKAGE = "package";
    public static final java.lang.String TAG_PACKAGE_VERIFIER = "package-verifier";
    public static final java.lang.String TAG_PERMISSION = "permission";
    public static final java.lang.String TAG_PERMISSION_GROUP = "permission-group";
    public static final java.lang.String TAG_PERMISSION_TREE = "permission-tree";
    public static final java.lang.String TAG_PROFILEABLE = "profileable";
    public static final java.lang.String TAG_PROTECTED_BROADCAST = "protected-broadcast";
    public static final java.lang.String TAG_QUERIES = "queries";
    public static final java.lang.String TAG_RECEIVER = "receiver";
    public static final java.lang.String TAG_RESTRICT_UPDATE = "restrict-update";
    public static final java.lang.String TAG_SUPPORTS_INPUT = "supports-input";
    public static final java.lang.String TAG_SUPPORT_SCREENS = "supports-screens";
    public static final java.lang.String TAG_USES_CONFIGURATION = "uses-configuration";
    public static final java.lang.String TAG_USES_FEATURE = "uses-feature";
    public static final java.lang.String TAG_USES_GL_TEXTURE = "uses-gl-texture";
    public static final java.lang.String TAG_USES_PERMISSION = "uses-permission";
    public static final java.lang.String TAG_USES_PERMISSION_SDK_23 = "uses-permission-sdk-23";
    public static final java.lang.String TAG_USES_PERMISSION_SDK_M = "uses-permission-sdk-m";
    public static final java.lang.String TAG_USES_SDK = "uses-sdk";
    public static final java.lang.String TAG_USES_SPLIT = "uses-split";
    public static boolean sCompatibilityModeEnabled;
    public static boolean sUseRoundIcon;
    private final com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback mCallback = null;
    private final android.util.DisplayMetrics mDisplayMetrics = null;
    private final java.lang.String[] mSeparateProcesses = null;
    private final java.util.List<android.permission.PermissionManager.SplitPermissionInfo> mSplitPermissionInfos = null;
    public ParsingPackageUtils(java.lang.String[] p0, android.util.DisplayMetrics p1, java.util.List<android.permission.PermissionManager.SplitPermissionInfo> p2, com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback p3) {}
    private static float aFloat(float p0, int p1, android.content.res.TypedArray p2) { return 0.0f; }
    private static float aFloat(int p0, android.content.res.TypedArray p1) { return 0.0f; }
    private static void adjustPackageToBeUnresizeableAndUnpipable(com.android.internal.pm.pkg.parsing.ParsingPackage p0) {}
    private void afterParseBaseApplication(com.android.internal.pm.pkg.parsing.ParsingPackage p0) {}
    private static int anInt(int p0, int p1, android.content.res.TypedArray p2) { return 0; }
    private static int anInt(int p0, android.content.res.TypedArray p1) { return 0; }
    private static int anInteger(int p0, int p1, android.content.res.TypedArray p2) { return 0; }
    private static boolean bool(boolean p0, int p1, android.content.res.TypedArray p2) { return false; }
    private static void convertCompatPermissions(com.android.internal.pm.pkg.parsing.ParsingPackage p0) {}
    private void convertSplitPermissions(com.android.internal.pm.pkg.parsing.ParsingPackage p0) {}
    private static android.util.SparseIntArray exactSizedCopyOfSparseArray(android.util.SparseIntArray p0) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.component.ParsedActivity> generateAppDetailsHiddenActivity(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.parsing.pkg.ParsedPackage p1, boolean p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.parsing.pkg.ParsedPackage p1, boolean p2, java.util.function.Supplier<java.io.File> p3) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.parsing.pkg.ParsedPackage p1, boolean p2, java.util.function.Supplier<java.io.File> p3, android.util.apk.InitAppScanMetrics p4) { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, boolean p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, int p3, java.lang.String[] p4, boolean p5, java.util.function.Supplier<java.io.File> p6) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, int p3, java.lang.String[] p4, boolean p5, java.util.function.Supplier<java.io.File> p6, android.util.apk.InitAppScanMetrics p7) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, boolean p3, android.content.pm.SigningDetails p4, int p5) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, boolean p3, android.content.pm.SigningDetails p4, int p5, java.util.function.Supplier<java.io.File> p6) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.SigningDetails> getSigningDetails(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, boolean p2, boolean p3, android.content.pm.SigningDetails p4, int p5, java.util.function.Supplier<java.io.File> p6, android.util.apk.InitAppScanMetrics p7) { return null; }
    private static java.lang.String getVolumeUuid(java.lang.String p0) { return null; }
    private static boolean hasDomainURLs(com.android.internal.pm.pkg.parsing.ParsingPackage p0) { return false; }
    private boolean isMainComponentTag(java.lang.String p0) { return false; }
    private boolean isValidPurpose(java.lang.String p0, int p1, int p2) { return false; }
    private static java.lang.String nonConfigString(int p0, int p1, android.content.res.TypedArray p2) { return null; }
    private static java.lang.String nonResString(int p0, android.content.res.TypedArray p1) { return null; }
    public static android.content.pm.parsing.result.ParseResult<java.lang.String[]> parseAdditionalCertificates(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseAdoptPermissions(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseAttribution(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseBaseApk(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, java.lang.String p2, com.android.internal.pm.split.SplitAssetLoader p3, int p4, boolean p5) { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseBaseApk(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, java.lang.String p2, android.content.res.Resources p3, android.content.res.XmlResourceParser p4, int p5, boolean p6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private android.content.pm.parsing.result.ParseResult parseBaseApkTag(java.lang.String p0, android.content.pm.parsing.result.ParseInput p1, com.android.internal.pm.pkg.parsing.ParsingPackage p2, android.content.res.Resources p3, android.content.res.XmlResourceParser p4, int p5) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseBaseApkTags(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.TypedArray p2, android.content.res.Resources p3, android.content.res.XmlResourceParser p4, int p5, boolean p6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private void parseBaseAppBasicFlags(com.android.internal.pm.pkg.parsing.ParsingPackage p0, android.content.res.TypedArray p1) {}
    private android.content.pm.parsing.result.ParseResult parseBaseAppChildTag(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, com.android.internal.pm.pkg.parsing.ParsingPackage p2, android.content.res.Resources p3, android.content.res.XmlResourceParser p4, int p5) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseBaseApplication(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, int p4, boolean p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseClusterPackage(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.parsing.pkg.ParsedPackage> parseDefault(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2, java.util.List<android.permission.PermissionManager.SplitPermissionInfo> p3, boolean p4, com.android.internal.pm.pkg.parsing.ParsingPackageUtils.Callback p5) { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.util.SparseIntArray> parseExtensionSdk(android.content.pm.parsing.result.ParseInput p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, android.util.SparseIntArray p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseFeatureGroup(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.content.pm.FeatureInfo parseFeatureInfo(android.content.res.Resources p0, android.util.AttributeSet p1) { return null; }
    private android.content.pm.parsing.result.ParseResult<java.lang.String> parseGeneralPurpose(android.content.pm.parsing.result.ParseInput p0, android.content.res.Resources p1, android.util.AttributeSet p2) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseInstallConstraints(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, java.util.Set<java.lang.String> p4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseInstrumentation(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseKeySets(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseLibrary(com.android.internal.pm.pkg.parsing.ParsingPackage p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, android.content.pm.parsing.result.ParseInput p3) { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackageUtils.ParseMainComponentResult> parseMainComponent(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, java.lang.String p4, java.lang.String p5, int p6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.PackageManager.Property> parseMetaData(com.android.internal.pm.pkg.parsing.ParsingPackage p0, com.android.internal.pm.pkg.component.ParsedComponent p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, java.lang.String p4, android.content.pm.parsing.result.ParseInput p5) { return null; }
    public static int parseMinOrMaxSdkVersion(android.content.res.TypedArray p0, int p1, int p2) { return 0; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseMonolithicPackage(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseOriginalPackage(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseOverlay(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parsePermission(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, int p4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parsePermissionGroup(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parsePermissionTree(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseProcesses(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, java.lang.String[] p4, int p5) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseProfileable(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseProtectedBroadcast(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) { return null; }
    private android.content.pm.parsing.result.ParseResult<java.lang.String> parsePurpose(android.content.pm.parsing.result.ParseInput p0, android.content.res.Resources p1, android.util.AttributeSet p2) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseQueries(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private android.content.pm.parsing.result.ParseResult<java.lang.String> parseRequiredFeature(android.content.pm.parsing.result.ParseInput p0, android.content.res.Resources p1, android.util.AttributeSet p2) { return null; }
    private android.content.pm.parsing.result.ParseResult<java.lang.String> parseRequiredNotFeature(android.content.pm.parsing.result.ParseInput p0, android.content.res.Resources p1, android.util.AttributeSet p2) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseRestrictUpdateHash(int p0, android.content.pm.parsing.result.ParseInput p1, com.android.internal.pm.pkg.parsing.ParsingPackage p2, android.content.res.Resources p3, android.content.res.XmlResourceParser p4) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseSdkLibrary(com.android.internal.pm.pkg.parsing.ParsingPackage p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, android.content.pm.parsing.result.ParseInput p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseSharedUser(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.TypedArray p2) { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseSplitApk(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, int p2, android.content.res.AssetManager p3, int p4) { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseSplitApk(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, int p4, int p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseSplitApplication(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, int p4, int p5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private android.content.pm.parsing.result.ParseResult parseSplitBaseAppChildTags(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, com.android.internal.pm.pkg.parsing.ParsingPackage p2, android.content.res.Resources p3, android.content.res.XmlResourceParser p4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseStaticLibrary(com.android.internal.pm.pkg.parsing.ParsingPackage p0, android.content.res.Resources p1, android.content.res.XmlResourceParser p2, android.content.pm.parsing.result.ParseInput p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseSupportScreens(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseUsesConfiguration(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseUsesFeature(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseUsesLibrary(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseUsesNativeLibrary(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseUsesPermission(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseUsesSdk(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3, int p4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseUsesSdkLibrary(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parseUsesStaticLibrary(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, android.content.res.Resources p2, android.content.res.XmlResourceParser p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static void readConfigUseRoundIcon(android.content.res.Resources p0) {}
    public static android.util.ArrayMap<java.lang.String, android.util.ArraySet<java.security.PublicKey>> readKeySetMapping(android.os.Parcel p0) { return null; }
    private static int resId(int p0, android.content.res.TypedArray p1) { return 0; }
    public static void setCompatibilityModeEnabled(boolean p0) {}
    private static void setMaxAspectRatio(com.android.internal.pm.pkg.parsing.ParsingPackage p0) {}
    private void setMinAspectRatio(com.android.internal.pm.pkg.parsing.ParsingPackage p0) {}
    private void setSupportsSizeChanges(com.android.internal.pm.pkg.parsing.ParsingPackage p0) {}
    private static java.lang.String string(int p0, android.content.res.TypedArray p1) { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> validateBaseApkTags(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1, int p2) { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> validateSingleUserComponents(android.content.pm.parsing.result.ParseInput p0, android.util.ArraySet<com.android.internal.pm.pkg.component.ParsedMainComponent> p1, int p2, java.lang.String p3, java.lang.String p4) { return null; }
    private android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> validateSingleUserProcess(android.content.pm.parsing.result.ParseInput p0, com.android.internal.pm.pkg.parsing.ParsingPackage p1) { return null; }
    public static void writeKeySetMapping(android.os.Parcel p0, java.util.Map<java.lang.String, android.util.ArraySet<java.security.PublicKey>> p1) {}
    public android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parsePackage(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public android.content.pm.parsing.result.ParseResult<com.android.internal.pm.pkg.parsing.ParsingPackage> parsePackageFromPackageLite(android.content.pm.parsing.result.ParseInput p0, android.content.pm.parsing.PackageLite p1, int p2) { return null; }

    public static interface Callback {
        public java.util.Set<java.lang.String> getHiddenApiWhitelistedApps();
        public java.util.Set<java.lang.String> getInstallConstraintsAllowlist();
        public boolean hasFeature(java.lang.String p0);
        public com.android.internal.pm.pkg.parsing.ParsingPackage startParsingPackage(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.content.res.TypedArray p3, boolean p4);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ParseFlags {
    }

    private static class ParseMainComponentResult {
        boolean mHasActivityOrder;
        boolean mHasReceiverOrder;
        boolean mHasServiceOrder;
        private ParseMainComponentResult() {}
    }
}

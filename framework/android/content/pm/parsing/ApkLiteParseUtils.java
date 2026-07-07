package android.content.pm.parsing;

public class ApkLiteParseUtils {
    public static final java.lang.String ANDROID_MANIFEST_FILENAME = "AndroidManifest.xml";
    private static final java.lang.String ANDROID_RES_NAMESPACE = "http://schemas.android.com/apk/res/android";
    public static final java.lang.String APK_FILE_EXTENSION = ".apk";
    public static final int DEFAULT_MIN_SDK_VERSION = 1;
    private static final int DEFAULT_TARGET_SDK_VERSION = 0;
    private static final int PARSE_COLLECT_CERTIFICATES = 32;
    private static final int PARSE_DEFAULT_INSTALL_LOCATION = -1;
    private static final int PARSE_IS_SYSTEM_DIR = 16;
    private static final java.lang.String[] SDK_CODENAMES = null;
    private static final int SDK_VERSION = Integer.valueOf(0);
    private static final java.lang.String TAG = "ApkLiteParseUtils";
    private static final java.lang.String TAG_APPLICATION = "application";
    private static final java.lang.String TAG_LIBRARY = "library";
    private static final java.lang.String TAG_MANIFEST = "manifest";
    private static final java.lang.String TAG_OVERLAY = "overlay";
    private static final java.lang.String TAG_PACKAGE_VERIFIER = "package-verifier";
    private static final java.lang.String TAG_PROCESS = "process";
    private static final java.lang.String TAG_PROCESSES = "processes";
    private static final java.lang.String TAG_PROFILEABLE = "profileable";
    private static final java.lang.String TAG_RECEIVER = "receiver";
    private static final java.lang.String TAG_SDK_LIBRARY = "sdk-library";
    private static final java.lang.String TAG_STATIC_LIBRARY = "static-library";
    private static final java.lang.String TAG_USES_SDK = "uses-sdk";
    private static final java.lang.String TAG_USES_SDK_LIBRARY = "uses-sdk-library";
    private static final java.lang.String TAG_USES_SPLIT = "uses-split";
    private static final java.lang.String TAG_USES_STATIC_LIBRARY = "uses-static-library";
    private static final java.util.Comparator<java.lang.String> sSplitNameComparator = null;
    public ApkLiteParseUtils() {}
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> composePackageLiteFromApks(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, android.content.pm.parsing.ApkLite p2, android.util.ArrayMap<java.lang.String, android.content.pm.parsing.ApkLite> p3) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> composePackageLiteFromApks(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, android.content.pm.parsing.ApkLite p2, android.util.ArrayMap<java.lang.String, android.content.pm.parsing.ApkLite> p3, boolean p4) { return null; }
    public static boolean isApkFile(java.io.File p0) { return false; }
    public static boolean isApkPath(java.lang.String p0) { return false; }
    private static boolean isDeviceAdminReceiver(android.content.res.XmlResourceParser p0, boolean p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return false; }
    private static java.lang.String normalizeCertDigest(java.lang.String p0) { return null; }
    private static android.content.pm.parsing.result.ParseResult<java.lang.String[]> parseAdditionalCertificates(android.content.pm.parsing.result.ParseInput p0, android.content.res.XmlResourceParser p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.ApkLite> parseApkLite(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.ApkLite> parseApkLite(android.content.pm.parsing.result.ParseInput p0, java.io.FileDescriptor p1, java.lang.String p2, int p3) { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.ApkLite> parseApkLite(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1, android.content.res.XmlResourceParser p2, android.content.pm.SigningDetails p3, int p4) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.ApkLite> parseApkLiteInner(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, java.io.FileDescriptor p2, java.lang.String p3, int p4) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> parseClusterPackageLite(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> parseMonolithicPackageLite(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> parseMonolithicPackageLite(android.content.pm.parsing.result.ParseInput p0, java.io.FileDescriptor p1, java.lang.String p2, int p3) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.content.pm.parsing.PackageLite> parsePackageLite(android.content.pm.parsing.result.ParseInput p0, java.io.File p1, int p2) { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.util.Pair<java.lang.String, java.lang.String>> parsePackageSplitNames(android.content.pm.parsing.result.ParseInput p0, android.content.res.XmlResourceParser p1) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    public static android.content.pm.parsing.result.ParseResult<android.util.Pair<java.util.Set<java.lang.String>, java.util.Set<java.lang.String>>> parseRequiredSplitTypes(android.content.pm.parsing.result.ParseInput p0, android.content.res.XmlResourceParser p1) { return null; }
    public static android.content.pm.VerifierInfo parseVerifier(android.util.AttributeSet p0) { return null; }
    private static android.content.pm.parsing.result.ParseResult<java.util.Set<java.lang.String>> separateAndValidateSplitTypes(android.content.pm.parsing.result.ParseInput p0, java.lang.String p1) { return null; }
    public static java.lang.String splitNameToFileName(android.content.pm.parsing.ApkLite p0) { return null; }

    private static class SplitNameComparator implements java.util.Comparator<java.lang.String> {
        private SplitNameComparator() {}
        public int compare(java.lang.String p0, java.lang.String p1) { return 0; }
    }
}

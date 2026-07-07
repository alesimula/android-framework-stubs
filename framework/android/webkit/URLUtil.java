package android.webkit;

public final class URLUtil {
    static final java.lang.String ASSET_BASE = "file:///android_asset/";
    static final java.lang.String CONTENT_BASE = "content:";
    private static final java.util.regex.Pattern CONTENT_DISPOSITION_PATTERN = null;
    private static final java.util.regex.Pattern DISPOSITION_PATTERN = null;
    static final java.lang.String FILE_BASE = "file:";
    private static final java.lang.String LOGTAG = "webkit";
    static final long PARSE_CONTENT_DISPOSITION_USING_RFC_6266 = 319400769L;
    static final java.lang.String PROXY_BASE = "file:///cookieless_proxy/";
    static final java.lang.String RESOURCE_BASE = "file:///android_res/";
    private static final boolean TRACE = false;
    public URLUtil() {}
    public static java.lang.String composeSearchUrl(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static byte[] decode(byte[] p0) throws java.lang.IllegalArgumentException { return null; }
    private static java.lang.String encodePlusCharacters(java.lang.String p0, java.nio.charset.Charset p1) { return null; }
    private static boolean extensionDifferentFromMimeType(java.lang.String p0, java.lang.String p1) { return false; }
    private static java.lang.String getFilenameFromContentDispositionRfc6266(java.lang.String p0) { return null; }
    private static java.lang.String getFilenameSuggestion(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String guessFileName(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    private static java.lang.String guessFileNameRfc2616(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    private static java.lang.String guessFileNameRfc6266(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static java.lang.String guessUrl(java.lang.String p0) { return null; }
    public static boolean isAboutUrl(java.lang.String p0) { return false; }
    public static boolean isAssetUrl(java.lang.String p0) { return false; }
    public static boolean isContentUrl(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public static boolean isCookielessProxyUrl(java.lang.String p0) { return false; }
    public static boolean isDataUrl(java.lang.String p0) { return false; }
    public static boolean isFileUrl(java.lang.String p0) { return false; }
    public static boolean isHttpUrl(java.lang.String p0) { return false; }
    public static boolean isHttpsUrl(java.lang.String p0) { return false; }
    public static boolean isJavaScriptUrl(java.lang.String p0) { return false; }
    public static boolean isNetworkUrl(java.lang.String p0) { return false; }
    public static boolean isResourceUrl(java.lang.String p0) { return false; }
    public static boolean isValidUrl(java.lang.String p0) { return false; }
    static java.lang.String parseContentDisposition(java.lang.String p0) { return null; }
    private static java.lang.String parseContentDispositionRfc2616(java.lang.String p0) { return null; }
    private static java.lang.String parseExtValueString(java.lang.String p0) { return null; }
    private static int parseHex(byte p0) { return 0; }
    private static java.lang.String removeSlashEscapes(java.lang.String p0) { return null; }
    private static java.lang.String replacePathSeparators(java.lang.String p0) { return null; }
    public static java.lang.String stripAnchor(java.lang.String p0) { return null; }
    private static java.lang.String suggestExtensionFromMimeType(java.lang.String p0) { return null; }
    static boolean verifyURLEncoding(java.lang.String p0) { return false; }
}

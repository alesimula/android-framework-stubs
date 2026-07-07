package android.webkit;

public class WebViewZygote {
    private static final java.lang.String LOGTAG = "WebViewZygote";
    private static final java.lang.Object sLock = null;
    private static android.content.pm.PackageInfo sPackage;
    private static android.os.ChildZygoteProcess sZygote;
    public WebViewZygote() {}
    private static void connectToZygoteIfNeededLocked() {}
    public static java.lang.String getPackageName() { return null; }
    public static android.os.IZygoteProcess getProcess() { return null; }
    public static boolean isMultiprocessEnabled() { return false; }
    public static boolean isNativeWebViewZygoteEnabled() { return false; }
    public static boolean isNativeWebViewZygoteEnabledForPackage(android.content.pm.PackageInfo p0) { return false; }
    static void onWebViewProviderChanged(android.content.pm.PackageInfo p0) {}
    private static void stopZygoteLocked() {}
}

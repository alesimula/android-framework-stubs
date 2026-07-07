package android.webkit;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public final class WebViewUpdateManager {
    private final android.webkit.IWebViewUpdateService mService = null;
    public WebViewUpdateManager(android.webkit.IWebViewUpdateService p0) {}
    public static android.webkit.WebViewUpdateManager getInstance() { return null; }
    public java.lang.String changeProviderAndSetting(java.lang.String p0) { return null; }
    public android.webkit.WebViewProviderInfo[] getAllWebViewPackages() { return null; }
    public android.content.pm.PackageInfo getCurrentWebViewPackage() { return null; }
    public java.lang.String getCurrentWebViewPackageName() { return null; }
    public android.webkit.WebViewProviderInfo getDefaultWebViewPackage() { return null; }
    public android.webkit.WebViewProviderInfo[] getValidWebViewPackages() { return null; }
    void notifyRelroCreationCompleted() {}
    public android.webkit.WebViewProviderResponse waitForAndGetProvider() { return null; }
}

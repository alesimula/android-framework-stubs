package android.webkit;

@android.annotation.SystemApi
public final class WebViewDelegate {
    public WebViewDelegate() {}
    public void addWebViewAssetPath(android.content.Context p0) {}
    @java.lang.Deprecated
    public void callDrawGlFunction(android.graphics.Canvas p0, long p1) {}
    @java.lang.Deprecated
    public void callDrawGlFunction(android.graphics.Canvas p0, long p1, java.lang.Runnable p2) {}
    @java.lang.Deprecated
    public boolean canInvokeDrawGlFunctor(android.view.View p0) { return false; }
    @java.lang.Deprecated
    public void detachDrawGlFunctor(android.view.View p0, long p1) {}
    public void drawWebViewFunctor(android.graphics.Canvas p0, int p1) {}
    public android.app.Application getApplication() { return null; }
    public java.lang.String getDataDirectorySuffix() { return null; }
    public java.lang.String getErrorString(android.content.Context p0, int p1) { return null; }
    public int getPackageId(android.content.res.Resources p0, java.lang.String p1) { return 0; }
    public android.webkit.SelectionActionMenuClient getSelectionActionMenuClient(android.content.Context p0) { return null; }
    public android.webkit.WebViewFactory.StartupTimestamps getStartupTimestamps() { return null; }
    @java.lang.Deprecated
    public void invokeDrawGlFunctor(android.view.View p0, long p1, boolean p2) {}
    public boolean isMultiProcessEnabled() { return false; }
    public boolean isNativeWebViewZygoteEnabled() { return false; }
    public boolean isTraceTagEnabled() { return false; }
    public void setOnTraceEnabledChangeListener(android.webkit.WebViewDelegate.OnTraceEnabledChangeListener p0) {}

    public static interface OnTraceEnabledChangeListener {
        public void onTraceEnabledChange(boolean p0);
    }
}

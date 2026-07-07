package android.webkit;

public abstract class WebViewDatabase {
    protected static final java.lang.String LOGTAG = "webviewdatabase";
    @java.lang.Deprecated
    public WebViewDatabase() {}
    public static android.webkit.WebViewDatabase getInstance(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public abstract void clearFormData();
    public abstract void clearHttpAuthUsernamePassword();
    @java.lang.Deprecated
    public abstract void clearUsernamePassword();
    public abstract java.lang.String[] getHttpAuthUsernamePassword(java.lang.String p0, java.lang.String p1);
    @java.lang.Deprecated
    public abstract boolean hasFormData();
    public abstract boolean hasHttpAuthUsernamePassword();
    @java.lang.Deprecated
    public abstract boolean hasUsernamePassword();
    public abstract void setHttpAuthUsernamePassword(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3);
}

package android.webkit;

public interface WebResourceRequest {
    public java.lang.String getMethod();
    public java.util.Map<java.lang.String, java.lang.String> getRequestHeaders();
    public android.net.Uri getUrl();
    public boolean hasGesture();
    public boolean isForMainFrame();
    public boolean isRedirect();
}

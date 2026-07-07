package android.webkit;

public class WebResourceResponse {
    private java.lang.String mEncoding;
    private boolean mImmutable;
    private java.io.InputStream mInputStream;
    private java.lang.String mMimeType;
    private java.lang.String mReasonPhrase;
    private java.util.Map<java.lang.String, java.lang.String> mResponseHeaders;
    private int mStatusCode;
    public WebResourceResponse(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3, java.util.Map<java.lang.String, java.lang.String> p4, java.io.InputStream p5) {}
    public WebResourceResponse(java.lang.String p0, java.lang.String p1, java.io.InputStream p2) {}
    @android.annotation.SystemApi
    public WebResourceResponse(boolean p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4, java.util.Map<java.lang.String, java.lang.String> p5, java.io.InputStream p6) {}
    private void checkImmutable() {}
    public java.io.InputStream getData() { return null; }
    public java.lang.String getEncoding() { return null; }
    public java.lang.String getMimeType() { return null; }
    public java.lang.String getReasonPhrase() { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getResponseHeaders() { return null; }
    public int getStatusCode() { return 0; }
    public void setData(java.io.InputStream p0) {}
    public void setEncoding(java.lang.String p0) {}
    public void setMimeType(java.lang.String p0) {}
    public void setResponseHeaders(java.util.Map<java.lang.String, java.lang.String> p0) {}
    public void setStatusCodeAndReasonPhrase(int p0, java.lang.String p1) {}
}

package com.android.internal.view;

public class WebViewCaptureHelper implements com.android.internal.view.ScrollCaptureViewHelper<android.webkit.WebView> {
    private static final java.lang.String TAG = "WebViewScrollCapture";
    private int mOriginScrollX;
    private int mOriginScrollY;
    private final android.graphics.Rect mRequestWebViewLocal = null;
    private final android.graphics.Rect mWebViewBounds = null;
    public WebViewCaptureHelper() {}
    public boolean onAcceptSession(android.webkit.WebView p0) { return false; }
    public void onPrepareForEnd(android.webkit.WebView p0) {}
    public void onPrepareForStart(android.webkit.WebView p0, android.graphics.Rect p1) {}
    public void onScrollRequested(android.webkit.WebView p0, android.graphics.Rect p1, android.graphics.Rect p2, android.os.CancellationSignal p3, java.util.function.Consumer<com.android.internal.view.ScrollCaptureViewHelper.ScrollResult> p4) {}
}

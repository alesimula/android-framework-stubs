package android.webkit;

public class WebView extends android.widget.AbsoluteLayout implements android.view.ViewTreeObserver.OnGlobalFocusChangeListener, android.view.ViewGroup.OnHierarchyChangeListener, android.view.ViewDebug.HierarchyHandler {
    private static final java.lang.String LOGTAG = "WebView";
    public static final int RENDERER_PRIORITY_BOUND = 1;
    public static final int RENDERER_PRIORITY_IMPORTANT = 2;
    public static final int RENDERER_PRIORITY_WAIVED = 0;
    public static final java.lang.String SCHEME_GEO = "geo:0,0?q=";
    public static final java.lang.String SCHEME_MAILTO = "mailto:";
    public static final java.lang.String SCHEME_TEL = "tel:";
    private android.webkit.WebView.FindListenerDistributor mFindListener;
    private android.webkit.WebViewProvider mProvider;
    private final android.os.Looper mWebViewThread = null;
    public WebView(android.content.Context p0) { super((android.content.Context)null); }
    public WebView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public WebView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public WebView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected WebView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, java.util.Map<java.lang.String, java.lang.Object> p4, boolean p5) { super((android.content.Context)null); }
    protected WebView(android.content.Context p0, android.util.AttributeSet p1, int p2, java.util.Map<java.lang.String, java.lang.Object> p3, boolean p4) { super((android.content.Context)null); }
    @java.lang.Deprecated
    public WebView(android.content.Context p0, android.util.AttributeSet p1, int p2, boolean p3) { super((android.content.Context)null); }
    private void checkThread() {}
    public static void clearClientCertPreferences(java.lang.Runnable p0) {}
    @java.lang.Deprecated
    public static void disablePlatformNotifications() {}
    public static void disableWebView() {}
    @java.lang.Deprecated
    public static void enablePlatformNotifications() {}
    public static void enableSlowWholeDocumentDraw() {}
    private void ensureProviderCreated() {}
    @java.lang.Deprecated
    public static java.lang.String findAddress(java.lang.String p0) { return null; }
    public static void freeMemoryForTests() {}
    public static android.content.pm.PackageInfo getCurrentWebViewPackage() { return null; }
    private static android.webkit.WebViewFactoryProvider getFactory() { return null; }
    @java.lang.Deprecated
    public static android.webkit.PluginList getPluginList() { return null; }
    public static android.net.Uri getSafeBrowsingPrivacyPolicyUrl() { return null; }
    public static java.lang.ClassLoader getWebViewClassLoader() { return null; }
    public static void setDataDirectorySuffix(java.lang.String p0) {}
    public static void setSafeBrowsingWhitelist(java.util.List<java.lang.String> p0, android.webkit.ValueCallback<java.lang.Boolean> p1) {}
    public static void setWebContentsDebuggingEnabled(boolean p0) {}
    private void setupFindListenerIfNeeded() {}
    @java.lang.Deprecated
    public static void startSafeBrowsing(android.content.Context p0, android.webkit.ValueCallback<java.lang.Boolean> p1) {}
    public void addJavascriptInterface(java.lang.Object p0, java.lang.String p1) {}
    public void autofill(android.util.SparseArray<android.view.autofill.AutofillValue> p0) {}
    public boolean canGoBack() { return false; }
    public boolean canGoBackOrForward(int p0) { return false; }
    public boolean canGoForward() { return false; }
    @java.lang.Deprecated
    public boolean canZoomIn() { return false; }
    @java.lang.Deprecated
    public boolean canZoomOut() { return false; }
    @java.lang.Deprecated
    public android.graphics.Picture capturePicture() { return null; }
    public void clearCache(boolean p0) {}
    public void clearFormData() {}
    public void clearHistory() {}
    public void clearMatches() {}
    public void clearSslPreferences() {}
    @java.lang.Deprecated
    public void clearView() {}
    protected int computeHorizontalScrollOffset() { return 0; }
    protected int computeHorizontalScrollRange() { return 0; }
    public void computeScroll() {}
    protected int computeVerticalScrollExtent() { return 0; }
    protected int computeVerticalScrollOffset() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    public android.webkit.WebBackForwardList copyBackForwardList() { return null; }
    @java.lang.Deprecated
    public android.print.PrintDocumentAdapter createPrintDocumentAdapter() { return null; }
    public android.print.PrintDocumentAdapter createPrintDocumentAdapter(java.lang.String p0) { return null; }
    public android.webkit.WebMessagePort[] createWebMessageChannel() { return null; }
    @java.lang.Deprecated
    public void debugDump() {}
    public void destroy() {}
    public void dispatchCreateViewTranslationRequest(java.util.Map<android.view.autofill.AutofillId, long[]> p0, int[] p1, android.view.translation.TranslationCapability p2, java.util.List<android.view.translation.ViewTranslationRequest> p3) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public void documentHasImages(android.os.Message p0) {}
    public void dumpViewHierarchyWithProperties(java.io.BufferedWriter p0, int p1) {}
    @java.lang.Deprecated
    public void emulateShiftHeld() {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public void evaluateJavascript(java.lang.String p0, android.webkit.ValueCallback<java.lang.String> p1) {}
    @java.lang.Deprecated
    public int findAll(java.lang.String p0) { return 0; }
    public void findAllAsync(java.lang.String p0) {}
    public android.view.View findFocus() { return null; }
    public android.view.View findHierarchyView(java.lang.String p0, int p1) { return null; }
    public void findNext(boolean p0) {}
    public void flingScroll(int p0, int p1) {}
    @java.lang.Deprecated
    public void freeMemory() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider() { return null; }
    public android.net.http.SslCertificate getCertificate() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="webview")
    public int getContentHeight() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="webview")
    public int getContentWidth() { return 0; }
    public android.graphics.Bitmap getFavicon() { return null; }
    public android.os.Handler getHandler() { return null; }
    public android.webkit.WebView.HitTestResult getHitTestResult() { return null; }
    @java.lang.Deprecated
    public java.lang.String[] getHttpAuthUsernamePassword(java.lang.String p0, java.lang.String p1) { return null; }
    @android.view.ViewDebug.ExportedProperty(category="webview")
    public java.lang.String getOriginalUrl() { return null; }
    public int getProgress() { return 0; }
    public boolean getRendererPriorityWaivedWhenNotVisible() { return false; }
    public int getRendererRequestedPriority() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="webview")
    @java.lang.Deprecated
    public float getScale() { return 0.0f; }
    public android.webkit.WebSettings getSettings() { return null; }
    public android.view.textclassifier.TextClassifier getTextClassifier() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="webview")
    public java.lang.String getTitle() { return null; }
    public java.lang.String getTouchIconUrl() { return null; }
    @android.view.ViewDebug.ExportedProperty(category="webview")
    public java.lang.String getUrl() { return null; }
    @java.lang.Deprecated
    public int getVisibleTitleHeight() { return 0; }
    public android.webkit.WebChromeClient getWebChromeClient() { return null; }
    public android.webkit.WebViewClient getWebViewClient() { return null; }
    public android.os.Looper getWebViewLooper() { return null; }
    @android.annotation.SystemApi
    public android.webkit.WebViewProvider getWebViewProvider() { return null; }
    public android.webkit.WebViewRenderProcess getWebViewRenderProcess() { return null; }
    public android.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient() { return null; }
    @java.lang.Deprecated
    public android.view.View getZoomControls() { return null; }
    public void goBack() {}
    public void goBackOrForward(int p0) {}
    public void goForward() {}
    public void invokeZoomPicker() {}
    public boolean isPaused() { return false; }
    public boolean isPrivateBrowsingEnabled() { return false; }
    public boolean isVisibleToUserForAutofill(int p0) { return false; }
    public void loadData(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void loadDataWithBaseURL(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
    public void loadUrl(java.lang.String p0) {}
    public void loadUrl(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) {}
    void notifyFindDialogDismissed() {}
    public void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    protected void onAttachedToWindow() {}
    public boolean onCheckIsTextEditor() { return false; }
    @java.lang.Deprecated
    public void onChildViewAdded(android.view.View p0, android.view.View p1) {}
    @java.lang.Deprecated
    public void onChildViewRemoved(android.view.View p0, android.view.View p1) {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p0) { return null; }
    public void onCreateVirtualViewTranslationRequests(long[] p0, int[] p1, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> p2) {}
    protected void onDetachedFromWindowInternal() {}
    public boolean onDragEvent(android.view.DragEvent p0) { return false; }
    protected void onDraw(android.graphics.Canvas p0) {}
    protected void onDrawVerticalScrollBar(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, int p2, int p3, int p4, int p5) {}
    public void onFinishTemporaryDetach() {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    @java.lang.Deprecated
    public void onGlobalFocusChanged(android.view.View p0, android.view.View p1) {}
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    protected void onMeasure(int p0, int p1) {}
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    protected void onOverScrolled(int p0, int p1, boolean p2, boolean p3) {}
    public void onPause() {}
    public void onProvideAutofillVirtualStructure(android.view.ViewStructure p0, int p1) {}
    public void onProvideContentCaptureStructure(android.view.ViewStructure p0, int p1) {}
    public void onProvideVirtualStructure(android.view.ViewStructure p0) {}
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    public void onResume() {}
    protected void onScrollChanged(int p0, int p1, int p2, int p3) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void onStartTemporaryDetach() {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public void onVirtualViewTranslationResponses(android.util.LongSparseArray<android.view.translation.ViewTranslationResponse> p0) {}
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    public void onWindowFocusChanged(boolean p0) {}
    protected void onWindowVisibilityChanged(int p0) {}
    @java.lang.Deprecated
    public boolean overlayHorizontalScrollbar() { return false; }
    @java.lang.Deprecated
    public boolean overlayVerticalScrollbar() { return false; }
    public boolean pageDown(boolean p0) { return false; }
    public boolean pageUp(boolean p0) { return false; }
    public void pauseTimers() {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public boolean performLongClick() { return false; }
    public void postUrl(java.lang.String p0, byte[] p1) {}
    public void postVisualStateCallback(long p0, android.webkit.WebView.VisualStateCallback p1) {}
    public void postWebMessage(android.webkit.WebMessage p0, android.net.Uri p1) {}
    @java.lang.Deprecated
    public void refreshPlugins(boolean p0) {}
    public void reload() {}
    public void removeJavascriptInterface(java.lang.String p0) {}
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public boolean requestFocus(int p0, android.graphics.Rect p1) { return false; }
    public void requestFocusNodeHref(android.os.Message p0) {}
    public void requestImageRef(android.os.Message p0) {}
    @java.lang.Deprecated
    public boolean restorePicture(android.os.Bundle p0, java.io.File p1) { return false; }
    public android.webkit.WebBackForwardList restoreState(android.os.Bundle p0) { return null; }
    public void resumeTimers() {}
    @java.lang.Deprecated
    public void savePassword(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    @java.lang.Deprecated
    public boolean savePicture(android.os.Bundle p0, java.io.File p1) { return false; }
    public android.webkit.WebBackForwardList saveState(android.os.Bundle p0) { return null; }
    public void saveWebArchive(java.lang.String p0) {}
    public void saveWebArchive(java.lang.String p0, boolean p1, android.webkit.ValueCallback<java.lang.String> p2) {}
    public void setBackgroundColor(int p0) {}
    @java.lang.Deprecated
    public void setCertificate(android.net.http.SslCertificate p0) {}
    public void setDownloadListener(android.webkit.DownloadListener p0) {}
    void setFindDialogFindListener(android.webkit.WebView.FindListener p0) {}
    public void setFindListener(android.webkit.WebView.FindListener p0) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    @java.lang.Deprecated
    public void setHorizontalScrollbarOverlay(boolean p0) {}
    @java.lang.Deprecated
    public void setHttpAuthUsernamePassword(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public void setInitialScale(int p0) {}
    public void setLayerType(int p0, android.graphics.Paint p1) {}
    public void setLayoutParams(android.view.ViewGroup.LayoutParams p0) {}
    @java.lang.Deprecated
    public void setMapTrackballToArrowKeys(boolean p0) {}
    public void setNetworkAvailable(boolean p0) {}
    public void setOverScrollMode(int p0) {}
    @java.lang.Deprecated
    public void setPictureListener(android.webkit.WebView.PictureListener p0) {}
    public void setRendererPriorityPolicy(int p0, boolean p1) {}
    public void setScrollBarStyle(int p0) {}
    public void setTextClassifier(android.view.textclassifier.TextClassifier p0) {}
    @java.lang.Deprecated
    public void setVerticalScrollbarOverlay(boolean p0) {}
    public void setWebChromeClient(android.webkit.WebChromeClient p0) {}
    public void setWebViewClient(android.webkit.WebViewClient p0) {}
    public void setWebViewRenderProcessClient(android.webkit.WebViewRenderProcessClient p0) {}
    public void setWebViewRenderProcessClient(java.util.concurrent.Executor p0, android.webkit.WebViewRenderProcessClient p1) {}
    @java.lang.Deprecated
    public boolean shouldDelayChildPressedState() { return false; }
    @java.lang.Deprecated
    public boolean showFindDialog(java.lang.String p0, boolean p1) { return false; }
    public void stopLoading() {}
    public void zoomBy(float p0) {}
    public boolean zoomIn() { return false; }
    public boolean zoomOut() { return false; }

    public static interface FindListener {
        public void onFindResultReceived(int p0, int p1, boolean p2);
    }

    private class FindListenerDistributor implements android.webkit.WebView.FindListener {
        private android.webkit.WebView.FindListener mFindDialogFindListener;
        private android.webkit.WebView.FindListener mUserFindListener;
        private FindListenerDistributor(android.webkit.WebView p0) {}
        public void onFindResultReceived(int p0, int p1, boolean p2) {}
    }

    public static class HitTestResult {
        @java.lang.Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;
        @java.lang.Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;
        private java.lang.String mExtra;
        private int mType;
        @android.annotation.SystemApi
        public HitTestResult() {}
        public java.lang.String getExtra() { return null; }
        public int getType() { return 0; }
        @android.annotation.SystemApi
        public void setExtra(java.lang.String p0) {}
        @android.annotation.SystemApi
        public void setType(int p0) {}
    }

    @java.lang.Deprecated
    public static interface PictureListener {
        @java.lang.Deprecated
        public void onNewPicture(android.webkit.WebView p0, android.graphics.Picture p1);
    }

    @android.annotation.SystemApi
    public class PrivateAccess {
        public PrivateAccess(android.webkit.WebView p0) {}
        public void awakenScrollBars(int p0) {}
        public void awakenScrollBars(int p0, boolean p1) {}
        public float getHorizontalScrollFactor() { return 0.0f; }
        public int getHorizontalScrollbarHeight() { return 0; }
        public float getVerticalScrollFactor() { return 0.0f; }
        public void onScrollChanged(int p0, int p1, int p2, int p3) {}
        public void overScrollBy(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8) {}
        public void setMeasuredDimension(int p0, int p1) {}
        public void setScrollXRaw(int p0) {}
        public void setScrollYRaw(int p0) {}
        public void super_computeScroll() {}
        public boolean super_dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
        public int super_getScrollBarStyle() { return 0; }
        public android.view.WindowInsets super_onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
        public void super_onDrawVerticalScrollBar(android.graphics.Canvas p0, android.graphics.drawable.Drawable p1, int p2, int p3, int p4, int p5) {}
        public boolean super_onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
        public boolean super_onHoverEvent(android.view.MotionEvent p0) { return false; }
        public boolean super_performAccessibilityAction(int p0, android.os.Bundle p1) { return false; }
        public boolean super_performLongClick() { return false; }
        public boolean super_requestFocus(int p0, android.graphics.Rect p1) { return false; }
        public void super_scrollTo(int p0, int p1) {}
        public boolean super_setFrame(int p0, int p1, int p2, int p3) { return false; }
        public void super_setLayoutParams(android.view.ViewGroup.LayoutParams p0) {}
        public void super_startActivityForResult(android.content.Intent p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RendererPriority {
    }

    public static abstract class VisualStateCallback {
        public VisualStateCallback() {}
        public abstract void onComplete(long p0);
    }

    public class WebViewTransport {
        private android.webkit.WebView mWebview;
        public WebViewTransport(android.webkit.WebView p0) {}
        public android.webkit.WebView getWebView() { return null; }
        public void setWebView(android.webkit.WebView p0) {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.webkit.WebView> {
        private int mContentHeightId;
        private int mFaviconId;
        private int mOriginalUrlId;
        private int mProgressId;
        private boolean mPropertiesMapped;
        private int mRendererPriorityWaivedWhenNotVisibleId;
        private int mRendererRequestedPriorityId;
        private int mTitleId;
        private int mUrlId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.webkit.WebView p0, android.view.inspector.PropertyReader p1) {}
    }
}

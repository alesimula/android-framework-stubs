package com.android.internal.view;

public class ScrollCaptureViewSupport<V extends android.view.View> implements android.view.ScrollCaptureCallback {
    private static final java.lang.String SETTING_CAPTURE_DELAY = "screenshot.scroll_capture_delay";
    private static final long SETTING_CAPTURE_DELAY_DEFAULT = 60L;
    private static final java.lang.String TAG = "SCViewSupport";
    private boolean mEnded;
    private final long mPostScrollDelayMillis = 0L;
    private final com.android.internal.view.ScrollCaptureViewSupport.ViewRenderer mRenderer = null;
    private boolean mStarted;
    private final com.android.internal.view.ScrollCaptureViewHelper<V> mViewHelper = null;
    private final java.lang.ref.WeakReference<V> mWeakView = null;
    ScrollCaptureViewSupport(V p0, com.android.internal.view.ScrollCaptureViewHelper<V> p1) {}
    public static int computeScrollAmount(android.graphics.Rect p0, android.graphics.Rect p1) { return 0; }
    private void doCapture(com.android.internal.view.ScrollCaptureViewHelper.ScrollResult p0, V p1, android.graphics.Rect p2, java.util.function.Consumer<android.graphics.Rect> p3) {}
    public static android.view.View findScrollingReferenceView(android.view.ViewGroup p0, int p1) { return null; }
    private static int getColorMode(android.view.View p0) { return 0; }
    private void onScrollResult(com.android.internal.view.ScrollCaptureViewHelper.ScrollResult p0, V p1, android.os.CancellationSignal p2, java.util.function.Consumer<android.graphics.Rect> p3) {}
    public static android.graphics.Rect transformFromContainerToRequest(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return null; }
    public static android.graphics.Rect transformFromRequestToContainer(int p0, android.graphics.Rect p1, android.graphics.Rect p2) { return null; }
    public final void onScrollCaptureEnd(java.lang.Runnable p0) {}
    public final void onScrollCaptureImageRequest(android.view.ScrollCaptureSession p0, android.os.CancellationSignal p1, android.graphics.Rect p2, java.util.function.Consumer<android.graphics.Rect> p3) {}
    public final void onScrollCaptureSearch(android.os.CancellationSignal p0, java.util.function.Consumer<android.graphics.Rect> p1) {}
    public final void onScrollCaptureStart(android.view.ScrollCaptureSession p0, android.os.CancellationSignal p1, java.lang.Runnable p2) {}
    public java.lang.String toString() { return null; }

    static final class ViewRenderer {
        private static final float AMBIENT_SHADOW_ALPHA = 0.039000000804662704f;
        private static final float LIGHT_RADIUS_DP = 800.0f;
        private static final float LIGHT_Z_DP = 400.0f;
        private static final float SPOT_SHADOW_ALPHA = 0.039000000804662704f;
        private static final java.lang.String TAG = "ViewRenderer";
        private final android.graphics.RenderNode mCaptureRenderNode = null;
        private long mLastRenderedSourceDrawingId;
        private final android.graphics.HardwareRenderer mRenderer = null;
        private android.view.Surface mSurface;
        private final int[] mTempLocation = null;
        private final android.graphics.Rect mTempRect = null;
        ViewRenderer() {}
        private void setupLighting(android.view.View p0) {}
        private void transformToRoot(android.view.View p0, android.graphics.Rect p1, android.graphics.Rect p2) {}
        private boolean updateForView(android.view.View p0) { return false; }
        private void updateRootNode(android.view.View p0, android.graphics.Rect p1) {}
        public void destroy() {}
        public int renderView(android.view.View p0, android.graphics.Rect p1) { return 0; }
        public void setColorMode(int p0) {}
        public void setSurface(android.view.Surface p0) {}
        public void trimMemory() {}
    }
}

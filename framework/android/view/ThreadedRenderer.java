package android.view;

public final class ThreadedRenderer extends android.graphics.HardwareRenderer {
    public static final java.lang.String DEBUG_DIRTY_REGIONS_PROPERTY = "debug.hwui.show_dirty_regions";
    public static final java.lang.String DEBUG_FORCE_DARK = "debug.hwui.force_dark";
    public static final java.lang.String DEBUG_FPS_DIVISOR = "debug.hwui.fps_divisor";
    public static final java.lang.String DEBUG_OVERDRAW_PROPERTY = "debug.hwui.overdraw";
    public static final java.lang.String DEBUG_SHOW_LAYERS_UPDATES_PROPERTY = "debug.hwui.show_layers_updates";
    public static final java.lang.String DEBUG_SHOW_NON_RECTANGULAR_CLIP_PROPERTY = "debug.hwui.show_non_rect_clip";
    public static int EGL_CONTEXT_PRIORITY_HIGH_IMG;
    public static int EGL_CONTEXT_PRIORITY_LOW_IMG;
    public static int EGL_CONTEXT_PRIORITY_MEDIUM_IMG;
    public static int EGL_CONTEXT_PRIORITY_REALTIME_NV;
    public static final java.lang.String OVERDRAW_PROPERTY_SHOW = "show";
    static final java.lang.String PRINT_CONFIG_PROPERTY = "debug.hwui.print_config";
    static final java.lang.String PROFILE_MAXFRAMES_PROPERTY = "debug.hwui.profile.maxframes";
    public static final java.lang.String PROFILE_PROPERTY = "debug.hwui.profile";
    public static final java.lang.String PROFILE_PROPERTY_VISUALIZE_BARS = "visual_bars";
    private static final java.lang.String[] VISUALIZERS = null;
    public static boolean sRendererEnabled;
    private android.view.ViewRootImpl.CornerRadii mCornerRadii;
    private boolean mEnabled;
    private int mHeight;
    private boolean mInitialized;
    private int mInsetLeft;
    private int mInsetTop;
    private final float mLightRadius = 0.0f;
    private final float mLightY = 0.0f;
    private final float mLightZ = 0.0f;
    private java.util.ArrayList<android.graphics.HardwareRenderer.FrameDrawingCallback> mNextRtFrameCallbacks;
    private android.graphics.Outline mOutline;
    private boolean mRequested;
    private boolean mRootNodeNeedsUpdate;
    private int mSurfaceHeight;
    private int mSurfaceWidth;
    private final android.view.ThreadedRenderer.WebViewOverlayProvider mWebViewOverlayProvider = null;
    private boolean mWebViewOverlaysEnabled;
    private int mWidth;
    ThreadedRenderer(android.content.Context p0, boolean p1, java.lang.String p2) { super(); }
    ThreadedRenderer(android.content.Context p0, boolean p1, java.lang.String p2, boolean p3) { super(); }
    public static android.view.ThreadedRenderer create(android.content.Context p0, boolean p1, java.lang.String p2) { return null; }
    public static android.view.ThreadedRenderer create(android.content.Context p0, boolean p1, java.lang.String p2, boolean p3) { return null; }
    private static void destroyResources(android.view.View p0) {}
    private static int dumpArgsToFlags(java.lang.String[] p0) { return 0; }
    public static void enableForegroundTrimming() {}
    public static void handleDumpGfxInfo(java.io.FileDescriptor p0, java.lang.String[] p1) {}
    public static void initForSystemProcess() {}
    private void updateRootDisplayList(android.view.View p0, android.view.ThreadedRenderer.DrawCallbacks p1) {}
    private void updateViewTreeDisplayList(android.view.View p0) {}
    private void updateWebViewOverlayCallbacks() {}
    android.graphics.Picture captureRenderingCommands() { return null; }
    public void destroy() {}
    void destroyHardwareResources(android.view.View p0) {}
    void draw(android.view.View p0, android.view.View.AttachInfo p1, android.view.ThreadedRenderer.DrawCallbacks p2) {}
    void dumpGfxInfo(java.io.PrintWriter p0, java.io.FileDescriptor p1, java.lang.String[] p2) {}
    int getHeight() { return 0; }
    public android.graphics.RenderNode getRootNode() { return null; }
    public boolean getSurfaceControlOpacity(boolean p0) { return false; }
    int getWidth() { return 0; }
    boolean initialize(android.view.Surface p0) throws android.view.Surface.OutOfResourcesException { return false; }
    boolean initializeIfNeeded(int p0, int p1, android.view.View.AttachInfo p2, android.view.Surface p3, android.graphics.Rect p4) throws android.view.Surface.OutOfResourcesException { return false; }
    void invalidateRoot() {}
    boolean isEnabled() { return false; }
    boolean isRequested() { return false; }
    public boolean loadSystemProperties() { return false; }
    public void notifyCallbackPending() {}
    public void notifyExpensiveFrame() {}
    void registerRtFrameCallback(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
    public boolean rendererOwnsSurfaceControlOpacity() { return false; }
    android.graphics.RectF setCornerRadius(android.view.ViewRootImpl.CornerRadii p0) { return null; }
    void setEnabled(boolean p0) {}
    void setLightCenter(android.view.View.AttachInfo p0) {}
    void setRequested(boolean p0) {}
    public void setSurface(android.view.Surface p0) {}
    public void setSurfaceControl(android.view.SurfaceControl p0, android.graphics.BLASTBufferQueue p1) {}
    void setup(int p0, int p1, android.view.View.AttachInfo p2, android.graphics.Rect p3) {}
    void unregisterRtFrameCallback(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
    void updateSurface(android.view.Surface p0) throws android.view.Surface.OutOfResourcesException {}

    static interface DrawCallbacks {
        public void onPostDraw(android.graphics.RecordingCanvas p0);
        public void onPreDraw(android.graphics.RecordingCanvas p0);
    }

    public static class SimpleRenderer extends android.graphics.HardwareRenderer {
        private final float mLightRadius = 0.0f;
        private final float mLightY = 0.0f;
        private final float mLightZ = 0.0f;
        public SimpleRenderer(android.content.Context p0, java.lang.String p1, android.view.Surface p2) { super(); }
        public void draw(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
        public android.graphics.RenderNode getRootNode() { return null; }
        public void setLightCenter(android.view.Display p0, int p1, int p2) {}
    }

    private static final class WebViewOverlayProvider implements android.graphics.HardwareRenderer.PrepareSurfaceControlForWebviewCallback, android.graphics.HardwareRenderer.ASurfaceTransactionCallback {
        private static final boolean sOverlaysAreEnabled = Boolean.valueOf(false);
        private android.graphics.BLASTBufferQueue mBLASTBufferQueue;
        private boolean mHasWebViewOverlays;
        private android.view.SurfaceControl mSurfaceControl;
        private final android.view.SurfaceControl.Transaction mTransaction = null;
        private WebViewOverlayProvider() {}
        public boolean getSurfaceControlOpacity(boolean p0) { return false; }
        public boolean onMergeTransaction(long p0, long p1, long p2) { return false; }
        public void prepare() {}
        public void setBLASTBufferQueue(android.graphics.BLASTBufferQueue p0) {}
        public void setSurfaceControl(android.view.SurfaceControl p0) {}
        public boolean shouldEnableOverlaySupport() { return false; }
    }
}

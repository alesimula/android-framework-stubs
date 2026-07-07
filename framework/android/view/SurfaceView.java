package android.view;

public class SurfaceView extends android.view.View implements android.view.ViewRootImpl.SurfaceChangedCallback {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_POSITION = false;
    private static final long FORWARD_BACK_KEY_TOLERANCE_MS = 100L;
    private static final int LOGTAG_INPUT_FOCUS = 62001;
    private static final int LOGTAG_SURFACEVIEW_CALLBACK = 60006;
    private static final int LOGTAG_SURFACEVIEW_LAYOUT = 60005;
    public static final int SURFACE_LIFECYCLE_DEFAULT = 0;
    public static final int SURFACE_LIFECYCLE_FOLLOWS_ATTACHMENT = 2;
    public static final int SURFACE_LIFECYCLE_FOLLOWS_VISIBILITY = 1;
    private static final java.lang.String TAG = "SurfaceView";
    float mAlpha;
    private boolean mAttachedToWindow;
    int mBackgroundColor;
    android.view.SurfaceControl mBackgroundControl;
    private android.graphics.BLASTBufferQueue mBlastBufferQueue;
    private android.view.SurfaceControl mBlastSurfaceControl;
    java.util.ArrayList<android.view.BlurRegion> mBlurRegions;
    final java.util.ArrayList<android.view.SurfaceHolder.Callback> mCallbacks = null;
    boolean mClipSurfaceToBounds;
    float mCornerRadius;
    boolean mDrawFinished;
    private final android.view.ViewTreeObserver.OnPreDrawListener mDrawListener = null;
    boolean mDrawingStopped;
    private final java.util.concurrent.ConcurrentLinkedQueue<android.view.WindowManager.LayoutParams> mEmbeddedWindowParams = null;
    private boolean mEnableBackgroundLayer;
    int mFormat;
    private final android.view.SurfaceControl.Transaction mFrameCallbackTransaction = null;
    private boolean mGlobalListenersAdded;
    boolean mHaveFrame;
    private float mHdrHeadroom;
    boolean mIsCreating;
    long mLastLockTime;
    int mLastSurfaceHeight;
    int mLastSurfaceWidth;
    boolean mLastWindowVisibility;
    final int[] mLocation = null;
    private java.lang.String mOverrideName;
    private int mParentSurfaceSequenceId;
    private android.view.SurfaceView.SurfaceViewPositionUpdateListener mPositionListener;
    private final android.graphics.Rect mRTLastReportedPosition = null;
    private final android.graphics.RectF mRTLastSetCrop = null;
    private android.view.RemoteAccessibilityController mRemoteAccessibilityController;
    boolean mRequestedBlurRegionsChanged;
    int mRequestedFormat;
    private float mRequestedHdrHeadroom;
    int mRequestedHeight;
    private android.media.quality.PictureProfileHandle mRequestedPictureProfileHandle;
    int mRequestedSubLayer;
    private int mRequestedSurfaceLifecycleStrategy;
    boolean mRequestedVisible;
    int mRequestedWidth;
    android.graphics.Paint mRoundedViewportPaint;
    private final android.view.SurfaceControl.Transaction mRtTransaction = null;
    final android.graphics.Rect mScreenRect = null;
    private final android.view.ViewTreeObserver.OnScrollChangedListener mScrollChangedListener = null;
    private boolean mShouldEmbedAccessibilityHierarchy;
    int mSubLayer;
    final android.view.Surface mSurface = null;
    android.view.SurfaceControl mSurfaceControl;
    final java.lang.Object mSurfaceControlLock = null;
    private final android.view.SurfaceView.SurfaceControlViewHostParent mSurfaceControlViewHostParent = null;
    boolean mSurfaceCreated;
    private int mSurfaceFlags;
    final android.graphics.Rect mSurfaceFrame = null;
    int mSurfaceHeight;
    private final android.view.SurfaceHolder mSurfaceHolder = null;
    private int mSurfaceLifecycleStrategy;
    final java.util.concurrent.locks.ReentrantLock mSurfaceLock = null;
    android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
    int mSurfaceWidth;
    private final android.util.ArraySet<android.window.SurfaceSyncGroup> mSyncGroups = null;
    private java.lang.String mTag;
    private final android.graphics.Matrix mTmpMatrix = null;
    final android.graphics.Rect mTmpRect = null;
    int mTransformHint;
    private boolean mUseBlastBufferQueueAidl;
    private boolean mUseRemoteBlastBufferQueue;
    boolean mViewVisibility;
    boolean mVisible;
    int mWindowSpaceLeft;
    int mWindowSpaceTop;
    boolean mWindowStopped;
    boolean mWindowVisibility;
    public SurfaceView(android.content.Context p0) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, boolean p4) { super((android.content.Context)null); }
    private void applyOrMergeTransaction(android.view.SurfaceControl.Transaction p0, long p1) {}
    private void applyTransactionOnVriDraw(android.view.SurfaceControl.Transaction p0) {}
    private void clearSurfaceViewPort(android.graphics.Canvas p0) {}
    private void copySurface(boolean p0, boolean p1) {}
    private void createBlastSurfaceControls(android.view.ViewRootImpl p0, java.lang.String p1, android.view.SurfaceControl.Transaction p2) {}
    private void dispatchScvhAttachedToHost() {}
    private android.view.SurfaceHolder.Callback[] getSurfaceCallbacks() { return null; }
    private void handleSyncBufferCallback(android.view.SurfaceHolder.Callback[] p0, android.view.SurfaceView.SyncBufferTransactionCallback p1) {}
    private void handleSyncNoBuffer(android.view.SurfaceHolder.Callback[] p0) {}
    private void initEmbeddedHierarchyForAccessibility(android.view.SurfaceControlViewHost.SurfacePackage p0) {}
    private boolean isAboveParent() { return false; }
    private void notifySurfaceDestroyed() {}
    private void onDrawFinished() {}
    private void performDrawFinished() {}
    private boolean performSurfaceTransaction(android.view.ViewRootImpl p0, android.content.res.CompatibilityInfo.Translator p1, boolean p2, boolean p3, boolean p4, boolean p5, boolean p6, boolean p7, boolean p8, android.media.quality.PictureProfileHandle p9, android.view.SurfaceControl.Transaction p10) { return false; }
    private void redrawNeededAsync(android.view.SurfaceHolder.Callback[] p0, java.lang.Runnable p1) {}
    private void releaseSurfaces(boolean p0) {}
    private void reparentSurfacePackage(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControlViewHost.SurfacePackage p1) {}
    private void replacePositionUpdateListener(int p0, int p1, java.util.ArrayList<android.view.BlurRegion> p2) {}
    private void requestEmbeddedFocus(boolean p0) {}
    private boolean requiresSurfaceControlCreation(boolean p0, boolean p1) { return false; }
    private void runOnUiThread(java.lang.Runnable p0) {}
    private void setBufferSize(android.view.SurfaceControl.Transaction p0) {}
    private void setTag() {}
    private void setWindowStopped(boolean p0) {}
    private boolean surfaceShouldExist() { return false; }
    private android.view.SurfaceControl.Transaction updateBackgroundColor(android.view.SurfaceControl.Transaction p0) { return null; }
    private void updateBackgroundVisibility(android.view.SurfaceControl.Transaction p0) {}
    private void updateBlurRegions(android.view.SurfaceControl.Transaction p0, java.util.ArrayList<android.view.BlurRegion> p1, int p2, int p3, float p4, float p5) {}
    private void updateOpaqueFlag() {}
    private void updateRelativeZ(android.view.SurfaceControl.Transaction p0) {}
    private void updateRequestedVisibility() {}
    public void applyTransactionToFrame(android.view.SurfaceControl.Transaction p0) {}
    public void clearChildSurfacePackage() {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public java.util.List<android.view.BlurRegion> getBlurRegions() { return null; }
    public android.view.SurfaceControlViewHost.SurfacePackage getChildSurfacePackage() { return null; }
    public int getCompositionOrder() { return 0; }
    public float getCornerRadius() { return 0.0f; }
    public android.view.SurfaceHolder getHolder() { return null; }
    @java.lang.Deprecated
    public android.os.IBinder getHostToken() { return null; }
    public int getImportantForAccessibility() { return 0; }
    public java.lang.String getName() { return null; }
    public android.view.SurfaceControl getRenderingSurfaceControl() { return null; }
    public android.view.SurfaceControl getSurfaceControl() { return null; }
    public android.view.SurfaceView.SurfaceForPixelCopy getSurfaceForPixelCopy() { return null; }
    public android.graphics.Rect getSurfaceRenderPosition() { return null; }
    public boolean hasOverlappingRendering() { return false; }
    public boolean isAccessibilityHierarchyEmbeddingEnabled() { return false; }
    public boolean isFixedSize() { return false; }
    public boolean isZOrderedOnTop() { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    protected boolean onSetAlpha(int p0) { return false; }
    protected void onSetSurfacePositionAndScale(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1, int p2, int p3, float p4, float p5) {}
    protected void onWindowVisibilityChanged(int p0) {}
    void performCollectViewAttributes(android.view.View.AttachInfo p0, int p1) {}
    public void requestUpdateSurfacePositionAndScale() {}
    public void sendPictureProfileHandle(android.media.quality.PictureProfileHandle p0) {}
    public void setAccessibilityHierarchyEmbeddingEnabled(boolean p0) {}
    public void setAlpha(float p0) {}
    public void setBackgroundLayerEnabled(android.view.SurfaceControl.Transaction p0, boolean p1) {}
    public void setBlurRegions(java.util.Collection<android.view.BlurRegion> p0) {}
    public void setChildSurfacePackage(android.view.SurfaceControlViewHost.SurfacePackage p0) {}
    public void setClipBounds(android.graphics.Rect p0) {}
    public void setCompositionOrder(int p0) {}
    public void setCornerRadius(float p0) {}
    public void setDesiredHdrHeadroom(float p0) {}
    public void setEnableSurfaceClipping(boolean p0) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    public void setOverrideName(java.lang.String p0) {}
    public void setResizeBackgroundColor(int p0) {}
    public void setResizeBackgroundColor(android.view.SurfaceControl.Transaction p0, int p1) {}
    public void setSecure(boolean p0) {}
    public void setSurfaceLifecycle(int p0) {}
    public void setUseAlpha() {}
    public void setVisibility(int p0) {}
    @java.lang.Deprecated
    public void setZOrderMediaOverlay(boolean p0) {}
    @java.lang.Deprecated
    public void setZOrderOnTop(boolean p0) {}
    @java.lang.Deprecated
    public boolean setZOrderedOnTop(boolean p0, boolean p1) { return false; }
    public void surfaceCreated(android.view.SurfaceControl.Transaction p0) {}
    public void surfaceDestroyed() {}
    public void surfaceReplaced(android.view.SurfaceControl.Transaction p0) {}
    public void syncNextFrame(java.util.function.Consumer<android.view.SurfaceControl.Transaction> p0) {}
    void updateEmbeddedAccessibilityMatrix(boolean p0) {}
    protected void updateSurface() {}
    public void vriDrawStarted(boolean p0) {}

    private static class SurfaceControlViewHostParent extends android.view.ISurfaceControlViewHostParent.Stub {
        private android.view.SurfaceView mSurfaceView;
        private SurfaceControlViewHostParent() { super(); }
        void attach(android.view.SurfaceView p0) {}
        void detach() {}
        public void forwardBackKeyToParent(android.view.KeyEvent p0) {}
        public void transferFocusToParent(int p0) {}
        public void updateParams(android.view.WindowManager.LayoutParams[] p0) {}
    }

    static class SurfaceForPixelCopy {
        private final boolean mIsTemporary = false;
        private final android.view.Surface mSurface = null;
        SurfaceForPixelCopy(android.view.Surface p0, boolean p1) {}
        android.view.Surface getSurface() { return null; }
        boolean isTemporary() { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SurfaceLifecycleStrategy {
    }

    private class SurfaceViewPositionUpdateListener implements android.graphics.RenderNode.PositionUpdateListener {
        private final boolean mDisableAutoClip = false;
        private final android.view.SurfaceControl.Transaction mPositionChangedTransaction = null;
        private final java.util.ArrayList<android.view.BlurRegion> mRtBlurRegions = null;
        private final int mRtSurfaceHeight = 0;
        private final int mRtSurfaceWidth = 0;
        private final android.graphics.Rect mViewClipBounds = null;
        SurfaceViewPositionUpdateListener(int p0, int p1, java.util.ArrayList<android.view.BlurRegion> p2) {}
        public void applyStretch(long p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) {}
        public void positionChanged(long p0, int p1, int p2, int p3, int p4) {}
        public void positionChanged(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, boolean p11, boolean p12) {}
        public void positionLost(long p0) {}
    }

    private static class SyncBufferTransactionCallback extends android.gui.ITransactionReadyCallback.Stub {
        private final java.util.concurrent.CountDownLatch mCountDownLatch = null;
        private android.view.SurfaceControl.Transaction mTransaction;
        private SyncBufferTransactionCallback() { super(); }
        public void onTransactionReady(android.view.SurfaceControl.Transaction p0) {}
        android.view.SurfaceControl.Transaction waitForTransaction() { return null; }
    }
}

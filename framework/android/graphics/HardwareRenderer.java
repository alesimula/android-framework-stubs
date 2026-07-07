package android.graphics;

public class HardwareRenderer {
    private static final java.lang.String CACHE_PATH_OPENGL_SHADERS = "com.android.opengl.shaders_cache";
    private static final java.lang.String CACHE_PATH_SKIA_PIPELINES = "com.android.skia.pipelines_cache";
    private static final java.lang.String CACHE_PATH_SKIA_SHADERS = "com.android.skia.shaders_cache";
    public static final int CACHE_TRIM_ALL = 0;
    public static final int CACHE_TRIM_FONT = 1;
    public static final int CACHE_TRIM_RESOURCES = 2;
    public static final int FLAG_DUMP_ALL = 1;
    public static final int FLAG_DUMP_FRAMESTATS = 1;
    public static final int FLAG_DUMP_RESET = 2;
    private static final java.lang.String LOG_TAG = "HardwareRenderer";
    public static final int SYNC_CONTEXT_IS_STOPPED = 4;
    public static final int SYNC_FRAME_DROPPED = 8;
    public static final int SYNC_LOST_SURFACE_REWARD_IF_FOUND = 2;
    public static final int SYNC_OK = 0;
    public static final int SYNC_REDRAW_REQUESTED = 1;
    private static int sDensityDpi;
    private int mColorMode;
    private float mDesiredSdrHdrRatio;
    private int mForceDark;
    private final long mNativeProxy = 0L;
    private final android.graphics.HardwareRenderer.NotifyRendererRateLimiter mNotifyExpensiveFrameRateLimiter = null;
    private final android.graphics.HardwareRenderer.NotifyRendererRateLimiter mNotifyGpuLoadUpRateLimiter = null;
    private boolean mOpaque;
    private android.graphics.HardwareRenderer.FrameRenderRequest mRenderRequest;
    protected android.graphics.RenderNode mRootNode;
    public HardwareRenderer() {}
    public HardwareRenderer(boolean p0) {}
    public static void copySurfaceInto(android.view.Surface p0, android.graphics.HardwareRenderer.CopyRequest p1) {}
    public static android.graphics.Bitmap createHardwareBitmap(android.graphics.RenderNode p0, int p1, int p2) { return null; }
    private android.graphics.HardwareRenderer.NotifyRendererRateLimiter createNotifyRendererRateLimiter(java.lang.String p0, java.lang.Runnable p1) { return null; }
    public static native void disableVsync();
    public static void dumpGlobalProfileInfo(java.io.FileDescriptor p0, int p1) {}
    public static void enableOopr() {}
    static void invokePictureCapturedCallback(long p0, android.graphics.HardwareRenderer.PictureCapturedCallback p1) {}
    public static boolean isDrawingEnabled() { return false; }
    public static boolean isOoprEnabled() { return false; }
    protected static native boolean isWebViewOverlaysEnabled();
    private static native void nAddObserver(long p0, long p1);
    private static native void nAddRenderNode(long p0, long p1, boolean p2);
    private static native void nAllocateBuffers(long p0);
    private static native void nApplyPendingTransactions(long p0, long p1);
    private static native void nBuildLayer(long p0, long p1);
    private static native void nCancelLayerUpdate(long p0, long p1);
    private static native void nClearSyncTransaction(long p0);
    private static native boolean nCopyLayerInto(long p0, long p1, long p2);
    private static native void nCopySurfaceInto(android.view.Surface p0, int p1, int p2, int p3, int p4, android.graphics.HardwareRenderer.CopyRequest p5);
    private static native android.graphics.Bitmap nCreateHardwareBitmap(long p0, int p1, int p2);
    private static native long nCreateProxy(boolean p0, long p1, boolean p2);
    private static native long nCreateRootRenderNode();
    private static native long nCreateTextureLayer(long p0);
    private static native void nDeleteProxy(long p0);
    private static native void nDestroy(long p0, long p1);
    private static native void nDestroyHardwareResources(long p0);
    private static native void nDetachSurfaceTexture(long p0, long p1);
    private static native void nDrawRenderNode(long p0, long p1);
    private static native void nDumpGlobalProfileInfo(java.io.FileDescriptor p0, int p1);
    private static native void nDumpProfileInfo(long p0, java.io.FileDescriptor p1, int p2);
    private static native void nEnableOopr();
    private static native void nFence(long p0);
    private static native void nForceDrawNextFrame(long p0);
    private static native android.view.SurfaceControl.Transaction nGatherPendingTransactions(long p0, long p1);
    private static native int nGetRenderThreadTid(long p0);
    private static native void nInitDisplayInfo(int p0, int p1, float p2, int p3, long p4, long p5, boolean p6, boolean p7, boolean p8);
    private static native boolean nIsDrawingEnabledForProcess();
    private static native boolean nIsOoprEnabled();
    private static native boolean nLoadSystemProperties(long p0);
    private static native void nMergeWithNextTransaction(long p0, long p1, long p2);
    private static native void nNotifyCallbackPending(long p0);
    private static native void nNotifyExpensiveFrame(long p0);
    private static native void nNotifyFramePending(long p0);
    private static native void nNotifyGpuLoadUp(long p0);
    private static native void nOverrideProperty(java.lang.String p0, java.lang.String p1);
    private static native boolean nPause(long p0);
    private static native void nPushLayerUpdate(long p0, long p1);
    private static native void nRegisterAnimatingRenderNode(long p0, long p1);
    private static native void nRegisterVectorDrawableAnimator(long p0, long p1);
    private static native void nRemoveObserver(long p0, long p1);
    private static native void nRemoveRenderNode(long p0, long p1);
    private static native void nRotateProcessStatsBuffer();
    private static native void nSetASurfaceTransactionCallback(long p0, android.graphics.HardwareRenderer.ASurfaceTransactionCallback p1);
    private static native void nSetBLASTBufferQueue(long p0, long p1);
    private static native float nSetColorMode(long p0, int p1);
    private static native void nSetContentDrawBounds(long p0, int p1, int p2, int p3, int p4);
    private static native void nSetContextPriority(int p0);
    private static native void nSetCornerRadiiCallback(long p0, android.graphics.HardwareRenderer.CornerRadiiCallback p1);
    private static native void nSetDebuggingEnabled(boolean p0);
    private static native void nSetDisplayDensityDpi(int p0);
    private static native void nSetDrawingEnabledForProcess(boolean p0);
    private static native void nSetDrawingEnabledForProxy(long p0, boolean p1);
    private static native void nSetForceDark(long p0, int p1);
    private static native void nSetFrameCallback(long p0, android.graphics.HardwareRenderer.FrameDrawingCallback p1);
    private static native void nSetFrameCommitCallback(long p0, android.graphics.HardwareRenderer.FrameCommitCallback p1);
    private static native void nSetFrameCompleteCallback(long p0, android.graphics.HardwareRenderer.FrameCompleteCallback p1);
    private static native void nSetHighContrastText(boolean p0);
    private static native void nSetHintSessionEnabled(long p0, boolean p1);
    private static native void nSetIsHighEndGfx(boolean p0);
    private static native void nSetIsLowRam(boolean p0);
    private static native void nSetIsSystemOrPersistent(boolean p0);
    private static native void nSetIsolatedProcess(boolean p0);
    private static native void nSetLightAlpha(long p0, float p1, float p2);
    private static native void nSetLightGeometry(long p0, float p1, float p2, float p3, float p4);
    private static native void nSetName(long p0, java.lang.String p1);
    private static native void nSetOpaque(long p0, boolean p1);
    private static native void nSetPictureCaptureCallback(long p0, android.graphics.HardwareRenderer.PictureCapturedCallback p1);
    private static native void nSetPrepareSurfaceControlForWebviewCallback(long p0, android.graphics.HardwareRenderer.PrepareSurfaceControlForWebviewCallback p1);
    private static native void nSetProcessStatsBuffer(int p0);
    private static native void nSetRtAnimationsEnabled(boolean p0);
    private static native void nSetRtAnimationsEnabledForContext(long p0, boolean p1);
    private static native void nSetSdrWhitePoint(long p0, float p1);
    private static native void nSetStopped(long p0, boolean p1);
    private static native void nSetSurface(long p0, android.view.Surface p1, boolean p2);
    private static native void nSetSurfaceControl(long p0, long p1);
    private static native void nSetTargetSdrHdrRatio(long p0, float p1);
    private static native void nSetWaitForBufferReleaseCallback(long p0, android.graphics.HardwareRenderer.WaitForBufferReleaseCallback p1);
    private static native void nStopDrawing(long p0);
    private static native int nSyncAndDrawFrame(long p0, long[] p1, int p2);
    private static native boolean nSyncNextTransaction(long p0, java.util.function.Consumer<android.view.SurfaceControl.Transaction> p1, boolean p2);
    private static native void nTrimCaches(int p0);
    private static native void nTrimMemory(int p0);
    private static native void nUpdateRenderTargetSize(long p0, long p1, long p2);
    private void notifyGpuLoadUp() {}
    public static void overrideProperty(java.lang.String p0, java.lang.String p1) {}
    public static native void preInitBufferAllocator();
    public static native int preload();
    public static void sendDeviceConfigurationForDebugging(android.content.res.Configuration p0) {}
    public static void setContextForInit(android.content.Context p0) {}
    public static void setContextPriority(int p0) {}
    public static void setDebuggingEnabled(boolean p0) {}
    public static void setDrawingEnabled(boolean p0) {}
    public static void setFPSDivisor(int p0) {}
    public static void setHighContrastText(boolean p0) {}
    public static void setIsSystemOrPersistent() {}
    public static void setIsolatedProcess(boolean p0) {}
    public static void setPackageName(java.lang.String p0) {}
    public static void setRtAnimationsEnabled(boolean p0) {}
    public static void setupDiskCache(java.io.File p0) {}
    protected static native void setupPersistentGraphicsCache(java.lang.String p0, java.lang.String p1, java.lang.String p2);
    public static void trimCaches(int p0) {}
    public static void trimMemory(int p0) {}
    private static void validateAlpha(float p0, java.lang.String p1) {}
    private static void validateFinite(float p0, java.lang.String p1) {}
    private static void validatePositive(float p0, java.lang.String p1) {}
    public void addObserver(long p0) {}
    public void addObserver(android.graphics.HardwareRendererObserver p0) {}
    public void addRenderNode(android.graphics.RenderNode p0, boolean p1) {}
    public void allocateBuffers() {}
    public void buildLayer(android.graphics.RenderNode p0) {}
    public void clearContent() {}
    public boolean copyLayerInto(android.graphics.TextureLayer p0, android.graphics.Bitmap p1) { return false; }
    public android.graphics.HardwareRenderer.FrameRenderRequest createRenderRequest() { return null; }
    public android.graphics.TextureLayer createTextureLayer() { return null; }
    public void destroy() {}
    public void detachSurfaceTexture(long p0) {}
    public void drawRenderNode(android.graphics.RenderNode p0) {}
    public void dumpProfileInfo(java.io.FileDescriptor p0, int p1) {}
    public void fence() {}
    public void forceDrawNextFrame() {}
    public boolean isOpaque() { return false; }
    public boolean loadSystemProperties() { return false; }
    public void notifyCallbackPending() {}
    public void notifyExpensiveFrame() {}
    public int notifyExpensiveFrameWithRateLimit(java.lang.String p0) { return 0; }
    public void notifyFramePending() {}
    public int notifyRendererForGpuLoadUp(java.lang.String p0) { return 0; }
    public void onLayerDestroyed(android.graphics.TextureLayer p0) {}
    public boolean pause() { return false; }
    public void pushLayerUpdate(android.graphics.TextureLayer p0) {}
    public void registerAnimatingRenderNode(android.graphics.RenderNode p0) {}
    public void registerVectorDrawableAnimator(android.view.NativeVectorDrawableAnimator p0) {}
    public void removeObserver(long p0) {}
    public void removeObserver(android.graphics.HardwareRendererObserver p0) {}
    public void removeRenderNode(android.graphics.RenderNode p0) {}
    protected void setASurfaceTransactionCallback(android.graphics.HardwareRenderer.ASurfaceTransactionCallback p0) {}
    public float setColorMode(int p0) { return 0.0f; }
    public void setColorMode(int p0, float p1) {}
    public void setContentDrawBounds(int p0, int p1, int p2, int p3) {}
    public void setContentRoot(android.graphics.RenderNode p0) {}
    public void setCornerRadiiCallback(android.graphics.HardwareRenderer.CornerRadiiCallback p0) {}
    public boolean setForceDark(int p0) { return false; }
    public void setFrameCallback(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
    public void setFrameCommitCallback(android.graphics.HardwareRenderer.FrameCommitCallback p0) {}
    public void setFrameCompleteCallback(android.graphics.HardwareRenderer.FrameCompleteCallback p0) {}
    public void setHintSessionEnabled(boolean p0) {}
    public void setLightSourceAlpha(float p0, float p1) {}
    public void setLightSourceGeometry(float p0, float p1, float p2, float p3) {}
    public void setName(java.lang.String p0) {}
    public void setOpaque(boolean p0) {}
    public void setPictureCaptureCallback(android.graphics.HardwareRenderer.PictureCapturedCallback p0) {}
    protected void setPrepareSurfaceControlForWebviewCallback(android.graphics.HardwareRenderer.PrepareSurfaceControlForWebviewCallback p0) {}
    public void setRendererDrawingEnabled(boolean p0) {}
    public void setRtAnimationsEnabledForWindow(boolean p0) {}
    public void setStopped(boolean p0) {}
    public void setSurface(android.view.Surface p0) {}
    public void setSurface(android.view.Surface p0, boolean p1) {}
    public void setSurfaceControl(android.view.SurfaceControl p0, android.graphics.BLASTBufferQueue p1) {}
    public void setTargetHdrSdrRatio(float p0) {}
    public void setWaitForBufferReleaseCallback(android.graphics.HardwareRenderer.WaitForBufferReleaseCallback p0) {}
    public void start() {}
    public void stop() {}
    public void stopDrawing() {}
    public int syncAndDrawFrame(android.graphics.FrameInfo p0) { return 0; }
    public void updateRenderTargetSize(long p0, long p1) {}

    public static interface ASurfaceTransactionCallback {
        public boolean onMergeTransaction(long p0, long p1, long p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CacheTrimLevel {
    }

    public static abstract class CopyRequest {
        protected android.graphics.Bitmap mDestinationBitmap;
        final android.graphics.Rect mSrcRect = null;
        protected CopyRequest(android.graphics.Rect p0, android.graphics.Bitmap p1) {}
        public long getDestinationBitmap(int p0, int p1) { return 0L; }
        public abstract void onCopyFinished(int p0);
    }

    public static interface CornerRadiiCallback {
        public void onCornerRadiiChanged(float[] p0);
    }

    private static final class DestroyContextRunnable implements java.lang.Runnable {
        private final long mNativeInstance = 0L;
        DestroyContextRunnable(long p0) {}
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DumpFlags {
    }

    public static interface FrameCommitCallback {
        public void onFrameCommit(boolean p0);
    }

    public static interface FrameCompleteCallback {
        public void onFrameComplete();
    }

    public static interface FrameDrawingCallback {
        default public android.graphics.HardwareRenderer.FrameCommitCallback onFrameDraw(int p0, long p1) { return null; }
        public void onFrameDraw(long p0);
    }

    public final class FrameRenderRequest {
        private android.graphics.FrameInfo mFrameInfo;
        private boolean mWaitForPresent;
        private FrameRenderRequest(android.graphics.HardwareRenderer p0) {}
        private void reset() {}
        public android.graphics.HardwareRenderer.FrameRenderRequest setFrameCommitCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) { return null; }
        public void setFrameInfo(android.graphics.FrameInfo p0) {}
        public android.graphics.HardwareRenderer.FrameRenderRequest setVsyncTime(long p0) { return null; }
        public android.graphics.HardwareRenderer.FrameRenderRequest setWaitForPresent(boolean p0) { return null; }
        public int syncAndDraw() { return 0; }
    }

    private static class NotifyRendererRateLimiter extends com.android.internal.util.RateLimitingCache<java.lang.Void> {
        private static final long DEFAULT_NOTIFY_PERIOD_MILLIS = 100L;
        private int mNotifyCount;
        private java.lang.String mNotifyReason;
        private final com.android.internal.util.RateLimitingCache.ValueFetcher<java.lang.Void> mNotifyRendererRunnable = null;
        private final java.lang.Runnable mRunnable = null;
        NotifyRendererRateLimiter(java.lang.String p0, java.lang.Runnable p1, long p2) { super(0L); }
        private java.lang.String getNotifyReason() { return null; }
        private void incrementNotifyCount() {}
        private int notifyIfAllow(java.lang.String p0) { return 0; }
    }

    public static interface PictureCapturedCallback {
        public void onPictureCaptured(android.graphics.Picture p0);
    }

    public static interface PrepareSurfaceControlForWebviewCallback {
        public void prepare();
    }

    private static class ProcessInitializer {
        static android.graphics.HardwareRenderer.ProcessInitializer sInstance;
        private android.content.Context mContext;
        private boolean mDisplayInitialized;
        private android.view.IGraphicsStatsCallback mGraphicsStatsCallback;
        private android.view.IGraphicsStats mGraphicsStatsService;
        private boolean mInitialized;
        private boolean mIsolated;
        private java.lang.String mPackageName;
        private ProcessInitializer() {}
        private void initDisplayInfo() {}
        private void initGraphicsStats() {}
        private void initSched(long p0) {}
        private void requestBuffer() {}
        private void rotateBuffer() {}
        void init(long p0) {}
        void initUsingContext() {}
        void setContext(android.content.Context p0) {}
        void setIsolated(boolean p0) {}
        void setPackageName(java.lang.String p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SyncAndDrawResult {
    }

    public class SyncInterface {
        public SyncInterface(android.graphics.HardwareRenderer p0) {}
        public static void applyPendingTransactions(android.graphics.HardwareRenderer p0, long p1) {}
        public static void applyTransactionInOrder(android.graphics.HardwareRenderer p0, android.view.SurfaceControl.Transaction p1) {}
        public static void clearSyncTransaction(android.graphics.HardwareRenderer p0) {}
        public static android.view.SurfaceControl.Transaction gatherPendingTransactions(android.graphics.HardwareRenderer p0, long p1) { return null; }
        public static void mergeWithNextTransaction(android.graphics.HardwareRenderer p0, android.view.SurfaceControl.Transaction p1, long p2) {}
        public static boolean syncNextTransaction(android.graphics.HardwareRenderer p0, java.util.function.Consumer<android.view.SurfaceControl.Transaction> p1) { return false; }
        public static boolean syncNextTransaction(android.graphics.HardwareRenderer p0, boolean p1, java.util.function.Consumer<android.view.SurfaceControl.Transaction> p2) { return false; }
    }

    public static interface WaitForBufferReleaseCallback {
        public void onWaitForBufferRelease(long p0);
    }
}

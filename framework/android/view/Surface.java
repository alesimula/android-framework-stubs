package android.view;

public class Surface implements android.os.Parcelable {
    public static final int CHANGE_FRAME_RATE_ALWAYS = 1;
    public static final int CHANGE_FRAME_RATE_ONLY_IF_SEAMLESS = 0;
    public static final android.os.Parcelable.Creator<android.view.Surface> CREATOR = null;
    public static final int FRAME_RATE_CATEGORY_DEFAULT = 0;
    public static final int FRAME_RATE_CATEGORY_HIGH = 5;
    public static final int FRAME_RATE_CATEGORY_HIGH_HINT = 4;
    public static final int FRAME_RATE_CATEGORY_LOW = 2;
    public static final int FRAME_RATE_CATEGORY_NORMAL = 3;
    public static final int FRAME_RATE_CATEGORY_NO_PREFERENCE = 1;
    public static final int FRAME_RATE_COMPATIBILITY_AT_LEAST = 2;
    public static final int FRAME_RATE_COMPATIBILITY_DEFAULT = 0;
    public static final int FRAME_RATE_COMPATIBILITY_EXACT = 100;
    public static final int FRAME_RATE_COMPATIBILITY_FIXED_SOURCE = 1;
    public static final int FRAME_RATE_COMPATIBILITY_MIN = 102;
    public static final int FRAME_RATE_COMPATIBILITY_NO_VOTE = 101;
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    public static final int SCALING_MODE_FREEZE = 0;
    public static final int SCALING_MODE_NO_SCALE_CROP = 3;
    public static final int SCALING_MODE_SCALE_CROP = 2;
    public static final int SCALING_MODE_SCALE_TO_WINDOW = 1;
    private static final long SURFACE_NATIVE_ALLOCATION_SIZE_BYTES = 5000L;
    private static final java.lang.String TAG = "Surface";
    private final android.graphics.Canvas mCanvas = null;
    private android.graphics.Matrix mCompatibleMatrix;
    private int mGenerationId;
    private android.view.Surface.HwuiContext mHwuiContext;
    private boolean mIsAutoRefreshEnabled;
    private boolean mIsSharedBufferModeEnabled;
    private boolean mIsSingleBuffered;
    final java.lang.Object mLock = null;
    private long mLockedObject;
    private java.lang.String mName;
    long mNativeObject;
    public Surface() {}
    private Surface(long p0) {}
    public Surface(android.graphics.SurfaceTexture p0) {}
    public Surface(android.view.SurfaceControl p0) {}
    private void checkNotReleasedLocked() {}
    private static void freeNativeMemoryUsage() {}
    private static native void nativeAllocateBuffers(long p0);
    private static native int nativeAttachAndQueueBufferWithColorSpace(long p0, android.hardware.HardwareBuffer p1, int p2);
    private static native long nativeCreateFromSurfaceControl(long p0);
    private static native long nativeCreateFromSurfaceTexture(android.graphics.SurfaceTexture p0) throws android.view.Surface.OutOfResourcesException;
    private static native void nativeDestroy(long p0);
    private static native int nativeForceScopedDisconnect(long p0);
    private static native long nativeGetFromBlastBufferQueue(long p0, long p1);
    private static native long nativeGetFromSurfaceControl(long p0, long p1);
    private static native int nativeGetHeight(long p0);
    private static native long nativeGetNextFrameNumber(long p0);
    private static native int nativeGetWidth(long p0);
    private static native boolean nativeIsConsumerRunningBehind(long p0);
    private static native int nativeIsProducerThrottlingEnabled(long p0);
    private static native boolean nativeIsValid(long p0);
    private static native long nativeLockCanvas(long p0, android.graphics.Canvas p1, android.graphics.Rect p2) throws android.view.Surface.OutOfResourcesException;
    private static native long nativeReadFromParcel(long p0, android.os.Parcel p1);
    private static native void nativeRelease(long p0);
    private static native int nativeSetAutoRefreshEnabled(long p0, boolean p1);
    private static native int nativeSetFrameRate(long p0, float p1, int p2, int p3);
    private static native int nativeSetProducerThrottlingEnabled(long p0, boolean p1);
    private static native int nativeSetScalingMode(long p0, int p1);
    private static native int nativeSetSharedBufferModeEnabled(long p0, boolean p1);
    private static native void nativeUnlockCanvasAndPost(long p0, android.graphics.Canvas p1);
    private static native void nativeWriteToParcel(long p0, android.os.Parcel p1);
    private static void registerNativeMemoryUsage() {}
    public static java.lang.String rotationToString(int p0) { return null; }
    private void setNativeObjectLocked(long p0) {}
    private void unlockSwCanvasAndPost(android.graphics.Canvas p0) {}
    private void updateNativeObject(long p0) {}
    public void allocateBuffers() {}
    public void attachAndQueueBufferWithColorSpace(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1) {}
    public void clearFrameRate() {}
    public void copyFrom(android.graphics.BLASTBufferQueue p0) {}
    public void copyFrom(android.view.SurfaceControl p0) {}
    public void createFrom(android.view.SurfaceControl p0) {}
    public int describeContents() { return 0; }
    public void destroy() {}
    protected void finalize() throws java.lang.Throwable {}
    void forceScopedDisconnect() {}
    public android.graphics.Point getDefaultSize() { return null; }
    public int getGenerationId() { return 0; }
    public long getNextFrameNumber() { return 0L; }
    public void hwuiDestroy() {}
    public boolean isAutoRefreshEnabled() { return false; }
    public boolean isConsumerRunningBehind() { return false; }
    public boolean isProducerThrottlingEnabled() { return false; }
    public boolean isSharedBufferModeEnabled() { return false; }
    public boolean isSingleBuffered() { return false; }
    public boolean isValid() { return false; }
    public android.graphics.Canvas lockCanvas(android.graphics.Rect p0) throws android.view.Surface.OutOfResourcesException, java.lang.IllegalArgumentException { return null; }
    public android.graphics.Canvas lockHardwareCanvas() { return null; }
    public android.graphics.Canvas lockHardwareWideColorGamutCanvas() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void release() {}
    public void setAutoRefreshEnabled(boolean p0) {}
    void setCompatibilityTranslator(android.content.res.CompatibilityInfo.Translator p0) {}
    public void setFrameRate(float p0, int p1) {}
    public void setFrameRate(float p0, int p1, int p2) {}
    public void setFrameRate(android.view.Surface.FrameRateParams p0) {}
    public void setProducerThrottlingEnabled(boolean p0) {}
    public void setScalingMode(int p0) {}
    public void setSharedBufferModeEnabled(boolean p0) {}
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    public void transferFrom(android.view.Surface p0) {}
    @java.lang.Deprecated
    public void unlockCanvas(android.graphics.Canvas p0) {}
    public void unlockCanvasAndPost(android.graphics.Canvas p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ChangeFrameRateStrategy {
    }

    private final class CompatibleCanvas extends android.graphics.Canvas {
        private android.graphics.Matrix mOrigMatrix;
        private CompatibleCanvas(android.view.Surface p0) { super(); }
        public void getMatrix(android.graphics.Matrix p0) {}
        public void setMatrix(android.graphics.Matrix p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrameRateCategory {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrameRateCompatibility {
    }

    public static class FrameRateParams {
        public static final android.view.Surface.FrameRateParams IGNORE = null;
        int mChangeFrameRateStrategy;
        float mDesiredMaxRate;
        float mDesiredMinRate;
        float mFixedSourceRate;
        private FrameRateParams() {}
        public int getChangeFrameRateStrategy() { return 0; }
        public float getDesiredMaxRate() { return 0.0f; }
        public float getDesiredMinRate() { return 0.0f; }
        public float getFixedSourceRate() { return 0.0f; }

        public static final class Builder {
            private int mChangeFrameRateStrategy;
            private float mDesiredMaxRate;
            private float mDesiredMinRate;
            private float mFixedSourceRate;
            public Builder() {}
            public android.view.Surface.FrameRateParams build() { return null; }
            public android.view.Surface.FrameRateParams.Builder setChangeFrameRateStrategy(int p0) { return null; }
            public android.view.Surface.FrameRateParams.Builder setDesiredRateRange(float p0, float p1) { return null; }
            public android.view.Surface.FrameRateParams.Builder setFixedSourceRate(float p0) { return null; }
        }
    }

    private final class HwuiContext {
        private android.graphics.RecordingCanvas mCanvas;
        private android.graphics.HardwareRenderer mHardwareRenderer;
        private int mHeight;
        private final boolean mIsWideColorGamut = false;
        private final android.graphics.RenderNode mRenderNode = null;
        private int mWidth;
        HwuiContext(android.view.Surface p0, boolean p1) {}
        void destroy() {}
        boolean isWideColorGamut() { return false; }
        android.graphics.Canvas lockCanvas(int p0, int p1) { return null; }
        void unlockAndPost(android.graphics.Canvas p0) {}
        void updateSurface() {}
    }

    public static class OutOfResourcesException extends java.lang.RuntimeException {
        public OutOfResourcesException() { super(); }
        public OutOfResourcesException(java.lang.String p0) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Rotation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScalingMode {
    }
}

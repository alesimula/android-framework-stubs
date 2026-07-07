package android.graphics;

public class SurfaceTexture {
    private final android.os.Looper mCreatorLooper = null;
    private long mFrameAvailableListener;
    private boolean mIsSingleBuffered;
    private android.os.Handler mOnFrameAvailableHandler;
    private android.os.Handler mOnSetFrameRateHandler;
    private long mProducer;
    private long mSurfaceTexture;
    public SurfaceTexture(int p0) {}
    public SurfaceTexture(int p0, boolean p1) {}
    public SurfaceTexture(boolean p0) {}
    private native int nativeAttachToGLContext(int p0);
    private native int nativeDetachFromGLContext();
    private native void nativeFinalize();
    private native int nativeGetDataSpace();
    private native long nativeGetTimestamp();
    private native void nativeGetTransformMatrix(float[] p0);
    private native void nativeInit(boolean p0, int p1, boolean p2, java.lang.ref.WeakReference<android.graphics.SurfaceTexture> p3) throws android.view.Surface.OutOfResourcesException;
    private native boolean nativeIsReleased();
    private native void nativeRelease();
    private native void nativeReleaseTexImage();
    private native void nativeSetDefaultBufferSize(int p0, int p1);
    private native void nativeUpdateTexImage();
    private static void postEventFromNative(java.lang.ref.WeakReference<android.graphics.SurfaceTexture> p0) {}
    private static void postOnSetFrameRateEventFromNative(java.lang.ref.WeakReference<android.graphics.SurfaceTexture> p0, float p1, int p2, int p3) {}
    public void attachToGLContext(int p0) {}
    public void detachFromGLContext() {}
    protected void finalize() throws java.lang.Throwable {}
    public int getDataSpace() { return 0; }
    public long getTimestamp() { return 0L; }
    public void getTransformMatrix(float[] p0) {}
    public boolean isReleased() { return false; }
    public boolean isSingleBuffered() { return false; }
    public void release() {}
    public void releaseTexImage() {}
    public void setDefaultBufferSize(int p0, int p1) {}
    public void setOnFrameAvailableListener(android.graphics.SurfaceTexture.OnFrameAvailableListener p0) {}
    public void setOnFrameAvailableListener(android.graphics.SurfaceTexture.OnFrameAvailableListener p0, android.os.Handler p1) {}
    public void setOnSetFrameRateListener(android.graphics.SurfaceTexture.OnSetFrameRateListener p0, android.os.Handler p1) {}
    public void updateTexImage() {}

    public static interface OnFrameAvailableListener {
        public void onFrameAvailable(android.graphics.SurfaceTexture p0);
    }

    public static interface OnSetFrameRateListener {
        public void onSetFrameRate(android.graphics.SurfaceTexture p0, float p1, int p2, int p3);
    }

    @java.lang.Deprecated
    public static class OutOfResourcesException extends java.lang.Exception {
        public OutOfResourcesException() { super(); }
        public OutOfResourcesException(java.lang.String p0) { super(); }
    }

    private static class SetFrameRateArgs {
        final int mChangeFrameRateStrategy = 0;
        final int mCompatibility = 0;
        final float mFrameRate = 0.0f;
        SetFrameRateArgs(float p0, int p1, int p2) {}
    }
}

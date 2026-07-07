package android.media;

public class ImageReader implements java.lang.AutoCloseable {
    private static final int ACQUIRE_MAX_IMAGES = 2;
    private static final int ACQUIRE_NO_BUFS = 1;
    private static final int ACQUIRE_SUCCESS = 0;
    private static final long DETACH_THROWS_ISE_ONLY = 236825255L;
    private java.util.List<android.media.Image> mAcquiredImages;
    private final java.lang.Object mCloseLock = null;
    private final int mDataSpace = 0;
    private final boolean mDetachThrowsIseOnly = false;
    private int mEstimatedNativeAllocBytes;
    private final int mFormat = 0;
    private final int mHardwareBufferFormat = 0;
    private final int mHeight = 0;
    private boolean mIsReaderValid;
    private android.media.ImageReader.OnImageAvailableListener mListener;
    private java.util.concurrent.Executor mListenerExecutor;
    private android.media.ImageReader.ListenerHandler mListenerHandler;
    private final java.lang.Object mListenerLock = null;
    private final int mMaxImages = 0;
    private long mNativeContext;
    private final int mNumPlanes = 0;
    private final android.hardware.camera2.MultiResolutionImageReader mParent = null;
    private android.view.Surface mSurface;
    private final long mUsage = 0L;
    private final int mWidth = 0;
    private ImageReader(int p0, int p1, int p2, int p3, long p4, android.hardware.camera2.MultiResolutionImageReader p5) {}
    private ImageReader(int p0, int p1, int p2, long p3, android.hardware.camera2.MultiResolutionImageReader p4, int p5, int p6) {}
    private int acquireNextSurfaceImage(android.media.ImageReader.SurfaceImage p0) { return 0; }
    public static android.media.ImageReader.ImagePlane[] initializeImagePlanes(int p0, android.graphics.GraphicBuffer p1, int p2, int p3, long p4, int p5, int p6, android.graphics.Rect p7) { return null; }
    private void initializeImageReader(int p0, int p1, int p2, int p3, long p4, int p5, int p6) {}
    private boolean isImageOwnedbyMe(android.media.Image p0) { return false; }
    private static native void nativeClassInit();
    private synchronized native void nativeClose();
    private static synchronized native android.media.ImageReader.ImagePlane[] nativeCreateImagePlanes(int p0, android.graphics.GraphicBuffer p1, int p2, int p3, int p4, int p5, int p6, int p7);
    private synchronized native int nativeDetachImage(android.media.Image p0, boolean p1);
    private synchronized native void nativeDiscardFreeBuffers();
    private synchronized native android.view.Surface nativeGetSurface();
    private synchronized native int nativeImageSetup(android.media.Image p0);
    private synchronized native void nativeInit(java.lang.Object p0, int p1, int p2, int p3, long p4, int p5, int p6);
    private synchronized native void nativeReleaseImage(android.media.Image p0);
    private static synchronized native void nativeUnlockGraphicBuffer(android.graphics.GraphicBuffer p0);
    public static android.media.ImageReader newInstance(int p0, int p1, int p2, int p3) { return null; }
    public static android.media.ImageReader newInstance(int p0, int p1, int p2, int p3, long p4) { return null; }
    public static android.media.ImageReader newInstance(int p0, int p1, int p2, int p3, android.hardware.camera2.MultiResolutionImageReader p4) { return null; }
    private static void postEventFromNative(java.lang.Object p0) {}
    private void releaseImage(android.media.Image p0) {}
    public static void unlockGraphicBuffer(android.graphics.GraphicBuffer p0) {}
    public android.media.Image acquireLatestImage() { return null; }
    public android.media.Image acquireNextImage() { return null; }
    public android.media.Image acquireNextImageNoThrowISE() { return null; }
    public void close() {}
    public void detachImage(android.media.Image p0) {}
    public void discardFreeBuffers() {}
    protected void finalize() throws java.lang.Throwable {}
    public int getDataSpace() { return 0; }
    public int getHardwareBufferFormat() { return 0; }
    public int getHeight() { return 0; }
    public int getImageFormat() { return 0; }
    public int getMaxImages() { return 0; }
    public android.view.Surface getSurface() { return null; }
    public long getUsage() { return 0L; }
    public int getWidth() { return 0; }
    public void setOnImageAvailableListener(android.media.ImageReader.OnImageAvailableListener p0, android.os.Handler p1) {}
    public void setOnImageAvailableListenerWithExecutor(android.media.ImageReader.OnImageAvailableListener p0, java.util.concurrent.Executor p1) {}

    public static final class Builder {
        private int mDataSpace;
        private int mHardwareBufferFormat;
        private int mHeight;
        private int mImageFormat;
        private int mMaxImages;
        private long mUsage;
        private boolean mUseLegacyImageFormat;
        private int mWidth;
        public Builder(int p0, int p1) {}
        public android.media.ImageReader build() { return null; }
        public android.media.ImageReader.Builder setDefaultDataSpace(int p0) { return null; }
        public android.media.ImageReader.Builder setDefaultHardwareBufferFormat(int p0) { return null; }
        public android.media.ImageReader.Builder setImageFormat(int p0) { return null; }
        public android.media.ImageReader.Builder setMaxImages(int p0) { return null; }
        public android.media.ImageReader.Builder setUsage(long p0) { return null; }
    }

    private final class HandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler = null;
        public HandlerExecutor(android.media.ImageReader p0, android.os.Handler p1) {}
        public void execute(java.lang.Runnable p0) {}
    }

    public static class ImagePlane extends android.media.Image.Plane {
        private java.nio.ByteBuffer mBuffer;
        private final int mPixelStride = 0;
        private final int mRowStride = 0;
        private ImagePlane(int p0, int p1, java.nio.ByteBuffer p2) { super(); }
        public java.nio.ByteBuffer getBuffer() { return null; }
        public int getPixelStride() { return 0; }
        public int getRowStride() { return 0; }
    }

    private final class ListenerHandler extends android.os.Handler {
        public ListenerHandler(android.media.ImageReader p0, android.os.Looper p1) { super(); }
    }

    public static interface OnImageAvailableListener {
        public void onImageAvailable(android.media.ImageReader p0);
    }

    private class SurfaceImage extends android.media.Image {
        private final java.lang.Object mCloseLock = null;
        private int mDataSpace;
        private int mFormat;
        private int mHardwareBufferFormat;
        private java.util.concurrent.atomic.AtomicBoolean mIsDetached;
        private long mNativeBuffer;
        private android.media.ImageReader.SurfaceImage.SurfacePlane[] mPlanes;
        private int mScalingMode;
        private long mTimestamp;
        private int mTransform;
        public SurfaceImage(android.media.ImageReader p0, int p1) { super(); }
        private void clearSurfacePlanes() {}
        private synchronized native android.media.ImageReader.SurfaceImage.SurfacePlane[] nativeCreatePlanes(int p0, int p1, long p2);
        private synchronized native int nativeGetFenceFd();
        private synchronized native int nativeGetFormat(int p0);
        private synchronized native android.hardware.HardwareBuffer nativeGetHardwareBuffer();
        private synchronized native int nativeGetHeight();
        private synchronized native int nativeGetWidth();
        private void setDetached(boolean p0) {}
        public void close() {}
        protected final void finalize() throws java.lang.Throwable {}
        public int getDataSpace() { return 0; }
        public android.hardware.SyncFence getFence() throws java.io.IOException { return null; }
        public int getFormat() { return 0; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public int getHeight() { return 0; }
        long getNativeContext() { return 0L; }
        android.media.ImageReader getOwner() { return null; }
        public int getPlaneCount() { return 0; }
        public android.media.Image.Plane[] getPlanes() { return null; }
        public android.media.ImageReader getReader() { return null; }
        public int getScalingMode() { return 0; }
        public long getTimestamp() { return 0L; }
        public int getTransform() { return 0; }
        public int getWidth() { return 0; }
        public boolean isAttachable() { return false; }
        public void setTimestamp(long p0) {}

        private class SurfacePlane extends android.media.Image.Plane {
            private java.nio.ByteBuffer mBuffer;
            private final int mPixelStride = 0;
            private final int mRowStride = 0;
            private SurfacePlane(android.media.ImageReader.SurfaceImage p0, int p1, int p2, java.nio.ByteBuffer p3) { super(); }
            private void clearBuffer() {}
            public java.nio.ByteBuffer getBuffer() { return null; }
            public int getPixelStride() { return 0; }
            public int getRowStride() { return 0; }
        }
    }
}

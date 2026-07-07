package android.media;

public class ImageWriter implements java.lang.AutoCloseable {
    private final java.lang.Object mCloseLock = null;
    private int mDataSpace;
    private java.util.List<android.media.Image> mDequeuedImages;
    private int mEstimatedNativeAllocBytes;
    private int mHardwareBufferFormat;
    private int mHeight;
    private boolean mIsWriterValid;
    private android.media.ImageWriter.OnImageReleasedListener mListener;
    private android.media.ImageWriter.ListenerHandler mListenerHandler;
    private final java.lang.Object mListenerLock = null;
    private final int mMaxImages = 0;
    private long mNativeContext;
    private long mUsage;
    private int mWidth;
    private int mWriterFormat;
    private ImageWriter(android.view.Surface p0, int p1, boolean p2, int p3, int p4, int p5) {}
    private ImageWriter(android.view.Surface p0, int p1, boolean p2, int p3, int p4, int p5, int p6, long p7) {}
    private ImageWriter(android.view.Surface p0, int p1, boolean p2, int p3, int p4, int p5, long p6) {}
    private void abortImage(android.media.Image p0) {}
    private void attachAndQueueInputImage(android.media.Image p0) {}
    private synchronized native void cancelImage(long p0, android.media.Image p1);
    private void initializeImageWriter(android.view.Surface p0, int p1, boolean p2, int p3, int p4, int p5, int p6, int p7, long p8) {}
    private boolean isImageOwnedByMe(android.media.Image p0) { return false; }
    private synchronized native int nativeAttachAndQueueGraphicBuffer(long p0, android.graphics.GraphicBuffer p1, int p2, long p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10);
    private synchronized native int nativeAttachAndQueueImage(long p0, long p1, int p2, long p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10);
    private static native void nativeClassInit();
    private synchronized native void nativeClose(long p0);
    private synchronized native void nativeDequeueInputImage(long p0, android.media.Image p1);
    private synchronized native long nativeInit(java.lang.Object p0, android.view.Surface p1, int p2, int p3, int p4, boolean p5, int p6, int p7, long p8);
    private synchronized native void nativeQueueInputImage(long p0, android.media.Image p1, long p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9);
    public static android.media.ImageWriter newInstance(android.view.Surface p0, int p1) { return null; }
    public static android.media.ImageWriter newInstance(android.view.Surface p0, int p1, int p2) { return null; }
    public static android.media.ImageWriter newInstance(android.view.Surface p0, int p1, int p2, int p3, int p4) { return null; }
    private static void postEventFromNative(java.lang.Object p0) {}
    public void close() {}
    public android.media.Image dequeueInputImage() { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public int getDataSpace() { return 0; }
    public int getFormat() { return 0; }
    public int getHardwareBufferFormat() { return 0; }
    public int getHeight() { return 0; }
    public int getMaxImages() { return 0; }
    public long getUsage() { return 0L; }
    public int getWidth() { return 0; }
    public void queueInputImage(android.media.Image p0) {}
    public void setOnImageReleasedListener(android.media.ImageWriter.OnImageReleasedListener p0, android.os.Handler p1) {}

    public static final class Builder {
        private int mDataSpace;
        private int mHardwareBufferFormat;
        private int mHeight;
        private int mImageFormat;
        private int mMaxImages;
        private android.view.Surface mSurface;
        private long mUsage;
        private boolean mUseLegacyImageFormat;
        private boolean mUseSurfaceImageFormatInfo;
        private int mWidth;
        public Builder(android.view.Surface p0) {}
        public android.media.ImageWriter build() { return null; }
        public android.media.ImageWriter.Builder setDataSpace(int p0) { return null; }
        public android.media.ImageWriter.Builder setHardwareBufferFormat(int p0) { return null; }
        public android.media.ImageWriter.Builder setImageFormat(int p0) { return null; }
        public android.media.ImageWriter.Builder setMaxImages(int p0) { return null; }
        public android.media.ImageWriter.Builder setUsage(long p0) { return null; }
        public android.media.ImageWriter.Builder setWidthAndHeight(int p0, int p1) { return null; }
    }

    private final class ListenerHandler extends android.os.Handler {
        public ListenerHandler(android.media.ImageWriter p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnImageReleasedListener {
        public void onImageReleased(android.media.ImageWriter p0);
    }

    private static class WriterSurfaceImage extends android.media.Image {
        private final long DEFAULT_TIMESTAMP = 0L;
        private final java.lang.Object mCloseLock = null;
        private int mDataSpace;
        private int mFormat;
        private int mHeight;
        private long mNativeBuffer;
        private int mNativeFenceFd;
        private android.media.ImageWriter mOwner;
        private android.media.ImageWriter.WriterSurfaceImage.SurfacePlane[] mPlanes;
        private int mScalingMode;
        private long mTimestamp;
        private int mTransform;
        private int mWidth;
        public WriterSurfaceImage(android.media.ImageWriter p0) { super(); }
        private void clearSurfacePlanes() {}
        private synchronized native android.media.ImageWriter.WriterSurfaceImage.SurfacePlane[] nativeCreatePlanes(int p0, int p1);
        private synchronized native int nativeGetFormat(int p0);
        private synchronized native android.hardware.HardwareBuffer nativeGetHardwareBuffer();
        private synchronized native int nativeGetHeight();
        private synchronized native int nativeGetWidth();
        private synchronized native void nativeSetFenceFd(int p0);
        public void close() {}
        protected final void finalize() throws java.lang.Throwable {}
        public int getDataSpace() { return 0; }
        public android.hardware.SyncFence getFence() throws java.io.IOException { return null; }
        public int getFormat() { return 0; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public int getHeight() { return 0; }
        long getNativeContext() { return 0L; }
        android.media.ImageWriter getOwner() { return null; }
        public android.media.Image.Plane[] getPlanes() { return null; }
        public int getScalingMode() { return 0; }
        public long getTimestamp() { return 0L; }
        public int getTransform() { return 0; }
        public int getWidth() { return 0; }
        public boolean isAttachable() { return false; }
        public void setDataSpace(int p0) {}
        public void setFence(android.hardware.SyncFence p0) throws java.io.IOException {}
        public void setTimestamp(long p0) {}

        private class SurfacePlane extends android.media.Image.Plane {
            private java.nio.ByteBuffer mBuffer;
            private final int mPixelStride = 0;
            private final int mRowStride = 0;
            private SurfacePlane(android.media.ImageWriter.WriterSurfaceImage p0, int p1, int p2, java.nio.ByteBuffer p3) { super(); }
            private void clearBuffer() {}
            public java.nio.ByteBuffer getBuffer() { return null; }
            public int getPixelStride() { return 0; }
            public int getRowStride() { return 0; }
        }
    }
}

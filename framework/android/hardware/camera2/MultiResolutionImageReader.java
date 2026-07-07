package android.hardware.camera2;

public class MultiResolutionImageReader implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "MultiResolutionImageReader";
    private final boolean mConcurrencyEnabled = false;
    private final int mFormat = 0;
    private final android.hardware.camera2.extension.IOnActiveOutputSurfaceCallback mIOnActiveOutputSurfaceCallback = null;
    private java.util.concurrent.Executor mListenerExecutor;
    private final java.lang.Object mListenerLock = null;
    private final int mMaxImages = 0;
    private android.hardware.camera2.MultiResolutionImageReader.OnActiveOutputSurfacesListener mOutputSurfacesListener;
    private final android.media.ImageReader[] mReaders = null;
    private final android.hardware.camera2.params.MultiResolutionStreamInfo[] mStreamInfo = null;
    private final java.util.HashMap<java.lang.Long, android.media.ImageReader> mUniqueIdReaderMap = null;
    public MultiResolutionImageReader(java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> p0, int p1, int p2) {}
    public MultiResolutionImageReader(java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> p0, int p1, int p2, long p3) {}
    private MultiResolutionImageReader(java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> p0, int p1, int p2, long p3, boolean p4) {}
    public void close() {}
    protected void finalize() {}
    public void flush() {}
    public void flushOther(android.media.ImageReader p0) {}
    public android.hardware.camera2.extension.IOnActiveOutputSurfaceCallback getIOnActiveOutputSurfaceCallback() { return null; }
    public android.hardware.camera2.MultiResolutionImageReader.OnActiveOutputSurfacesListener getOnActiveOutputSurfacesListener() { return null; }
    public android.media.ImageReader[] getReaders() { return null; }
    public android.hardware.camera2.params.MultiResolutionStreamInfo getStreamInfoForImageReader(android.media.ImageReader p0) { return null; }
    public android.view.Surface getSurface() { return null; }
    public android.view.Surface getSurface(android.util.Size p0, java.lang.String p1) { return null; }
    public boolean isConcurrencyEnabled() { return false; }
    public void postOnActiveOutputSurfacesCallback(java.util.List<android.view.Surface> p0, long p1, long p2) {}
    public void setOnActiveOutputSurfacesListener(java.util.concurrent.Executor p0, android.hardware.camera2.MultiResolutionImageReader.OnActiveOutputSurfacesListener p1) {}
    public void setOnImageAvailableListener(android.media.ImageReader.OnImageAvailableListener p0, java.util.concurrent.Executor p1) {}

    public static final class Builder {
        private boolean mConcurrencyEnabled;
        private int mFormat;
        private int mMaxImages;
        private java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> mStreams;
        private long mUsage;
        public Builder(java.util.Collection<android.hardware.camera2.params.MultiResolutionStreamInfo> p0, int p1, int p2) {}
        public android.hardware.camera2.MultiResolutionImageReader build() { return null; }
        public android.hardware.camera2.MultiResolutionImageReader.Builder setConcurrentOutputsEnabled(boolean p0) { return null; }
        public android.hardware.camera2.MultiResolutionImageReader.Builder setUsage(long p0) { return null; }
    }

    public static interface OnActiveOutputSurfacesListener {
        public void onActiveOutputSurfaces(java.util.List<android.view.Surface> p0, long p1, long p2);
    }
}

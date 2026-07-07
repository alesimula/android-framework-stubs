package android.window;

public class ScreenCaptureInternal {
    private static final int SCREENSHOT_WAIT_TIME_S = Integer.valueOf(0);
    private static final java.lang.String TAG = "ScreenCaptureInternal";
    public ScreenCaptureInternal() {}
    public static android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer captureDisplay(android.window.ScreenCaptureInternal.DisplayCaptureArgs p0) { return null; }
    public static void captureDisplay(android.window.ScreenCaptureInternal.DisplayCaptureArgs p0, android.window.ScreenCaptureInternal.ScreenCaptureListener p1) {}
    private static int captureDisplayInternal(android.window.ScreenCaptureInternal.DisplayCaptureArgs p0, android.window.ScreenCaptureInternal.ScreenCaptureListener p1) { return 0; }
    public static int captureLayers(android.window.ScreenCaptureInternal.LayerCaptureArgs p0, android.window.ScreenCaptureInternal.ScreenCaptureListener p1) { return 0; }
    public static android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer captureLayers(android.view.SurfaceControl p0, android.graphics.Rect p1, float p2) { return null; }
    public static android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer captureLayers(android.view.SurfaceControl p0, android.graphics.Rect p1, float p2, int p3) { return null; }
    public static android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer captureLayers(android.window.ScreenCaptureInternal.LayerCaptureArgs p0) { return null; }
    public static android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer captureLayersExcluding(android.view.SurfaceControl p0, android.graphics.Rect p1, float p2, int p3, android.view.SurfaceControl[] p4) { return null; }
    public static android.window.ScreenCaptureInternal.SynchronousScreenCaptureListener createSyncCaptureListener() { return null; }
    private static native long getNativeListenerFinalizer();
    private static native int nativeCaptureDisplay(android.window.ScreenCaptureInternal.DisplayCaptureArgs p0, long p1);
    private static native int nativeCaptureLayers(android.window.ScreenCaptureInternal.LayerCaptureArgs p0, long p1, boolean p2);
    private static native long nativeCreateScreenCaptureListener(java.util.function.ObjIntConsumer<android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer> p0);
    private static native void nativeListenerOnError(long p0, int p1);
    private static native long nativeReadListenerFromParcel(android.os.Parcel p0);
    private static native void nativeWriteListenerToParcel(long p0, android.os.Parcel p1);

    public static class CaptureArgs implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.ScreenCaptureInternal.CaptureArgs> CREATOR = null;
        public final int mCaptureMode = 0;
        final android.view.SurfaceControl[] mExcludeLayers = null;
        public final int mExclusionMask = 0;
        public final float mFrameScaleX = 0.0f;
        public final float mFrameScaleY = 0.0f;
        public final boolean mGrayscale = false;
        public final boolean mIncludeSystemOverlays = false;
        public final int mPixelFormat = 0;
        public final boolean mPreserveDisplayColors = false;
        public final int mProtectedContentPolicy = 0;
        public final int mSecureContentPolicy = 0;
        public final android.graphics.Rect mSourceCrop = null;
        public final long mUid = 0L;
        public final boolean mUseDisplayInstallationOrientation = false;
        private CaptureArgs(android.os.Parcel p0) {}
        private CaptureArgs(android.window.ScreenCaptureInternal.CaptureArgs.Builder<? extends android.window.ScreenCaptureInternal.CaptureArgs.Builder<?>> p0) {}
        private long[] getNativeExcludeLayers() { return null; }
        public int describeContents() { return 0; }
        public void release() {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static class Builder<T extends android.window.ScreenCaptureInternal.CaptureArgs.Builder<T>> {
            private int mCaptureMode;
            private android.view.SurfaceControl[] mExcludeLayers;
            private int mExclusionMask;
            private float mFrameScaleX;
            private float mFrameScaleY;
            private boolean mGrayscale;
            private boolean mIncludeSystemOverlays;
            private int mPixelFormat;
            private boolean mPreserveDisplayColors;
            private int mProtectedContentPolicy;
            private int mSecureContentPolicy;
            private final android.graphics.Rect mSourceCrop = null;
            private long mUid;
            private boolean mUseDisplayInstallationOrientation;
            public Builder() {}
            public android.window.ScreenCaptureInternal.CaptureArgs build() { return null; }
            T getThis() { return null; }
            public T setCaptureMode(int p0) { return null; }
            public T setExcludeLayers(android.view.SurfaceControl[] p0) { return null; }
            public T setExclusionMask(int p0) { return null; }
            public T setFrameScale(float p0) { return null; }
            public T setFrameScale(float p0, float p1) { return null; }
            public T setGrayscale(boolean p0) { return null; }
            public T setIncludeSystemOverlays(boolean p0) { return null; }
            public T setPixelFormat(int p0) { return null; }
            public T setPreserveDisplayColors(boolean p0) { return null; }
            public T setProtectedContentPolicy(int p0) { return null; }
            public T setSecureContentPolicy(int p0) { return null; }
            public T setSourceCrop(android.graphics.Rect p0) { return null; }
            public T setUid(long p0) { return null; }
            public T setUseDisplayInstallationOrientation(boolean p0) { return null; }
        }
    }

    public static class DisplayCaptureArgs extends android.window.ScreenCaptureInternal.CaptureArgs {
        private final android.os.IBinder mDisplayToken = null;
        private final int mHeight = 0;
        private final int mWidth = 0;
        private DisplayCaptureArgs(android.window.ScreenCaptureInternal.DisplayCaptureArgs.Builder p0) { super((android.os.Parcel)null); }

        public static class Builder extends android.window.ScreenCaptureInternal.CaptureArgs.Builder<android.window.ScreenCaptureInternal.DisplayCaptureArgs.Builder> {
            private android.os.IBinder mDisplayToken;
            private int mHeight;
            private int mWidth;
            public Builder() { super(); }
            public Builder(android.os.IBinder p0) { super(); }
            public android.window.ScreenCaptureInternal.DisplayCaptureArgs build() { return null; }
            android.window.ScreenCaptureInternal.DisplayCaptureArgs.Builder getThis() { return null; }
            public android.window.ScreenCaptureInternal.DisplayCaptureArgs.Builder setDisplayToken(android.os.IBinder p0) { return null; }
            public android.window.ScreenCaptureInternal.DisplayCaptureArgs.Builder setSize(int p0, int p1) { return null; }
        }
    }

    public static class LayerCaptureArgs extends android.window.ScreenCaptureInternal.CaptureArgs {
        private final boolean mChildrenOnly = false;
        private final long mNativeLayer = 0L;
        private LayerCaptureArgs(android.window.ScreenCaptureInternal.LayerCaptureArgs.Builder p0) { super((android.os.Parcel)null); }

        public static class Builder extends android.window.ScreenCaptureInternal.CaptureArgs.Builder<android.window.ScreenCaptureInternal.LayerCaptureArgs.Builder> {
            private boolean mChildrenOnly;
            private android.view.SurfaceControl mLayer;
            public Builder(android.view.SurfaceControl p0) { super(); }
            public Builder(android.view.SurfaceControl p0, android.window.ScreenCaptureInternal.CaptureArgs p1) { super(); }
            public android.window.ScreenCaptureInternal.LayerCaptureArgs build() { return null; }
            android.window.ScreenCaptureInternal.LayerCaptureArgs.Builder getThis() { return null; }
            public android.window.ScreenCaptureInternal.LayerCaptureArgs.Builder setChildrenOnly(boolean p0) { return null; }
            public android.window.ScreenCaptureInternal.LayerCaptureArgs.Builder setLayer(android.view.SurfaceControl p0) { return null; }
        }
    }

    public static class ScreenCaptureListener implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.window.ScreenCaptureInternal.ScreenCaptureListener> CREATOR = null;
        final long mNativeObject = 0L;
        private ScreenCaptureListener(android.os.Parcel p0) {}
        public ScreenCaptureListener(java.util.function.ObjIntConsumer<android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer> p0) {}
        public int describeContents() { return 0; }
        public void onError(int p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class ScreenshotHardwareBuffer implements java.lang.AutoCloseable {
        private static final float EPSILON = 0.015625f;
        private final android.graphics.ColorSpace mColorSpace = null;
        private final boolean mContainsHdrLayers = false;
        private final boolean mContainsSecureLayers = false;
        private final android.hardware.HardwareBuffer mGainmap = null;
        private final android.hardware.HardwareBuffer mHardwareBuffer = null;
        private final float mHdrSdrRatio = 0.0f;
        public ScreenshotHardwareBuffer(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1, boolean p2, boolean p3) {}
        public ScreenshotHardwareBuffer(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1, boolean p2, boolean p3, android.hardware.HardwareBuffer p4, float p5) {}
        private static android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer createFromNative(android.hardware.HardwareBuffer p0, int p1, boolean p2, boolean p3, android.hardware.HardwareBuffer p4, float p5) { return null; }
        public android.graphics.Bitmap asBitmap() { return null; }
        public void close() {}
        public boolean containsHdrLayers() { return false; }
        public boolean containsSecureLayers() { return false; }
        public android.graphics.ColorSpace getColorSpace() { return null; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
    }

    public static abstract class SynchronousScreenCaptureListener extends android.window.ScreenCaptureInternal.ScreenCaptureListener {
        SynchronousScreenCaptureListener(java.util.function.ObjIntConsumer<android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer> p0) { super((java.util.function.ObjIntConsumer)null); }
        public abstract android.window.ScreenCaptureInternal.ScreenshotHardwareBuffer getBuffer();
    }
}

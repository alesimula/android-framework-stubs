package android.media.projection;

public final class MediaProjection {
    static final long MEDIA_PROJECTION_REQUIRES_CALLBACK = 269849258L;
    private static final java.lang.String TAG = "MediaProjection";
    private final java.util.Map<android.media.projection.MediaProjection.Callback, android.media.projection.MediaProjection.CallbackRecord> mCallbacks = null;
    private final android.content.Context mContext = null;
    private final int mDisplayId = 0;
    private final android.hardware.display.DisplayManager mDisplayManager = null;
    private final android.media.projection.IMediaProjection mImpl = null;
    public MediaProjection(android.content.Context p0, android.media.projection.IMediaProjection p1) {}
    public MediaProjection(android.content.Context p0, android.media.projection.IMediaProjection p1, android.hardware.display.DisplayManager p2) {}
    private boolean shouldMediaProjectionRequireCallback() { return false; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(android.hardware.display.VirtualDisplayConfig.Builder p0, android.hardware.display.VirtualDisplay.Callback p1, android.os.Handler p2) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, int p4, android.view.Surface p5, android.hardware.display.VirtualDisplay.Callback p6, android.os.Handler p7) { return null; }
    public android.hardware.display.VirtualDisplay createVirtualDisplay(java.lang.String p0, int p1, int p2, int p3, boolean p4, android.view.Surface p5, android.hardware.display.VirtualDisplay.Callback p6, android.os.Handler p7) { return null; }
    public android.media.projection.IMediaProjection getProjection() { return null; }
    public void registerCallback(android.media.projection.MediaProjection.Callback p0, android.os.Handler p1) {}
    @android.annotation.SystemApi
    public void setRecordingOverlayStopAtLayer(android.view.View p0) {}
    public void stop() {}
    public void stop(int p0) {}
    public void unregisterCallback(android.media.projection.MediaProjection.Callback p0) {}

    public static abstract class Callback {
        public Callback() {}
        public void onCapturedContentResize(int p0, int p1) {}
        public void onCapturedContentVisibilityChanged(boolean p0) {}
        public void onStop() {}
    }

    private static final class CallbackRecord extends android.media.projection.MediaProjection.Callback {
        private final android.media.projection.MediaProjection.Callback mCallback = null;
        private final android.os.Handler mHandler = null;
        public CallbackRecord(android.media.projection.MediaProjection.Callback p0, android.os.Handler p1) { super(); }
        public void onCapturedContentResize(int p0, int p1) {}
        public void onCapturedContentVisibilityChanged(boolean p0) {}
        public void onStop() {}
    }

    private final class MediaProjectionCallback extends android.media.projection.IMediaProjectionCallback.Stub {
        private MediaProjectionCallback(android.media.projection.MediaProjection p0) { super(); }
        public void onCapturedContentResize(int p0, int p1) {}
        public void onCapturedContentVisibilityChanged(boolean p0) {}
        public void onStop() {}
    }
}

package android.hardware.camera2.extension;

@android.annotation.SystemApi
public abstract class SessionProcessor {
    private static final java.lang.String TAG = "SessionProcessor";
    private android.hardware.camera2.extension.CameraUsageTracker mCameraUsageTracker;
    public SessionProcessor() {}
    public abstract void deInitSession(android.os.IBinder p0);
    public android.hardware.camera2.extension.SessionProcessor.CaptureLatencyInfo getRealtimeStillCaptureLatency() { return null; }
    android.hardware.camera2.extension.ISessionProcessorImpl getSessionProcessorBinder() { return null; }
    public android.hardware.camera2.extension.ExtensionConfiguration initSession(android.os.IBinder p0, java.lang.String p1, android.hardware.camera2.extension.CharacteristicsMap p2, android.hardware.camera2.extension.CameraConfiguration p3) { return null; }
    public abstract android.hardware.camera2.extension.ExtensionConfiguration initSession(android.os.IBinder p0, java.lang.String p1, android.hardware.camera2.extension.CharacteristicsMap p2, android.hardware.camera2.extension.CameraOutputSurface p3, android.hardware.camera2.extension.CameraOutputSurface p4);
    public abstract void onCaptureSessionEnd();
    public abstract void onCaptureSessionStart(android.hardware.camera2.extension.RequestProcessor p0, java.lang.String p1);
    void setCameraUsageTracker(android.hardware.camera2.extension.CameraUsageTracker p0) {}
    public abstract void setParameters(android.hardware.camera2.CaptureRequest p0);
    public abstract int startMultiFrameCapture(java.util.concurrent.Executor p0, android.hardware.camera2.extension.SessionProcessor.CaptureCallback p1);
    public int startMultiFrameCapture(boolean p0, java.util.concurrent.Executor p1, android.hardware.camera2.extension.SessionProcessor.CaptureCallback p2) { return 0; }
    public abstract int startRepeating(java.util.concurrent.Executor p0, android.hardware.camera2.extension.SessionProcessor.CaptureCallback p1);
    public abstract int startTrigger(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.extension.SessionProcessor.CaptureCallback p2);
    public abstract void stopRepeating();

    @android.annotation.SystemApi
    public static interface CaptureCallback {
        public void onCaptureCompleted(long p0, int p1, java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> p2);
        public void onCaptureFailed(int p0, int p1);
        default public void onCaptureProcessProgressUpdated(int p0) {}
        public void onCaptureProcessStarted(int p0);
        public void onCaptureSequenceAborted(int p0);
        public void onCaptureSequenceCompleted(int p0);
        public void onCaptureStarted(int p0, long p1);
    }

    private static final class CaptureCallbackImpl implements android.hardware.camera2.extension.SessionProcessor.CaptureCallback {
        private final android.hardware.camera2.extension.ICaptureCallback mCaptureCallback = null;
        private long mVendorId;
        CaptureCallbackImpl(android.hardware.camera2.extension.ICaptureCallback p0, long p1) {}
        public void onCaptureCompleted(long p0, int p1, java.util.Map<android.hardware.camera2.CaptureResult.Key, java.lang.Object> p2) {}
        public void onCaptureFailed(int p0, int p1) {}
        public void onCaptureProcessProgressUpdated(int p0) {}
        public void onCaptureProcessStarted(int p0) {}
        public void onCaptureSequenceAborted(int p0) {}
        public void onCaptureSequenceCompleted(int p0) {}
        public void onCaptureStarted(int p0, long p1) {}
    }

    public static final class CaptureLatencyInfo {
        public final long captureLatency = 0L;
        public final long processingLatency = 0L;
        public CaptureLatencyInfo(long p0, long p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private final class SessionProcessorImpl extends android.hardware.camera2.extension.ISessionProcessorImpl.Stub {
        android.hardware.camera2.extension.OutputSurface mImageCaptureSurface;
        android.hardware.camera2.extension.OutputSurface mPostviewSurface;
        android.hardware.camera2.extension.OutputSurface mPreviewSurface;
        private long mVendorId;
        private SessionProcessorImpl(android.hardware.camera2.extension.SessionProcessor p0) { super(); }
        public void deInitSession(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.hardware.camera2.extension.LatencyPair getRealtimeCaptureLatency() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.CameraSessionConfig initSession(android.os.IBinder p0, java.lang.String p1, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p2, android.hardware.camera2.extension.OutputSurface p3, android.hardware.camera2.extension.OutputSurface p4, android.hardware.camera2.extension.OutputSurface p5, android.hardware.camera2.CaptureRequest p6) throws android.os.RemoteException { return null; }
        public void onCaptureSessionEnd() throws android.os.RemoteException {}
        public void onCaptureSessionStart(android.hardware.camera2.extension.IRequestProcessorImpl p0, java.lang.String p1) throws android.os.RemoteException {}
        public void setParameters(android.hardware.camera2.CaptureRequest p0) throws android.os.RemoteException {}
        public int startCapture(android.hardware.camera2.extension.ICaptureCallback p0, boolean p1) throws android.os.RemoteException { return 0; }
        public int startRepeating(android.hardware.camera2.extension.ICaptureCallback p0) throws android.os.RemoteException { return 0; }
        public int startTrigger(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.extension.ICaptureCallback p1) throws android.os.RemoteException { return 0; }
        public void stopRepeating() throws android.os.RemoteException {}
    }
}

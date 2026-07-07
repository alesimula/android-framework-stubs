package android.hardware.camera2;

public abstract class CameraExtensionSession implements java.lang.AutoCloseable {
    public CameraExtensionSession() {}
    public int capture(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void close() throws android.hardware.camera2.CameraAccessException {}
    public android.hardware.camera2.CameraDevice getDevice() { return null; }
    public android.hardware.camera2.CameraExtensionSession.StillCaptureLatency getRealtimeStillCaptureLatency() throws android.hardware.camera2.CameraAccessException { return null; }
    public int setRepeatingRequest(android.hardware.camera2.CaptureRequest p0, java.util.concurrent.Executor p1, android.hardware.camera2.CameraExtensionSession.ExtensionCaptureCallback p2) throws android.hardware.camera2.CameraAccessException { return 0; }
    public void stopRepeating() throws android.hardware.camera2.CameraAccessException {}

    public static abstract class ExtensionCaptureCallback {
        public ExtensionCaptureCallback() {}
        public void onCaptureFailed(android.hardware.camera2.CameraExtensionSession p0, android.hardware.camera2.CaptureRequest p1) {}
        public void onCaptureFailed(android.hardware.camera2.CameraExtensionSession p0, android.hardware.camera2.CaptureRequest p1, int p2) {}
        public void onCaptureProcessProgressed(android.hardware.camera2.CameraExtensionSession p0, android.hardware.camera2.CaptureRequest p1, int p2) {}
        public void onCaptureProcessStarted(android.hardware.camera2.CameraExtensionSession p0, android.hardware.camera2.CaptureRequest p1) {}
        public void onCaptureResultAvailable(android.hardware.camera2.CameraExtensionSession p0, android.hardware.camera2.CaptureRequest p1, android.hardware.camera2.TotalCaptureResult p2) {}
        public void onCaptureSequenceAborted(android.hardware.camera2.CameraExtensionSession p0, int p1) {}
        public void onCaptureSequenceCompleted(android.hardware.camera2.CameraExtensionSession p0, int p1) {}
        public void onCaptureStarted(android.hardware.camera2.CameraExtensionSession p0, android.hardware.camera2.CaptureRequest p1, long p2) {}
    }

    public static abstract class StateCallback {
        public StateCallback() {}
        public void onClosed(android.hardware.camera2.CameraExtensionSession p0) {}
        public abstract void onConfigureFailed(android.hardware.camera2.CameraExtensionSession p0);
        public abstract void onConfigured(android.hardware.camera2.CameraExtensionSession p0);
    }

    public static final class StillCaptureLatency {
        private final long mCaptureLatency = 0L;
        private final long mProcessingLatency = 0L;
        public StillCaptureLatency(long p0, long p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public long getCaptureLatency() { return 0L; }
        public long getProcessingLatency() { return 0L; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}

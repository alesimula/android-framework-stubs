package android.hardware.camera2.impl;

public class CameraInjectionSessionImpl extends android.hardware.camera2.CameraInjectionSession implements android.os.IBinder.DeathRecipient {
    private static final java.lang.String TAG = "CameraInjectionSessionImpl";
    private final android.hardware.camera2.impl.CameraInjectionSessionImpl.CameraInjectionCallback mCallback = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private android.hardware.camera2.ICameraInjectionSession mInjectionSession;
    private final android.hardware.camera2.CameraInjectionSession.InjectionStatusCallback mInjectionStatusCallback = null;
    private final java.lang.Object mInterfaceLock = null;
    public CameraInjectionSessionImpl(android.hardware.camera2.CameraInjectionSession.InjectionStatusCallback p0, java.util.concurrent.Executor p1) { super(); }
    private void notifyError(int p0) {}
    private void scheduleNotifyError(int p0) {}
    public void binderDied() {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    public android.hardware.camera2.impl.CameraInjectionSessionImpl.CameraInjectionCallback getCallback() { return null; }
    public void onInjectionError(int p0) {}
    public void setRemoteInjectionSession(android.hardware.camera2.ICameraInjectionSession p0) {}

    public class CameraInjectionCallback extends android.hardware.camera2.ICameraInjectionCallback.Stub {
        public CameraInjectionCallback(android.hardware.camera2.impl.CameraInjectionSessionImpl p0) { super(); }
        public android.os.IBinder asBinder() { return null; }
        public void onInjectionError(int p0) {}
    }
}

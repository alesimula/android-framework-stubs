package android.companion.virtual.camera;

public interface IVirtualCameraCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.camera.IVirtualCameraCallback";
    public void onConfigureSession(android.hardware.camera2.CaptureRequest p0, android.companion.virtual.camera.ICaptureResultConsumer p1) throws android.os.RemoteException;
    public void onOpenCamera() throws android.os.RemoteException;
    public void onProcessCaptureRequest(int p0, long p1, android.hardware.camera2.CaptureRequest p2) throws android.os.RemoteException;
    public void onStreamClosed(int p0) throws android.os.RemoteException;
    public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.camera.IVirtualCameraCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onConfigureSession(android.hardware.camera2.CaptureRequest p0, android.companion.virtual.camera.ICaptureResultConsumer p1) throws android.os.RemoteException {}
        public void onOpenCamera() throws android.os.RemoteException {}
        public void onProcessCaptureRequest(int p0, long p1, android.hardware.camera2.CaptureRequest p2) throws android.os.RemoteException {}
        public void onStreamClosed(int p0) throws android.os.RemoteException {}
        public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.camera.IVirtualCameraCallback {
        static final int TRANSACTION_onConfigureSession = 2;
        static final int TRANSACTION_onOpenCamera = 1;
        static final int TRANSACTION_onProcessCaptureRequest = 4;
        static final int TRANSACTION_onStreamClosed = 5;
        static final int TRANSACTION_onStreamConfigured = 3;
        public Stub() { super(); }
        public static android.companion.virtual.camera.IVirtualCameraCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.companion.virtual.camera.IVirtualCameraCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onConfigureSession(android.hardware.camera2.CaptureRequest p0, android.companion.virtual.camera.ICaptureResultConsumer p1) throws android.os.RemoteException {}
            public void onOpenCamera() throws android.os.RemoteException {}
            public void onProcessCaptureRequest(int p0, long p1, android.hardware.camera2.CaptureRequest p2) throws android.os.RemoteException {}
            public void onStreamClosed(int p0) throws android.os.RemoteException {}
            public void onStreamConfigured(int p0, android.view.Surface p1, int p2, int p3, int p4) throws android.os.RemoteException {}
        }
    }
}

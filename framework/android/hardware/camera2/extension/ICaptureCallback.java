package android.hardware.camera2.extension;

public interface ICaptureCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.ICaptureCallback";
    public void onCaptureCompleted(long p0, int p1, android.hardware.camera2.impl.CameraMetadataNative p2) throws android.os.RemoteException;
    public void onCaptureFailed(int p0) throws android.os.RemoteException;
    public void onCaptureProcessFailed(int p0, int p1) throws android.os.RemoteException;
    public void onCaptureProcessProgressed(int p0) throws android.os.RemoteException;
    public void onCaptureProcessStarted(int p0) throws android.os.RemoteException;
    public void onCaptureSequenceAborted(int p0) throws android.os.RemoteException;
    public void onCaptureSequenceCompleted(int p0) throws android.os.RemoteException;
    public void onCaptureStarted(int p0, long p1) throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.ICaptureCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onCaptureCompleted(long p0, int p1, android.hardware.camera2.impl.CameraMetadataNative p2) throws android.os.RemoteException {}
        public void onCaptureFailed(int p0) throws android.os.RemoteException {}
        public void onCaptureProcessFailed(int p0, int p1) throws android.os.RemoteException {}
        public void onCaptureProcessProgressed(int p0) throws android.os.RemoteException {}
        public void onCaptureProcessStarted(int p0) throws android.os.RemoteException {}
        public void onCaptureSequenceAborted(int p0) throws android.os.RemoteException {}
        public void onCaptureSequenceCompleted(int p0) throws android.os.RemoteException {}
        public void onCaptureStarted(int p0, long p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.ICaptureCallback {
        static final int TRANSACTION_onCaptureCompleted = 6;
        static final int TRANSACTION_onCaptureFailed = 3;
        static final int TRANSACTION_onCaptureProcessFailed = 8;
        static final int TRANSACTION_onCaptureProcessProgressed = 7;
        static final int TRANSACTION_onCaptureProcessStarted = 2;
        static final int TRANSACTION_onCaptureSequenceAborted = 5;
        static final int TRANSACTION_onCaptureSequenceCompleted = 4;
        static final int TRANSACTION_onCaptureStarted = 1;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.ICaptureCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.camera2.extension.ICaptureCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onCaptureCompleted(long p0, int p1, android.hardware.camera2.impl.CameraMetadataNative p2) throws android.os.RemoteException {}
            public void onCaptureFailed(int p0) throws android.os.RemoteException {}
            public void onCaptureProcessFailed(int p0, int p1) throws android.os.RemoteException {}
            public void onCaptureProcessProgressed(int p0) throws android.os.RemoteException {}
            public void onCaptureProcessStarted(int p0) throws android.os.RemoteException {}
            public void onCaptureSequenceAborted(int p0) throws android.os.RemoteException {}
            public void onCaptureSequenceCompleted(int p0) throws android.os.RemoteException {}
            public void onCaptureStarted(int p0, long p1) throws android.os.RemoteException {}
        }
    }
}

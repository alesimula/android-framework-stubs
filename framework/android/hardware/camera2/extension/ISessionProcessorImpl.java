package android.hardware.camera2.extension;

public interface ISessionProcessorImpl extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.ISessionProcessorImpl";
    public void deInitSession(android.os.IBinder p0) throws android.os.RemoteException;
    public android.hardware.camera2.extension.LatencyPair getRealtimeCaptureLatency() throws android.os.RemoteException;
    public android.hardware.camera2.extension.CameraSessionConfig initSession(android.os.IBinder p0, java.lang.String p1, java.util.Map<java.lang.String, android.hardware.camera2.impl.CameraMetadataNative> p2, android.hardware.camera2.extension.OutputSurface p3, android.hardware.camera2.extension.OutputSurface p4, android.hardware.camera2.extension.OutputSurface p5, android.hardware.camera2.CaptureRequest p6) throws android.os.RemoteException;
    public void onCaptureSessionEnd() throws android.os.RemoteException;
    public void onCaptureSessionStart(android.hardware.camera2.extension.IRequestProcessorImpl p0, java.lang.String p1) throws android.os.RemoteException;
    public void setParameters(android.hardware.camera2.CaptureRequest p0) throws android.os.RemoteException;
    public int startCapture(android.hardware.camera2.extension.ICaptureCallback p0, boolean p1) throws android.os.RemoteException;
    public int startRepeating(android.hardware.camera2.extension.ICaptureCallback p0) throws android.os.RemoteException;
    public int startTrigger(android.hardware.camera2.CaptureRequest p0, android.hardware.camera2.extension.ICaptureCallback p1) throws android.os.RemoteException;
    public void stopRepeating() throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.ISessionProcessorImpl {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
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

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.ISessionProcessorImpl {
        static final int TRANSACTION_deInitSession = 2;
        static final int TRANSACTION_getRealtimeCaptureLatency = 10;
        static final int TRANSACTION_initSession = 1;
        static final int TRANSACTION_onCaptureSessionEnd = 4;
        static final int TRANSACTION_onCaptureSessionStart = 3;
        static final int TRANSACTION_setParameters = 8;
        static final int TRANSACTION_startCapture = 7;
        static final int TRANSACTION_startRepeating = 5;
        static final int TRANSACTION_startTrigger = 9;
        static final int TRANSACTION_stopRepeating = 6;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.ISessionProcessorImpl asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.camera2.extension.ISessionProcessorImpl {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void deInitSession(android.os.IBinder p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
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
}

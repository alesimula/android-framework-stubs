package android.hardware.camera2.extension;

public interface IOutputSurfaceConfiguration extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.hardware.camera2.extension.IOutputSurfaceConfiguration";
    public android.hardware.camera2.extension.OutputSurface getImageAnalysisOutputSurface() throws android.os.RemoteException;
    public android.hardware.camera2.extension.OutputSurface getImageCaptureOutputSurface() throws android.os.RemoteException;
    public android.hardware.camera2.extension.OutputSurface getPostviewOutputSurface() throws android.os.RemoteException;
    public android.hardware.camera2.extension.OutputSurface getPreviewOutputSurface() throws android.os.RemoteException;

    public static class Default implements android.hardware.camera2.extension.IOutputSurfaceConfiguration {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.hardware.camera2.extension.OutputSurface getImageAnalysisOutputSurface() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.OutputSurface getImageCaptureOutputSurface() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.OutputSurface getPostviewOutputSurface() throws android.os.RemoteException { return null; }
        public android.hardware.camera2.extension.OutputSurface getPreviewOutputSurface() throws android.os.RemoteException { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.camera2.extension.IOutputSurfaceConfiguration {
        static final int TRANSACTION_getImageAnalysisOutputSurface = 3;
        static final int TRANSACTION_getImageCaptureOutputSurface = 2;
        static final int TRANSACTION_getPostviewOutputSurface = 4;
        static final int TRANSACTION_getPreviewOutputSurface = 1;
        public Stub() { super(); }
        public static android.hardware.camera2.extension.IOutputSurfaceConfiguration asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.camera2.extension.IOutputSurfaceConfiguration {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.hardware.camera2.extension.OutputSurface getImageAnalysisOutputSurface() throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.OutputSurface getImageCaptureOutputSurface() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.hardware.camera2.extension.OutputSurface getPostviewOutputSurface() throws android.os.RemoteException { return null; }
            public android.hardware.camera2.extension.OutputSurface getPreviewOutputSurface() throws android.os.RemoteException { return null; }
        }
    }
}

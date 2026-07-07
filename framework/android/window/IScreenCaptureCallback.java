package android.window;

public interface IScreenCaptureCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IScreenCaptureCallback";
    public void onFailure(int p0) throws android.os.RemoteException;
    public void onSuccess(android.window.ScreenCapture.ScreenCaptureResult p0) throws android.os.RemoteException;

    public static class Default implements android.window.IScreenCaptureCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onFailure(int p0) throws android.os.RemoteException {}
        public void onSuccess(android.window.ScreenCapture.ScreenCaptureResult p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IScreenCaptureCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;
        public Stub() { super(); }
        public static android.window.IScreenCaptureCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.window.IScreenCaptureCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onFailure(int p0) throws android.os.RemoteException {}
            public void onSuccess(android.window.ScreenCapture.ScreenCaptureResult p0) throws android.os.RemoteException {}
        }
    }
}

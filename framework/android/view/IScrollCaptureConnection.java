package android.view;

public interface IScrollCaptureConnection extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.IScrollCaptureConnection";
    public void close() throws android.os.RemoteException;
    public android.os.ICancellationSignal endCapture() throws android.os.RemoteException;
    public android.os.ICancellationSignal requestImage(android.graphics.Rect p0) throws android.os.RemoteException;
    public android.os.ICancellationSignal startCapture(android.view.Surface p0, android.view.IScrollCaptureCallbacks p1) throws android.os.RemoteException;

    public static class Default implements android.view.IScrollCaptureConnection {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public android.os.ICancellationSignal endCapture() throws android.os.RemoteException { return null; }
        public android.os.ICancellationSignal requestImage(android.graphics.Rect p0) throws android.os.RemoteException { return null; }
        public android.os.ICancellationSignal startCapture(android.view.Surface p0, android.view.IScrollCaptureCallbacks p1) throws android.os.RemoteException { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IScrollCaptureConnection {
        static final int TRANSACTION_close = 4;
        static final int TRANSACTION_endCapture = 3;
        static final int TRANSACTION_requestImage = 2;
        static final int TRANSACTION_startCapture = 1;
        public Stub() { super(); }
        public static android.view.IScrollCaptureConnection asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.IScrollCaptureConnection {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public android.os.ICancellationSignal endCapture() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ICancellationSignal requestImage(android.graphics.Rect p0) throws android.os.RemoteException { return null; }
            public android.os.ICancellationSignal startCapture(android.view.Surface p0, android.view.IScrollCaptureCallbacks p1) throws android.os.RemoteException { return null; }
        }
    }
}

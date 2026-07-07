package android.view.accessibility;

public interface IWindowSurfaceInfoCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.accessibility.IWindowSurfaceInfoCallback";
    public void provideWindowSurfaceInfo(int p0, int p1, android.view.SurfaceControl p2) throws android.os.RemoteException;
    public void provideWindowSurfaceInfoWithBounds(int p0, int p1, android.view.SurfaceControl p2, android.graphics.Rect p3) throws android.os.RemoteException;

    public static class Default implements android.view.accessibility.IWindowSurfaceInfoCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void provideWindowSurfaceInfo(int p0, int p1, android.view.SurfaceControl p2) throws android.os.RemoteException {}
        public void provideWindowSurfaceInfoWithBounds(int p0, int p1, android.view.SurfaceControl p2, android.graphics.Rect p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.view.accessibility.IWindowSurfaceInfoCallback {
        static final int TRANSACTION_provideWindowSurfaceInfo = 1;
        static final int TRANSACTION_provideWindowSurfaceInfoWithBounds = 2;
        public Stub() { super(); }
        public static android.view.accessibility.IWindowSurfaceInfoCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.view.accessibility.IWindowSurfaceInfoCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void provideWindowSurfaceInfo(int p0, int p1, android.view.SurfaceControl p2) throws android.os.RemoteException {}
            public void provideWindowSurfaceInfoWithBounds(int p0, int p1, android.view.SurfaceControl p2, android.graphics.Rect p3) throws android.os.RemoteException {}
        }
    }
}

package android.window.sharedsurface;

public interface ISharedAnimationProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.sharedsurface.ISharedAnimationProvider";
    public void createSurfaceHandler(android.window.sharedsurface.SharedAnimationFilter p0, android.view.SurfaceControl p1, int p2, int p3, android.window.sharedsurface.ISharedAnimationReady p4) throws android.os.RemoteException;

    public static class Default implements android.window.sharedsurface.ISharedAnimationProvider {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void createSurfaceHandler(android.window.sharedsurface.SharedAnimationFilter p0, android.view.SurfaceControl p1, int p2, int p3, android.window.sharedsurface.ISharedAnimationReady p4) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.window.sharedsurface.ISharedAnimationProvider {
        static final int TRANSACTION_createSurfaceHandler = 1;
        public Stub() { super(); }
        public static android.window.sharedsurface.ISharedAnimationProvider asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.window.sharedsurface.ISharedAnimationProvider {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void createSurfaceHandler(android.window.sharedsurface.SharedAnimationFilter p0, android.view.SurfaceControl p1, int p2, int p3, android.window.sharedsurface.ISharedAnimationReady p4) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}

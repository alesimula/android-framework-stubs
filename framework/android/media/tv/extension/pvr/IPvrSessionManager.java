package android.media.tv.extension.pvr;

public interface IPvrSessionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.pvr.IPvrSessionManager";
    public void activatePvr() throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.pvr.IPvrSessionManager {
        public Default() {}
        public void activatePvr() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.pvr.IPvrSessionManager {
        static final int TRANSACTION_activatePvr = 1;
        public Stub() { super(); }
        public static android.media.tv.extension.pvr.IPvrSessionManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.media.tv.extension.pvr.IPvrSessionManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void activatePvr() throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}

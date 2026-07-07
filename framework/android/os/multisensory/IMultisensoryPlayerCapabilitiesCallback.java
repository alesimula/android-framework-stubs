package android.os.multisensory;

public interface IMultisensoryPlayerCapabilitiesCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.multisensory.IMultisensoryPlayerCapabilitiesCallback";
    public static final int FLAG_SUPPORTS_SESSIONS = 32;
    public void onCapabilitiesUpdated(long p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.os.multisensory.IMultisensoryPlayerCapabilitiesCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onCapabilitiesUpdated(long p0, int p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.multisensory.IMultisensoryPlayerCapabilitiesCallback {
        static final int TRANSACTION_onCapabilitiesUpdated = 2;
        public Stub() { super(); }
        public static android.os.multisensory.IMultisensoryPlayerCapabilitiesCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.multisensory.IMultisensoryPlayerCapabilitiesCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onCapabilitiesUpdated(long p0, int p1) throws android.os.RemoteException {}
        }
    }
}

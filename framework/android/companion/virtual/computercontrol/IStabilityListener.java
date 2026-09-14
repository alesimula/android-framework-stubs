package android.companion.virtual.computercontrol;

public interface IStabilityListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.computercontrol.IStabilityListener";
    public void onSessionStable() throws android.os.RemoteException;
    public void onSessionUnstable(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.computercontrol.IStabilityListener {
        static final int TRANSACTION_onSessionStable = 1;
        static final int TRANSACTION_onSessionUnstable = 2;
        public Stub() { super(); }
        public static android.companion.virtual.computercontrol.IStabilityListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.companion.virtual.computercontrol.IStabilityListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionStable() throws android.os.RemoteException {}
            public void onSessionUnstable(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.companion.virtual.computercontrol.IStabilityListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onSessionStable() throws android.os.RemoteException {}
        public void onSessionUnstable(int p0) throws android.os.RemoteException {}
    }
}

package android.hardware.display;

public interface IDisplayManagerCallback extends android.os.IInterface {
    public void onDisplayEvent(int p0, int p1) throws android.os.RemoteException;
    public void onDisplaySnapshot(int[] p0, int[] p1) throws android.os.RemoteException;
    public void onTopologyChanged(android.hardware.display.DisplayTopology p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.display.IDisplayManagerCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onDisplayEvent(int p0, int p1) throws android.os.RemoteException {}
        public void onDisplaySnapshot(int[] p0, int[] p1) throws android.os.RemoteException {}
        public void onTopologyChanged(android.hardware.display.DisplayTopology p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.display.IDisplayManagerCallback {
        public static final java.lang.String DESCRIPTOR = "android.hardware.display.IDisplayManagerCallback";
        static final int TRANSACTION_onDisplayEvent = 1;
        static final int TRANSACTION_onDisplaySnapshot = 3;
        static final int TRANSACTION_onTopologyChanged = 2;
        public Stub() { super(); }
        public static android.hardware.display.IDisplayManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.hardware.display.IDisplayManagerCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onDisplayEvent(int p0, int p1) throws android.os.RemoteException {}
            public void onDisplaySnapshot(int[] p0, int[] p1) throws android.os.RemoteException {}
            public void onTopologyChanged(android.hardware.display.DisplayTopology p0) throws android.os.RemoteException {}
        }
    }
}

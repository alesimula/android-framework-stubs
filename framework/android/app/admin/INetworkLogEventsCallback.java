package android.app.admin;

public interface INetworkLogEventsCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.admin.INetworkLogEventsCallback";
    public void onNewNetworkLogEvents(android.content.pm.ParceledListSlice<android.app.admin.NetworkEvent> p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.admin.INetworkLogEventsCallback {
        static final int TRANSACTION_onNewNetworkLogEvents = 1;
        public Stub() { super(); }
        public static android.app.admin.INetworkLogEventsCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.admin.INetworkLogEventsCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onNewNetworkLogEvents(android.content.pm.ParceledListSlice<android.app.admin.NetworkEvent> p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.admin.INetworkLogEventsCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onNewNetworkLogEvents(android.content.pm.ParceledListSlice<android.app.admin.NetworkEvent> p0) throws android.os.RemoteException {}
    }
}

package android.app;

public interface IInstantAppResolver extends android.os.IInterface {
    public void getInstantAppIntentFilterList(android.content.pm.InstantAppRequestInfo p0, android.os.IRemoteCallback p1) throws android.os.RemoteException;
    public void getInstantAppResolveInfoList(android.content.pm.InstantAppRequestInfo p0, int p1, android.os.IRemoteCallback p2) throws android.os.RemoteException;

    public static class Default implements android.app.IInstantAppResolver {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void getInstantAppIntentFilterList(android.content.pm.InstantAppRequestInfo p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
        public void getInstantAppResolveInfoList(android.content.pm.InstantAppRequestInfo p0, int p1, android.os.IRemoteCallback p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IInstantAppResolver {
        public static final java.lang.String DESCRIPTOR = "android.app.IInstantAppResolver";
        static final int TRANSACTION_getInstantAppIntentFilterList = 2;
        static final int TRANSACTION_getInstantAppResolveInfoList = 1;
        public Stub() { super(); }
        public static android.app.IInstantAppResolver asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IInstantAppResolver {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void getInstantAppIntentFilterList(android.content.pm.InstantAppRequestInfo p0, android.os.IRemoteCallback p1) throws android.os.RemoteException {}
            public void getInstantAppResolveInfoList(android.content.pm.InstantAppRequestInfo p0, int p1, android.os.IRemoteCallback p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}

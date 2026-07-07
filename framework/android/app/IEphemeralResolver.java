package android.app;

public interface IEphemeralResolver extends android.os.IInterface {
    public void getEphemeralIntentFilterList(android.os.IRemoteCallback p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void getEphemeralResolveInfoList(android.os.IRemoteCallback p0, int[] p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.app.IEphemeralResolver {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void getEphemeralIntentFilterList(android.os.IRemoteCallback p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void getEphemeralResolveInfoList(android.os.IRemoteCallback p0, int[] p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IEphemeralResolver {
        public static final java.lang.String DESCRIPTOR = "android.app.IEphemeralResolver";
        static final int TRANSACTION_getEphemeralIntentFilterList = 2;
        static final int TRANSACTION_getEphemeralResolveInfoList = 1;
        public Stub() { super(); }
        public static android.app.IEphemeralResolver asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IEphemeralResolver {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void getEphemeralIntentFilterList(android.os.IRemoteCallback p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void getEphemeralResolveInfoList(android.os.IRemoteCallback p0, int[] p1, int p2) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}

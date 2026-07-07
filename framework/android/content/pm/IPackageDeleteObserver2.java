package android.content.pm;

public interface IPackageDeleteObserver2 extends android.os.IInterface {
    public void onPackageDeleted(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void onUserActionRequired(android.content.Intent p0) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageDeleteObserver2 {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onPackageDeleted(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void onUserActionRequired(android.content.Intent p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageDeleteObserver2 {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageDeleteObserver2";
        static final int TRANSACTION_onPackageDeleted = 2;
        static final int TRANSACTION_onUserActionRequired = 1;
        public Stub() { super(); }
        public static android.content.pm.IPackageDeleteObserver2 asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.content.pm.IPackageDeleteObserver2 {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onPackageDeleted(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void onUserActionRequired(android.content.Intent p0) throws android.os.RemoteException {}
        }
    }
}

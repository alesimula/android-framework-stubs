package android.content.res;

public interface IResourcesManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.res.IResourcesManager";
    public boolean dumpResources(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.RemoteCallback p2) throws android.os.RemoteException;

    public static class Default implements android.content.res.IResourcesManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public boolean dumpResources(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.RemoteCallback p2) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.res.IResourcesManager {
        static final int TRANSACTION_dumpResources = 1;
        public Stub() { super(); }
        public static android.content.res.IResourcesManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.content.res.IResourcesManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public boolean dumpResources(java.lang.String p0, android.os.ParcelFileDescriptor p1, android.os.RemoteCallback p2) throws android.os.RemoteException { return false; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}

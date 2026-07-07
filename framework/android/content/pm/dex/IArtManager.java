package android.content.pm.dex;

public interface IArtManager extends android.os.IInterface {
    public boolean isRuntimeProfilingEnabled(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void snapshotRuntimeProfile(int p0, java.lang.String p1, java.lang.String p2, android.content.pm.dex.ISnapshotRuntimeProfileCallback p3, java.lang.String p4) throws android.os.RemoteException;

    public static class Default implements android.content.pm.dex.IArtManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public boolean isRuntimeProfilingEnabled(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public void snapshotRuntimeProfile(int p0, java.lang.String p1, java.lang.String p2, android.content.pm.dex.ISnapshotRuntimeProfileCallback p3, java.lang.String p4) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.dex.IArtManager {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.dex.IArtManager";
        static final int TRANSACTION_isRuntimeProfilingEnabled = 2;
        static final int TRANSACTION_snapshotRuntimeProfile = 1;
        public Stub() { super(); }
        public static android.content.pm.dex.IArtManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.content.pm.dex.IArtManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isRuntimeProfilingEnabled(int p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public void snapshotRuntimeProfile(int p0, java.lang.String p1, java.lang.String p2, android.content.pm.dex.ISnapshotRuntimeProfileCallback p3, java.lang.String p4) throws android.os.RemoteException {}
        }
    }
}

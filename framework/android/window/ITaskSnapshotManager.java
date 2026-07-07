package android.window;

public interface ITaskSnapshotManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.ITaskSnapshotManager";
    public android.window.TaskSnapshot getTaskSnapshot(int p0, long p1, int p2) throws android.os.RemoteException;
    public void registerTaskSnapshotListener(android.window.ITaskSnapshotListener p0) throws android.os.RemoteException;
    public android.window.TaskSnapshot takeTaskSnapshot(int p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException;
    public void unregisterTaskSnapshotListener(android.window.ITaskSnapshotListener p0) throws android.os.RemoteException;

    public static class Default implements android.window.ITaskSnapshotManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.window.TaskSnapshot getTaskSnapshot(int p0, long p1, int p2) throws android.os.RemoteException { return null; }
        public void registerTaskSnapshotListener(android.window.ITaskSnapshotListener p0) throws android.os.RemoteException {}
        public android.window.TaskSnapshot takeTaskSnapshot(int p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException { return null; }
        public void unregisterTaskSnapshotListener(android.window.ITaskSnapshotListener p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ITaskSnapshotManager {
        static final int TRANSACTION_getTaskSnapshot = 1;
        static final int TRANSACTION_registerTaskSnapshotListener = 3;
        static final int TRANSACTION_takeTaskSnapshot = 2;
        static final int TRANSACTION_unregisterTaskSnapshotListener = 4;
        public Stub() { super(); }
        public static android.window.ITaskSnapshotManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.window.ITaskSnapshotManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public android.window.TaskSnapshot getTaskSnapshot(int p0, long p1, int p2) throws android.os.RemoteException { return null; }
            public void registerTaskSnapshotListener(android.window.ITaskSnapshotListener p0) throws android.os.RemoteException {}
            public android.window.TaskSnapshot takeTaskSnapshot(int p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException { return null; }
            public void unregisterTaskSnapshotListener(android.window.ITaskSnapshotListener p0) throws android.os.RemoteException {}
        }
    }
}

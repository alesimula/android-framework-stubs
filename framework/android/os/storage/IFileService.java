package android.os.storage;

public interface IFileService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.storage.IFileService";
    public android.os.storage.operations.FileOperationEnqueueResult enqueueOperation(android.os.storage.operations.FileOperationRequest p0, java.lang.String p1) throws android.os.RemoteException;
    public android.os.storage.operations.FileOperationResult fetchResult(java.lang.String p0) throws android.os.RemoteException;
    public void registerCompletionListener(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void unregisterCompletionListener(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.os.storage.IFileService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.os.storage.operations.FileOperationEnqueueResult enqueueOperation(android.os.storage.operations.FileOperationRequest p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.os.storage.operations.FileOperationResult fetchResult(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void registerCompletionListener(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void unregisterCompletionListener(java.lang.String p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.storage.IFileService {
        static final int TRANSACTION_enqueueOperation = 1;
        static final int TRANSACTION_fetchResult = 2;
        static final int TRANSACTION_registerCompletionListener = 3;
        static final int TRANSACTION_unregisterCompletionListener = 4;
        public Stub() { super(); }
        public static android.os.storage.IFileService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.storage.IFileService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.os.storage.operations.FileOperationEnqueueResult enqueueOperation(android.os.storage.operations.FileOperationRequest p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.os.storage.operations.FileOperationResult fetchResult(java.lang.String p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void registerCompletionListener(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void unregisterCompletionListener(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}

package android.app;

public interface IBinderSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IBinderSession";
    public void binderTransactionCompleted(long p0) throws android.os.RemoteException;
    public long binderTransactionStarting(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.app.IBinderSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void binderTransactionCompleted(long p0) throws android.os.RemoteException {}
        public long binderTransactionStarting(java.lang.String p0) throws android.os.RemoteException { return 0L; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IBinderSession {
        static final int TRANSACTION_binderTransactionCompleted = 2;
        static final int TRANSACTION_binderTransactionStarting = 1;
        public Stub() { super(); }
        public static android.app.IBinderSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IBinderSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void binderTransactionCompleted(long p0) throws android.os.RemoteException {}
            public long binderTransactionStarting(java.lang.String p0) throws android.os.RemoteException { return 0L; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}

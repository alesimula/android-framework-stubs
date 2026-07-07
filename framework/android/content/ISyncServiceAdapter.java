package android.content;

public interface ISyncServiceAdapter extends android.os.IInterface {
    public void cancelSync(android.content.ISyncContext p0) throws android.os.RemoteException;
    public void startSync(android.content.ISyncContext p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static class Default implements android.content.ISyncServiceAdapter {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void cancelSync(android.content.ISyncContext p0) throws android.os.RemoteException {}
        public void startSync(android.content.ISyncContext p0, android.os.Bundle p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.content.ISyncServiceAdapter {
        public static final java.lang.String DESCRIPTOR = "android.content.ISyncServiceAdapter";
        static final int TRANSACTION_cancelSync = 2;
        static final int TRANSACTION_startSync = 1;
        public Stub() { super(); }
        public static android.content.ISyncServiceAdapter asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.content.ISyncServiceAdapter {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void cancelSync(android.content.ISyncContext p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void startSync(android.content.ISyncContext p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }
}

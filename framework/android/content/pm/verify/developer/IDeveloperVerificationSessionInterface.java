package android.content.pm.verify.developer;

public interface IDeveloperVerificationSessionInterface extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.pm.verify.developer.IDeveloperVerificationSessionInterface";
    public long extendTimeoutMillis(int p0, long p1) throws android.os.RemoteException;
    public long getTimeoutTimeMillis(int p0) throws android.os.RemoteException;
    public void reportVerificationBypassed(int p0, int p1) throws android.os.RemoteException;
    public void reportVerificationComplete(int p0, android.content.pm.verify.developer.DeveloperVerificationStatus p1, android.os.PersistableBundle p2) throws android.os.RemoteException;
    public void reportVerificationIncomplete(int p0, int p1) throws android.os.RemoteException;
    public boolean setVerificationPolicy(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.content.pm.verify.developer.IDeveloperVerificationSessionInterface {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public long extendTimeoutMillis(int p0, long p1) throws android.os.RemoteException { return 0L; }
        public long getTimeoutTimeMillis(int p0) throws android.os.RemoteException { return 0L; }
        public void reportVerificationBypassed(int p0, int p1) throws android.os.RemoteException {}
        public void reportVerificationComplete(int p0, android.content.pm.verify.developer.DeveloperVerificationStatus p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
        public void reportVerificationIncomplete(int p0, int p1) throws android.os.RemoteException {}
        public boolean setVerificationPolicy(int p0, int p1) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.verify.developer.IDeveloperVerificationSessionInterface {
        static final int TRANSACTION_extendTimeoutMillis = 2;
        static final int TRANSACTION_getTimeoutTimeMillis = 1;
        static final int TRANSACTION_reportVerificationBypassed = 6;
        static final int TRANSACTION_reportVerificationComplete = 5;
        static final int TRANSACTION_reportVerificationIncomplete = 4;
        static final int TRANSACTION_setVerificationPolicy = 3;
        public Stub() { super(); }
        public static android.content.pm.verify.developer.IDeveloperVerificationSessionInterface asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.content.pm.verify.developer.IDeveloperVerificationSessionInterface {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public long extendTimeoutMillis(int p0, long p1) throws android.os.RemoteException { return 0L; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public long getTimeoutTimeMillis(int p0) throws android.os.RemoteException { return 0L; }
            public void reportVerificationBypassed(int p0, int p1) throws android.os.RemoteException {}
            public void reportVerificationComplete(int p0, android.content.pm.verify.developer.DeveloperVerificationStatus p1, android.os.PersistableBundle p2) throws android.os.RemoteException {}
            public void reportVerificationIncomplete(int p0, int p1) throws android.os.RemoteException {}
            public boolean setVerificationPolicy(int p0, int p1) throws android.os.RemoteException { return false; }
        }
    }
}

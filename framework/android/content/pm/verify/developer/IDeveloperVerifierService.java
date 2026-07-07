package android.content.pm.verify.developer;

public interface IDeveloperVerifierService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.pm.verify.developer.IDeveloperVerifierService";
    public void onPackageNameAvailable(java.lang.String p0) throws android.os.RemoteException;
    public void onVerificationCancelled(java.lang.String p0) throws android.os.RemoteException;
    public void onVerificationRequired(android.content.pm.verify.developer.DeveloperVerificationSession p0) throws android.os.RemoteException;
    public void onVerificationRetry(android.content.pm.verify.developer.DeveloperVerificationSession p0) throws android.os.RemoteException;
    public void onVerificationTimeout(int p0) throws android.os.RemoteException;

    public static class Default implements android.content.pm.verify.developer.IDeveloperVerifierService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onPackageNameAvailable(java.lang.String p0) throws android.os.RemoteException {}
        public void onVerificationCancelled(java.lang.String p0) throws android.os.RemoteException {}
        public void onVerificationRequired(android.content.pm.verify.developer.DeveloperVerificationSession p0) throws android.os.RemoteException {}
        public void onVerificationRetry(android.content.pm.verify.developer.DeveloperVerificationSession p0) throws android.os.RemoteException {}
        public void onVerificationTimeout(int p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.verify.developer.IDeveloperVerifierService {
        static final int TRANSACTION_onPackageNameAvailable = 1;
        static final int TRANSACTION_onVerificationCancelled = 2;
        static final int TRANSACTION_onVerificationRequired = 3;
        static final int TRANSACTION_onVerificationRetry = 4;
        static final int TRANSACTION_onVerificationTimeout = 5;
        public Stub() { super(); }
        public static android.content.pm.verify.developer.IDeveloperVerifierService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.content.pm.verify.developer.IDeveloperVerifierService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onPackageNameAvailable(java.lang.String p0) throws android.os.RemoteException {}
            public void onVerificationCancelled(java.lang.String p0) throws android.os.RemoteException {}
            public void onVerificationRequired(android.content.pm.verify.developer.DeveloperVerificationSession p0) throws android.os.RemoteException {}
            public void onVerificationRetry(android.content.pm.verify.developer.DeveloperVerificationSession p0) throws android.os.RemoteException {}
            public void onVerificationTimeout(int p0) throws android.os.RemoteException {}
        }
    }
}

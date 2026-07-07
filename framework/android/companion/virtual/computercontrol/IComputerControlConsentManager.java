package android.companion.virtual.computercontrol;

public interface IComputerControlConsentManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.computercontrol.IComputerControlConsentManager";
    public void clearAllUserConsents(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int getUserConsent(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;
    public java.util.Map getUserConsents(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void setUserConsent(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.computercontrol.IComputerControlConsentManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void clearAllUserConsents(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public int getUserConsent(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
        public java.util.Map getUserConsents(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public void setUserConsent(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.computercontrol.IComputerControlConsentManager {
        static final int TRANSACTION_clearAllUserConsents = 3;
        static final int TRANSACTION_getUserConsent = 2;
        static final int TRANSACTION_getUserConsents = 4;
        static final int TRANSACTION_setUserConsent = 1;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.companion.virtual.computercontrol.IComputerControlConsentManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void clearAllUserConsents_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        protected void getUserConsents_enforcePermission() throws java.lang.SecurityException {}
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setUserConsent_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.companion.virtual.computercontrol.IComputerControlConsentManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void clearAllUserConsents(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int getUserConsent(int p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return 0; }
            public java.util.Map getUserConsents(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public void setUserConsent(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException {}
        }
    }
}

package android.os;

public interface IRecoverySystem extends android.os.IInterface {
    public boolean allocateSpaceForUpdate(java.lang.String p0) throws android.os.RemoteException;
    public boolean clearBcb() throws android.os.RemoteException;
    public boolean clearLskf(java.lang.String p0) throws android.os.RemoteException;
    public boolean isLskfCaptured(java.lang.String p0) throws android.os.RemoteException;
    public void rebootRecoveryWithCommand(java.lang.String p0) throws android.os.RemoteException;
    public int rebootWithLskf(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException;
    public int rebootWithLskfAssumeSlotSwitch(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean requestLskf(java.lang.String p0, android.content.IntentSender p1) throws android.os.RemoteException;
    public boolean setupBcb(java.lang.String p0) throws android.os.RemoteException;
    public boolean uncrypt(java.lang.String p0, android.os.IRecoverySystemProgressListener p1) throws android.os.RemoteException;

    public static class Default implements android.os.IRecoverySystem {
        public Default() {}
        public boolean allocateSpaceForUpdate(java.lang.String p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
        public boolean clearBcb() throws android.os.RemoteException { return false; }
        public boolean clearLskf(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean isLskfCaptured(java.lang.String p0) throws android.os.RemoteException { return false; }
        public void rebootRecoveryWithCommand(java.lang.String p0) throws android.os.RemoteException {}
        public int rebootWithLskf(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int rebootWithLskfAssumeSlotSwitch(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public boolean requestLskf(java.lang.String p0, android.content.IntentSender p1) throws android.os.RemoteException { return false; }
        public boolean setupBcb(java.lang.String p0) throws android.os.RemoteException { return false; }
        public boolean uncrypt(java.lang.String p0, android.os.IRecoverySystemProgressListener p1) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IRecoverySystem {
        public static final java.lang.String DESCRIPTOR = "android.os.IRecoverySystem";
        static final int TRANSACTION_allocateSpaceForUpdate = 1;
        static final int TRANSACTION_clearBcb = 4;
        static final int TRANSACTION_clearLskf = 7;
        static final int TRANSACTION_isLskfCaptured = 8;
        static final int TRANSACTION_rebootRecoveryWithCommand = 5;
        static final int TRANSACTION_rebootWithLskf = 10;
        static final int TRANSACTION_rebootWithLskfAssumeSlotSwitch = 9;
        static final int TRANSACTION_requestLskf = 6;
        static final int TRANSACTION_setupBcb = 3;
        static final int TRANSACTION_uncrypt = 2;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.os.IRecoverySystem asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void allocateSpaceForUpdate_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void rebootWithLskfAssumeSlotSwitch_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.os.IRecoverySystem {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public boolean allocateSpaceForUpdate(java.lang.String p0) throws android.os.RemoteException { return false; }
            public android.os.IBinder asBinder() { return null; }
            public boolean clearBcb() throws android.os.RemoteException { return false; }
            public boolean clearLskf(java.lang.String p0) throws android.os.RemoteException { return false; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isLskfCaptured(java.lang.String p0) throws android.os.RemoteException { return false; }
            public void rebootRecoveryWithCommand(java.lang.String p0) throws android.os.RemoteException {}
            public int rebootWithLskf(java.lang.String p0, java.lang.String p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int rebootWithLskfAssumeSlotSwitch(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public boolean requestLskf(java.lang.String p0, android.content.IntentSender p1) throws android.os.RemoteException { return false; }
            public boolean setupBcb(java.lang.String p0) throws android.os.RemoteException { return false; }
            public boolean uncrypt(java.lang.String p0, android.os.IRecoverySystemProgressListener p1) throws android.os.RemoteException { return false; }
        }
    }
}

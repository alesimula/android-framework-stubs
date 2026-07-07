package android.os.vibrator;

public interface IHapticGeneratorSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.vibrator.IHapticGeneratorSession";
    public void close() throws android.os.RemoteException;
    public android.os.vibrator.IHapticChannelStream generateHapticChannelStream(android.os.VibrationEffect p0) throws android.os.RemoteException;

    public static class Default implements android.os.vibrator.IHapticGeneratorSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void close() throws android.os.RemoteException {}
        public android.os.vibrator.IHapticChannelStream generateHapticChannelStream(android.os.VibrationEffect p0) throws android.os.RemoteException { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.vibrator.IHapticGeneratorSession {
        static final int TRANSACTION_close = 2;
        static final int TRANSACTION_generateHapticChannelStream = 1;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.os.vibrator.IHapticGeneratorSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        protected void close_enforcePermission() throws java.lang.SecurityException {}
        protected void generateHapticChannelStream_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.vibrator.IHapticGeneratorSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void close() throws android.os.RemoteException {}
            public android.os.vibrator.IHapticChannelStream generateHapticChannelStream(android.os.VibrationEffect p0) throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}

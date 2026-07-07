package android.os.vibrator;

public interface IHapticGeneratorSessionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.vibrator.IHapticGeneratorSessionCallback";
    public static final int ERROR_CODE_ILLEGAL_ARGUMENT = 3;
    public static final int ERROR_CODE_ILLEGAL_STATE = 2;
    public static final int ERROR_CODE_UNKNOWN = 0;
    public static final int ERROR_CODE_UNSUPPORTED = 1;
    public void onError(int p0) throws android.os.RemoteException;
    public void onSessionStarted(android.os.vibrator.IHapticGeneratorSession p0) throws android.os.RemoteException;

    public static class Default implements android.os.vibrator.IHapticGeneratorSessionCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onError(int p0) throws android.os.RemoteException {}
        public void onSessionStarted(android.os.vibrator.IHapticGeneratorSession p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.vibrator.IHapticGeneratorSessionCallback {
        static final int TRANSACTION_onError = 2;
        static final int TRANSACTION_onSessionStarted = 1;
        public Stub() { super(); }
        public static android.os.vibrator.IHapticGeneratorSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.vibrator.IHapticGeneratorSessionCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onError(int p0) throws android.os.RemoteException {}
            public void onSessionStarted(android.os.vibrator.IHapticGeneratorSession p0) throws android.os.RemoteException {}
        }
    }
}

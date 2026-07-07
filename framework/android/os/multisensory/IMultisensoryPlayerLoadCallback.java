package android.os.multisensory;

public interface IMultisensoryPlayerLoadCallback extends android.os.IInterface {
    public static final int CLOSE_SESSION_SUCCESS = 24;
    public static final int CLOSE_SESSION_UNKNOWN_ERROR = 25;
    public static final java.lang.String DESCRIPTOR = "android.os.multisensory.IMultisensoryPlayerLoadCallback";
    public static final int LOAD_RESULT_AUDIO_NOT_FOUND = 4;
    public static final int LOAD_RESULT_LOADING = 2;
    public static final int LOAD_RESULT_REMOTE_EXCEPTION = 5;
    public static final int LOAD_RESULT_SUCCESS = 0;
    public static final int LOAD_RESULT_UNKNOWN = 1;
    public static final int LOAD_RESULT_UNKNOWN_ERROR = 3;
    public static final int OPEN_SESSION_RESULT_SUCCESS = 8;
    public static final int OPEN_SESSION_RESULT_UNKNOWN_ERROR = 9;
    public static final int START_SESSION_CLOSED_SESSION_ERROR = 18;
    public static final int START_SESSION_SUCCESS = 16;
    public static final int START_SESSION_UNKNOWN_ERROR = 17;
    public void onLoadComplete(long p0, int p1, int p2) throws android.os.RemoteException;

    public static class Default implements android.os.multisensory.IMultisensoryPlayerLoadCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onLoadComplete(long p0, int p1, int p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.multisensory.IMultisensoryPlayerLoadCallback {
        static final int TRANSACTION_onLoadComplete = 2;
        public Stub() { super(); }
        public static android.os.multisensory.IMultisensoryPlayerLoadCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.multisensory.IMultisensoryPlayerLoadCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onLoadComplete(long p0, int p1, int p2) throws android.os.RemoteException {}
        }
    }
}

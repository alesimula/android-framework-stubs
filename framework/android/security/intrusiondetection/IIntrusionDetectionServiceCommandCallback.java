package android.security.intrusiondetection;

public interface IIntrusionDetectionServiceCommandCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback";
    public void onFailure(int p0) throws android.os.RemoteException;
    public void onSuccess() throws android.os.RemoteException;

    public static class Default implements android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onFailure(int p0) throws android.os.RemoteException {}
        public void onSuccess() throws android.os.RemoteException {}
    }

    public static @interface ErrorCode {
        public static final int DATA_SOURCE_UNAVAILABLE = 4;
        public static final int INVALID_STATE_TRANSITION = 2;
        public static final int PERMISSION_DENIED = 1;
        public static final int TRANSPORT_UNAVAILABLE = 3;
        public static final int UNKNOWN = 0;
    }

    public static abstract class Stub extends android.os.Binder implements android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback {
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onSuccess = 1;
        public Stub() { super(); }
        public static android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onFailure(int p0) throws android.os.RemoteException {}
            public void onSuccess() throws android.os.RemoteException {}
        }
    }
}

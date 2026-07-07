package android.security.intrusiondetection;

public interface IIntrusionDetectionEventTransport extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.intrusiondetection.IIntrusionDetectionEventTransport";
    public void addData(java.util.List<android.security.intrusiondetection.IntrusionDetectionEvent> p0, com.android.internal.infra.AndroidFuture<java.lang.Boolean> p1) throws android.os.RemoteException;
    public void initialize(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException;
    public void release(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException;

    public static class Default implements android.security.intrusiondetection.IIntrusionDetectionEventTransport {
        public Default() {}
        public void addData(java.util.List<android.security.intrusiondetection.IntrusionDetectionEvent> p0, com.android.internal.infra.AndroidFuture<java.lang.Boolean> p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void initialize(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException {}
        public void release(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.security.intrusiondetection.IIntrusionDetectionEventTransport {
        static final int TRANSACTION_addData = 2;
        static final int TRANSACTION_initialize = 1;
        static final int TRANSACTION_release = 3;
        public Stub() { super(); }
        public static android.security.intrusiondetection.IIntrusionDetectionEventTransport asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.security.intrusiondetection.IIntrusionDetectionEventTransport {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addData(java.util.List<android.security.intrusiondetection.IntrusionDetectionEvent> p0, com.android.internal.infra.AndroidFuture<java.lang.Boolean> p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void initialize(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException {}
            public void release(com.android.internal.infra.AndroidFuture<java.lang.Boolean> p0) throws android.os.RemoteException {}
        }
    }
}

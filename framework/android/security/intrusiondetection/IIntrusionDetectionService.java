package android.security.intrusiondetection;

public interface IIntrusionDetectionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.intrusiondetection.IIntrusionDetectionService";
    public void addStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException;
    public void disable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException;
    public void enable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException;
    public void removeStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException;

    public static class Default implements android.security.intrusiondetection.IIntrusionDetectionService {
        public Default() {}
        public void addStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public void disable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException {}
        public void enable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException {}
        public void removeStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.security.intrusiondetection.IIntrusionDetectionService {
        static final int TRANSACTION_addStateCallback = 1;
        static final int TRANSACTION_disable = 4;
        static final int TRANSACTION_enable = 3;
        static final int TRANSACTION_removeStateCallback = 2;
        private final android.os.PermissionEnforcer mEnforcer = null;
        @java.lang.Deprecated
        public Stub() { super(); }
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        public static android.security.intrusiondetection.IIntrusionDetectionService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        protected void addStateCallback_enforcePermission() throws java.lang.SecurityException {}
        public android.os.IBinder asBinder() { return null; }
        protected void disable_enforcePermission() throws java.lang.SecurityException {}
        protected void enable_enforcePermission() throws java.lang.SecurityException {}
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void removeStateCallback_enforcePermission() throws java.lang.SecurityException {}

        private static final class Proxy implements android.security.intrusiondetection.IIntrusionDetectionService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public void disable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException {}
            public void enable(android.security.intrusiondetection.IIntrusionDetectionServiceCommandCallback p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void removeStateCallback(android.security.intrusiondetection.IIntrusionDetectionServiceStateCallback p0) throws android.os.RemoteException {}
        }
    }
}

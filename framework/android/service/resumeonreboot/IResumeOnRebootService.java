package android.service.resumeonreboot;

public interface IResumeOnRebootService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.resumeonreboot.IResumeOnRebootService";
    public void unwrap(byte[] p0, android.os.RemoteCallback p1) throws android.os.RemoteException;
    public void wrapSecret(byte[] p0, long p1, android.os.RemoteCallback p2) throws android.os.RemoteException;

    public static class Default implements android.service.resumeonreboot.IResumeOnRebootService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void unwrap(byte[] p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
        public void wrapSecret(byte[] p0, long p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.service.resumeonreboot.IResumeOnRebootService {
        static final int TRANSACTION_unwrap = 2;
        static final int TRANSACTION_wrapSecret = 1;
        public Stub() { super(); }
        public static android.service.resumeonreboot.IResumeOnRebootService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.service.resumeonreboot.IResumeOnRebootService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void unwrap(byte[] p0, android.os.RemoteCallback p1) throws android.os.RemoteException {}
            public void wrapSecret(byte[] p0, long p1, android.os.RemoteCallback p2) throws android.os.RemoteException {}
        }
    }
}

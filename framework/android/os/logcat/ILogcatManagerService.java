package android.os.logcat;

public interface ILogcatManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.logcat.ILogcatManagerService";
    public void finishThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void startThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.os.logcat.ILogcatManagerService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void finishThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void startThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.logcat.ILogcatManagerService {
        static final int TRANSACTION_finishThread = 2;
        static final int TRANSACTION_startThread = 1;
        public Stub() { super(); }
        public static android.os.logcat.ILogcatManagerService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.logcat.ILogcatManagerService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void finishThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void startThread(int p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        }
    }
}

package android.app;

public interface INativeApplicationThread extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.INativeApplicationThread";
    public void bindApplication(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException;
    public void scheduleBindService(android.os.IBinder p0, android.os.IBinder p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, long p6) throws android.os.RemoteException;
    public void scheduleCreateService(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, int p9) throws android.os.RemoteException;
    public void scheduleDestroyService(android.os.IBinder p0) throws android.os.RemoteException;
    public void scheduleTrimMemory(int p0) throws android.os.RemoteException;
    public void scheduleUnbindService(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void setProcessState(int p0) throws android.os.RemoteException;
    public void updateTimeZone() throws android.os.RemoteException;

    public static class Default implements android.app.INativeApplicationThread {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void bindApplication(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
        public void scheduleBindService(android.os.IBinder p0, android.os.IBinder p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, long p6) throws android.os.RemoteException {}
        public void scheduleCreateService(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, int p9) throws android.os.RemoteException {}
        public void scheduleDestroyService(android.os.IBinder p0) throws android.os.RemoteException {}
        public void scheduleTrimMemory(int p0) throws android.os.RemoteException {}
        public void scheduleUnbindService(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void setProcessState(int p0) throws android.os.RemoteException {}
        public void updateTimeZone() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.INativeApplicationThread {
        static final int TRANSACTION_bindApplication = 6;
        static final int TRANSACTION_scheduleBindService = 3;
        static final int TRANSACTION_scheduleCreateService = 1;
        static final int TRANSACTION_scheduleDestroyService = 2;
        static final int TRANSACTION_scheduleTrimMemory = 5;
        static final int TRANSACTION_scheduleUnbindService = 4;
        static final int TRANSACTION_setProcessState = 7;
        static final int TRANSACTION_updateTimeZone = 8;
        public Stub() { super(); }
        public static android.app.INativeApplicationThread asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.INativeApplicationThread {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void bindApplication(android.os.ParcelFileDescriptor p0) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void scheduleBindService(android.os.IBinder p0, android.os.IBinder p1, java.lang.String p2, java.lang.String p3, boolean p4, int p5, long p6) throws android.os.RemoteException {}
            public void scheduleCreateService(android.os.IBinder p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, boolean p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, int p9) throws android.os.RemoteException {}
            public void scheduleDestroyService(android.os.IBinder p0) throws android.os.RemoteException {}
            public void scheduleTrimMemory(int p0) throws android.os.RemoteException {}
            public void scheduleUnbindService(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void setProcessState(int p0) throws android.os.RemoteException {}
            public void updateTimeZone() throws android.os.RemoteException {}
        }
    }
}

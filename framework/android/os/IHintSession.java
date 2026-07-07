package android.os;

public interface IHintSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IHintSession";
    public void associateToLayers(android.os.IBinder[] p0) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void reportActualWorkDuration(long[] p0, long[] p1) throws android.os.RemoteException;
    public void reportActualWorkDuration2(android.hardware.power.WorkDuration[] p0) throws android.os.RemoteException;
    public void sendHint(int p0) throws android.os.RemoteException;
    public void setMode(int p0, boolean p1) throws android.os.RemoteException;
    public void updateTargetWorkDuration(long p0) throws android.os.RemoteException;

    public static class Default implements android.os.IHintSession {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void associateToLayers(android.os.IBinder[] p0) throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public void reportActualWorkDuration(long[] p0, long[] p1) throws android.os.RemoteException {}
        public void reportActualWorkDuration2(android.hardware.power.WorkDuration[] p0) throws android.os.RemoteException {}
        public void sendHint(int p0) throws android.os.RemoteException {}
        public void setMode(int p0, boolean p1) throws android.os.RemoteException {}
        public void updateTargetWorkDuration(long p0) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IHintSession {
        static final int TRANSACTION_associateToLayers = 7;
        static final int TRANSACTION_close = 3;
        static final int TRANSACTION_reportActualWorkDuration = 2;
        static final int TRANSACTION_reportActualWorkDuration2 = 6;
        static final int TRANSACTION_sendHint = 4;
        static final int TRANSACTION_setMode = 5;
        static final int TRANSACTION_updateTargetWorkDuration = 1;
        public Stub() { super(); }
        public static android.os.IHintSession asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.IHintSession {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void associateToLayers(android.os.IBinder[] p0) throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void reportActualWorkDuration(long[] p0, long[] p1) throws android.os.RemoteException {}
            public void reportActualWorkDuration2(android.hardware.power.WorkDuration[] p0) throws android.os.RemoteException {}
            public void sendHint(int p0) throws android.os.RemoteException {}
            public void setMode(int p0, boolean p1) throws android.os.RemoteException {}
            public void updateTargetWorkDuration(long p0) throws android.os.RemoteException {}
        }
    }
}

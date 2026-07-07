package android.os;

public interface IUpdateEngineCallback extends android.os.IInterface {
    public void onPayloadApplicationComplete(int p0) throws android.os.RemoteException;
    public void onStatusUpdate(int p0, float p1) throws android.os.RemoteException;

    public static class Default implements android.os.IUpdateEngineCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onPayloadApplicationComplete(int p0) throws android.os.RemoteException {}
        public void onStatusUpdate(int p0, float p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IUpdateEngineCallback {
        public static final java.lang.String DESCRIPTOR = "android.os.IUpdateEngineCallback";
        static final int TRANSACTION_onPayloadApplicationComplete = 2;
        static final int TRANSACTION_onStatusUpdate = 1;
        public Stub() { super(); }
        public static android.os.IUpdateEngineCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.IUpdateEngineCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onPayloadApplicationComplete(int p0) throws android.os.RemoteException {}
            public void onStatusUpdate(int p0, float p1) throws android.os.RemoteException {}
        }
    }
}

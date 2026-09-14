package android.app.personalcontext;

public interface IOpCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.personalcontext.IOpCallback";
    public void signalCompletion() throws android.os.RemoteException;

    public static class Default implements android.app.personalcontext.IOpCallback {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void signalCompletion() throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.personalcontext.IOpCallback {
        static final int TRANSACTION_signalCompletion = 1;
        public Stub() { super(); }
        public static android.app.personalcontext.IOpCallback asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.personalcontext.IOpCallback {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void signalCompletion() throws android.os.RemoteException {}
        }
    }
}

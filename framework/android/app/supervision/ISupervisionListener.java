package android.app.supervision;

public interface ISupervisionListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.supervision.ISupervisionListener";
    public void onPolicyChanged(android.app.supervision.Policy p0) throws android.os.RemoteException;
    public void onSetSupervisionEnabled(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.app.supervision.ISupervisionListener {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void onPolicyChanged(android.app.supervision.Policy p0) throws android.os.RemoteException {}
        public void onSetSupervisionEnabled(int p0, boolean p1) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.supervision.ISupervisionListener {
        static final int TRANSACTION_onPolicyChanged = 2;
        static final int TRANSACTION_onSetSupervisionEnabled = 1;
        public Stub() { super(); }
        public static android.app.supervision.ISupervisionListener asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.supervision.ISupervisionListener {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void onPolicyChanged(android.app.supervision.Policy p0) throws android.os.RemoteException {}
            public void onSetSupervisionEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}

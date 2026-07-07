package android.os;

public interface ISecurityStateManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.ISecurityStateManager";
    public android.os.Bundle getGlobalSecurityState() throws android.os.RemoteException;

    public static class Default implements android.os.ISecurityStateManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.os.Bundle getGlobalSecurityState() throws android.os.RemoteException { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.ISecurityStateManager {
        static final int TRANSACTION_getGlobalSecurityState = 1;
        public Stub() { super(); }
        public static android.os.ISecurityStateManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.ISecurityStateManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.os.Bundle getGlobalSecurityState() throws android.os.RemoteException { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}

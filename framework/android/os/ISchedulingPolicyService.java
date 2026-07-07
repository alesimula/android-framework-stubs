package android.os;

public interface ISchedulingPolicyService extends android.os.IInterface {
    public int requestCpusetBoost(boolean p0, android.os.IBinder p1) throws android.os.RemoteException;
    public int requestPriority(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException;

    public static class Default implements android.os.ISchedulingPolicyService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public int requestCpusetBoost(boolean p0, android.os.IBinder p1) throws android.os.RemoteException { return 0; }
        public int requestPriority(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.ISchedulingPolicyService {
        public static final java.lang.String DESCRIPTOR = "android.os.ISchedulingPolicyService";
        static final int TRANSACTION_requestCpusetBoost = 2;
        static final int TRANSACTION_requestPriority = 1;
        public Stub() { super(); }
        public static android.os.ISchedulingPolicyService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.os.ISchedulingPolicyService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int requestCpusetBoost(boolean p0, android.os.IBinder p1) throws android.os.RemoteException { return 0; }
            public int requestPriority(int p0, int p1, int p2, boolean p3) throws android.os.RemoteException { return 0; }
        }
    }
}

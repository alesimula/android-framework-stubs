package android.app;

public interface IMemoryBudgetService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IMemoryBudgetService";
    public static final int STATUS_ERROR_EXCEEDS_LIMIT = -4;
    public static final int STATUS_ERROR_INVALID_ARGUMENT = -2;
    public static final int STATUS_ERROR_PERMISSION_DENIED = -3;
    public static final int STATUS_ERROR_READING_BUDGET = -5;
    public static final int STATUS_LIMIT_IS_DISABLED = -1;
    public static final int STATUS_SUCCESS = 0;
    public int clearPackageBudget() throws android.os.RemoteException;
    public int clearProcessBudget() throws android.os.RemoteException;
    public int setPackageBudget(long p0) throws android.os.RemoteException;
    public int setProcessBudget(long p0) throws android.os.RemoteException;

    public static class Default implements android.app.IMemoryBudgetService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public int clearPackageBudget() throws android.os.RemoteException { return 0; }
        public int clearProcessBudget() throws android.os.RemoteException { return 0; }
        public int setPackageBudget(long p0) throws android.os.RemoteException { return 0; }
        public int setProcessBudget(long p0) throws android.os.RemoteException { return 0; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IMemoryBudgetService {
        static final int TRANSACTION_clearPackageBudget = 3;
        static final int TRANSACTION_clearProcessBudget = 4;
        static final int TRANSACTION_setPackageBudget = 1;
        static final int TRANSACTION_setProcessBudget = 2;
        public Stub() { super(); }
        public static android.app.IMemoryBudgetService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.IMemoryBudgetService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public int clearPackageBudget() throws android.os.RemoteException { return 0; }
            public int clearProcessBudget() throws android.os.RemoteException { return 0; }
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public int setPackageBudget(long p0) throws android.os.RemoteException { return 0; }
            public int setProcessBudget(long p0) throws android.os.RemoteException { return 0; }
        }
    }
}

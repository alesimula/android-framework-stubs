package android.app.appfunctions;

public interface IAppFunctionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.appfunctions.IAppFunctionService";
    public void executeAppFunction(android.app.appfunctions.ExecuteAppFunctionRequest p0, java.lang.String p1, android.content.pm.SigningInfo p2, android.app.appfunctions.ICancellationCallback p3, android.app.appfunctions.IExecuteAppFunctionCallback p4) throws android.os.RemoteException;

    public static class Default implements android.app.appfunctions.IAppFunctionService {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public void executeAppFunction(android.app.appfunctions.ExecuteAppFunctionRequest p0, java.lang.String p1, android.content.pm.SigningInfo p2, android.app.appfunctions.ICancellationCallback p3, android.app.appfunctions.IExecuteAppFunctionCallback p4) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.appfunctions.IAppFunctionService {
        static final int TRANSACTION_executeAppFunction = 1;
        public Stub() { super(); }
        public static android.app.appfunctions.IAppFunctionService asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.appfunctions.IAppFunctionService {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public void executeAppFunction(android.app.appfunctions.ExecuteAppFunctionRequest p0, java.lang.String p1, android.content.pm.SigningInfo p2, android.app.appfunctions.ICancellationCallback p3, android.app.appfunctions.IExecuteAppFunctionCallback p4) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}

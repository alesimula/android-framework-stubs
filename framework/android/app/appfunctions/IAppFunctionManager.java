package android.app.appfunctions;

public interface IAppFunctionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.appfunctions.IAppFunctionManager";
    public android.os.ICancellationSignal executeAppFunction(android.app.appfunctions.ExecuteAppFunctionAidlRequest p0, android.app.appfunctions.IExecuteAppFunctionCallback p1) throws android.os.RemoteException;
    public void getAppFunctionActivityStates(java.util.List<android.app.appfunctions.AppFunctionActivityId> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionActivityStatesCallback p3) throws android.os.RemoteException;
    public void getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionStatesCallback p3) throws android.os.RemoteException;
    public void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3, android.app.appfunctions.IIsAppFunctionEnabledCallback p4) throws android.os.RemoteException;
    public void observeAppFunctions(android.app.appfunctions.AppFunctionAidlSearchSpec p0, android.app.appfunctions.IObserveAppFunctionChangesCallback p1) throws android.os.RemoteException;
    public void registerAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void setAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, int p3, android.app.appfunctions.ISetAppFunctionEnabledCallback p4) throws android.os.RemoteException;
    public void unregisterAppFunctionObserver(java.lang.String p0, android.os.UserHandle p1, android.app.appfunctions.IObserveAppFunctionChangesCallback p2) throws android.os.RemoteException;
    public void unregisterAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2) throws android.os.RemoteException;

    public static class Default implements android.app.appfunctions.IAppFunctionManager {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
        public android.os.ICancellationSignal executeAppFunction(android.app.appfunctions.ExecuteAppFunctionAidlRequest p0, android.app.appfunctions.IExecuteAppFunctionCallback p1) throws android.os.RemoteException { return null; }
        public void getAppFunctionActivityStates(java.util.List<android.app.appfunctions.AppFunctionActivityId> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionActivityStatesCallback p3) throws android.os.RemoteException {}
        public void getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionStatesCallback p3) throws android.os.RemoteException {}
        public void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3, android.app.appfunctions.IIsAppFunctionEnabledCallback p4) throws android.os.RemoteException {}
        public void observeAppFunctions(android.app.appfunctions.AppFunctionAidlSearchSpec p0, android.app.appfunctions.IObserveAppFunctionChangesCallback p1) throws android.os.RemoteException {}
        public void registerAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2, android.os.IBinder p3) throws android.os.RemoteException {}
        public void setAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, int p3, android.app.appfunctions.ISetAppFunctionEnabledCallback p4) throws android.os.RemoteException {}
        public void unregisterAppFunctionObserver(java.lang.String p0, android.os.UserHandle p1, android.app.appfunctions.IObserveAppFunctionChangesCallback p2) throws android.os.RemoteException {}
        public void unregisterAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2) throws android.os.RemoteException {}
    }

    public static abstract class Stub extends android.os.Binder implements android.app.appfunctions.IAppFunctionManager {
        static final int TRANSACTION_executeAppFunction = 1;
        static final int TRANSACTION_getAppFunctionActivityStates = 9;
        static final int TRANSACTION_getAppFunctionStates = 8;
        static final int TRANSACTION_isAppFunctionEnabled = 4;
        static final int TRANSACTION_observeAppFunctions = 2;
        static final int TRANSACTION_registerAppFunctions = 6;
        static final int TRANSACTION_setAppFunctionEnabled = 5;
        static final int TRANSACTION_unregisterAppFunctionObserver = 3;
        static final int TRANSACTION_unregisterAppFunctions = 7;
        public Stub() { super(); }
        public static android.app.appfunctions.IAppFunctionManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.appfunctions.IAppFunctionManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public android.os.ICancellationSignal executeAppFunction(android.app.appfunctions.ExecuteAppFunctionAidlRequest p0, android.app.appfunctions.IExecuteAppFunctionCallback p1) throws android.os.RemoteException { return null; }
            public void getAppFunctionActivityStates(java.util.List<android.app.appfunctions.AppFunctionActivityId> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionActivityStatesCallback p3) throws android.os.RemoteException {}
            public void getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionStatesCallback p3) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3, android.app.appfunctions.IIsAppFunctionEnabledCallback p4) throws android.os.RemoteException {}
            public void observeAppFunctions(android.app.appfunctions.AppFunctionAidlSearchSpec p0, android.app.appfunctions.IObserveAppFunctionChangesCallback p1) throws android.os.RemoteException {}
            public void registerAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2, android.os.IBinder p3) throws android.os.RemoteException {}
            public void setAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, int p3, android.app.appfunctions.ISetAppFunctionEnabledCallback p4) throws android.os.RemoteException {}
            public void unregisterAppFunctionObserver(java.lang.String p0, android.os.UserHandle p1, android.app.appfunctions.IObserveAppFunctionChangesCallback p2) throws android.os.RemoteException {}
            public void unregisterAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2) throws android.os.RemoteException {}
        }
    }
}

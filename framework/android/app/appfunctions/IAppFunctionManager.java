package android.app.appfunctions;

public interface IAppFunctionManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.appfunctions.IAppFunctionManager";
    public void addOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException;
    public android.content.Intent createRequestAccessIntent(java.lang.String p0) throws android.os.RemoteException;
    public android.os.ICancellationSignal executeAppFunction(android.app.appfunctions.ExecuteAppFunctionAidlRequest p0, android.app.appfunctions.IExecuteAppFunctionCallback p1) throws android.os.RemoteException;
    public int getAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int getAccessRequestState(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public void getAppFunctionActivityStates(java.util.List<android.app.appfunctions.AppFunctionActivityId> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionActivityStatesCallback p3) throws android.os.RemoteException;
    public void getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionStatesCallback p3) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getValidAgents(int p0) throws android.os.RemoteException;
    public java.util.List<java.lang.String> getValidTargets(int p0) throws android.os.RemoteException;
    public void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3, android.app.appfunctions.IIsAppFunctionEnabledCallback p4) throws android.os.RemoteException;
    public void observeAppFunctions(android.app.appfunctions.AppFunctionAidlSearchSpec p0, android.app.appfunctions.IObserveAppFunctionChangesCallback p1) throws android.os.RemoteException;
    public void registerAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void removeOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException;
    public void revokeSelfAccess(java.lang.String p0) throws android.os.RemoteException;
    public void setAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, int p3, android.app.appfunctions.ISetAppFunctionEnabledCallback p4) throws android.os.RemoteException;
    public void unregisterAppFunctionObserver(java.lang.String p0, android.os.UserHandle p1, android.app.appfunctions.IObserveAppFunctionChangesCallback p2) throws android.os.RemoteException;
    public void unregisterAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2) throws android.os.RemoteException;
    public boolean updateAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, int p5) throws android.os.RemoteException;

    public static class Default implements android.app.appfunctions.IAppFunctionManager {
        public Default() {}
        public void addOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
        public android.content.Intent createRequestAccessIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.os.ICancellationSignal executeAppFunction(android.app.appfunctions.ExecuteAppFunctionAidlRequest p0, android.app.appfunctions.IExecuteAppFunctionCallback p1) throws android.os.RemoteException { return null; }
        public int getAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public int getAccessRequestState(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public void getAppFunctionActivityStates(java.util.List<android.app.appfunctions.AppFunctionActivityId> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionActivityStatesCallback p3) throws android.os.RemoteException {}
        public void getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionStatesCallback p3) throws android.os.RemoteException {}
        public java.util.List<java.lang.String> getValidAgents(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getValidTargets(int p0) throws android.os.RemoteException { return null; }
        public void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3, android.app.appfunctions.IIsAppFunctionEnabledCallback p4) throws android.os.RemoteException {}
        public void observeAppFunctions(android.app.appfunctions.AppFunctionAidlSearchSpec p0, android.app.appfunctions.IObserveAppFunctionChangesCallback p1) throws android.os.RemoteException {}
        public void registerAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2, android.os.IBinder p3) throws android.os.RemoteException {}
        public void removeOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException {}
        public void revokeSelfAccess(java.lang.String p0) throws android.os.RemoteException {}
        public void setAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, int p3, android.app.appfunctions.ISetAppFunctionEnabledCallback p4) throws android.os.RemoteException {}
        public void unregisterAppFunctionObserver(java.lang.String p0, android.os.UserHandle p1, android.app.appfunctions.IObserveAppFunctionChangesCallback p2) throws android.os.RemoteException {}
        public void unregisterAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2) throws android.os.RemoteException {}
        public boolean updateAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, int p5) throws android.os.RemoteException { return false; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.appfunctions.IAppFunctionManager {
        static final int TRANSACTION_addOnAccessChangedListener = 15;
        static final int TRANSACTION_createRequestAccessIntent = 14;
        static final int TRANSACTION_executeAppFunction = 1;
        static final int TRANSACTION_getAccessFlags = 7;
        static final int TRANSACTION_getAccessRequestState = 6;
        static final int TRANSACTION_getAppFunctionActivityStates = 18;
        static final int TRANSACTION_getAppFunctionStates = 17;
        static final int TRANSACTION_getValidAgents = 12;
        static final int TRANSACTION_getValidTargets = 13;
        static final int TRANSACTION_isAppFunctionEnabled = 4;
        static final int TRANSACTION_observeAppFunctions = 2;
        static final int TRANSACTION_registerAppFunctions = 9;
        static final int TRANSACTION_removeOnAccessChangedListener = 16;
        static final int TRANSACTION_revokeSelfAccess = 11;
        static final int TRANSACTION_setAppFunctionEnabled = 5;
        static final int TRANSACTION_unregisterAppFunctionObserver = 3;
        static final int TRANSACTION_unregisterAppFunctions = 10;
        static final int TRANSACTION_updateAccessFlags = 8;
        public Stub() { super(); }
        public static android.app.appfunctions.IAppFunctionManager asInterface(android.os.IBinder p0) { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static final class Proxy implements android.app.appfunctions.IAppFunctionManager {
            private android.os.IBinder mRemote;
            Proxy(android.os.IBinder p0) {}
            public void addOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException {}
            public android.os.IBinder asBinder() { return null; }
            public android.content.Intent createRequestAccessIntent(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.os.ICancellationSignal executeAppFunction(android.app.appfunctions.ExecuteAppFunctionAidlRequest p0, android.app.appfunctions.IExecuteAppFunctionCallback p1) throws android.os.RemoteException { return null; }
            public int getAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public int getAccessRequestState(java.lang.String p0, int p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public void getAppFunctionActivityStates(java.util.List<android.app.appfunctions.AppFunctionActivityId> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionActivityStatesCallback p3) throws android.os.RemoteException {}
            public void getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName> p0, java.lang.String p1, int p2, android.app.appfunctions.IGetAppFunctionStatesCallback p3) throws android.os.RemoteException {}
            public final java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<java.lang.String> getValidAgents(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getValidTargets(int p0) throws android.os.RemoteException { return null; }
            public void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.os.UserHandle p3, android.app.appfunctions.IIsAppFunctionEnabledCallback p4) throws android.os.RemoteException {}
            public void observeAppFunctions(android.app.appfunctions.AppFunctionAidlSearchSpec p0, android.app.appfunctions.IObserveAppFunctionChangesCallback p1) throws android.os.RemoteException {}
            public void registerAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2, android.os.IBinder p3) throws android.os.RemoteException {}
            public void removeOnAccessChangedListener(android.app.IOnAppInteractionAccessChangeListener p0, int p1) throws android.os.RemoteException {}
            public void revokeSelfAccess(java.lang.String p0) throws android.os.RemoteException {}
            public void setAppFunctionEnabled(java.lang.String p0, java.lang.String p1, android.os.UserHandle p2, int p3, android.app.appfunctions.ISetAppFunctionEnabledCallback p4) throws android.os.RemoteException {}
            public void unregisterAppFunctionObserver(java.lang.String p0, android.os.UserHandle p1, android.app.appfunctions.IObserveAppFunctionChangesCallback p2) throws android.os.RemoteException {}
            public void unregisterAppFunctions(java.lang.String p0, java.util.List<java.lang.String> p1, android.app.appfunctions.IAppFunctionExecutor p2) throws android.os.RemoteException {}
            public boolean updateAccessFlags(java.lang.String p0, int p1, java.lang.String p2, int p3, int p4, int p5) throws android.os.RemoteException { return false; }
        }
    }
}

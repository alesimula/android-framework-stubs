package android.app.appfunctions;

public final class AppFunctionManager {
    public static final int APP_FUNCTION_STATE_DEFAULT = 0;
    public static final int APP_FUNCTION_STATE_DISABLED = 2;
    public static final int APP_FUNCTION_STATE_ENABLED = 1;
    public static final java.lang.String PROPERTY_SUPPORT_APP_FUNCTION_USER_CONTROL = "android.app.appfunctions.PROPERTY_SUPPORTS_APP_FUNCTION_USER_CONTROL";
    private static final java.lang.String TAG = "AppFunctionManager";
    private final android.content.Context mContext = null;
    private android.app.appfunctions.AppFunctionManager.AppFunctionRegistry mRegistry;
    private final java.lang.Object mRegistryLock = null;
    private final android.app.appfunctions.IAppFunctionManager mService = null;
    public AppFunctionManager(android.app.appfunctions.IAppFunctionManager p0, android.content.Context p1) {}
    private android.app.appfunctions.AppFunctionManager.AppFunctionRegistry ensureRegistry() { return null; }
    private void executeAppFunction(android.app.appfunctions.ExecuteAppFunctionAidlRequest p0, java.util.concurrent.Executor p1, android.os.CancellationSignal p2, android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse, android.app.appfunctions.AppFunctionException> p3) {}
    private void isAppFunctionEnabledInternal(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p3) {}
    public void executeAppFunction(android.app.AppInteractionSession p0, android.app.appfunctions.ExecuteAppFunctionRequest p1, java.util.concurrent.Executor p2, android.os.CancellationSignal p3, android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse, android.app.appfunctions.AppFunctionException> p4) {}
    public void executeAppFunction(android.app.appfunctions.ExecuteAppFunctionRequest p0, java.util.concurrent.Executor p1, android.os.CancellationSignal p2, android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse, android.app.appfunctions.AppFunctionException> p3) {}
    public void getAppFunctionActivityStates(java.util.Set<android.app.appfunctions.AppFunctionActivityId> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionActivityState>, java.lang.Exception> p2) {}
    public void getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>, java.lang.Exception> p2) {}
    public void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p3) {}
    public void isAppFunctionEnabled(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
    public android.app.appfunctions.AppFunctionObservation observeAppFunctions(java.util.concurrent.Executor p0, android.app.appfunctions.AppFunctionObserver p1) { return null; }
    public android.app.appfunctions.AppFunctionRegistration registerAppFunction(java.lang.String p0, java.util.concurrent.Executor p1, android.app.appfunctions.AppFunction p2) { return null; }
    public android.app.appfunctions.AppFunctionRegistration registerAppFunctions(java.util.List<android.app.appfunctions.RegisterAppFunctionRequest> p0) { return null; }
    public void searchAppFunctions(android.app.appfunctions.AppFunctionSearchSpec p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionMetadata>, java.lang.Exception> p2) {}
    public void setAppFunctionEnabled(java.lang.String p0, int p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p3) {}
    public void unregisterAllAppFunctions(java.lang.String p0) {}

    private class AppFunctionRegistry {
        private final android.os.IBinder mActivityToken = null;
        private final android.app.appfunctions.IAppFunctionExecutor.Stub mExecutor = null;
        private final boolean mIsAllowedContext = false;
        private final java.lang.Object mLock = null;
        private final android.util.ArrayMap<java.lang.String, android.app.appfunctions.AppFunctionManager.AppFunctionRegistry.RegistrationRecord> mRegistrations = null;
        AppFunctionRegistry(android.app.appfunctions.AppFunctionManager p0, android.content.Context p1) {}
        android.app.appfunctions.AppFunctionRegistration register(java.util.List<android.app.appfunctions.RegisterAppFunctionRequest> p0) { return null; }
        void unregister(android.util.ArrayMap<java.lang.String, android.app.appfunctions.AppFunctionManager.AppFunctionRegistry.RegistrationRecord> p0) {}
        void unregisterAllAppFunctions(java.lang.String p0) {}

        private static class RegistrationRecord {
            private final android.app.appfunctions.AppFunction mAppFunction = null;
            private final java.util.concurrent.Executor mExecutor = null;
            RegistrationRecord(android.app.appfunctions.RegisterAppFunctionRequest p0) {}
            void onExecuteFunction(android.app.appfunctions.ExecuteAppFunctionRequest p0, android.os.CancellationSignal p1, android.app.appfunctions.IExecuteAppFunctionCallback p2) {}
        }
    }

    private static class CallbackWrapper extends android.app.appfunctions.ISetAppFunctionEnabledCallback.Stub {
        private final android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        CallbackWrapper(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p1) { super(); }
        public void onError(android.os.ParcelableException p0) {}
        public void onSuccess() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnabledState {
    }
}

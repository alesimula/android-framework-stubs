package android.app.appfunctions;

public final class AppFunctionManager {
    public static final int ACCESS_FLAG_MASK_ALL = 63;
    public static final int ACCESS_FLAG_MASK_OTHER = 48;
    public static final int ACCESS_FLAG_MASK_USER = 12;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_OTHER_DENIED = 32;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_OTHER_GRANTED = 16;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_PREGRANTED = 1;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_UPGRADE_GRANTED = 2;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_USER_DENIED = 8;
    @android.annotation.SystemApi
    public static final int ACCESS_FLAG_USER_GRANTED = 4;
    public static final int ACCESS_REQUEST_STATE_DENIED = 1;
    public static final int ACCESS_REQUEST_STATE_GRANTED = 0;
    public static final int ACCESS_REQUEST_STATE_UNREQUESTABLE = 2;
    public static final java.lang.String ACTION_MANAGE_AGENT_APP_FUNCTION_ACCESS = "android.app.appfunctions.action.MANAGE_AGENT_APP_FUNCTION_ACCESS";
    public static final java.lang.String ACTION_MANAGE_APP_FUNCTION_ACCESS = "android.app.appfunctions.action.MANAGE_APP_FUNCTION_ACCESS";
    public static final java.lang.String ACTION_MANAGE_TARGET_APP_FUNCTION_ACCESS = "android.app.appfunctions.action.MANAGE_TARGET_APP_FUNCTION_ACCESS";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_REQUEST_APP_FUNCTION_ACCESS = "android.app.appfunctions.action.REQUEST_APP_FUNCTION_ACCESS";
    public static final int APP_FUNCTION_STATE_DEFAULT = 0;
    public static final int APP_FUNCTION_STATE_DISABLED = 2;
    public static final int APP_FUNCTION_STATE_ENABLED = 1;
    private static final java.lang.String TAG = "AppFunctionManager";
    private final android.content.Context mContext = null;
    private final android.util.ArrayMap<android.app.appfunctions.AppFunctionManager.OnAppFunctionAccessChangedListener, android.app.appfunctions.AppFunctionManager.OnAppFunctionAccessChangeListenerDelegate> mListeners = null;
    private android.app.appfunctions.AppFunctionManager.AppFunctionRegistry mRegistry;
    private final java.lang.Object mRegistryLock = null;
    private final android.app.appfunctions.IAppFunctionManager mService = null;
    public AppFunctionManager(android.app.appfunctions.IAppFunctionManager p0, android.content.Context p1) {}
    private android.app.appfunctions.AppFunctionManager.AppFunctionRegistry ensureRegistry() { return null; }
    private void isAppFunctionEnabledInternal(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p3) {}
    private void isAppFunctionEnabledInternal2(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p3) {}
    @android.annotation.SystemApi
    public void addAccessChangedListener(java.util.concurrent.Executor p0, android.app.appfunctions.AppFunctionManager.OnAppFunctionAccessChangedListener p1) {}
    public android.content.Intent createRequestAccessIntent(java.lang.String p0) { return null; }
    public void executeAppFunction(android.app.appfunctions.ExecuteAppFunctionRequest p0, java.util.concurrent.Executor p1, android.os.CancellationSignal p2, android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse, android.app.appfunctions.AppFunctionException> p3) {}
    @android.annotation.SystemApi
    public int getAccessFlags(java.lang.String p0, java.lang.String p1) { return 0; }
    public int getAccessRequestState(java.lang.String p0) { return 0; }
    @android.annotation.SystemApi
    public int getAccessRequestState(java.lang.String p0, java.lang.String p1) { return 0; }
    public java.util.List<android.content.pm.SignedPackage> getAgentAllowlist() { return null; }
    public void getAppFunctionActivityStates(java.util.Set<android.app.appfunctions.AppFunctionActivityId> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionActivityState>, java.lang.Exception> p2) {}
    public void getAppFunctionStates(java.util.List<android.app.appfunctions.AppFunctionName> p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionState>, java.lang.Exception> p2) {}
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getValidAgents() { return null; }
    @android.annotation.SystemApi
    public java.util.List<java.lang.String> getValidTargets() { return null; }
    public void isAppFunctionEnabled(java.lang.String p0, java.lang.String p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p3) {}
    public void isAppFunctionEnabled(java.lang.String p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Boolean, java.lang.Exception> p2) {}
    public android.app.appfunctions.AppFunctionObservation observeAppFunctions(java.util.concurrent.Executor p0, android.app.appfunctions.AppFunctionObserver p1) { return null; }
    public android.app.appfunctions.AppFunctionRegistration registerAppFunction(java.lang.String p0, java.util.concurrent.Executor p1, android.app.appfunctions.AppFunction p2) { return null; }
    public android.app.appfunctions.AppFunctionRegistration registerAppFunctions(java.util.List<android.app.appfunctions.RegisterAppFunctionRequest> p0) { return null; }
    @android.annotation.SystemApi
    public void removeAccessChangedListener(android.app.appfunctions.AppFunctionManager.OnAppFunctionAccessChangedListener p0) {}
    public void revokeSelfAccess(java.lang.String p0) {}
    public void searchAppFunctions(android.app.appfunctions.AppFunctionSearchSpec p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.util.List<android.app.appfunctions.AppFunctionMetadata>, java.lang.Exception> p2) {}
    public void setAppFunctionEnabled(java.lang.String p0, int p1, java.util.concurrent.Executor p2, android.os.OutcomeReceiver<java.lang.Void, java.lang.Exception> p3) {}
    public void unregisterAllAppFunctions(java.lang.String p0) {}
    @android.annotation.SystemApi
    public void updateAccessFlags(java.lang.String p0, java.lang.String p1, int p2, int p3) {}

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

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppInteractionAccessFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AppInteractionAccessState {
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

    @android.annotation.SystemApi
    public static interface OnAppFunctionAccessChangedListener {
        public void onAppFunctionAccessChanged(int p0);
    }

    private static final class OnAppFunctionAccessChangeListenerDelegate extends android.app.IOnAppInteractionAccessChangeListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.app.appfunctions.AppFunctionManager.OnAppFunctionAccessChangedListener mListener = null;
        private final int mUserId = 0;
        private OnAppFunctionAccessChangeListenerDelegate(android.app.appfunctions.AppFunctionManager.OnAppFunctionAccessChangedListener p0, java.util.concurrent.Executor p1, int p2) { super(); }
        public void onAppInteractionAccessChanged(int p0) {}
    }
}

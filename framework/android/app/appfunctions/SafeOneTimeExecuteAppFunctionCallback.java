package android.app.appfunctions;

public class SafeOneTimeExecuteAppFunctionCallback {
    private static final java.lang.String TAG = "SafeOneTimeExecuteApp";
    private final android.app.appfunctions.SafeOneTimeExecuteAppFunctionCallback.BeforeCompletionCallback mBeforeCompletionCallback = null;
    private final android.app.appfunctions.IExecuteAppFunctionCallback mCallback = null;
    private java.util.ArrayList<android.app.appfunctions.SafeOneTimeExecuteAppFunctionCallback.CompletionCallback> mCompletionCallbacks;
    private final java.util.concurrent.atomic.AtomicLong mExecutionStartTimeAfterBindMillis = null;
    private final java.util.concurrent.atomic.AtomicBoolean mOnResultCalled = null;
    public SafeOneTimeExecuteAppFunctionCallback(android.app.appfunctions.IExecuteAppFunctionCallback p0) {}
    public SafeOneTimeExecuteAppFunctionCallback(android.app.appfunctions.IExecuteAppFunctionCallback p0, android.app.appfunctions.SafeOneTimeExecuteAppFunctionCallback.BeforeCompletionCallback p1, android.app.appfunctions.SafeOneTimeExecuteAppFunctionCallback.CompletionCallback p2) {}
    public void attachOnDeathListener(android.os.IBinder p0) throws android.os.RemoteException {}
    public void disable() {}
    public void onError(android.app.appfunctions.AppFunctionException p0) {}
    public void onResult(android.app.appfunctions.ExecuteAppFunctionResponse p0) {}
    public void setExecutionStartTimeAfterBindMillis(long p0) {}
    public android.app.appfunctions.IExecuteAppFunctionCallback wrapToExecutionCallback() { return null; }

    public static interface BeforeCompletionCallback {
        public void beforeOnSuccess(android.app.appfunctions.ExecuteAppFunctionResponse p0);
    }

    public static interface CompletionCallback {
        public void finalizeOnError(android.app.appfunctions.AppFunctionException p0, long p1);
        public void finalizeOnSuccess(android.app.appfunctions.ExecuteAppFunctionResponse p0, long p1);
    }
}

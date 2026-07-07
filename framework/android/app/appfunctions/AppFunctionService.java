package android.app.appfunctions;

public abstract class AppFunctionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.app.appfunctions.AppFunctionService";
    private static final java.lang.String TAG = "AppFunctionService";
    private final android.os.Binder mBinder = null;
    public AppFunctionService() { super(); }
    public static android.os.Binder createBinder(android.content.Context p0, android.app.appfunctions.AppFunctionService.OnExecuteFunction p1) { return null; }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onExecuteFunction(android.app.appfunctions.ExecuteAppFunctionRequest p0, java.lang.String p1, android.content.pm.SigningInfo p2, android.os.CancellationSignal p3, android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse, android.app.appfunctions.AppFunctionException> p4);

    @java.lang.FunctionalInterface
    public static interface OnExecuteFunction {
        public void perform(android.app.appfunctions.ExecuteAppFunctionRequest p0, java.lang.String p1, android.content.pm.SigningInfo p2, android.os.CancellationSignal p3, android.os.OutcomeReceiver<android.app.appfunctions.ExecuteAppFunctionResponse, android.app.appfunctions.AppFunctionException> p4);
    }
}

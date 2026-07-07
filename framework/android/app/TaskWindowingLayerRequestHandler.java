package android.app;

public class TaskWindowingLayerRequestHandler {
    public static final java.lang.String REMOTE_CALLBACK_RESULT_KEY = "result";
    public static final int RESULT_APPROVED = 0;
    public static final int RESULT_FAILED_BAD_STATE = 1;
    public static final int RESULT_FAILED_INSUFFICIENT_PERMISSIONS = 2;
    private static final java.lang.String TAG = "WindowingLayerRequest";
    public TaskWindowingLayerRequestHandler() {}
    private static android.os.IRemoteCallback createRemoteCallback(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<java.lang.Integer, java.lang.Exception> p1) { return null; }
    public static void requestWindowingLayer(int p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<java.lang.Integer, java.lang.Exception> p2, android.app.IAppTask p3) {}

    public static @interface Result {
    }
}

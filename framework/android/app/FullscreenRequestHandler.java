package android.app;

public class FullscreenRequestHandler {
    public static final java.lang.String REMOTE_CALLBACK_RESULT_KEY = "result";
    public static final int REQUEST_ALLOW_MODE_ENTER = 2;
    public static final int REQUEST_ALLOW_MODE_EXIT = 3;
    public static final int REQUEST_ALLOW_MODE_INHERIT = 0;
    public static final int REQUEST_ALLOW_MODE_NONE = 1;
    public static final int RESULT_APPROVED = 0;
    public static final int RESULT_FAILED_ALREADY_FULLY_EXPANDED = 3;
    public static final int RESULT_FAILED_NOT_IN_FULLSCREEN_WITH_HISTORY = 1;
    public static final int RESULT_FAILED_NOT_SUPPORTED = 4;
    public static final int RESULT_FAILED_NOT_TOP_FOCUSED = 2;
    private static final android.util.Singleton<android.app.FullscreenRequestHandler> sInstance = null;
    private final android.app.ActivityClient mActivityClient = null;
    public FullscreenRequestHandler(android.app.ActivityClient p0) {}
    public static android.app.FullscreenRequestHandler getInstance() { return null; }
    private void notifyFullscreenRequestResult(android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> p0, int p1) {}
    public static java.lang.String requestResultToString(int p0) { return null; }
    public void requestFullscreenMode(int p0, android.os.OutcomeReceiver<java.lang.Void, java.lang.Throwable> p1, android.os.IBinder p2, java.util.concurrent.Executor p3) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestAllowMode {
    }

    public static @interface RequestResult {
    }
}

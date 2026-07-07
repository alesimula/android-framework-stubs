package android.app;

public class TaskMoveRequestHandler {
    public static final java.lang.String REMOTE_CALLBACK_BOUNDS_KEY = "bounds";
    public static final java.lang.String REMOTE_CALLBACK_DISPLAY_ID_KEY = "display_id";
    public static final java.lang.String REMOTE_CALLBACK_RESULT_KEY = "result";
    public static final int RESULT_APPROVED = 0;
    public static final int RESULT_FAILED_BAD_BOUNDS = 4;
    public static final int RESULT_FAILED_BAD_STATE = 1;
    public static final int RESULT_FAILED_BAL_POLICY_VIOLATION = 7;
    public static final int RESULT_FAILED_IMMOVABLE_TASK = 5;
    public static final int RESULT_FAILED_NONEXISTENT_DISPLAY = 3;
    public static final int RESULT_FAILED_NO_PERMISSIONS = 6;
    public static final int RESULT_FAILED_UNABLE_TO_PLACE_TASK = 2;
    private TaskMoveRequestHandler() {}
    static void moveTaskTo(android.app.TaskLocation p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.app.TaskLocation, java.lang.Exception> p2, android.app.IAppTask p3) {}
    private static void notifyTaskMoveRequestResult(java.util.concurrent.Executor p0, android.os.OutcomeReceiver<android.app.TaskLocation, java.lang.Exception> p1, int p2, android.graphics.Rect p3, int p4) {}
    private static void preValidateTaskMoveRequest(android.app.TaskLocation p0, java.util.concurrent.Executor p1, android.os.OutcomeReceiver<android.app.TaskLocation, java.lang.Exception> p2) {}

    public static @interface RequestResult {
    }
}

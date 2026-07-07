package android.window;

@android.annotation.SystemApi
public abstract class TaskFpsCallback {
    public TaskFpsCallback() {}
    private static void dispatchOnFpsReported(android.window.ITaskFpsCallback p0, float p1) {}
    public abstract void onFpsReported(float p0);
}

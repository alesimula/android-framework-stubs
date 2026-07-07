package android.hardware.camera2.utils;

public class TaskDrainer<T extends java.lang.Object> {
    private static final java.lang.String TAG = "TaskDrainer";
    private final boolean DEBUG = false;
    private boolean mDrainFinished;
    private boolean mDraining;
    private final java.util.Set<T> mEarlyFinishedTaskSet = null;
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.hardware.camera2.utils.TaskDrainer.DrainListener mListener = null;
    private final java.lang.Object mLock = null;
    private final java.lang.String mName = null;
    private final java.util.Set<T> mTaskSet = null;
    public TaskDrainer(java.util.concurrent.Executor p0, android.hardware.camera2.utils.TaskDrainer.DrainListener p1) {}
    public TaskDrainer(java.util.concurrent.Executor p0, android.hardware.camera2.utils.TaskDrainer.DrainListener p1, java.lang.String p2) {}
    private void checkIfDrainFinished() {}
    private void postDrained() {}
    public void beginDrain() {}
    public void taskFinished(T p0) {}
    public void taskStarted(T p0) {}

    public static interface DrainListener {
        public void onDrained();
    }
}

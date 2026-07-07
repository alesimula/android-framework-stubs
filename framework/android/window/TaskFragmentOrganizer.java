package android.window;

public class TaskFragmentOrganizer extends android.window.WindowOrganizer {
    public static final java.lang.String KEY_ERROR_CALLBACK_OP_TYPE = "operation_type";
    public static final java.lang.String KEY_ERROR_CALLBACK_TASK_FRAGMENT_INFO = "task_fragment_info";
    public static final java.lang.String KEY_ERROR_CALLBACK_THROWABLE = "fragment_throwable";
    public static final java.lang.String KEY_RESTORE_TASK_FRAGMENTS_INFO = "key_restore_task_fragments_info";
    public static final java.lang.String KEY_RESTORE_TASK_FRAGMENT_PARENT_INFO = "key_restore_task_fragment_parent_info";
    public static final int TASK_FRAGMENT_TRANSIT_CHANGE = 6;
    public static final int TASK_FRAGMENT_TRANSIT_CLOSE = 2;
    public static final int TASK_FRAGMENT_TRANSIT_DRAG_RESIZE = 1017;
    public static final int TASK_FRAGMENT_TRANSIT_NONE = 0;
    public static final int TASK_FRAGMENT_TRANSIT_OPEN = 1;
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.window.ITaskFragmentOrganizer mInterface = null;
    private final android.window.TaskFragmentOrganizerToken mToken = null;
    public TaskFragmentOrganizer(java.util.concurrent.Executor p0) { super(); }
    private android.window.ITaskFragmentOrganizerController getController() { return null; }
    public static boolean isActivityEmbedded(android.app.Activity p0) { return false; }
    public static android.os.Bundle putErrorInfoInBundle(java.lang.Throwable p0, android.window.TaskFragmentInfo p1, int p2) { return null; }
    public void applySystemTransaction(android.window.WindowContainerTransaction p0, int p1, android.window.RemoteTransition p2) {}
    public void applyTransaction(android.window.WindowContainerTransaction p0) {}
    public void applyTransaction(android.window.WindowContainerTransaction p0, int p1, boolean p2) {}
    public java.util.concurrent.Executor getExecutor() { return null; }
    public android.window.TaskFragmentOrganizerToken getOrganizerToken() { return null; }
    public void onTransactionHandled(android.os.IBinder p0, android.window.WindowContainerTransaction p1, int p2, boolean p3) {}
    public void onTransactionReady(android.window.TaskFragmentTransaction p0) {}
    public void registerOrganizer() {}
    public void registerOrganizer(boolean p0) {}
    public void registerOrganizer(boolean p0, android.os.Bundle p1) {}
    public void registerRemoteAnimations(android.view.RemoteAnimationDefinition p0) {}
    public void setSavedState(android.os.Bundle p0) {}
    public void unregisterOrganizer() {}
    public void unregisterRemoteAnimations() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TaskFragmentTransitionType {
    }
}

package android.window;

public class TaskOrganizer extends android.window.WindowOrganizer {
    private final java.util.concurrent.Executor mExecutor = null;
    private final android.window.ITaskOrganizer mInterface = null;
    private final android.window.ITaskOrganizerController mTaskOrganizerController = null;
    public TaskOrganizer() { super(); }
    public TaskOrganizer(android.window.ITaskOrganizerController p0, java.util.concurrent.Executor p1) { super(); }
    private android.window.ITaskOrganizerController getController() { return null; }
    public void addStartingWindow(android.window.StartingWindowInfo p0) {}
    public void clearExcludeLayersFromTaskSnapshot(android.window.WindowContainerToken p0) {}
    public void copySplashScreenView(int p0) {}
    @java.lang.Deprecated
    public void createRootTask(int p0, int p1, android.os.IBinder p2) {}
    public android.window.TaskAppearedInfo createTask(android.window.TaskCreationParams p0) { return null; }
    @java.lang.Deprecated
    public boolean deleteRootTask(android.window.WindowContainerToken p0) { return false; }
    public boolean deleteTask(android.window.WindowContainerToken p0) { return false; }
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getChildTasks(android.window.WindowContainerToken p0, int[] p1) { return null; }
    public java.util.concurrent.Executor getExecutor() { return null; }
    public android.window.WindowContainerToken getImeLayeringTarget(int p0) { return null; }
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getRootTasks(int p0, int[] p1) { return null; }
    public void onAppSplashScreenViewRemoved(int p0) {}
    public void onBackOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0, boolean p1, boolean p2, boolean p3) {}
    public void onImeDrawnOnTask(int p0) {}
    public void onKeyguardOccludingTaskChanged(int p0, android.app.ActivityManager.RunningTaskInfo p1) {}
    public void onPackageUpdateFinished(java.util.List<android.app.ActivityManager.RunningTaskInfo> p0) {}
    public void onPackageUpdateRequested(java.util.List<android.app.ActivityManager.RunningTaskInfo> p0) {}
    public void onTaskAppeared(android.app.ActivityManager.RunningTaskInfo p0, android.view.SurfaceControl p1) {}
    public void onTaskInfoChanged(android.app.ActivityManager.RunningTaskInfo p0) {}
    public void onTaskVanished(android.app.ActivityManager.RunningTaskInfo p0) {}
    public void onTransitionReady(android.os.IBinder p0, android.window.TransitionInfo p1, android.view.SurfaceControl.Transaction p2, android.view.SurfaceControl.Transaction p3) {}
    public java.util.List<android.window.TaskAppearedInfo> registerOrganizer() { return null; }
    public void removeStartingWindow(android.window.StartingWindowRemovalInfo p0) {}
    public void requestStartTransition(android.os.IBinder p0, android.window.TransitionRequestInfo p1) {}
    public void restartTaskProcessIfVisible(android.window.WindowContainerToken p0) {}
    public void restartTaskTopActivityProcessIfVisible(android.window.WindowContainerToken p0) {}
    public void setExcludeLayersFromTaskSnapshot(android.window.WindowContainerToken p0, android.view.SurfaceControl[] p1) {}
    public void setInterceptBackPressedOnTaskRoot(android.window.WindowContainerToken p0, boolean p1) {}
    public void unregisterOrganizer() {}
}

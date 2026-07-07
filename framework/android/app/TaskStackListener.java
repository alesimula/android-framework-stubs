package android.app;

public abstract class TaskStackListener extends android.app.ITaskStackListener.Stub {
    private boolean mIsRemote;
    public TaskStackListener() { super(); }
    public void onActivityDismissingDockedTask() throws android.os.RemoteException {}
    public void onActivityForcedResizable(java.lang.String p0, int p1, int p2) throws android.os.RemoteException {}
    @java.lang.Deprecated
    public void onActivityLaunchOnSecondaryDisplayFailed() throws android.os.RemoteException {}
    public void onActivityLaunchOnSecondaryDisplayFailed(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
    public void onActivityLaunchOnSecondaryDisplayRerouted(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
    public void onActivityPinned(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
    public void onActivityRequestedOrientationChanged(int p0, int p1) throws android.os.RemoteException {}
    public void onActivityRestartAttempt(android.app.ActivityManager.RunningTaskInfo p0, boolean p1, boolean p2, boolean p3) throws android.os.RemoteException {}
    public void onActivityRotation(int p0) {}
    public void onActivityUnpinned() throws android.os.RemoteException {}
    public void onBackPressedOnTaskRoot(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
    public void onLockTaskModeChanged(int p0) {}
    public void onRecentTaskListFrozenChanged(boolean p0) {}
    public void onRecentTaskListUpdated() throws android.os.RemoteException {}
    public void onRecentTaskRemovedForAddTask(int p0) {}
    public void onTaskCreated(int p0, android.content.ComponentName p1) throws android.os.RemoteException {}
    @java.lang.Deprecated
    public void onTaskDescriptionChanged(int p0, android.app.ActivityManager.TaskDescription p1) throws android.os.RemoteException {}
    public void onTaskDescriptionChanged(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
    public void onTaskDisplayChanged(int p0, int p1) throws android.os.RemoteException {}
    public void onTaskFocusChanged(int p0, boolean p1) {}
    public void onTaskMovedToBack(android.app.ActivityManager.RunningTaskInfo p0) {}
    @java.lang.Deprecated
    public void onTaskMovedToFront(int p0) throws android.os.RemoteException {}
    public void onTaskMovedToFront(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
    @java.lang.Deprecated
    public void onTaskProfileLocked(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
    public void onTaskProfileLocked(android.app.ActivityManager.RunningTaskInfo p0, int p1) throws android.os.RemoteException {}
    @java.lang.Deprecated
    public void onTaskRemovalStarted(int p0) throws android.os.RemoteException {}
    public void onTaskRemovalStarted(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
    public void onTaskRemoved(int p0) throws android.os.RemoteException {}
    public void onTaskStackChanged() throws android.os.RemoteException {}
    public void setIsLocal() {}
}

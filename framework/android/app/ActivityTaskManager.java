package android.app;

public class ActivityTaskManager {
    public static final int DEFAULT_MINIMAL_SPLIT_SCREEN_DISPLAY_SIZE_DP = 440;
    public static final java.lang.String EXTRA_IGNORE_TARGET_SECURITY = "android.app.extra.EXTRA_IGNORE_TARGET_SECURITY";
    public static final java.lang.String EXTRA_OPTIONS = "android.app.extra.OPTIONS";
    private static final android.util.Singleton<android.app.IActivityTaskManager> IActivityTaskManagerSingleton = null;
    public static final int INVALID_STACK_ID = -1;
    public static final int INVALID_TASK_ID = -1;
    public static final int INVALID_WINDOWING_MODE = -1;
    public static final int RESIZE_MODE_FORCED = 2;
    public static final int RESIZE_MODE_PRESERVE_WINDOW = 1;
    public static final int RESIZE_MODE_SYSTEM = 0;
    public static final int RESIZE_MODE_USER = 1;
    public static final int RESIZE_MODE_USER_FORCED = 3;
    private static final android.util.Singleton<android.app.ActivityTaskManager> sInstance = null;
    private static int sMaxRecentTasks;
    private ActivityTaskManager() {}
    public static boolean currentUiModeSupportsErrorDialogs(android.content.Context p0) { return false; }
    public static boolean currentUiModeSupportsErrorDialogs(android.content.res.Configuration p0) { return false; }
    public static int getDefaultAppRecentsLimitStatic() { return 0; }
    public static android.app.ActivityTaskManager getInstance() { return null; }
    public static int getMaxAppRecentsLimitStatic() { return 0; }
    public static int getMaxNumPictureInPictureActions(android.content.Context p0) { return 0; }
    public static int getMaxRecentTasksStatic() { return 0; }
    public static android.app.IActivityTaskManager getService() { return null; }
    public static boolean supportsMultiWindow(android.content.Context p0) { return false; }
    public static boolean supportsSplitScreenMultiWindow(android.content.Context p0) { return false; }
    public boolean canBeUniversalResizeable(android.content.pm.ApplicationInfo p0) { return false; }
    public void clearLaunchParamsForPackages(java.util.List<java.lang.String> p0) {}
    public void detachNavigationBarFromApp(android.os.IBinder p0) {}
    public java.util.List<android.app.ActivityManager.RecentTaskInfo> getRecentTasks(int p0, int p1, int p2) { return null; }
    public android.graphics.Rect getTaskBounds(int p0) { return null; }
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0) { return null; }
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0, boolean p1) { return null; }
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0, boolean p1, boolean p2) { return null; }
    public java.util.List<android.app.ActivityManager.RunningTaskInfo> getTasks(int p0, boolean p1, boolean p2, int p3) { return null; }
    public boolean isInLockTaskMode() { return false; }
    public void moveTaskToRootTask(int p0, int p1, boolean p2) {}
    public void onSplashScreenViewCopyFinished(int p0, android.window.SplashScreenView.SplashScreenViewParcelable p1) {}
    public void registerRemoteAnimationsForDisplay(int p0, android.view.RemoteAnimationDefinition p1) {}
    public void registerTaskStackListener(android.app.TaskStackListener p0) {}
    public void removeAllVisibleRecentTasks() {}
    public void removeRootTasksInWindowingModes(int[] p0) {}
    public void removeRootTasksWithActivityTypes(int[] p0) {}
    public boolean removeTask(int p0) { return false; }
    public void resizeTask(int p0, android.graphics.Rect p1) {}
    public void startSystemLockTaskMode(int p0) {}
    public void stopSystemLockTaskMode() {}
    public void unregisterTaskStackListener(android.app.TaskStackListener p0) {}
    public void updateLockTaskPackages(android.content.Context p0, java.lang.String[] p1) {}

    public static class RootTaskInfo extends android.app.TaskInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.ActivityTaskManager.RootTaskInfo> CREATOR = null;
        public android.graphics.Rect bounds;
        public android.graphics.Rect[] childTaskBounds;
        public int[] childTaskIds;
        public java.lang.String[] childTaskNames;
        public int[] childTaskUserIds;
        public int position;
        public boolean visible;
        public RootTaskInfo() { super((android.os.Parcel)null); }
        private RootTaskInfo(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public int describeContents() { return 0; }
        void readFromParcel(android.os.Parcel p0) {}
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}

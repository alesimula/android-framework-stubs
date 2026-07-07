package android.window;

public final class TaskPropertiesRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskPropertiesRequest> CREATOR = null;
    public static final int REQUEST_DISABLE_APP_COMPAT_ROUNDED_CORNERS = 8;
    public static final int REQUEST_DISABLE_LAUNCH_ADJACENT = 2048;
    public static final int REQUEST_DISABLE_PIP = 1024;
    public static final int REQUEST_DISALLOW_OVERRIDE_WINDOWING_MODE_FOR_CHILDREN = 64;
    public static final int REQUEST_FORCE_LEAF_TASKS_NON_OCCLUDING = 16;
    public static final int REQUEST_FORCE_OPAQUE = 2;
    public static final int REQUEST_FORCE_TRANSLUCENT = 4096;
    public static final int REQUEST_IGNORE_INSETS = 4;
    public static final int REQUEST_INTERCEPT_BACK_PRESSED_ON_TASK_ROOT = 256;
    public static final int REQUEST_NONE = 0;
    public static final int REQUEST_PRESERVE_LEAF_TASK_IF_RELAUNCH = 128;
    public static final int REQUEST_REPARENT_LEAF_TASK_IF_RELAUNCH_FROM_HOME = 32;
    public static final int REQUEST_REPARENT_ON_DISPLAY_REMOVAL = 1;
    public static final int REQUEST_TASK_FORCE_EXCLUDED_FROM_RECENTS = 512;
    private boolean mDisableAppCompatRoundedCorners;
    private boolean mDisableLaunchAdjacent;
    private boolean mDisablePip;
    private boolean mDisallowOverrideWindowingModeForChildren;
    private boolean mForceLeafTasksNonOccluding;
    private boolean mForceOpaque;
    private boolean mForceTranslucent;
    private boolean mIgnoreInsets;
    private boolean mInterceptBackPressedOnTaskRoot;
    private boolean mPreserveLeafTaskIfRelaunch;
    private boolean mReparentLeafTaskIfRelaunchFromHome;
    private boolean mReparentOnDisplayRemoval;
    private int mRequestMask;
    private boolean mTaskForceExcludedFromRecents;
    public TaskPropertiesRequest() {}
    TaskPropertiesRequest(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getRequestMask() { return 0; }
    public int hashCode() { return 0; }
    public boolean isDisableAppCompatRoundedCorners() { return false; }
    public boolean isDisableLaunchAdjacent() { return false; }
    public boolean isDisablePip() { return false; }
    public boolean isDisallowOverrideWindowingModeForChildren() { return false; }
    public boolean isForceLeafTasksNonOccluding() { return false; }
    public boolean isForceOpaque() { return false; }
    public boolean isForceTranslucent() { return false; }
    public boolean isIgnoreInsets() { return false; }
    public boolean isInterceptBackPressedOnTaskRoot() { return false; }
    public boolean isPreserveLeafTaskIfRelaunch() { return false; }
    public boolean isReparentLeafTaskIfRelaunchFromHome() { return false; }
    public boolean isReparentOnDisplayRemoval() { return false; }
    public boolean isTaskForceExcludedFromRecents() { return false; }
    public android.window.TaskPropertiesRequest setDisableAppCompatRoundedCorners(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setDisableLaunchAdjacent(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setDisablePip(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setDisallowOverrideWindowingModeForChildren(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setForceLeafTasksNonOccluding(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setForceOpaque(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setForceTranslucent(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setIgnoreInsets(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setInterceptBackPressedOnTaskRoot(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setPreserveLeafTaskIfRelaunch(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setReparentLeafTaskIfRelaunchFromHome(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setReparentOnDisplayRemoval(boolean p0) { return null; }
    public android.window.TaskPropertiesRequest setTaskForceExcludedFromRecents(boolean p0) { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestMask {
    }
}

package android.app;

public class TaskInfo {
    public static final int PROPERTY_VALUE_UNSET = -1;
    public static final int SELF_MOVABLE_ALLOWED = 1;
    public static final int SELF_MOVABLE_DEFAULT = 0;
    public static final int SELF_MOVABLE_DENIED = 2;
    public static final int SELF_MOVABLE_UNSET = -1;
    private static final java.lang.String TAG = "TaskInfo";
    public android.app.AppCompatTaskInfo appCompatTaskInfo;
    public android.content.ComponentName baseActivity;
    public android.content.Intent baseIntent;
    public android.net.Uri capturedLink;
    public long capturedLinkTimestamp;
    public final android.content.res.Configuration configuration = null;
    public int defaultMinSize;
    public int displayAreaFeatureId;
    public android.graphics.Rect displayCutoutInsets;
    public int displayId;
    public int effectiveUid;
    public boolean isActivityStackTransparent;
    @java.lang.Deprecated
    public boolean isAppBubble;
    public boolean isFocused;
    public boolean isInteractive;
    public boolean isRealActivityAppLockEnabled;
    public boolean isResizeable;
    public boolean isRunning;
    public boolean isSleeping;
    public boolean isTopActivityNoDisplay;
    public boolean isTopActivityTransparent;
    public boolean isVisible;
    public boolean isVisibleRequested;
    public long lastActiveTime;
    public android.graphics.Rect lastNonFullscreenBounds;
    public int lastParentTaskIdBeforePip;
    public java.util.ArrayList<android.os.IBinder> launchCookies;
    public int launchIntoPipHostTaskId;
    public boolean leafTaskBoundsFromOptions;
    public android.content.LocusId mTopActivityLocusId;
    public int minHeight;
    public int minWidth;
    public int numActivities;
    public android.content.ComponentName origActivity;
    public int parentTaskId;
    public android.app.PictureInPictureParams pictureInPictureParams;
    public android.graphics.Point positionInParent;
    public android.content.ComponentName realActivity;
    public int requestedVisibleTypes;
    public int resizeMode;
    public int seqId;
    public boolean shouldDockBigOverlays;
    public boolean supportsMultiWindow;
    public boolean supportsMultiWindowWithoutConstraints;
    public android.app.ActivityManager.TaskDescription taskDescription;
    public int taskId;
    public android.window.WindowContainerToken token;
    public android.content.ComponentName topActivity;
    public android.content.pm.ActivityInfo topActivityInfo;
    public android.graphics.Rect topActivityMainWindowFrame;
    public long topActivityRequestOpenInBrowserEducationTimestamp;
    public int topActivityType;
    public int userId;
    TaskInfo() {}
    TaskInfo(android.app.TaskInfo p0) {}
    public TaskInfo(android.os.Parcel p0) {}
    public void addLaunchCookie(android.os.IBinder p0) {}
    public boolean containsLaunchCookie(android.os.IBinder p0) { return false; }
    public boolean equalsForCompatUi(android.app.TaskInfo p0) { return false; }
    public boolean equalsForTaskOrganizer(android.app.TaskInfo p0) { return false; }
    public int getActivityType() { return 0; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public int getDisplayId() { return 0; }
    public int getParentTaskId() { return 0; }
    public android.app.PictureInPictureParams getPictureInPictureParams() { return null; }
    public int getTaskId() { return 0; }
    public android.window.WindowContainerToken getToken() { return null; }
    public int getWindowingMode() { return 0; }
    public boolean hasParentTask() { return false; }
    public boolean isFreeform() { return false; }
    public boolean isVisible() { return false; }
    void readTaskFromParcel(android.os.Parcel p0) {}
    public boolean shouldDockBigOverlays() { return false; }
    public java.lang.String toString() { return null; }
    public void writeTaskToParcel(android.os.Parcel p0, int p1) {}

    public static @interface SelfMovable {
    }
}

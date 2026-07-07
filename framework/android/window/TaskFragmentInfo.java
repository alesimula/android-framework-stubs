package android.window;

public final class TaskFragmentInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentInfo> CREATOR = null;
    private final java.util.List<android.os.IBinder> mActivities = null;
    private final android.content.res.Configuration mConfiguration = null;
    private final android.os.IBinder mFragmentToken = null;
    private final java.util.List<android.os.IBinder> mInRequestedTaskFragmentActivities = null;
    private final boolean mIsClearedForReorderActivityToFront = false;
    private final boolean mIsTaskClearedForReuse = false;
    private final boolean mIsTaskFragmentClearedForPip = false;
    private final boolean mIsTopNonFishingChild = false;
    private final boolean mIsVisible = false;
    private final android.graphics.Point mMinimumDimensions = null;
    private final android.graphics.Point mPositionInParent = null;
    private final int mRunningActivityCount = 0;
    private final android.window.WindowContainerToken mToken = null;
    public TaskFragmentInfo(android.os.IBinder p0, android.window.WindowContainerToken p1, android.content.res.Configuration p2, int p3, boolean p4, java.util.List<android.os.IBinder> p5, java.util.List<android.os.IBinder> p6, android.graphics.Point p7, boolean p8, boolean p9, boolean p10, android.graphics.Point p11, boolean p12) {}
    private TaskFragmentInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equalsForTaskFragmentOrganizer(android.window.TaskFragmentInfo p0) { return false; }
    public java.util.List<android.os.IBinder> getActivities() { return null; }
    public java.util.List<android.os.IBinder> getActivitiesRequestedInTaskFragment() { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public android.os.IBinder getFragmentToken() { return null; }
    public int getMinimumHeight() { return 0; }
    public int getMinimumWidth() { return 0; }
    public android.graphics.Point getPositionInParent() { return null; }
    public int getRunningActivityCount() { return 0; }
    public android.window.WindowContainerToken getToken() { return null; }
    public int getWindowingMode() { return 0; }
    public boolean hasRunningActivity() { return false; }
    public boolean isClearedForReorderActivityToFront() { return false; }
    public boolean isEmpty() { return false; }
    public boolean isTaskClearedForReuse() { return false; }
    public boolean isTaskFragmentClearedForPip() { return false; }
    public boolean isTopNonFinishingChild() { return false; }
    public boolean isVisible() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

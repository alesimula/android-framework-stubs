package android.window;

public final class TaskFragmentParentInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.TaskFragmentParentInfo> CREATOR = null;
    private final android.content.res.Configuration mConfiguration = null;
    private final android.view.SurfaceControl mDecorSurface = null;
    private final int mDisplayId = 0;
    private final boolean mHasDirectActivity = false;
    private final int mTaskId = 0;
    private final boolean mVisible = false;
    public TaskFragmentParentInfo(android.content.res.Configuration p0, int p1, int p2, boolean p3, boolean p4, android.view.SurfaceControl p5) {}
    private TaskFragmentParentInfo(android.os.Parcel p0) {}
    public TaskFragmentParentInfo(android.window.TaskFragmentParentInfo p0) {}
    private int getWindowingMode() { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean equalsForTaskFragmentOrganizer(android.window.TaskFragmentParentInfo p0) { return false; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public android.view.SurfaceControl getDecorSurface() { return null; }
    public int getDisplayId() { return 0; }
    public int getTaskId() { return 0; }
    public boolean hasDirectActivity() { return false; }
    public int hashCode() { return 0; }
    public boolean isVisible() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

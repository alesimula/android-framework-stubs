package android.window;

public final class ActivityTransitionInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.ActivityTransitionInfo> CREATOR = null;
    private final android.window.AppCompatTransitionInfo mAppCompatTransitionInfo = null;
    private final android.content.ComponentName mComponent = null;
    private final int mTaskId = 0;
    public ActivityTransitionInfo(android.content.ComponentName p0, int p1) {}
    public ActivityTransitionInfo(android.content.ComponentName p0, int p1, android.window.AppCompatTransitionInfo p2) {}
    ActivityTransitionInfo(android.os.Parcel p0) {}
    public ActivityTransitionInfo(android.window.ActivityTransitionInfo p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.window.AppCompatTransitionInfo getAppCompatTransitionInfo() { return null; }
    public android.content.ComponentName getComponent() { return null; }
    public int getTaskId() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

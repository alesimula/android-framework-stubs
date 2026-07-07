package android.content.pm;

public class LauncherActivityInfoInternal implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.LauncherActivityInfoInternal> CREATOR = null;
    private android.content.pm.ActivityInfo mActivityInfo;
    private android.content.ComponentName mComponentName;
    private android.content.pm.IncrementalStatesInfo mIncrementalStatesInfo;
    private boolean mSupportsMultiInstance;
    private android.os.UserHandle mUser;
    public LauncherActivityInfoInternal(android.content.pm.ActivityInfo p0, android.content.pm.IncrementalStatesInfo p1, android.os.UserHandle p2, boolean p3) {}
    public LauncherActivityInfoInternal(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.content.pm.ActivityInfo getActivityInfo() { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public android.content.pm.IncrementalStatesInfo getIncrementalStatesInfo() { return null; }
    public android.os.UserHandle getUser() { return null; }
    public boolean supportsMultiInstance() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

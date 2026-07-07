package android.app.appfunctions;

public final class AppFunctionState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.appfunctions.AppFunctionState> CREATOR = null;
    private final android.util.ArraySet<android.app.appfunctions.AppFunctionActivityId> mActivityIds = null;
    private final android.app.appfunctions.AppFunctionName mFunctionName = null;
    private final boolean mIsEnabled = false;
    public AppFunctionState(android.app.appfunctions.AppFunctionName p0, boolean p1, android.util.ArraySet<android.app.appfunctions.AppFunctionActivityId> p2) {}
    private AppFunctionState(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.util.ArraySet<android.app.appfunctions.AppFunctionActivityId> getActivityIds() { return null; }
    public android.app.appfunctions.AppFunctionName getFunctionName() { return null; }
    public int hashCode() { return 0; }
    public boolean isEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

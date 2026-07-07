package android.window.sharedsurface;

public final class SharedAnimationFilter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.sharedsurface.SharedAnimationFilter> CREATOR = null;
    final android.content.ComponentName mComponent = null;
    final android.os.IBinder mLaunchCookie = null;
    final java.lang.String mPackageName = null;
    final int mTaskId = 0;
    final int mUserId = 0;
    private SharedAnimationFilter(android.content.ComponentName p0, java.lang.String p1, android.os.IBinder p2, int p3, int p4) {}
    private SharedAnimationFilter(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.ComponentName getComponentName() { return null; }
    public android.os.IBinder getLaunchCookie() { return null; }
    public java.lang.String getPackageName() { return null; }
    public int getTaskId() { return 0; }
    public int getUserId() { return 0; }
    public int hashCode() { return 0; }
    boolean isValid() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        android.content.ComponentName mComponent;
        android.os.IBinder mLaunchCookie;
        java.lang.String mPackageName;
        int mTaskId;
        int mUserId;
        public Builder() {}
        public android.window.sharedsurface.SharedAnimationFilter build() { return null; }
        public android.window.sharedsurface.SharedAnimationFilter.Builder setComponent(android.content.ComponentName p0) { return null; }
        public android.window.sharedsurface.SharedAnimationFilter.Builder setLaunchCookie(android.os.IBinder p0) { return null; }
        public android.window.sharedsurface.SharedAnimationFilter.Builder setPackageName(java.lang.String p0) { return null; }
        public android.window.sharedsurface.SharedAnimationFilter.Builder setTaskId(int p0) { return null; }
        public android.window.sharedsurface.SharedAnimationFilter.Builder setUserId(int p0) { return null; }
    }
}

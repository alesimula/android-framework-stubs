package android.app.usage;

public final class UsageStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.usage.UsageStats> CREATOR = null;
    public android.util.SparseIntArray mActivities;
    public int mAppLaunchCount;
    public long mBeginTimeStamp;
    public android.util.ArrayMap<java.lang.String, android.util.ArrayMap<java.lang.String, java.lang.Integer>> mChooserCounts;
    public android.util.SparseArray<android.util.SparseIntArray> mChooserCountsObfuscated;
    public long mEndTimeStamp;
    public android.util.ArrayMap<java.lang.String, java.lang.Integer> mForegroundServices;
    @java.lang.Deprecated
    public int mLastEvent;
    public long mLastTimeComponentUsed;
    public long mLastTimeForegroundServiceUsed;
    public long mLastTimeUsed;
    public long mLastTimeVisible;
    public int mLaunchCount;
    public java.lang.String mPackageName;
    public int mPackageToken;
    public long mTotalTimeForegroundServiceUsed;
    public long mTotalTimeInForeground;
    public long mTotalTimeVisible;
    public UsageStats() {}
    public UsageStats(android.app.usage.UsageStats p0) {}
    private boolean anyForegroundServiceStarted() { return false; }
    private android.os.Bundle eventMapToBundle(android.util.ArrayMap<java.lang.String, java.lang.Integer> p0) { return null; }
    private boolean hasForegroundActivity() { return false; }
    private void incrementServiceTimeUsed(long p0) {}
    private void incrementTimeUsed(long p0) {}
    private void incrementTimeVisible(long p0) {}
    private void mergeEventMap(android.util.ArrayMap<java.lang.String, java.lang.Integer> p0, android.util.ArrayMap<java.lang.String, java.lang.Integer> p1) {}
    private void mergeEventMap(android.util.SparseIntArray p0, android.util.SparseIntArray p1) {}
    private void updateActivity(java.lang.String p0, long p1, int p2, int p3) {}
    private void updateForegroundService(java.lang.String p0, long p1, int p2) {}
    private void writeSparseIntArray(android.os.Parcel p0, android.util.SparseIntArray p1) {}
    public void add(android.app.usage.UsageStats p0) {}
    public int describeContents() { return 0; }
    @android.annotation.SystemApi
    public int getAppLaunchCount() { return 0; }
    public long getFirstTimeStamp() { return 0L; }
    @android.annotation.SystemApi
    public long getLastTimeAnyComponentUsed() { return 0L; }
    public long getLastTimeForegroundServiceUsed() { return 0L; }
    public long getLastTimePackageUsed() { return 0L; }
    public long getLastTimeStamp() { return 0L; }
    public long getLastTimeUsed() { return 0L; }
    public long getLastTimeVisible() { return 0L; }
    public android.app.usage.UsageStats getObfuscatedForInstantApp() { return null; }
    public java.lang.String getPackageName() { return null; }
    public long getTotalTimeForegroundServiceUsed() { return 0L; }
    public long getTotalTimeInForeground() { return 0L; }
    public long getTotalTimeVisible() { return 0L; }
    public boolean hasVisibleActivity() { return false; }
    public void update(java.lang.String p0, long p1, int p2, int p3) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.app.usage.UsageStats mUsageStats = null;
        public Builder() {}
        public android.app.usage.UsageStats build() { return null; }
        public android.app.usage.UsageStats.Builder setFirstTimeStamp(long p0) { return null; }
        public android.app.usage.UsageStats.Builder setLastTimeStamp(long p0) { return null; }
        public android.app.usage.UsageStats.Builder setLastTimeUsed(long p0) { return null; }
        public android.app.usage.UsageStats.Builder setPackageName(java.lang.String p0) { return null; }
        public android.app.usage.UsageStats.Builder setTotalTimeInForeground(long p0) { return null; }
    }
}

package android.app.usage;

public final class ConfigurationStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.usage.ConfigurationStats> CREATOR = null;
    public int mActivationCount;
    public long mBeginTimeStamp;
    public android.content.res.Configuration mConfiguration;
    public long mEndTimeStamp;
    public long mLastTimeActive;
    public long mTotalTimeActive;
    public ConfigurationStats() {}
    public ConfigurationStats(android.app.usage.ConfigurationStats p0) {}
    public int describeContents() { return 0; }
    public int getActivationCount() { return 0; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public long getFirstTimeStamp() { return 0L; }
    public long getLastTimeActive() { return 0L; }
    public long getLastTimeStamp() { return 0L; }
    public long getTotalTimeActive() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.util;

public class MergedConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.util.MergedConfiguration> CREATOR = null;
    private final android.content.res.Configuration mGlobalConfig = null;
    private final android.content.res.Configuration mMergedConfig = null;
    private final android.content.res.Configuration mOverrideConfig = null;
    public MergedConfiguration() {}
    public MergedConfiguration(android.content.res.Configuration p0) {}
    public MergedConfiguration(android.content.res.Configuration p0, android.content.res.Configuration p1) {}
    private MergedConfiguration(android.os.Parcel p0) {}
    public MergedConfiguration(android.util.MergedConfiguration p0) {}
    private void updateMergedConfig() {}
    public int describeContents() { return 0; }
    public void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.res.Configuration getGlobalConfiguration() { return null; }
    public android.content.res.Configuration getMergedConfiguration() { return null; }
    public android.content.res.Configuration getOverrideConfiguration() { return null; }
    public int hashCode() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setConfiguration(android.content.res.Configuration p0, android.content.res.Configuration p1) {}
    public void setGlobalConfiguration(android.content.res.Configuration p0) {}
    public void setOverrideConfiguration(android.content.res.Configuration p0) {}
    public void setTo(android.util.MergedConfiguration p0) {}
    public java.lang.String toString() { return null; }
    public void unset() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

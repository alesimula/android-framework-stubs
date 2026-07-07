package android.content.pm;

@java.lang.Deprecated
public class PackageStats implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.PackageStats> CREATOR = null;
    public long apkSize;
    public long cacheSize;
    public long codeSize;
    public long curProfSize;
    public long dataSize;
    public long dexoptSize;
    public long dmSize;
    public long externalCacheSize;
    public long externalCodeSize;
    public long externalDataSize;
    public long externalMediaSize;
    public long externalObbSize;
    public long libSize;
    public java.lang.String packageName;
    public long refProfSize;
    public int userHandle;
    public PackageStats(android.content.pm.PackageStats p0) {}
    public PackageStats(android.os.Parcel p0) {}
    public PackageStats(java.lang.String p0) {}
    public PackageStats(java.lang.String p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

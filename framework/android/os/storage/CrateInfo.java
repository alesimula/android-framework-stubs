package android.os.storage;

public final class CrateInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.storage.CrateInfo> CREATOR = null;
    private static final java.lang.String TAG = "CrateInfo";
    private long mExpiration;
    private java.lang.String mId;
    private java.lang.CharSequence mLabel;
    private java.lang.String mPackageName;
    private int mUid;
    private CrateInfo() {}
    public CrateInfo(java.lang.CharSequence p0) {}
    public CrateInfo(java.lang.CharSequence p0, long p1) {}
    public static android.os.storage.CrateInfo copyFrom(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getExpirationMillis() { return 0L; }
    public java.lang.CharSequence getLabel() { return null; }
    public int hashCode() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setExpiration(long p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.app.blob;

public final class LeaseInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.blob.LeaseInfo> CREATOR = null;
    private final java.lang.CharSequence mDescription = null;
    private final int mDescriptionResId = 0;
    private final long mExpiryTimeMillis = 0L;
    private final java.lang.String mPackageName = null;
    private LeaseInfo(android.os.Parcel p0) {}
    public LeaseInfo(java.lang.String p0, long p1, int p2, java.lang.CharSequence p3) {}
    private java.lang.String toShortString() { return null; }
    static java.lang.String toShortString(java.util.List<android.app.blob.LeaseInfo> p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.CharSequence getDescription() { return null; }
    public int getDescriptionResId() { return 0; }
    public long getExpiryTimeMillis() { return 0L; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

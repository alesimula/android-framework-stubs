package android.app.blob;

public final class BlobInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.blob.BlobInfo> CREATOR = null;
    private final long mExpiryTimeMs = 0L;
    private final long mId = 0L;
    private final java.lang.CharSequence mLabel = null;
    private final java.util.List<android.app.blob.LeaseInfo> mLeaseInfos = null;
    private final long mSizeBytes = 0L;
    public BlobInfo(long p0, long p1, java.lang.CharSequence p2, long p3, java.util.List<android.app.blob.LeaseInfo> p4) {}
    private BlobInfo(android.os.Parcel p0) {}
    private static java.lang.String formatBlobSize(long p0) { return null; }
    private java.lang.String toShortString() { return null; }
    public int describeContents() { return 0; }
    public long getExpiryTimeMs() { return 0L; }
    public long getId() { return 0L; }
    public java.lang.CharSequence getLabel() { return null; }
    public java.util.List<android.app.blob.LeaseInfo> getLeases() { return null; }
    public long getSizeBytes() { return 0L; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

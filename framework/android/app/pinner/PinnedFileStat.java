package android.app.pinner;

public final class PinnedFileStat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.pinner.PinnedFileStat> CREATOR = null;
    private long bytesPinned;
    private java.lang.String filename;
    private java.lang.String groupName;
    private PinnedFileStat(android.os.Parcel p0) {}
    public PinnedFileStat(java.lang.String p0, long p1, java.lang.String p2) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getBytesPinned() { return 0L; }
    public java.lang.String getFilename() { return null; }
    public java.lang.String getGroupName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

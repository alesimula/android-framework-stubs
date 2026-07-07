package android.service.contentcapture;

public final class FlushMetrics implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.contentcapture.FlushMetrics> CREATOR = null;
    public int sessionFinished;
    public int sessionStarted;
    public int viewAppearedCount;
    public int viewDisappearedCount;
    public int viewTextChangedCount;
    public FlushMetrics() {}
    public int describeContents() { return 0; }
    public void reset() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

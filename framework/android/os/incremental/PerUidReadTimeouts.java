package android.os.incremental;

public class PerUidReadTimeouts implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.incremental.PerUidReadTimeouts> CREATOR = null;
    public long maxPendingTimeUs;
    public long minPendingTimeUs;
    public long minTimeUs;
    public int uid;
    public PerUidReadTimeouts() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

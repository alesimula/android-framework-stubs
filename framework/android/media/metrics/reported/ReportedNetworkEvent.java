package android.media.metrics.reported;

public class ReportedNetworkEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.metrics.reported.ReportedNetworkEvent> CREATOR = null;
    public int networkType;
    public long timeSinceCreatedMillis;
    public ReportedNetworkEvent() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

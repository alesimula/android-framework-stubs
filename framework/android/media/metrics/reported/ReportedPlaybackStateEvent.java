package android.media.metrics.reported;

public class ReportedPlaybackStateEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.metrics.reported.ReportedPlaybackStateEvent> CREATOR = null;
    public int state;
    public long timeSinceCreatedMillis;
    public ReportedPlaybackStateEvent() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

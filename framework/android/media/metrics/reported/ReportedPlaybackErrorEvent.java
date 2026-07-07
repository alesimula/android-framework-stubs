package android.media.metrics.reported;

public class ReportedPlaybackErrorEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.metrics.reported.ReportedPlaybackErrorEvent> CREATOR = null;
    public int errorCode;
    public java.lang.String exceptionStack;
    public int subErrorCode;
    public long timeSinceCreatedMillis;
    public ReportedPlaybackErrorEvent() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

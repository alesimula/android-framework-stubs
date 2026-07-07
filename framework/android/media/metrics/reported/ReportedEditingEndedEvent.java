package android.media.metrics.reported;

public class ReportedEditingEndedEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.metrics.reported.ReportedEditingEndedEvent> CREATOR = null;
    public int errorCode;
    public java.lang.String exporterName;
    public float finalProgressPercent;
    public int finalState;
    public android.media.metrics.reported.ReportedMediaItemInfo[] inputMediaItemInfos;
    public java.lang.String muxerName;
    public long operationTypes;
    public android.media.metrics.reported.ReportedMediaItemInfo outputMediaItemInfo;
    public long timeSinceCreatedMillis;
    public ReportedEditingEndedEvent() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

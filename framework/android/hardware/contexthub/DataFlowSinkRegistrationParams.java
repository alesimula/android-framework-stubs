package android.hardware.contexthub;

public class DataFlowSinkRegistrationParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.DataFlowSinkRegistrationParams> CREATOR = null;
    public android.hardware.contexthub.DataFlowSinkContext context;
    public android.hardware.contexthub.Message msg;
    public int sessionId;
    public android.hardware.contexthub.EndpointId sinkId;
    public android.hardware.contexthub.EndpointId sourceId;
    public DataFlowSinkRegistrationParams() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

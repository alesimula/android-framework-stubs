package android.telephony.data;

public final class NrQos extends android.telephony.data.Qos implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.data.NrQos> CREATOR = null;
    int averagingWindowMs;
    int fiveQi;
    int qosFlowId;
    private NrQos(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public NrQos(android.telephony.data.Qos.QosBandwidth p0, android.telephony.data.Qos.QosBandwidth p1, int p2, int p3, int p4) { super((android.os.Parcel)null); }
    public static android.telephony.data.NrQos createFromParcelBody(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int get5Qi() { return 0; }
    public int getAveragingWindow() { return 0; }
    public int getQfi() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

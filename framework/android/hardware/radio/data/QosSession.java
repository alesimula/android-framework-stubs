package android.hardware.radio.data;

public class QosSession implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.QosSession> CREATOR = null;
    public android.hardware.radio.data.Qos qos;
    public android.hardware.radio.data.QosFilter[] qosFilters;
    public int qosSessionId;
    public QosSession() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

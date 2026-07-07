package android.telephony.data;

public final class QosBearerSession implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.data.QosBearerSession> CREATOR = null;
    final android.telephony.data.Qos qos = null;
    final java.util.List<android.telephony.data.QosBearerFilter> qosBearerFilterList = null;
    final int qosBearerSessionId = 0;
    public QosBearerSession(int p0, android.telephony.data.Qos p1, java.util.List<android.telephony.data.QosBearerFilter> p2) {}
    private QosBearerSession(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.data.Qos getQos() { return null; }
    public java.util.List<android.telephony.data.QosBearerFilter> getQosBearerFilterList() { return null; }
    public int getQosBearerSessionId() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

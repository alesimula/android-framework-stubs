package android.telephony.data;

public abstract class Qos implements android.os.Parcelable {
    static final int QOS_TYPE_EPS = 1;
    static final int QOS_TYPE_NR = 2;
    final android.telephony.data.Qos.QosBandwidth downlink = null;
    final int type = 0;
    final android.telephony.data.Qos.QosBandwidth uplink = null;
    Qos(int p0, android.telephony.data.Qos.QosBandwidth p1, android.telephony.data.Qos.QosBandwidth p2) {}
    protected Qos(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.data.Qos.QosBandwidth getDownlinkBandwidth() { return null; }
    public int getType() { return 0; }
    public android.telephony.data.Qos.QosBandwidth getUplinkBandwidth() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(int p0, android.os.Parcel p1, int p2) {}

    public static class QosBandwidth implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.telephony.data.Qos.QosBandwidth> CREATOR = null;
        int guaranteedBitrateKbps;
        int maxBitrateKbps;
        public QosBandwidth(int p0, int p1) {}
        private QosBandwidth(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getGuaranteedBitrateKbps() { return 0; }
        public int getMaxBitrateKbps() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface QosType {
    }
}

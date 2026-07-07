package android.telephony.data;

public final class QosBearerFilter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.data.QosBearerFilter> CREATOR = null;
    public static final int QOS_FILTER_DIRECTION_BIDIRECTIONAL = 2;
    public static final int QOS_FILTER_DIRECTION_DOWNLINK = 0;
    public static final int QOS_FILTER_DIRECTION_UPLINK = 1;
    public static final int QOS_MAX_PORT = 65535;
    public static final int QOS_MIN_PORT = 20;
    public static final int QOS_PROTOCOL_AH = 51;
    public static final int QOS_PROTOCOL_ESP = 50;
    public static final int QOS_PROTOCOL_TCP = 6;
    public static final int QOS_PROTOCOL_UDP = 17;
    public static final int QOS_PROTOCOL_UNSPECIFIED = -1;
    private int filterDirection;
    private long flowLabel;
    private java.util.List<android.net.LinkAddress> localAddresses;
    private android.telephony.data.QosBearerFilter.PortRange localPort;
    private int precedence;
    private int protocol;
    private java.util.List<android.net.LinkAddress> remoteAddresses;
    private android.telephony.data.QosBearerFilter.PortRange remotePort;
    private long securityParameterIndex;
    private int typeOfServiceMask;
    private QosBearerFilter(android.os.Parcel p0) {}
    public QosBearerFilter(java.util.List<android.net.LinkAddress> p0, java.util.List<android.net.LinkAddress> p1, android.telephony.data.QosBearerFilter.PortRange p2, android.telephony.data.QosBearerFilter.PortRange p3, int p4, int p5, long p6, long p7, int p8, int p9) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<android.net.LinkAddress> getLocalAddresses() { return null; }
    public android.telephony.data.QosBearerFilter.PortRange getLocalPortRange() { return null; }
    public int getPrecedence() { return 0; }
    public int getProtocol() { return 0; }
    public java.util.List<android.net.LinkAddress> getRemoteAddresses() { return null; }
    public android.telephony.data.QosBearerFilter.PortRange getRemotePortRange() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class PortRange implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.telephony.data.QosBearerFilter.PortRange> CREATOR = null;
        int end;
        int start;
        public PortRange(int p0, int p1) {}
        private PortRange(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getEnd() { return 0; }
        public int getStart() { return 0; }
        public int hashCode() { return 0; }
        public boolean isValid() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface QosBearerFilterDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface QosProtocol {
    }
}

package android.hardware.radio.data;

public class QosFilter implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.QosFilter> CREATOR = null;
    public static final byte DIRECTION_BIDIRECTIONAL = 2;
    public static final byte DIRECTION_DOWNLINK = 0;
    public static final byte DIRECTION_UPLINK = 1;
    public static final byte PROTOCOL_AH = 51;
    public static final byte PROTOCOL_ESP = 50;
    public static final byte PROTOCOL_TCP = 6;
    public static final byte PROTOCOL_UDP = 17;
    public static final byte PROTOCOL_UNSPECIFIED = -1;
    public byte direction;
    public android.hardware.radio.data.QosFilterIpv6FlowLabel flowLabel;
    public java.lang.String[] localAddresses;
    public android.hardware.radio.data.PortRange localPort;
    public int precedence;
    public byte protocol;
    public java.lang.String[] remoteAddresses;
    public android.hardware.radio.data.PortRange remotePort;
    public android.hardware.radio.data.QosFilterIpsecSpi spi;
    public android.hardware.radio.data.QosFilterTypeOfService tos;
    public QosFilter() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.hardware.radio.data;

public class TrafficDescriptor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.TrafficDescriptor> CREATOR = null;
    public byte connectionCapability;
    public java.lang.String dnn;
    public android.hardware.radio.data.OsAppId osAppId;
    public TrafficDescriptor() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface ConnectionCapability {
        public static final byte BACKGROUND = -88;
        public static final byte DOWNLINK_STREAMING = -93;
        public static final byte IMS = 1;
        public static final byte INTERNET = 8;
        public static final byte IOT_DELAY_TOLERANT = -95;
        public static final byte IOT_NON_DELAY_TOLERANT = -94;
        public static final byte LCS_USER_PLANE_POSITIONING = 16;
        public static final byte LOW_LATENCY_LOSS_TOLERANT_UNACK = -85;
        public static final byte MISSION_CRITICAL_COMMUNICATIONS = -87;
        public static final byte MMS = 2;
        public static final byte REAL_TIME_INTERACTIVE = -90;
        public static final byte SUPL = 4;
        public static final byte TIME_CRITICAL_COMMUNICATIONS = -86;
        public static final byte UNIFIED_COMMUNICATIONS = -89;
        public static final byte UNKNOWN = 0;
        public static final byte UPLINK_STREAMING = -92;
        public static final byte VEHICULAR_COMMUNICATIONS = -91;
    }
}

package android.telephony.data;

public final class TrafficDescriptor implements android.os.Parcelable {
    public static final int CONNECTION_CAPABILITY_BACKGROUND = 168;
    public static final int CONNECTION_CAPABILITY_DOWNLINK_STREAMING = 163;
    public static final int CONNECTION_CAPABILITY_IMS = 1;
    public static final int CONNECTION_CAPABILITY_INTERNET = 8;
    public static final int CONNECTION_CAPABILITY_IOT_DELAY_TOLERANT = 161;
    public static final int CONNECTION_CAPABILITY_IOT_NON_DELAY_TOLERANT = 162;
    public static final int CONNECTION_CAPABILITY_LCS_USER_PLANE_POSITIONING = 16;
    public static final int CONNECTION_CAPABILITY_LOW_LATENCY_LOSS_TOLERANT_UNACK = 171;
    public static final int CONNECTION_CAPABILITY_MISSION_CRITICAL_COMMUNICATIONS = 169;
    public static final int CONNECTION_CAPABILITY_MMS = 2;
    public static final int CONNECTION_CAPABILITY_REAL_TIME_INTERACTIVE = 166;
    public static final int CONNECTION_CAPABILITY_SUPL = 4;
    public static final int CONNECTION_CAPABILITY_TIME_CRITICAL_COMMUNICATIONS = 170;
    public static final int CONNECTION_CAPABILITY_UNIFIED_COMMUNICATIONS = 167;
    public static final int CONNECTION_CAPABILITY_UNKNOWN = 0;
    public static final int CONNECTION_CAPABILITY_UPLINK_STREAMING = 164;
    public static final int CONNECTION_CAPABILITY_VEHICULAR_COMMUNICATIONS = 165;
    public static final android.os.Parcelable.Creator<android.telephony.data.TrafficDescriptor> CREATOR = null;
    private final int mConnectionCapability = 0;
    private final java.lang.String mDnn = null;
    private final android.telephony.data.TrafficDescriptor.OsAppId mOsAppId = null;
    private TrafficDescriptor(android.os.Parcel p0) {}
    public TrafficDescriptor(java.lang.String p0, byte[] p1) {}
    private TrafficDescriptor(java.lang.String p0, byte[] p1, int p2) {}
    private void enforceAllowedIds() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getConnectionCapability() { return 0; }
    public java.lang.String getDataNetworkName() { return null; }
    public byte[] getOsAppId() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mConnectionCapability;
        private java.lang.String mDnn;
        private byte[] mOsAppId;
        public Builder() {}
        public android.telephony.data.TrafficDescriptor build() { return null; }
        public android.telephony.data.TrafficDescriptor.Builder setConnectionCapability(int p0) { return null; }
        public android.telephony.data.TrafficDescriptor.Builder setDataNetworkName(java.lang.String p0) { return null; }
        public android.telephony.data.TrafficDescriptor.Builder setOsAppId(byte[] p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ConnectionCapability {
    }

    public static final class OsAppId {
        private static final java.util.Set<java.lang.String> ALLOWED_APP_IDS = null;
        public static final java.util.UUID ANDROID_OS_ID = null;
        private final java.lang.String mAppId = null;
        private final int mDifferentiator = 0;
        private final java.util.UUID mOsId = null;
        public OsAppId(java.util.UUID p0, java.lang.String p1) {}
        public OsAppId(java.util.UUID p0, java.lang.String p1, int p2) {}
        public OsAppId(byte[] p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getAppId() { return null; }
        public byte[] getBytes() { return null; }
        public int getDifferentiator() { return 0; }
        public java.util.UUID getOsId() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}

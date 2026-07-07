package android.telephony;

public final class PreciseDataConnectionState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.PreciseDataConnectionState> CREATOR = null;
    private static final long GET_DATA_CONNECTION_STATE_R_VERSION = 148535736L;
    public static final int NETWORK_VALIDATION_FAILURE = 4;
    public static final int NETWORK_VALIDATION_IN_PROGRESS = 2;
    public static final int NETWORK_VALIDATION_NOT_REQUESTED = 1;
    public static final int NETWORK_VALIDATION_SUCCESS = 3;
    public static final int NETWORK_VALIDATION_UNSUPPORTED = 0;
    private final android.telephony.data.ApnSetting mApnSetting = null;
    private final android.telephony.data.Qos mDefaultQos = null;
    private final int mFailCause = 0;
    private final int mId = 0;
    private final int mNetId = 0;
    private final int mNetworkType = 0;
    private final int mNetworkValidationStatus = 0;
    private final int mState = 0;
    private final int mTransportType = 0;
    private PreciseDataConnectionState(int p0, int p1, int p2, int p3, int p4, android.net.LinkProperties p5, int p6, android.telephony.data.ApnSetting p7, android.telephony.data.Qos p8, int p9) {}
    @java.lang.Deprecated
    public PreciseDataConnectionState(int p0, int p1, int p2, java.lang.String p3, android.net.LinkProperties p4, int p5) {}
    private PreciseDataConnectionState(android.os.Parcel p0) {}
    public static java.lang.String networkValidationStatusToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.data.ApnSetting getApnSetting() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.lang.String getDataConnectionApn() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public int getDataConnectionApnTypeBitMask() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public int getDataConnectionFailCause() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public int getDataConnectionState() { return 0; }
    public android.telephony.data.Qos getDefaultQos() { return null; }
    public int getId() { return 0; }
    public int getLastCauseCode() { return 0; }
    public android.net.LinkProperties getLinkProperties() { return null; }
    public int getNetId() { return 0; }
    public int getNetworkType() { return 0; }
    public int getNetworkValidationStatus() { return 0; }
    public int getState() { return 0; }
    public int getTransportType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.telephony.data.ApnSetting mApnSetting;
        private android.telephony.data.Qos mDefaultQos;
        private int mFailCause;
        private int mId;
        private int mNetworkAgentId;
        private int mNetworkType;
        private int mNetworkValidationStatus;
        private int mState;
        private int mTransportType;
        public Builder() {}
        public android.telephony.PreciseDataConnectionState build() { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setApnSetting(android.telephony.data.ApnSetting p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setDefaultQos(android.telephony.data.Qos p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setFailCause(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setId(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setLinkProperties(android.net.LinkProperties p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setNetworkAgentId(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setNetworkType(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setNetworkValidationStatus(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setState(int p0) { return null; }
        public android.telephony.PreciseDataConnectionState.Builder setTransportType(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkValidationStatus {
    }
}

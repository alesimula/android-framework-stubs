package android.telephony;

public final class NetworkRegistrationInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.NetworkRegistrationInfo> CREATOR = null;
    public static final int DOMAIN_CS = 1;
    public static final int DOMAIN_CS_PS = 3;
    public static final int DOMAIN_PS = 2;
    public static final int DOMAIN_UNKNOWN = 0;
    public static final int FIRST_SERVICE_TYPE = 1;
    public static final int LAST_SERVICE_TYPE = 7;
    public static final int NR_STATE_CONNECTED = 3;
    public static final int NR_STATE_NONE = 0;
    public static final int NR_STATE_NOT_RESTRICTED = 2;
    public static final int NR_STATE_RESTRICTED = 1;
    @android.annotation.SystemApi
    public static final int REGISTRATION_STATE_DENIED = 3;
    @android.annotation.SystemApi
    public static final int REGISTRATION_STATE_EMERGENCY = 6;
    @android.annotation.SystemApi
    public static final int REGISTRATION_STATE_HOME = 1;
    @android.annotation.SystemApi
    public static final int REGISTRATION_STATE_NOT_REGISTERED_OR_SEARCHING = 0;
    @android.annotation.SystemApi
    public static final int REGISTRATION_STATE_NOT_REGISTERED_SEARCHING = 2;
    @android.annotation.SystemApi
    public static final int REGISTRATION_STATE_ROAMING = 5;
    @android.annotation.SystemApi
    public static final int REGISTRATION_STATE_UNKNOWN = 4;
    public static final long RETURN_REGISTRATION_STATE_EMERGENCY = 255938466L;
    public static final int SERVICE_TYPE_DATA = 2;
    public static final int SERVICE_TYPE_EMERGENCY = 5;
    public static final int SERVICE_TYPE_EMERGENCY_SMS = 7;
    public static final int SERVICE_TYPE_MMS = 6;
    public static final int SERVICE_TYPE_SMS = 3;
    public static final int SERVICE_TYPE_UNKNOWN = 0;
    public static final int SERVICE_TYPE_VIDEO = 4;
    public static final int SERVICE_TYPE_VOICE = 1;
    private int mAccessNetworkTechnology;
    private java.util.ArrayList<java.lang.Integer> mAvailableServices;
    private android.telephony.CellIdentity mCellIdentity;
    private android.telephony.DataSpecificRegistrationInfo mDataSpecificInfo;
    private final int mDomain = 0;
    private final boolean mEmergencyOnly = false;
    private boolean mIsNonTerrestrialNetwork;
    private boolean mIsUsingCarrierAggregation;
    private final int mNetworkRegistrationState = 0;
    private int mNrState;
    private int mRegistrationState;
    private final int mRejectCause = 0;
    private int mRoamingType;
    private java.lang.String mRplmn;
    private int mSatelliteTech;
    private final int mTransportType = 0;
    private android.telephony.VoiceSpecificRegistrationInfo mVoiceSpecificInfo;
    public NetworkRegistrationInfo(int p0, int p1, int p2, int p3, int p4, boolean p5, java.util.List<java.lang.Integer> p6, android.telephony.CellIdentity p7, java.lang.String p8, int p9, boolean p10, boolean p11, boolean p12, android.telephony.VopsSupportInfo p13) {}
    private NetworkRegistrationInfo(int p0, int p1, int p2, int p3, int p4, boolean p5, java.util.List<java.lang.Integer> p6, android.telephony.CellIdentity p7, java.lang.String p8, android.telephony.VoiceSpecificRegistrationInfo p9, android.telephony.DataSpecificRegistrationInfo p10, boolean p11, int p12) {}
    public NetworkRegistrationInfo(int p0, int p1, int p2, int p3, int p4, boolean p5, java.util.List<java.lang.Integer> p6, android.telephony.CellIdentity p7, java.lang.String p8, boolean p9, int p10, int p11, int p12) {}
    private NetworkRegistrationInfo(android.os.Parcel p0) {}
    public NetworkRegistrationInfo(android.telephony.NetworkRegistrationInfo p0) {}
    private android.telephony.NetworkRegistrationInfo copy() { return null; }
    static java.lang.String domainToString(int p0) { return null; }
    public static java.lang.String isNonTerrestrialNetworkToString(boolean p0) { return null; }
    public static java.lang.String nrStateToString(int p0) { return null; }
    public static java.lang.String registrationStateToString(int p0) { return null; }
    public static java.lang.String satelliteTechnologyToString(int p0) { return null; }
    public static java.lang.String serviceTypeToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAccessNetworkTechnology() { return 0; }
    public java.util.List<java.lang.Integer> getAvailableServices() { return null; }
    public android.telephony.CellIdentity getCellIdentity() { return null; }
    @android.annotation.SystemApi
    public android.telephony.DataSpecificRegistrationInfo getDataSpecificInfo() { return null; }
    public int getDomain() { return 0; }
    @android.annotation.SystemApi
    public int getNetworkRegistrationState() { return 0; }
    public int getNrState() { return 0; }
    public java.lang.String getRegisteredPlmn() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public int getRegistrationState() { return 0; }
    public int getRejectCause() { return 0; }
    @android.annotation.SystemApi
    public int getRoamingType() { return 0; }
    @android.annotation.SystemApi
    public int getSatelliteTechnology() { return 0; }
    public int getTransportType() { return 0; }
    public android.telephony.VoiceSpecificRegistrationInfo getVoiceSpecificInfo() { return null; }
    public int hashCode() { return 0; }
    @android.annotation.SystemApi
    public boolean isEmergencyEnabled() { return false; }
    public boolean isInService() { return false; }
    public boolean isNetworkRegistered() { return false; }
    public boolean isNetworkRoaming() { return false; }
    public boolean isNetworkSearching() { return false; }
    public boolean isNonTerrestrialNetwork() { return false; }
    @java.lang.Deprecated
    public boolean isRegistered() { return false; }
    @java.lang.Deprecated
    public boolean isRoaming() { return false; }
    @java.lang.Deprecated
    public boolean isSearching() { return false; }
    public boolean isUsingCarrierAggregation() { return false; }
    public android.telephony.NetworkRegistrationInfo sanitizeLocationInfo() { return null; }
    public void setAccessNetworkTechnology(int p0) {}
    public void setAvailableServices(java.util.List<java.lang.Integer> p0) {}
    public void setIsNonTerrestrialNetwork(boolean p0) {}
    public void setIsUsingCarrierAggregation(boolean p0) {}
    public void setNrState(int p0) {}
    public void setRoamingType(int p0) {}
    public void setSatelliteTechnology(int p0) {}
    public java.lang.String toString() { return null; }
    public void updateNrState() {}
    @android.annotation.SystemApi
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private int mAccessNetworkTechnology;
        private java.util.List<java.lang.Integer> mAvailableServices;
        private android.telephony.CellIdentity mCellIdentity;
        private android.telephony.DataSpecificRegistrationInfo mDataSpecificRegistrationInfo;
        private int mDomain;
        private boolean mEmergencyOnly;
        private boolean mIsNonTerrestrialNetwork;
        private int mNetworkRegistrationState;
        private int mRejectCause;
        private java.lang.String mRplmn;
        private int mSatelliteTech;
        private int mTransportType;
        private android.telephony.VoiceSpecificRegistrationInfo mVoiceSpecificRegistrationInfo;
        public Builder() {}
        public Builder(android.telephony.NetworkRegistrationInfo p0) {}
        @android.annotation.SystemApi
        public android.telephony.NetworkRegistrationInfo build() { return null; }
        public android.telephony.NetworkRegistrationInfo.Builder setAccessNetworkTechnology(int p0) { return null; }
        @android.annotation.SystemApi
        public android.telephony.NetworkRegistrationInfo.Builder setAvailableServices(java.util.List<java.lang.Integer> p0) { return null; }
        @android.annotation.SystemApi
        public android.telephony.NetworkRegistrationInfo.Builder setCellIdentity(android.telephony.CellIdentity p0) { return null; }
        public android.telephony.NetworkRegistrationInfo.Builder setDataSpecificInfo(android.telephony.DataSpecificRegistrationInfo p0) { return null; }
        public android.telephony.NetworkRegistrationInfo.Builder setDomain(int p0) { return null; }
        @android.annotation.SystemApi
        public android.telephony.NetworkRegistrationInfo.Builder setEmergencyOnly(boolean p0) { return null; }
        public android.telephony.NetworkRegistrationInfo.Builder setIsNonTerrestrialNetwork(boolean p0) { return null; }
        public android.telephony.NetworkRegistrationInfo.Builder setRegisteredPlmn(java.lang.String p0) { return null; }
        public android.telephony.NetworkRegistrationInfo.Builder setRegistrationState(int p0) { return null; }
        public android.telephony.NetworkRegistrationInfo.Builder setRejectCause(int p0) { return null; }
        public android.telephony.NetworkRegistrationInfo.Builder setSatelliteTechnology(int p0) { return null; }
        public android.telephony.NetworkRegistrationInfo.Builder setTransportType(int p0) { return null; }
        public android.telephony.NetworkRegistrationInfo.Builder setVoiceSpecificInfo(android.telephony.VoiceSpecificRegistrationInfo p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Domain {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NRState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RegistrationState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ServiceType {
    }
}

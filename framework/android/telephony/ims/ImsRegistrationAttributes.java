package android.telephony.ims;

public final class ImsRegistrationAttributes implements android.os.Parcelable {
    public static final int ATTR_EPDG_OVER_CELL_INTERNET = 1;
    public static final int ATTR_REGISTRATION_TYPE_EMERGENCY = 2;
    public static final int ATTR_VIRTUAL_FOR_ANONYMOUS_EMERGENCY_CALL = 4;
    public static final android.os.Parcelable.Creator<android.telephony.ims.ImsRegistrationAttributes> CREATOR = null;
    private final java.util.ArrayList<java.lang.String> mFeatureTags = null;
    private final int mImsAttributeFlags = 0;
    private final java.lang.String mPcscfAddress = null;
    private final int mRegistrationTech = 0;
    private final android.telephony.ims.SipDetails mSipDetails = null;
    private final int mTransportType = 0;
    public ImsRegistrationAttributes(int p0, int p1, int p2, java.util.Set<java.lang.String> p3) {}
    public ImsRegistrationAttributes(int p0, int p1, int p2, java.util.Set<java.lang.String> p3, android.telephony.ims.SipDetails p4) {}
    public ImsRegistrationAttributes(int p0, int p1, int p2, java.util.Set<java.lang.String> p3, android.telephony.ims.SipDetails p4, java.lang.String p5) {}
    public ImsRegistrationAttributes(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAttributeFlags() { return 0; }
    public java.util.Set<java.lang.String> getFeatureTags() { return null; }
    public boolean getFlagRegistrationTypeEmergency() { return false; }
    public boolean getFlagVirtualRegistrationForEmergencyCall() { return false; }
    public java.lang.String getPcscfAddress() { return null; }
    @android.annotation.SystemApi
    public int getRegistrationTechnology() { return 0; }
    public android.telephony.ims.SipDetails getSipDetails() { return null; }
    public int getTransportType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private int mAttributeFlags;
        private java.util.Set<java.lang.String> mFeatureTags;
        private java.lang.String mPcscfAddress;
        private final int mRegistrationTech = 0;
        private android.telephony.ims.SipDetails mSipDetails;
        public Builder(int p0) {}
        public android.telephony.ims.ImsRegistrationAttributes build() { return null; }
        public android.telephony.ims.ImsRegistrationAttributes.Builder setFeatureTags(java.util.Set<java.lang.String> p0) { return null; }
        public android.telephony.ims.ImsRegistrationAttributes.Builder setFlagRegistrationTypeEmergency() { return null; }
        public android.telephony.ims.ImsRegistrationAttributes.Builder setFlagVirtualRegistrationForEmergencyCall() { return null; }
        public android.telephony.ims.ImsRegistrationAttributes.Builder setPcscfAddress(java.lang.String p0) { return null; }
        public android.telephony.ims.ImsRegistrationAttributes.Builder setSipDetails(android.telephony.ims.SipDetails p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ImsAttributeFlag {
    }
}

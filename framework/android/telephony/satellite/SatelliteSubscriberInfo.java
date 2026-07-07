package android.telephony.satellite;

@android.annotation.SystemApi
public final class SatelliteSubscriberInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteSubscriberInfo> CREATOR = null;
    public static final int SUBSCRIBER_ID_TYPE_ICCID = 0;
    public static final int SUBSCRIBER_ID_TYPE_IMSI_MSISDN = 1;
    private int mCarrierId;
    private java.lang.String mNiddApn;
    private java.lang.String mSubscriberId;
    private int mSubscriberIdType;
    private int mSubscriptionId;
    private SatelliteSubscriberInfo(android.os.Parcel p0) {}
    public SatelliteSubscriberInfo(android.telephony.satellite.SatelliteSubscriberInfo.Builder p0) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getCarrierId() { return 0; }
    public java.lang.String getNiddApn() { return null; }
    public java.lang.String getSubscriberId() { return null; }
    public int getSubscriberIdType() { return 0; }
    public int getSubscriptionId() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mCarrierId;
        private java.lang.String mNiddApn;
        private java.lang.String mSubscriberId;
        private int mSubscriberIdType;
        private int mSubscriptionId;
        public Builder() {}
        public android.telephony.satellite.SatelliteSubscriberInfo build() { return null; }
        public android.telephony.satellite.SatelliteSubscriberInfo.Builder setCarrierId(int p0) { return null; }
        public android.telephony.satellite.SatelliteSubscriberInfo.Builder setNiddApn(java.lang.String p0) { return null; }
        public android.telephony.satellite.SatelliteSubscriberInfo.Builder setSubscriberId(java.lang.String p0) { return null; }
        public android.telephony.satellite.SatelliteSubscriberInfo.Builder setSubscriberIdType(int p0) { return null; }
        public android.telephony.satellite.SatelliteSubscriberInfo.Builder setSubscriptionId(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubscriberIdType {
    }
}

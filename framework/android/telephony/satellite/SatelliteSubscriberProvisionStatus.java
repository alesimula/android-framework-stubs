package android.telephony.satellite;

@android.annotation.SystemApi
public final class SatelliteSubscriberProvisionStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteSubscriberProvisionStatus> CREATOR = null;
    private boolean mProvisioned;
    private android.telephony.satellite.SatelliteSubscriberInfo mSubscriberInfo;
    private SatelliteSubscriberProvisionStatus(android.os.Parcel p0) {}
    public SatelliteSubscriberProvisionStatus(android.telephony.satellite.SatelliteSubscriberProvisionStatus.Builder p0) {}
    private void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.satellite.SatelliteSubscriberInfo getSatelliteSubscriberInfo() { return null; }
    public int hashCode() { return 0; }
    public boolean isProvisioned() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mProvisioned;
        private android.telephony.satellite.SatelliteSubscriberInfo mSubscriberInfo;
        public Builder() {}
        public android.telephony.satellite.SatelliteSubscriberProvisionStatus build() { return null; }
        public android.telephony.satellite.SatelliteSubscriberProvisionStatus.Builder setProvisioned(boolean p0) { return null; }
        public android.telephony.satellite.SatelliteSubscriberProvisionStatus.Builder setSatelliteSubscriberInfo(android.telephony.satellite.SatelliteSubscriberInfo p0) { return null; }
    }
}

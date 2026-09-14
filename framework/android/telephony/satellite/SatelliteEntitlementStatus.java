package android.telephony.satellite;

public final class SatelliteEntitlementStatus implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteEntitlementStatus> CREATOR = null;
    private final int mDataMode = 0;
    private final boolean mEnabled = false;
    private final int mVoiceStatus = 0;
    private SatelliteEntitlementStatus(android.os.Parcel p0) {}
    private SatelliteEntitlementStatus(boolean p0, int p1, int p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getDataMode() { return 0; }
    public int getVoiceStatus() { return 0; }
    public int hashCode() { return 0; }
    public boolean isEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mDataMode;
        private boolean mEnabled;
        private int mVoiceStatus;
        public Builder() {}
        public android.telephony.satellite.SatelliteEntitlementStatus build() { return null; }
        public android.telephony.satellite.SatelliteEntitlementStatus.Builder setDataMode(int p0) { return null; }
        public android.telephony.satellite.SatelliteEntitlementStatus.Builder setEnabled(boolean p0) { return null; }
        public android.telephony.satellite.SatelliteEntitlementStatus.Builder setVoiceStatus(int p0) { return null; }
    }
}

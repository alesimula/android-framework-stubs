package android.telephony.satellite;

@android.annotation.SystemApi
public class EnableRequestAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.EnableRequestAttributes> CREATOR = null;
    private int mConnectType;
    private boolean mIsDemoMode;
    private boolean mIsEmergencyMode;
    private boolean mIsEnabled;
    private boolean mIsPrioritizedScanningRequired;
    private int mSatelliteEnablementRequestReason;
    private EnableRequestAttributes(android.os.Parcel p0) {}
    private EnableRequestAttributes(android.telephony.satellite.EnableRequestAttributes.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getConnectType() { return 0; }
    public int getSatelliteEnablementRequestReason() { return 0; }
    public int hashCode() { return 0; }
    public boolean isDemoMode() { return false; }
    public boolean isEmergencyMode() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isPrioritizedScanningRequired() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mConnectType;
        private boolean mIsDemoMode;
        private boolean mIsEmergencyMode;
        private boolean mIsEnabled;
        private boolean mIsPrioritizedScanningRequired;
        private int mSatelliteEnablementRequestReason;
        public Builder(boolean p0) {}
        private void validate(android.telephony.satellite.EnableRequestAttributes.Builder p0) {}
        public android.telephony.satellite.EnableRequestAttributes build() { return null; }
        public android.telephony.satellite.EnableRequestAttributes.Builder setConnectType(int p0) { return null; }
        public android.telephony.satellite.EnableRequestAttributes.Builder setDemoMode(boolean p0) { return null; }
        public android.telephony.satellite.EnableRequestAttributes.Builder setEmergencyMode(boolean p0) { return null; }
        public android.telephony.satellite.EnableRequestAttributes.Builder setPrioritizedScanningRequired(boolean p0) { return null; }
        public android.telephony.satellite.EnableRequestAttributes.Builder setSatelliteEnablementRequestReason(int p0) { return null; }
    }
}

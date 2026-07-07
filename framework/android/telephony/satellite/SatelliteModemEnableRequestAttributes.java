package android.telephony.satellite;

@android.annotation.SystemApi
public final class SatelliteModemEnableRequestAttributes implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.SatelliteModemEnableRequestAttributes> CREATOR = null;
    private final boolean mIsEnabled = false;
    private final boolean mIsForDemoMode = false;
    private final boolean mIsForEmergencyMode = false;
    private final android.telephony.satellite.SatelliteSubscriptionInfo mSatelliteSubscriptionInfo = null;
    private SatelliteModemEnableRequestAttributes(android.os.Parcel p0) {}
    public SatelliteModemEnableRequestAttributes(boolean p0, boolean p1, boolean p2, android.telephony.satellite.SatelliteSubscriptionInfo p3) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.satellite.SatelliteSubscriptionInfo getSatelliteSubscriptionInfo() { return null; }
    public int hashCode() { return 0; }
    public boolean isEnabled() { return false; }
    public boolean isForDemoMode() { return false; }
    public boolean isForEmergencyMode() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

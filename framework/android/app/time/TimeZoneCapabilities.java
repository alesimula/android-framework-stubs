package android.app.time;

@android.annotation.SystemApi
public final class TimeZoneCapabilities implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.TimeZoneCapabilities> CREATOR = null;
    private final int mConfigureAutoDetectionEnabledCapability = 0;
    private final int mConfigureGeoDetectionEnabledCapability = 0;
    private final int mConfigureNotificationsEnabledCapability = 0;
    private final int mConfigureTimeZoneOffsetChangeNotificationsEnabledCapability = 0;
    private final int mSetManualTimeZoneCapability = 0;
    private final boolean mUseLocationEnabled = false;
    private final android.os.UserHandle mUserHandle = null;
    private TimeZoneCapabilities(android.app.time.TimeZoneCapabilities.Builder p0) {}
    private static android.app.time.TimeZoneCapabilities createFromParcel(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getConfigureAutoDetectionEnabledCapability() { return 0; }
    public int getConfigureGeoDetectionEnabledCapability() { return 0; }
    public int getConfigureNotificationsEnabledCapability() { return 0; }
    public int getConfigureTimeZoneOffsetChangeNotificationsEnabledCapability() { return 0; }
    public int getSetManualTimeZoneCapability() { return 0; }
    public int hashCode() { return 0; }
    public boolean isUseLocationEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public android.app.time.TimeZoneConfiguration tryApplyConfigChanges(android.app.time.TimeZoneConfiguration p0, android.app.time.TimeZoneConfiguration p1) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private int mConfigureAutoDetectionEnabledCapability;
        private int mConfigureGeoDetectionEnabledCapability;
        private int mConfigureNotificationsEnabledCapability;
        private int mConfigureTimeZoneOffsetChangeNotificationsEnabledCapability;
        private int mSetManualTimeZoneCapability;
        private java.lang.Boolean mUseLocationEnabled;
        private android.os.UserHandle mUserHandle;
        public Builder(android.app.time.TimeZoneCapabilities p0) {}
        public Builder(android.os.UserHandle p0) {}
        private void verifyCapabilitySet(int p0, java.lang.String p1) {}
        public android.app.time.TimeZoneCapabilities build() { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setConfigureAutoDetectionEnabledCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setConfigureGeoDetectionEnabledCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setConfigureNotificationsEnabledCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setConfigureTimeZoneOffsetChangeNotificationsEnabledCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setSetManualTimeZoneCapability(int p0) { return null; }
        public android.app.time.TimeZoneCapabilities.Builder setUseLocationEnabled(boolean p0) { return null; }
    }
}

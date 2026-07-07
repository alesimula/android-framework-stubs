package android.app.admin;

@android.annotation.SystemApi
public final class FullyManagedDeviceProvisioningParams implements android.os.Parcelable {
    private static final java.lang.String CAN_DEVICE_OWNER_GRANT_SENSOR_PERMISSIONS_PARAM = "CAN_DEVICE_OWNER_GRANT_SENSOR_PERMISSIONS";
    public static final android.os.Parcelable.Creator<android.app.admin.FullyManagedDeviceProvisioningParams> CREATOR = null;
    private static final java.lang.String DEMO_DEVICE = "DEMO_DEVICE";
    private static final java.lang.String LEAVE_ALL_SYSTEM_APPS_ENABLED_PARAM = "LEAVE_ALL_SYSTEM_APPS_ENABLED";
    private static final java.lang.String LOCALE_PROVIDED_PARAM = "LOCALE_PROVIDED";
    private static final java.lang.String TIME_ZONE_PROVIDED_PARAM = "TIME_ZONE_PROVIDED";
    private final android.os.PersistableBundle mAdminExtras = null;
    private final boolean mDemoDevice = false;
    private final android.content.ComponentName mDeviceAdminComponentName = null;
    private final boolean mDeviceOwnerCanGrantSensorsPermissions = false;
    private final boolean mLeaveAllSystemAppsEnabled = false;
    private final long mLocalTime = 0L;
    private final java.util.Locale mLocale = null;
    private final java.lang.String mOwnerName = null;
    private final java.lang.String mTimeZone = null;
    private FullyManagedDeviceProvisioningParams(android.content.ComponentName p0, java.lang.String p1, boolean p2, java.lang.String p3, long p4, java.lang.String p5, boolean p6, android.os.PersistableBundle p7, boolean p8) {}
    private FullyManagedDeviceProvisioningParams(android.content.ComponentName p0, java.lang.String p1, boolean p2, java.lang.String p3, long p4, java.util.Locale p5, boolean p6, android.os.PersistableBundle p7, boolean p8) {}
    private static java.util.Locale getLocale(java.lang.String p0) { return null; }
    private void logParam(java.lang.String p0, java.lang.String p1, boolean p2) {}
    public boolean canDeviceOwnerGrantSensorsPermissions() { return false; }
    public int describeContents() { return 0; }
    public android.os.PersistableBundle getAdminExtras() { return null; }
    public android.content.ComponentName getDeviceAdminComponentName() { return null; }
    public long getLocalTime() { return 0L; }
    public java.util.Locale getLocale() { return null; }
    public java.lang.String getOwnerName() { return null; }
    public java.lang.String getTimeZone() { return null; }
    public boolean isDemoDevice() { return false; }
    public boolean isLeaveAllSystemAppsEnabled() { return false; }
    public void logParams(java.lang.String p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.os.PersistableBundle mAdminExtras;
        boolean mDemoDevice;
        private final android.content.ComponentName mDeviceAdminComponentName = null;
        boolean mDeviceOwnerCanGrantSensorsPermissions;
        private boolean mLeaveAllSystemAppsEnabled;
        private long mLocalTime;
        private java.util.Locale mLocale;
        private final java.lang.String mOwnerName = null;
        private java.lang.String mTimeZone;
        public Builder(android.content.ComponentName p0, java.lang.String p1) {}
        public android.app.admin.FullyManagedDeviceProvisioningParams build() { return null; }
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setAdminExtras(android.os.PersistableBundle p0) { return null; }
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setCanDeviceOwnerGrantSensorsPermissions(boolean p0) { return null; }
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setDemoDevice(boolean p0) { return null; }
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setLeaveAllSystemAppsEnabled(boolean p0) { return null; }
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setLocalTime(long p0) { return null; }
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setLocale(java.util.Locale p0) { return null; }
        public android.app.admin.FullyManagedDeviceProvisioningParams.Builder setTimeZone(java.lang.String p0) { return null; }
    }
}

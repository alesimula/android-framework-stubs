package android.security.authenticationpolicy;

public final class CrossDeviceAuthenticationSourceDeviceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo> CREATOR = null;
    private final boolean mIsAutomotive = false;
    private final boolean mIsDeviceLocked = false;
    private final boolean mIsDeviceSecure = false;
    private final boolean mIsPc = false;
    private final boolean mIsWatch = false;
    private final boolean mIsXrPeripheral = false;
    private final java.lang.String mPackageName = null;
    private final java.util.List<android.content.pm.Signature> mSignatures = null;
    private final java.time.Instant mTimestamp = null;
    private final byte[] mUuidBytes = null;
    private final boolean mWasCallingPackageInForeground = false;
    private CrossDeviceAuthenticationSourceDeviceInfo(android.os.Parcel p0) {}
    private CrossDeviceAuthenticationSourceDeviceInfo(byte[] p0, java.lang.String p1, java.util.List<android.content.pm.Signature> p2, boolean p3, java.time.Instant p4, boolean p5, boolean p6, boolean p7, boolean p8, boolean p9, boolean p10) {}
    public static byte[] getBytesFromUuid(java.util.UUID p0) { return null; }
    public static java.util.UUID getUuidFromBytes(byte[] p0) { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public java.util.List<android.content.pm.Signature> getSignatures() { return null; }
    public java.time.Instant getTimestamp() { return null; }
    public java.util.UUID getUuid() { return null; }
    public byte[] getUuidBytes() { return null; }
    public boolean isDeviceAutomotive() { return false; }
    public boolean isDeviceLocked() { return false; }
    public boolean isDevicePc() { return false; }
    public boolean isDeviceSecure() { return false; }
    public boolean isDeviceWatch() { return false; }
    public boolean isDeviceXrPeripheral() { return false; }
    public boolean wasCallingPackageInForeground() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mIsAutomotive;
        private boolean mIsDeviceLocked;
        private boolean mIsDeviceSecure;
        private boolean mIsPc;
        private boolean mIsWatch;
        private boolean mIsXrPeripheral;
        private java.lang.String mPackageName;
        private java.util.List<android.content.pm.Signature> mSignatures;
        private java.time.Instant mTimestamp;
        private final byte[] mUuid = null;
        private boolean mWasCallingPackageInForeground;
        public Builder(java.util.UUID p0) {}
        public Builder(byte[] p0) {}
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo build() { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDeviceAutomotive(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDeviceLocked(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDevicePc(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDeviceSecure(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDeviceWatch(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDeviceXrPeripheral(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setPackageName(java.lang.String p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setSignatures(java.util.List<android.content.pm.Signature> p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setTimestamp(java.time.Instant p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setWasCallingPackageInForeground(boolean p0) { return null; }
    }
}

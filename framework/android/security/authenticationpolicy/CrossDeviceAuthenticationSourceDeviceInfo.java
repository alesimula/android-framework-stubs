package android.security.authenticationpolicy;

public final class CrossDeviceAuthenticationSourceDeviceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo> CREATOR = null;
    private static final java.lang.String TAG = "CrossDeviceAuthenticationSourceDeviceInfo";
    private final java.util.List<java.lang.String> mCallingPackageAliases = null;
    private final boolean mCallingPackageIsInForeground = false;
    private final java.util.List<android.content.pm.Signature> mCurrentSignatures = null;
    private final boolean mIsAutomotive = false;
    private final boolean mIsDeviceLocked = false;
    private final boolean mIsDeviceSecure = false;
    private final boolean mIsPc = false;
    private final boolean mIsWatch = false;
    private final boolean mIsXrPeripheral = false;
    private final java.lang.String mPackageName = null;
    private final java.util.List<android.content.pm.Signature> mPastSignatures = null;
    private final java.util.List<java.lang.String> mRoles = null;
    private final int mSignatureSchemeVersion = 0;
    private final java.time.Instant mTimestamp = null;
    private final byte[] mUuidBytes = null;
    private CrossDeviceAuthenticationSourceDeviceInfo(android.os.Parcel p0) {}
    private CrossDeviceAuthenticationSourceDeviceInfo(byte[] p0, java.lang.String p1, java.util.List<android.content.pm.Signature> p2, java.util.List<android.content.pm.Signature> p3, int p4, java.util.List<java.lang.String> p5, java.util.List<java.lang.String> p6, boolean p7, java.time.Instant p8, boolean p9, boolean p10, boolean p11, boolean p12, boolean p13, boolean p14) {}
    public static byte[] getBytesFromUuid(java.util.UUID p0) { return null; }
    public static java.util.UUID getUuidFromBytes(byte[] p0) { return null; }
    public int describeContents() { return 0; }
    public java.util.List<java.lang.String> getCallingPackageAliases() { return null; }
    public java.util.List<android.content.pm.Signature> getCurrentSignatures() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.util.List<android.content.pm.Signature> getPastSignatures() { return null; }
    public java.util.List<java.lang.String> getRoles() { return null; }
    public int getSignatureSchemeVersion() { return 0; }
    public android.content.pm.SigningDetails getSigningDetails() { return null; }
    public java.time.Instant getTimestamp() { return null; }
    public java.util.UUID getUuid() { return null; }
    public byte[] getUuidBytes() { return null; }
    public boolean isCallingPackageInForeground() { return false; }
    public boolean isDeviceAutomotive() { return false; }
    public boolean isDeviceLocked() { return false; }
    public boolean isDevicePc() { return false; }
    public boolean isDeviceSecure() { return false; }
    public boolean isDeviceWatch() { return false; }
    public boolean isDeviceXrPeripheral() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<java.lang.String> mCallingPackageAliases;
        private boolean mCallingPackageIsInForeground;
        private java.util.List<android.content.pm.Signature> mCurrentSignatures;
        private boolean mIsAutomotive;
        private boolean mIsDeviceLocked;
        private boolean mIsDeviceSecure;
        private boolean mIsPc;
        private boolean mIsWatch;
        private boolean mIsXrPeripheral;
        private java.lang.String mPackageName;
        private java.util.List<android.content.pm.Signature> mPastSignatures;
        private java.util.List<java.lang.String> mRoles;
        private int mSignatureSchemeVersion;
        private java.time.Instant mTimestamp;
        private final byte[] mUuid = null;
        public Builder(java.util.UUID p0) {}
        public Builder(byte[] p0) {}
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo build() { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setCallingPackageAliases(java.util.List<java.lang.String> p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setCallingPackageInForeground(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setCurrentSignatures(java.util.List<android.content.pm.Signature> p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDeviceAutomotive(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDeviceLocked(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDevicePc(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDeviceSecure(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDeviceWatch(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setDeviceXrPeripheral(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setPackageName(java.lang.String p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setPastSignatures(java.util.List<android.content.pm.Signature> p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setRoles(java.util.List<java.lang.String> p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setSignatureSchemeVersion(int p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticationSourceDeviceInfo.Builder setTimestamp(java.time.Instant p0) { return null; }
    }
}

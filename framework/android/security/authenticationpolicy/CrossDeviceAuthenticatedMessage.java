package android.security.authenticationpolicy;

@android.annotation.SystemApi
public final class CrossDeviceAuthenticatedMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage> CREATOR = null;
    private final android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage mCallingPackage = null;
    private final boolean mCallingPackageIsInForeground = false;
    private final android.companion.DeviceId mDeviceId = null;
    private final boolean mIsDeviceLocked = false;
    private final boolean mIsDeviceSecure = false;
    private final java.time.Instant mTimestamp = null;
    private CrossDeviceAuthenticatedMessage(android.companion.DeviceId p0, boolean p1, boolean p2, java.time.Instant p3, android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage p4, boolean p5) {}
    private CrossDeviceAuthenticatedMessage(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage getCallingPackage() { return null; }
    public android.companion.DeviceId getSourceDeviceId() { return null; }
    public java.time.Instant getTimestamp() { return null; }
    public boolean isCallingPackageInForeground() { return false; }
    public boolean isDeviceLocked() { return false; }
    public boolean isDeviceSecure() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class CallingPackage implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage> CREATOR = null;
        public static final java.util.Set<java.lang.String> SUPPORTED_ROLES = null;
        private final java.lang.String mPackageName = null;
        private final java.util.Set<java.lang.String> mRoles = null;
        private final android.content.pm.SigningDetails mSigningDetails = null;
        private CallingPackage(android.os.Parcel p0) {}
        public CallingPackage(java.lang.String p0) {}
        public CallingPackage(java.lang.String p0, android.content.pm.SigningDetails p1) {}
        public CallingPackage(java.lang.String p0, android.content.pm.SigningDetails p1, java.util.Set<java.lang.String> p2) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String getPackageName() { return null; }
        public java.util.Set<java.lang.String> getRoles() { return null; }
        public android.content.pm.SigningDetails getSigningDetails() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Builder {
        private android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage mCallingPackage;
        private boolean mCallingPackageIsInForeground;
        private final android.companion.DeviceId mDeviceId = null;
        private boolean mIsDeviceLocked;
        private boolean mIsDeviceSecure;
        private java.time.Instant mTimestamp;
        public Builder(android.companion.DeviceId p0) {}
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage build() { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.Builder setCallingPackage(android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.Builder setCallingPackageInForeground(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.Builder setDeviceLocked(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.Builder setDeviceSecure(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.Builder setTimestamp(java.time.Instant p0) { return null; }
    }
}

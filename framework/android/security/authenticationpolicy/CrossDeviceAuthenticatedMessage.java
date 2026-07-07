package android.security.authenticationpolicy;

@android.annotation.SystemApi
public final class CrossDeviceAuthenticatedMessage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage> CREATOR = null;
    private final android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage mCallingPackage = null;
    private final boolean mCallingPackageWasInForeground = false;
    private final boolean mIsDeviceLocked = false;
    private final boolean mIsDeviceSecure = false;
    private final java.time.Instant mTimestamp = null;
    private CrossDeviceAuthenticatedMessage(android.os.Parcel p0) {}
    private CrossDeviceAuthenticatedMessage(boolean p0, boolean p1, java.time.Instant p2, android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage p3, boolean p4) {}
    public int describeContents() { return 0; }
    public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage getCallingPackage() { return null; }
    public java.time.Instant getTimestamp() { return null; }
    public boolean getWasCallingPackageInForeground() { return false; }
    public boolean isDeviceLocked() { return false; }
    public boolean isDeviceSecure() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage mCallingPackage;
        private boolean mCallingPackageWasInForeground;
        private boolean mIsDeviceLocked;
        private boolean mIsDeviceSecure;
        private java.time.Instant mTimestamp;
        public Builder() {}
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage build() { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.Builder setCallingPackage(android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.Builder setDeviceLocked(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.Builder setDeviceSecure(boolean p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.Builder setTimestamp(java.time.Instant p0) { return null; }
        public android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.Builder setWasCallingPackageInForeground(boolean p0) { return null; }
    }

    @android.annotation.SystemApi
    public static final class CallingPackage implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.security.authenticationpolicy.CrossDeviceAuthenticatedMessage.CallingPackage> CREATOR = null;
        private final java.lang.String mPackageName = null;
        private final java.util.List<android.content.pm.Signature> mSignatures = null;
        private CallingPackage(android.os.Parcel p0) {}
        public CallingPackage(java.lang.String p0, java.util.List<android.content.pm.Signature> p1) {}
        public int describeContents() { return 0; }
        public java.lang.String getPackageName() { return null; }
        public java.util.List<android.content.pm.Signature> getSignatures() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}

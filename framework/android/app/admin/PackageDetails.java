package android.app.admin;

public final class PackageDetails {
    public static final int INSTALLATION_SOURCE_CUSTOM = 4;
    public static final int INSTALLATION_SOURCE_PRIVILEGED_INSTALLER = 3;
    public static final int INSTALLATION_SOURCE_SYSTEM_APP_FACTORY = 1;
    public static final int INSTALLATION_SOURCE_SYSTEM_APP_UPDATED = 2;
    public static final int INSTALLATION_SOURCE_UNSPECIFIED = 0;
    public static final int USER_FACING_TYPE_NOT_USER_FACING = 2;
    public static final int USER_FACING_TYPE_UNSPECIFIED = 0;
    public static final int USER_FACING_TYPE_USER_FACING = 1;
    private final java.lang.String mDisplayName = null;
    private final int mInstallationSource = 0;
    private final java.lang.String mInstallerPackageName = null;
    private final java.lang.String mPackageName = null;
    private final java.util.List<java.lang.String> mSigningKeyCerts = null;
    private final int mUserFacingType = 0;
    private final long mVersionCode = 0L;
    private final java.lang.String mVersionName = null;
    private PackageDetails(android.app.admin.PackageDetails.Builder p0) {}
    public PackageDetails(android.app.admin.PackageDetailsTransport p0) {}
    public android.app.admin.PackageDetailsTransport createTransport() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getDisplayName() { return null; }
    public int getInstallationSource() { return 0; }
    public java.lang.String getInstallerPackageName() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.util.Collection<java.lang.String> getSigningKeyCerts() { return null; }
    public int getUserFacingType() { return 0; }
    public long getVersionCode() { return 0L; }
    public java.lang.String getVersionName() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private static final java.util.regex.Pattern SHA256_HEX_PATTERN = null;
        private java.lang.String mDisplayName;
        private int mInstallationSource;
        private java.lang.String mInstallerPackageName;
        private java.lang.String mPackageName;
        private java.util.List<java.lang.String> mSigningKeyCerts;
        private int mUserFacingType;
        private long mVersionCode;
        private java.lang.String mVersionName;
        public Builder(java.lang.String p0) {}
        public android.app.admin.PackageDetails build() { return null; }
        public android.app.admin.PackageDetails.Builder setDisplayName(java.lang.String p0) { return null; }
        public android.app.admin.PackageDetails.Builder setInstallationSource(int p0) { return null; }
        public android.app.admin.PackageDetails.Builder setInstallerPackageName(java.lang.String p0) { return null; }
        public android.app.admin.PackageDetails.Builder setSigningKeyCerts(java.util.Collection<java.lang.String> p0) { return null; }
        public android.app.admin.PackageDetails.Builder setUserFacingType(int p0) { return null; }
        public android.app.admin.PackageDetails.Builder setVersionCode(long p0) { return null; }
        public android.app.admin.PackageDetails.Builder setVersionName(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InstallationSource {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserFacingType {
    }
}

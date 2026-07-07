package android.content.integrity;

public final class AppInstallMetadata {
    private final java.util.Map<java.lang.String, java.lang.String> mAllowedInstallersAndCertificates = null;
    private final java.util.List<java.lang.String> mAppCertificateLineage = null;
    private final java.util.List<java.lang.String> mAppCertificates = null;
    private final java.util.List<java.lang.String> mInstallerCertificates = null;
    private final java.lang.String mInstallerName = null;
    private final boolean mIsPreInstalled = false;
    private final boolean mIsStampPresent = false;
    private final boolean mIsStampTrusted = false;
    private final boolean mIsStampVerified = false;
    private final java.lang.String mPackageName = null;
    private final java.lang.String mStampCertificateHash = null;
    private final long mVersionCode = 0L;
    private AppInstallMetadata(android.content.integrity.AppInstallMetadata.Builder p0) {}
    public java.util.Map<java.lang.String, java.lang.String> getAllowedInstallersAndCertificates() { return null; }
    public java.util.List<java.lang.String> getAppCertificateLineage() { return null; }
    public java.util.List<java.lang.String> getAppCertificates() { return null; }
    public java.util.List<java.lang.String> getInstallerCertificates() { return null; }
    public java.lang.String getInstallerName() { return null; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String getStampCertificateHash() { return null; }
    public long getVersionCode() { return 0L; }
    public boolean isPreInstalled() { return false; }
    public boolean isStampPresent() { return false; }
    public boolean isStampTrusted() { return false; }
    public boolean isStampVerified() { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private java.util.Map<java.lang.String, java.lang.String> mAllowedInstallersAndCertificates;
        private java.util.List<java.lang.String> mAppCertificateLineage;
        private java.util.List<java.lang.String> mAppCertificates;
        private java.util.List<java.lang.String> mInstallerCertificates;
        private java.lang.String mInstallerName;
        private boolean mIsPreInstalled;
        private boolean mIsStampPresent;
        private boolean mIsStampTrusted;
        private boolean mIsStampVerified;
        private java.lang.String mPackageName;
        private java.lang.String mStampCertificateHash;
        private long mVersionCode;
        public Builder() {}
        public android.content.integrity.AppInstallMetadata build() { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setAllowedInstallersAndCert(java.util.Map<java.lang.String, java.lang.String> p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setAppCertificateLineage(java.util.List<java.lang.String> p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setAppCertificates(java.util.List<java.lang.String> p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setInstallerCertificates(java.util.List<java.lang.String> p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setInstallerName(java.lang.String p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setIsPreInstalled(boolean p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setIsStampPresent(boolean p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setIsStampTrusted(boolean p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setIsStampVerified(boolean p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setPackageName(java.lang.String p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setStampCertificateHash(java.lang.String p0) { return null; }
        public android.content.integrity.AppInstallMetadata.Builder setVersionCode(long p0) { return null; }
    }
}

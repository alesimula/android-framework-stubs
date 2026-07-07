package android.security.identity;

@java.lang.Deprecated
public class AccessControlProfile {
    private android.security.identity.AccessControlProfileId mAccessControlProfileId;
    private java.security.cert.X509Certificate mReaderCertificate;
    private boolean mUserAuthenticationRequired;
    private long mUserAuthenticationTimeout;
    private AccessControlProfile() {}
    @java.lang.Deprecated
    android.security.identity.AccessControlProfileId getAccessControlProfileId() { return null; }
    @java.lang.Deprecated
    java.security.cert.X509Certificate getReaderCertificate() { return null; }
    @java.lang.Deprecated
    long getUserAuthenticationTimeout() { return 0L; }
    @java.lang.Deprecated
    boolean isUserAuthenticationRequired() { return false; }

    @java.lang.Deprecated
    public static final class Builder {
        private android.security.identity.AccessControlProfile mProfile;
        @java.lang.Deprecated
        public Builder(android.security.identity.AccessControlProfileId p0) {}
        @java.lang.Deprecated
        public android.security.identity.AccessControlProfile build() { return null; }
        @java.lang.Deprecated
        public android.security.identity.AccessControlProfile.Builder setReaderCertificate(java.security.cert.X509Certificate p0) { return null; }
        @java.lang.Deprecated
        public android.security.identity.AccessControlProfile.Builder setUserAuthenticationRequired(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.security.identity.AccessControlProfile.Builder setUserAuthenticationTimeout(long p0) { return null; }
    }
}

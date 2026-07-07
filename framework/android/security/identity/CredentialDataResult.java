package android.security.identity;

@java.lang.Deprecated
public abstract class CredentialDataResult {
    @java.lang.Deprecated
    protected CredentialDataResult() {}
    @java.lang.Deprecated
    public abstract byte[] getDeviceMac();
    @java.lang.Deprecated
    public abstract byte[] getDeviceNameSpaces();
    @java.lang.Deprecated
    public byte[] getDeviceSignature() { return null; }
    @java.lang.Deprecated
    public abstract android.security.identity.CredentialDataResult.Entries getDeviceSignedEntries();
    @java.lang.Deprecated
    public abstract android.security.identity.CredentialDataResult.Entries getIssuerSignedEntries();
    @java.lang.Deprecated
    public abstract byte[] getStaticAuthenticationData();

    @java.lang.Deprecated
    public static interface Entries {
        public static final int STATUS_NOT_IN_REQUEST_MESSAGE = 3;
        public static final int STATUS_NOT_REQUESTED = 2;
        public static final int STATUS_NO_ACCESS_CONTROL_PROFILES = 6;
        public static final int STATUS_NO_SUCH_ENTRY = 1;
        public static final int STATUS_OK = 0;
        public static final int STATUS_READER_AUTHENTICATION_FAILED = 5;
        public static final int STATUS_USER_AUTHENTICATION_FAILED = 4;
        @java.lang.Deprecated
        public byte[] getEntry(java.lang.String p0, java.lang.String p1);
        @java.lang.Deprecated
        public java.util.Collection<java.lang.String> getEntryNames(java.lang.String p0);
        @java.lang.Deprecated
        public java.util.Collection<java.lang.String> getNamespaces();
        @java.lang.Deprecated
        public java.util.Collection<java.lang.String> getRetrievedEntryNames(java.lang.String p0);
        @java.lang.Deprecated
        public int getStatus(java.lang.String p0, java.lang.String p1);

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Status {
        }
    }
}

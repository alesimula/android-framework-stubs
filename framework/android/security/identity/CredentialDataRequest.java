package android.security.identity;

@java.lang.Deprecated
public class CredentialDataRequest {
    boolean mAllowUsingExhaustedKeys;
    boolean mAllowUsingExpiredKeys;
    java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> mDeviceSignedEntriesToRequest;
    boolean mIncrementUseCount;
    java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> mIssuerSignedEntriesToRequest;
    byte[] mReaderSignature;
    byte[] mRequestMessage;
    CredentialDataRequest() {}
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> getDeviceSignedEntriesToRequest() { return null; }
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> getIssuerSignedEntriesToRequest() { return null; }
    @java.lang.Deprecated
    public byte[] getReaderSignature() { return null; }
    @java.lang.Deprecated
    public byte[] getRequestMessage() { return null; }
    @java.lang.Deprecated
    public boolean isAllowUsingExhaustedKeys() { return false; }
    @java.lang.Deprecated
    public boolean isAllowUsingExpiredKeys() { return false; }
    @java.lang.Deprecated
    public boolean isIncrementUseCount() { return false; }

    @java.lang.Deprecated
    public static final class Builder {
        private android.security.identity.CredentialDataRequest mData;
        @java.lang.Deprecated
        public Builder() {}
        @java.lang.Deprecated
        public android.security.identity.CredentialDataRequest build() { return null; }
        @java.lang.Deprecated
        public android.security.identity.CredentialDataRequest.Builder setAllowUsingExhaustedKeys(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.security.identity.CredentialDataRequest.Builder setAllowUsingExpiredKeys(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.security.identity.CredentialDataRequest.Builder setDeviceSignedEntriesToRequest(java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> p0) { return null; }
        @java.lang.Deprecated
        public android.security.identity.CredentialDataRequest.Builder setIncrementUseCount(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.security.identity.CredentialDataRequest.Builder setIssuerSignedEntriesToRequest(java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> p0) { return null; }
        @java.lang.Deprecated
        public android.security.identity.CredentialDataRequest.Builder setReaderSignature(byte[] p0) { return null; }
        @java.lang.Deprecated
        public android.security.identity.CredentialDataRequest.Builder setRequestMessage(byte[] p0) { return null; }
    }
}

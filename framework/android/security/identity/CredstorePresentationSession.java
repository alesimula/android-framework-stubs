package android.security.identity;

@java.lang.Deprecated
class CredstorePresentationSession extends android.security.identity.PresentationSession {
    private final android.security.identity.ISession mBinder = null;
    private final java.util.Map<java.lang.String, android.security.identity.CredstoreIdentityCredential> mCredentialCache = null;
    private java.security.KeyPair mEphemeralKeyPair;
    private final int mFeatureVersion = 0;
    private long mOperationHandle;
    private boolean mOperationHandleSet;
    private byte[] mSessionTranscript;
    CredstorePresentationSession(android.security.identity.ISession p0, int p1) { super(); }
    private void ensureEphemeralKeyPair() {}
    public android.security.identity.CredentialDataResult getCredentialData(java.lang.String p0, android.security.identity.CredentialDataRequest p1) throws android.security.identity.NoAuthenticationKeyAvailableException, android.security.identity.InvalidReaderSignatureException, android.security.identity.InvalidRequestMessageException, android.security.identity.EphemeralPublicKeyNotFoundException { return null; }
    @java.lang.Deprecated
    public long getCredstoreOperationHandle() { return 0L; }
    public java.security.KeyPair getEphemeralKeyPair() { return null; }
    public void setReaderEphemeralPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    public void setSessionTranscript(byte[] p0) {}
}

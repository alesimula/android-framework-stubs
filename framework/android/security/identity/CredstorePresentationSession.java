package android.security.identity;

@java.lang.Deprecated
class CredstorePresentationSession extends android.security.identity.PresentationSession {
    private static final java.lang.String TAG = "CredstorePresentationSession";
    private android.security.identity.ISession mBinder;
    private int mCipherSuite;
    private android.content.Context mContext;
    private java.util.Map<java.lang.String, android.security.identity.CredstoreIdentityCredential> mCredentialCache;
    private java.security.KeyPair mEphemeralKeyPair;
    private int mFeatureVersion;
    private long mOperationHandle;
    private boolean mOperationHandleSet;
    private byte[] mSessionTranscript;
    private android.security.identity.CredstoreIdentityCredentialStore mStore;
    CredstorePresentationSession(android.content.Context p0, int p1, android.security.identity.CredstoreIdentityCredentialStore p2, android.security.identity.ISession p3, int p4) { super(); }
    private void ensureEphemeralKeyPair() {}
    public android.security.identity.CredentialDataResult getCredentialData(java.lang.String p0, android.security.identity.CredentialDataRequest p1) throws android.security.identity.NoAuthenticationKeyAvailableException, android.security.identity.InvalidReaderSignatureException, android.security.identity.InvalidRequestMessageException, android.security.identity.EphemeralPublicKeyNotFoundException { return null; }
    @java.lang.Deprecated
    public long getCredstoreOperationHandle() { return 0L; }
    public java.security.KeyPair getEphemeralKeyPair() { return null; }
    public void setReaderEphemeralPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    public void setSessionTranscript(byte[] p0) {}
}

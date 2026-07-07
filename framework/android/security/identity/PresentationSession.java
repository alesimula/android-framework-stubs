package android.security.identity;

@java.lang.Deprecated
public abstract class PresentationSession {
    protected PresentationSession() {}
    @java.lang.Deprecated
    public abstract android.security.identity.CredentialDataResult getCredentialData(java.lang.String p0, android.security.identity.CredentialDataRequest p1) throws android.security.identity.NoAuthenticationKeyAvailableException, android.security.identity.InvalidReaderSignatureException, android.security.identity.InvalidRequestMessageException, android.security.identity.EphemeralPublicKeyNotFoundException;
    public abstract long getCredstoreOperationHandle();
    @java.lang.Deprecated
    public abstract java.security.KeyPair getEphemeralKeyPair();
    @java.lang.Deprecated
    public abstract void setReaderEphemeralPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException;
    @java.lang.Deprecated
    public abstract void setSessionTranscript(byte[] p0);
}

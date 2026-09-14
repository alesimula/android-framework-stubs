package android.security.identity;

@java.lang.Deprecated
class CredstoreIdentityCredential extends android.security.identity.IdentityCredential {
    private boolean mAllowUsingExhaustedKeys;
    private boolean mAllowUsingExpiredKeys;
    private final android.security.identity.ICredential mBinder = null;
    private int mEphemeralCounter;
    private java.security.KeyPair mEphemeralKeyPair;
    private final int mFeatureVersion = 0;
    private boolean mIncrementKeyUsageCount;
    private long mOperationHandle;
    private boolean mOperationHandleSet;
    private javax.crypto.SecretKey mReaderSecretKey;
    private int mReadersExpectedEphemeralCounter;
    private javax.crypto.SecretKey mSecretKey;
    CredstoreIdentityCredential(android.security.identity.ICredential p0, int p1) { super(); }
    private void ensureEphemeralKeyPair() {}
    public java.security.KeyPair createEphemeralKeyPair() { return null; }
    public byte[] decryptMessageFromReader(byte[] p0) throws android.security.identity.MessageDecryptionException { return null; }
    public byte[] delete(byte[] p0) { return null; }
    public byte[] encryptMessageToReader(byte[] p0) { return null; }
    public java.util.Collection<java.security.cert.X509Certificate> getAuthKeysNeedingCertification() { return null; }
    public int[] getAuthenticationDataUsageCount() { return null; }
    public java.util.List<android.security.identity.AuthenticationKeyMetadata> getAuthenticationKeyMetadata() { return null; }
    public java.util.Collection<java.security.cert.X509Certificate> getCredentialKeyCertificateChain() { return null; }
    @java.lang.Deprecated
    public long getCredstoreOperationHandle() { return 0L; }
    public android.security.identity.ResultData getEntries(byte[] p0, java.util.Map<java.lang.String, java.util.Collection<java.lang.String>> p1, byte[] p2, byte[] p3) throws android.security.identity.SessionTranscriptMismatchException, android.security.identity.NoAuthenticationKeyAvailableException, android.security.identity.InvalidReaderSignatureException, android.security.identity.EphemeralPublicKeyNotFoundException, android.security.identity.InvalidRequestMessageException { return null; }
    public byte[] proveOwnership(byte[] p0) { return null; }
    public void setAllowUsingExhaustedKeys(boolean p0) {}
    public void setAllowUsingExpiredKeys(boolean p0) {}
    public void setAvailableAuthenticationKeys(int p0, int p1) {}
    public void setAvailableAuthenticationKeys(int p0, int p1, long p2) {}
    public void setIncrementKeyUsageCount(boolean p0) {}
    public void setReaderEphemeralPublicKey(java.security.PublicKey p0) throws java.security.InvalidKeyException {}
    public void storeStaticAuthenticationData(java.security.cert.X509Certificate p0, java.time.Instant p1, byte[] p2) throws android.security.identity.UnknownAuthenticationKeyException {}
    public void storeStaticAuthenticationData(java.security.cert.X509Certificate p0, byte[] p1) throws android.security.identity.UnknownAuthenticationKeyException {}
    public byte[] update(android.security.identity.PersonalizationData p0) { return null; }
}

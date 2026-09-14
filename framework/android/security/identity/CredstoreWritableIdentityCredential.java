package android.security.identity;

@java.lang.Deprecated
class CredstoreWritableIdentityCredential extends android.security.identity.WritableIdentityCredential {
    private final android.security.identity.IWritableCredential mBinder = null;
    CredstoreWritableIdentityCredential(android.security.identity.IWritableCredential p0) { super(); }
    private static long getRootSid() { return 0L; }
    static byte[] personalize(android.security.identity.IWritableCredential p0, android.security.identity.PersonalizationData p1) { return null; }
    public java.util.Collection<java.security.cert.X509Certificate> getCredentialKeyCertificateChain(byte[] p0) { return null; }
    public byte[] personalize(android.security.identity.PersonalizationData p0) { return null; }
}

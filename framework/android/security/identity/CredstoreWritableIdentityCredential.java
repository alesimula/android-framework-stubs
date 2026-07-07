package android.security.identity;

@java.lang.Deprecated
class CredstoreWritableIdentityCredential extends android.security.identity.WritableIdentityCredential {
    private static final java.lang.String TAG = "CredstoreWritableIdentityCredential";
    private android.security.identity.IWritableCredential mBinder;
    private android.content.Context mContext;
    private java.lang.String mCredentialName;
    private java.lang.String mDocType;
    CredstoreWritableIdentityCredential(android.content.Context p0, java.lang.String p1, java.lang.String p2, android.security.identity.IWritableCredential p3) { super(); }
    private static long getRootSid() { return 0L; }
    static byte[] personalize(android.security.identity.IWritableCredential p0, android.security.identity.PersonalizationData p1) { return null; }
    public java.util.Collection<java.security.cert.X509Certificate> getCredentialKeyCertificateChain(byte[] p0) { return null; }
    public byte[] personalize(android.security.identity.PersonalizationData p0) { return null; }
}

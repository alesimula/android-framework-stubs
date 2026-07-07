package android.security.identity;

@java.lang.Deprecated
public abstract class WritableIdentityCredential {
    protected WritableIdentityCredential() {}
    @java.lang.Deprecated
    public abstract java.util.Collection<java.security.cert.X509Certificate> getCredentialKeyCertificateChain(byte[] p0);
    @java.lang.Deprecated
    public abstract byte[] personalize(android.security.identity.PersonalizationData p0);
}

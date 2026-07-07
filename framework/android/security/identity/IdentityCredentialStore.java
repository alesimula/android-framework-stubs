package android.security.identity;

@java.lang.Deprecated
public abstract class IdentityCredentialStore {
    @java.lang.Deprecated
    public static final int CIPHERSUITE_ECDHE_HKDF_ECDSA_WITH_AES_256_GCM_SHA256 = 1;
    IdentityCredentialStore() {}
    @java.lang.Deprecated
    public static android.security.identity.IdentityCredentialStore getDirectAccessInstance(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public static android.security.identity.IdentityCredentialStore getInstance(android.content.Context p0) { return null; }
    @java.lang.Deprecated
    public abstract android.security.identity.WritableIdentityCredential createCredential(java.lang.String p0, java.lang.String p1) throws android.security.identity.AlreadyPersonalizedException, android.security.identity.DocTypeNotSupportedException;
    @java.lang.Deprecated
    public android.security.identity.PresentationSession createPresentationSession(int p0) throws android.security.identity.CipherSuiteNotSupportedException { return null; }
    @java.lang.Deprecated
    public abstract byte[] deleteCredentialByName(java.lang.String p0);
    @java.lang.Deprecated
    public abstract android.security.identity.IdentityCredential getCredentialByName(java.lang.String p0, int p1) throws android.security.identity.CipherSuiteNotSupportedException;
    @java.lang.Deprecated
    public abstract java.lang.String[] getSupportedDocTypes();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Ciphersuite {
    }
}

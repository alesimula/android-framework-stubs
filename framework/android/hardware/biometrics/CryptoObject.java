package android.hardware.biometrics;

public class CryptoObject {
    private final java.lang.Object mCrypto = null;
    public CryptoObject(long p0) {}
    @java.lang.Deprecated
    public CryptoObject(android.security.identity.IdentityCredential p0) {}
    public CryptoObject(android.security.identity.PresentationSession p0) {}
    public CryptoObject(java.security.Signature p0) {}
    public CryptoObject(javax.crypto.Cipher p0) {}
    public CryptoObject(javax.crypto.KeyAgreement p0) {}
    public CryptoObject(javax.crypto.Mac p0) {}
    public javax.crypto.Cipher getCipher() { return null; }
    @java.lang.Deprecated
    public android.security.identity.IdentityCredential getIdentityCredential() { return null; }
    public javax.crypto.KeyAgreement getKeyAgreement() { return null; }
    public javax.crypto.Mac getMac() { return null; }
    public long getOpId() { return 0L; }
    public android.security.identity.PresentationSession getPresentationSession() { return null; }
    public java.security.Signature getSignature() { return null; }
}

package com.android.internal.org.bouncycastle.jce.provider;

public final class BouncyCastleProvider extends java.security.Provider implements com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider {
    private static final java.lang.String[] ASYMMETRIC_CIPHERS = null;
    private static final java.lang.String[] ASYMMETRIC_GENERIC = null;
    private static final java.lang.String ASYMMETRIC_PACKAGE = "com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.";
    public static final com.android.internal.org.bouncycastle.jcajce.provider.config.ProviderConfiguration CONFIGURATION = null;
    private static final java.lang.String[] DIGESTS = null;
    private static final java.lang.String DIGEST_PACKAGE = "com.android.internal.org.bouncycastle.jcajce.provider.digest.";
    private static final java.lang.String[] KEYSTORES = null;
    private static final java.lang.String KEYSTORE_PACKAGE = "com.android.internal.org.bouncycastle.jcajce.provider.keystore.";
    private static final java.util.logging.Logger LOG = null;
    public static final java.lang.String PROVIDER_NAME = "BC";
    private static final com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties[] SYMMETRIC_CIPHERS = null;
    private static final java.lang.String[] SYMMETRIC_GENERIC = null;
    private static final java.lang.String[] SYMMETRIC_MACS = null;
    private static final java.lang.String SYMMETRIC_PACKAGE = "com.android.internal.org.bouncycastle.jcajce.provider.symmetric.";
    private static java.lang.String info;
    private static final java.util.Map keyInfoConverters = null;
    private static final java.lang.Class revChkClass = null;
    private final java.security.Provider privateProvider = null;
    private java.util.Map<java.lang.String, java.security.Provider.Service> serviceMap;
    public BouncyCastleProvider() { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null); }
    private static com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getAsymmetricKeyInfoConverter(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public static java.security.PrivateKey getPrivateKey(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException { return null; }
    public static java.security.PublicKey getPublicKey(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws java.io.IOException { return null; }
    private void loadAlgorithms(java.lang.String p0, com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties[] p1) {}
    private void loadAlgorithms(java.lang.String p0, java.lang.String[] p1) {}
    private void loadServiceClass(java.lang.String p0, java.lang.String p1) {}
    private static com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties service(java.lang.String p0, int p1) { return null; }
    private void setup() {}
    public void addAlgorithm(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2) {}
    public void addAlgorithm(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2, java.util.Map<java.lang.String, java.lang.String> p3) {}
    public void addAlgorithm(java.lang.String p0, java.lang.String p1) {}
    public void addAlgorithm(java.lang.String p0, java.lang.String p1, java.util.Map<java.lang.String, java.lang.String> p2) {}
    public void addAttributes(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) {}
    public void addKeyInfoConverter(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter p1) {}
    public void addPrivateAlgorithm(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, java.lang.String p2) {}
    public void addPrivateAlgorithm(java.lang.String p0, java.lang.String p1) {}
    public com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter getKeyInfoConverter(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.security.Provider getPrivateProvider() { return null; }
    public boolean hasAlgorithm(java.lang.String p0, java.lang.String p1) { return false; }
    public void setParameter(java.lang.String p0, java.lang.Object p1) {}

    private static class JcaCryptoService implements com.android.internal.org.bouncycastle.crypto.CryptoServiceProperties {
        private final int bitsOfSecurity = 0;
        private final java.lang.String name = null;
        JcaCryptoService(java.lang.String p0, int p1) {}
        public int bitsOfSecurity() { return 0; }
        public java.lang.Object getParams() { return null; }
        public com.android.internal.org.bouncycastle.crypto.CryptoServicePurpose getPurpose() { return null; }
        public java.lang.String getServiceName() { return null; }
    }

    private static final class PrivateProvider extends java.security.Provider {
        public PrivateProvider() { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null); }
    }
}

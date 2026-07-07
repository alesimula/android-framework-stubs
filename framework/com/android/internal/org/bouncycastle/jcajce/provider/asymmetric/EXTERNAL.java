package com.android.internal.org.bouncycastle.jcajce.provider.asymmetric;

public class EXTERNAL {
    private static final java.lang.String PREFIX = "com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.EXTERNAL";
    private static com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter baseConverter;
    private static final java.util.Map<java.lang.String, java.lang.String> externalAttributes = null;
    public EXTERNAL() {}

    private static class ExternalKeyInfoConverter implements com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter {
        private final com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider provider = null;
        public ExternalKeyInfoConverter(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
        public java.security.PrivateKey generatePrivate(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException { return null; }
        public java.security.PublicKey generatePublic(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws java.io.IOException { return null; }
    }

    public static class KeyFactory extends com.android.internal.org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi {
        public KeyFactory() { super(); }
        protected java.security.Key engineTranslateKey(java.security.Key p0) throws java.security.InvalidKeyException { return null; }
        public java.security.PrivateKey generatePrivate(com.android.internal.org.bouncycastle.asn1.pkcs.PrivateKeyInfo p0) throws java.io.IOException { return null; }
        public java.security.PublicKey generatePublic(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws java.io.IOException { return null; }
    }

    public static class Mappings extends com.android.internal.org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider {
        public Mappings() { super(); }
        public void configure(com.android.internal.org.bouncycastle.jcajce.provider.config.ConfigurableProvider p0) {}
    }
}

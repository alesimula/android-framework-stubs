package com.android.internal.org.bouncycastle.operator.jcajce;

public class JcaContentVerifierProviderBuilder {
    private com.android.internal.org.bouncycastle.operator.jcajce.OperatorHelper helper;
    public JcaContentVerifierProviderBuilder() {}
    private com.android.internal.org.bouncycastle.operator.ContentVerifier createCompositeVerifier(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, java.security.PublicKey p1) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    private java.security.Signature createRawSig(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, java.security.PublicKey p1) { return null; }
    private java.security.Signature createSignature(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, java.security.PublicKey p1) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.operator.ContentVerifierProvider build(com.android.internal.org.bouncycastle.asn1.x509.SubjectPublicKeyInfo p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.operator.ContentVerifierProvider build(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException, java.security.cert.CertificateException { return null; }
    public com.android.internal.org.bouncycastle.operator.ContentVerifierProvider build(java.security.PublicKey p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.operator.ContentVerifierProvider build(java.security.cert.X509Certificate p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder setProvider(java.lang.String p0) { return null; }
    public com.android.internal.org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder setProvider(java.security.Provider p0) { return null; }

    private static class CompositeVerifier implements com.android.internal.org.bouncycastle.operator.ContentVerifier {
        private java.security.Signature[] sigs;
        private java.io.OutputStream stream;
        public CompositeVerifier(java.security.Signature[] p0) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException {}
        public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() { return null; }
        public java.io.OutputStream getOutputStream() { return null; }
        public boolean verify(byte[] p0) { return false; }
    }

    private static class RawSigVerifier extends com.android.internal.org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder.SigVerifier implements com.android.internal.org.bouncycastle.operator.RawContentVerifier {
        private java.security.Signature rawSignature;
        RawSigVerifier(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, java.security.Signature p1, java.security.Signature p2) { super(null, null); }
        public boolean verify(byte[] p0) { return false; }
        public boolean verify(byte[] p0, byte[] p1) { return false; }
    }

    private static class SigVerifier implements com.android.internal.org.bouncycastle.operator.ContentVerifier {
        private final com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithm = null;
        private final java.security.Signature signature = null;
        protected final java.io.OutputStream stream = null;
        SigVerifier(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, java.security.Signature p1) {}
        public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() { return null; }
        public java.io.OutputStream getOutputStream() { return null; }
        public boolean verify(byte[] p0) { return false; }
    }
}

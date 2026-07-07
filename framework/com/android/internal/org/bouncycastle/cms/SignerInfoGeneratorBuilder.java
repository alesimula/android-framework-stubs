package com.android.internal.org.bouncycastle.cms;

public class SignerInfoGeneratorBuilder {
    private com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier contentDigest;
    private final com.android.internal.org.bouncycastle.operator.DigestAlgorithmIdentifierFinder digAlgFinder = null;
    private com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider digestProvider;
    private boolean directSignature;
    private com.android.internal.org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder sigEncAlgFinder;
    private com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator signedGen;
    private com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator unsignedGen;
    public SignerInfoGeneratorBuilder(com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider p0) {}
    public SignerInfoGeneratorBuilder(com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider p0, com.android.internal.org.bouncycastle.cms.CMSSignatureEncryptionAlgorithmFinder p1) {}
    private com.android.internal.org.bouncycastle.cms.SignerInfoGenerator createGenerator(com.android.internal.org.bouncycastle.operator.ContentSigner p0, com.android.internal.org.bouncycastle.asn1.cms.SignerIdentifier p1) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInfoGenerator build(com.android.internal.org.bouncycastle.operator.ContentSigner p0, com.android.internal.org.bouncycastle.cert.X509CertificateHolder p1) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInfoGenerator build(com.android.internal.org.bouncycastle.operator.ContentSigner p0, byte[] p1) throws com.android.internal.org.bouncycastle.operator.OperatorCreationException { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInfoGeneratorBuilder setContentDigest(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0) { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInfoGeneratorBuilder setDirectSignature(boolean p0) { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInfoGeneratorBuilder setSignedAttributeGenerator(com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator p0) { return null; }
    public com.android.internal.org.bouncycastle.cms.SignerInfoGeneratorBuilder setUnsignedAttributeGenerator(com.android.internal.org.bouncycastle.cms.CMSAttributeTableGenerator p0) { return null; }
}

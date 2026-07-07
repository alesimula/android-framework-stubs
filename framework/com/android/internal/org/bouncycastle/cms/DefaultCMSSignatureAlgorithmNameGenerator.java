package com.android.internal.org.bouncycastle.cms;

public class DefaultCMSSignatureAlgorithmNameGenerator implements com.android.internal.org.bouncycastle.cms.CMSSignatureAlgorithmNameGenerator {
    private final java.util.Map digestAlgs = null;
    private final java.util.Map encryptionAlgs = null;
    private final java.util.Map simpleAlgs = null;
    public DefaultCMSSignatureAlgorithmNameGenerator() {}
    private void addEntries(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1, java.lang.String p2) {}
    private java.lang.String getDigestAlgName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    private java.lang.String getEncryptionAlgName(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0) { return null; }
    public java.lang.String getSignatureName(com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p0, com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier p1) { return null; }
    protected void setSigningDigestAlgorithmMapping(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1) {}
    protected void setSigningEncryptionAlgorithmMapping(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1) {}
}

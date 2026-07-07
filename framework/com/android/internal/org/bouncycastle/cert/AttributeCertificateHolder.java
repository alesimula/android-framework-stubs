package com.android.internal.org.bouncycastle.cert;

public class AttributeCertificateHolder implements com.android.internal.org.bouncycastle.util.Selector {
    private static com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider digestCalculatorProvider;
    final com.android.internal.org.bouncycastle.asn1.x509.Holder holder = null;
    public AttributeCertificateHolder(int p0, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p1, com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p2, byte[] p3) {}
    AttributeCertificateHolder(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) {}
    public AttributeCertificateHolder(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) {}
    public AttributeCertificateHolder(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, java.math.BigInteger p1) {}
    public AttributeCertificateHolder(com.android.internal.org.bouncycastle.cert.X509CertificateHolder p0) {}
    private com.android.internal.org.bouncycastle.asn1.x509.GeneralNames generateGeneralNames(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) { return null; }
    private com.android.internal.org.bouncycastle.asn1.x500.X500Name[] getPrincipals(com.android.internal.org.bouncycastle.asn1.x509.GeneralName[] p0) { return null; }
    private boolean matchesDN(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, com.android.internal.org.bouncycastle.asn1.x509.GeneralNames p1) { return false; }
    public static void setDigestCalculatorProvider(com.android.internal.org.bouncycastle.operator.DigestCalculatorProvider p0) {}
    public java.lang.Object clone() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() { return null; }
    public int getDigestedObjectType() { return 0; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name[] getEntityNames() { return null; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name[] getIssuer() { return null; }
    public byte[] getObjectDigest() { return null; }
    public com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier getOtherObjectTypeID() { return null; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public int hashCode() { return 0; }
    public boolean match(java.lang.Object p0) { return false; }
}

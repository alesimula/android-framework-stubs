package com.android.internal.org.bouncycastle.openssl;

public class CertificateTrustBlock {
    private java.lang.String alias;
    private com.android.internal.org.bouncycastle.asn1.ASN1Sequence prohibitions;
    private com.android.internal.org.bouncycastle.asn1.ASN1Sequence uses;
    public CertificateTrustBlock(java.lang.String p0, java.util.Set<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> p1) {}
    public CertificateTrustBlock(java.lang.String p0, java.util.Set<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> p1, java.util.Set<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> p2) {}
    public CertificateTrustBlock(java.util.Set<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> p0) {}
    CertificateTrustBlock(byte[] p0) {}
    private com.android.internal.org.bouncycastle.asn1.ASN1Sequence toSequence(java.util.Set<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> p0) { return null; }
    private java.util.Set<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> toSet(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) { return null; }
    public java.lang.String getAlias() { return null; }
    public java.util.Set<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> getProhibitions() { return null; }
    public java.util.Set<com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier> getUses() { return null; }
    com.android.internal.org.bouncycastle.asn1.ASN1Sequence toASN1Sequence() { return null; }
}

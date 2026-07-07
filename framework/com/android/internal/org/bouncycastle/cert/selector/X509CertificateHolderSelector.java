package com.android.internal.org.bouncycastle.cert.selector;

public class X509CertificateHolderSelector implements com.android.internal.org.bouncycastle.util.Selector {
    private com.android.internal.org.bouncycastle.asn1.x500.X500Name issuer;
    private java.math.BigInteger serialNumber;
    private byte[] subjectKeyId;
    public X509CertificateHolderSelector(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, java.math.BigInteger p1) {}
    public X509CertificateHolderSelector(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, java.math.BigInteger p1, byte[] p2) {}
    public X509CertificateHolderSelector(byte[] p0) {}
    private boolean equalsObj(java.lang.Object p0, java.lang.Object p1) { return false; }
    public java.lang.Object clone() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public com.android.internal.org.bouncycastle.asn1.x500.X500Name getIssuer() { return null; }
    public java.math.BigInteger getSerialNumber() { return null; }
    public byte[] getSubjectKeyIdentifier() { return null; }
    public int hashCode() { return 0; }
    public boolean match(java.lang.Object p0) { return false; }
}

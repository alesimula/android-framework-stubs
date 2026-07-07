package com.android.internal.org.bouncycastle.x509;

public class X509CRLStoreSelector extends java.security.cert.X509CRLSelector implements com.android.internal.org.bouncycastle.util.Selector {
    private com.android.internal.org.bouncycastle.x509.X509AttributeCertificate attrCertChecking;
    private boolean completeCRLEnabled;
    private boolean deltaCRLIndicator;
    private byte[] issuingDistributionPoint;
    private boolean issuingDistributionPointEnabled;
    private java.math.BigInteger maxBaseCRLNumber;
    public X509CRLStoreSelector() { super(); }
    public static com.android.internal.org.bouncycastle.x509.X509CRLStoreSelector getInstance(java.security.cert.X509CRLSelector p0) { return null; }
    public java.lang.Object clone() { return null; }
    public com.android.internal.org.bouncycastle.x509.X509AttributeCertificate getAttrCertificateChecking() { return null; }
    public byte[] getIssuingDistributionPoint() { return null; }
    public java.math.BigInteger getMaxBaseCRLNumber() { return null; }
    public boolean isCompleteCRLEnabled() { return false; }
    public boolean isDeltaCRLIndicatorEnabled() { return false; }
    public boolean isIssuingDistributionPointEnabled() { return false; }
    public boolean match(java.lang.Object p0) { return false; }
    public boolean match(java.security.cert.CRL p0) { return false; }
    public void setAttrCertificateChecking(com.android.internal.org.bouncycastle.x509.X509AttributeCertificate p0) {}
    public void setCompleteCRLEnabled(boolean p0) {}
    public void setDeltaCRLIndicatorEnabled(boolean p0) {}
    public void setIssuingDistributionPoint(byte[] p0) {}
    public void setIssuingDistributionPointEnabled(boolean p0) {}
    public void setMaxBaseCRLNumber(java.math.BigInteger p0) {}
}

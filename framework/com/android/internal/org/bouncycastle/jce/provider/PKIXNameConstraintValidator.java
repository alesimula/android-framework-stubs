package com.android.internal.org.bouncycastle.jce.provider;

public class PKIXNameConstraintValidator {
    com.android.internal.org.bouncycastle.asn1.x509.PKIXNameConstraintValidator validator;
    public PKIXNameConstraintValidator() {}
    public void addExcludedSubtree(com.android.internal.org.bouncycastle.asn1.x509.GeneralSubtree p0) {}
    public void checkExcluded(com.android.internal.org.bouncycastle.asn1.x509.GeneralName p0) throws com.android.internal.org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException {}
    public void checkExcludedDN(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) throws com.android.internal.org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException {}
    public void checkPermitted(com.android.internal.org.bouncycastle.asn1.x509.GeneralName p0) throws com.android.internal.org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException {}
    public void checkPermittedDN(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0) throws com.android.internal.org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void intersectEmptyPermittedSubtree(int p0) {}
    public void intersectPermittedSubtree(com.android.internal.org.bouncycastle.asn1.x509.GeneralSubtree p0) {}
    public void intersectPermittedSubtree(com.android.internal.org.bouncycastle.asn1.x509.GeneralSubtree[] p0) {}
    public java.lang.String toString() { return null; }
}

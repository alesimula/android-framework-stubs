package com.android.internal.org.bouncycastle.asn1.x509;

public class PKIXNameConstraintValidator implements com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidator {
    private java.util.Set excludedSubtreesDN;
    private java.util.Set excludedSubtreesDNS;
    private java.util.Set excludedSubtreesEmail;
    private java.util.Set excludedSubtreesIP;
    private java.util.Set excludedSubtreesOtherName;
    private java.util.Set excludedSubtreesURI;
    private java.util.Set permittedSubtreesDN;
    private java.util.Set permittedSubtreesDNS;
    private java.util.Set permittedSubtreesEmail;
    private java.util.Set permittedSubtreesIP;
    private java.util.Set permittedSubtreesOtherName;
    private java.util.Set permittedSubtreesURI;
    public PKIXNameConstraintValidator() {}
    private final void addLine(java.lang.StringBuilder p0, java.lang.String p1) {}
    private void checkExcludedDN(java.util.Set p0, com.android.internal.org.bouncycastle.asn1.ASN1Sequence p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkExcludedDNS(java.util.Set p0, java.lang.String p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkExcludedEmail(java.util.Set p0, java.lang.String p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkExcludedIP(java.util.Set p0, byte[] p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkExcludedOtherName(java.util.Set p0, com.android.internal.org.bouncycastle.asn1.x509.OtherName p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkExcludedURI(java.util.Set p0, java.lang.String p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkPermittedDN(java.util.Set p0, com.android.internal.org.bouncycastle.asn1.ASN1Sequence p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkPermittedDNS(java.util.Set p0, java.lang.String p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkPermittedEmail(java.util.Set p0, java.lang.String p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkPermittedIP(java.util.Set p0, byte[] p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkPermittedOtherName(java.util.Set p0, com.android.internal.org.bouncycastle.asn1.x509.OtherName p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private void checkPermittedURI(java.util.Set p0, java.lang.String p1) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    private boolean collectionsAreEqual(java.util.Collection p0, java.util.Collection p1) { return false; }
    private static int compareTo(byte[] p0, byte[] p1) { return 0; }
    private boolean emailIsConstrained(java.lang.String p0, java.lang.String p1) { return false; }
    private boolean equals(java.lang.Object p0, java.lang.Object p1) { return false; }
    private static java.lang.String extractHostFromURL(java.lang.String p0) { return null; }
    private byte[][] extractIPsAndSubnetMasks(byte[] p0, byte[] p1) { return null; }
    private java.lang.String extractNameAsString(com.android.internal.org.bouncycastle.asn1.x509.GeneralName p0) { return null; }
    private int hashCollection(java.util.Collection p0) { return 0; }
    private java.util.Set intersectDN(java.util.Set p0, java.util.Set p1) { return null; }
    private java.util.Set intersectDNS(java.util.Set p0, java.util.Set p1) { return null; }
    private java.util.Set intersectEmail(java.util.Set p0, java.util.Set p1) { return null; }
    private void intersectEmail(java.lang.String p0, java.lang.String p1, java.util.Set p2) {}
    private java.util.Set intersectIP(java.util.Set p0, java.util.Set p1) { return null; }
    private java.util.Set intersectIPRange(byte[] p0, byte[] p1) { return null; }
    private java.util.Set intersectOtherName(java.util.Set p0, java.util.Set p1) { return null; }
    private void intersectOtherName(com.android.internal.org.bouncycastle.asn1.x509.OtherName p0, com.android.internal.org.bouncycastle.asn1.x509.OtherName p1, java.util.Set p2) {}
    private java.util.Set intersectURI(java.util.Set p0, java.util.Set p1) { return null; }
    private void intersectURI(java.lang.String p0, java.lang.String p1, java.util.Set p2) {}
    private byte[] ipWithSubnetMask(byte[] p0, byte[] p1) { return null; }
    private boolean isIPConstrained(byte[] p0, byte[] p1) { return false; }
    private boolean isUriConstrained(java.lang.String p0, java.lang.String p1) { return false; }
    private static byte[] max(byte[] p0, byte[] p1) { return null; }
    private static byte[] min(byte[] p0, byte[] p1) { return null; }
    private byte[][] minMaxIPs(byte[] p0, byte[] p1, byte[] p2, byte[] p3) { return null; }
    private static byte[] or(byte[] p0, byte[] p1) { return null; }
    private boolean otherNameIsConstrained(com.android.internal.org.bouncycastle.asn1.x509.OtherName p0, com.android.internal.org.bouncycastle.asn1.x509.OtherName p1) { return false; }
    private java.lang.String stringifyIP(byte[] p0) { return null; }
    private java.lang.String stringifyIPCollection(java.util.Set p0) { return null; }
    private java.lang.String stringifyOtherNameCollection(java.util.Set p0) { return null; }
    private java.util.Set unionDN(java.util.Set p0, com.android.internal.org.bouncycastle.asn1.ASN1Sequence p1) { return null; }
    private java.util.Set unionDNS(java.util.Set p0, java.lang.String p1) { return null; }
    private java.util.Set unionEmail(java.util.Set p0, java.lang.String p1) { return null; }
    private void unionEmail(java.lang.String p0, java.lang.String p1, java.util.Set p2) {}
    private java.util.Set unionIP(java.util.Set p0, byte[] p1) { return null; }
    private java.util.Set unionIPRange(byte[] p0, byte[] p1) { return null; }
    private java.util.Set unionOtherName(java.util.Set p0, com.android.internal.org.bouncycastle.asn1.x509.OtherName p1) { return null; }
    private java.util.Set unionURI(java.util.Set p0, java.lang.String p1) { return null; }
    private void unionURI(java.lang.String p0, java.lang.String p1, java.util.Set p2) {}
    private static boolean withinDNSubtree(com.android.internal.org.bouncycastle.asn1.ASN1Sequence p0, com.android.internal.org.bouncycastle.asn1.ASN1Sequence p1) { return false; }
    private boolean withinDomain(java.lang.String p0, java.lang.String p1) { return false; }
    public void addExcludedSubtree(com.android.internal.org.bouncycastle.asn1.x509.GeneralSubtree p0) {}
    public void checkExcluded(com.android.internal.org.bouncycastle.asn1.x509.GeneralName p0) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    public void checkExcludedDN(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    public void checkPermitted(com.android.internal.org.bouncycastle.asn1.x509.GeneralName p0) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    public void checkPermittedDN(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) throws com.android.internal.org.bouncycastle.asn1.x509.NameConstraintValidatorException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void intersectEmptyPermittedSubtree(int p0) {}
    public void intersectPermittedSubtree(com.android.internal.org.bouncycastle.asn1.x509.GeneralSubtree p0) {}
    public void intersectPermittedSubtree(com.android.internal.org.bouncycastle.asn1.x509.GeneralSubtree[] p0) {}
    public java.lang.String toString() { return null; }
}

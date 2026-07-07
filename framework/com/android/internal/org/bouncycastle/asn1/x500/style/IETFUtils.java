package com.android.internal.org.bouncycastle.asn1.x500.style;

public class IETFUtils {
    public IETFUtils() {}
    private static void addMultiValuedRDN(com.android.internal.org.bouncycastle.asn1.x500.X500NameStyle p0, com.android.internal.org.bouncycastle.asn1.x500.X500NameBuilder p1, com.android.internal.org.bouncycastle.asn1.x500.style.X500NameTokenizer p2) {}
    private static void addRDN(com.android.internal.org.bouncycastle.asn1.x500.X500NameStyle p0, com.android.internal.org.bouncycastle.asn1.x500.X500NameBuilder p1, java.lang.String p2) {}
    private static void addRDNs(com.android.internal.org.bouncycastle.asn1.x500.X500NameStyle p0, com.android.internal.org.bouncycastle.asn1.x500.X500NameBuilder p1, com.android.internal.org.bouncycastle.asn1.x500.style.X500NameTokenizer p2) {}
    public static void appendRDN(java.lang.StringBuffer p0, com.android.internal.org.bouncycastle.asn1.x500.RDN p1, java.util.Hashtable p2) {}
    public static void appendTypeAndValue(java.lang.StringBuffer p0, com.android.internal.org.bouncycastle.asn1.x500.AttributeTypeAndValue p1, java.util.Hashtable p2) {}
    private static boolean atvAreEqual(com.android.internal.org.bouncycastle.asn1.x500.AttributeTypeAndValue p0, com.android.internal.org.bouncycastle.asn1.x500.AttributeTypeAndValue p1) { return false; }
    public static java.lang.String canonicalString(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) { return null; }
    public static java.lang.String canonicalize(java.lang.String p0) { return null; }
    private static void collectAttributeTypeAndValue(com.android.internal.org.bouncycastle.asn1.x500.X500NameStyle p0, java.util.Vector p1, java.util.Vector p2, java.lang.String p3) {}
    private static int convertHex(char p0) { return 0; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier decodeAttrName(java.lang.String p0, java.util.Hashtable p1) { return null; }
    private static com.android.internal.org.bouncycastle.asn1.ASN1Primitive decodeObject(java.lang.String p0) { return null; }
    public static java.lang.String[] findAttrNamesForOID(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.util.Hashtable p1) { return null; }
    private static boolean isHexDigit(char p0) { return false; }
    private static java.lang.String nextToken(com.android.internal.org.bouncycastle.asn1.x500.style.X500NameTokenizer p0, boolean p1) { return null; }
    public static boolean rDNAreEqual(com.android.internal.org.bouncycastle.asn1.x500.RDN p0, com.android.internal.org.bouncycastle.asn1.x500.RDN p1) { return false; }
    public static com.android.internal.org.bouncycastle.asn1.x500.RDN[] rDNsFromString(java.lang.String p0, com.android.internal.org.bouncycastle.asn1.x500.X500NameStyle p1) { return null; }
    public static java.lang.String stripInternalSpaces(java.lang.String p0) { return null; }
    private static com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier[] toOIDArray(java.util.Vector p0) { return null; }
    private static java.lang.String[] toValueArray(java.util.Vector p0) { return null; }
    private static java.lang.String unescape(java.lang.String p0) { return null; }
    public static com.android.internal.org.bouncycastle.asn1.ASN1Encodable valueFromHexString(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public static java.lang.String valueToString(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) { return null; }
}

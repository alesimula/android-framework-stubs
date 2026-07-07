package com.android.internal.org.bouncycastle.asn1.x500.style;

public abstract class AbstractX500NameStyle implements com.android.internal.org.bouncycastle.asn1.x500.X500NameStyle {
    public AbstractX500NameStyle() {}
    private int calcHashCode(com.android.internal.org.bouncycastle.asn1.ASN1Encodable p0) { return 0; }
    public static java.util.Hashtable copyHashTable(java.util.Hashtable p0) { return null; }
    private boolean foundMatch(boolean p0, com.android.internal.org.bouncycastle.asn1.x500.RDN p1, com.android.internal.org.bouncycastle.asn1.x500.RDN[] p2) { return false; }
    public boolean areEqual(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0, com.android.internal.org.bouncycastle.asn1.x500.X500Name p1) { return false; }
    public int calculateHashCode(com.android.internal.org.bouncycastle.asn1.x500.X500Name p0) { return 0; }
    protected com.android.internal.org.bouncycastle.asn1.ASN1Encodable encodeStringValue(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1) { return null; }
    protected boolean rdnAreEqual(com.android.internal.org.bouncycastle.asn1.x500.RDN p0, com.android.internal.org.bouncycastle.asn1.x500.RDN p1) { return false; }
    public com.android.internal.org.bouncycastle.asn1.ASN1Encodable stringToValue(com.android.internal.org.bouncycastle.asn1.ASN1ObjectIdentifier p0, java.lang.String p1) { return null; }
}

package android.content.pm;

public class Signature implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.Signature> CREATOR = null;
    private java.security.cert.Certificate[] mCertificateChain;
    private int mFlags;
    private int mHashCode;
    private boolean mHaveHashCode;
    private final byte[] mSignature = null;
    private java.lang.ref.SoftReference<java.lang.String> mStringRef;
    public Signature(android.content.pm.Signature p0) {}
    private Signature(android.os.Parcel p0) {}
    public Signature(java.lang.String p0) {}
    public Signature(byte[] p0) {}
    public Signature(java.security.cert.Certificate[] p0) throws java.security.cert.CertificateEncodingException {}
    static boolean areEffectiveArraysMatch(android.content.pm.Signature[] p0, android.content.pm.Signature[] p1) throws java.security.cert.CertificateException { return false; }
    public static boolean areEffectiveMatch(android.content.pm.Signature p0, android.content.pm.Signature p1) throws java.security.cert.CertificateException { return false; }
    public static boolean areEffectiveMatch(android.content.pm.SigningDetails p0, android.content.pm.SigningDetails p1) throws java.security.cert.CertificateException { return false; }
    static boolean areExactArraysMatch(android.content.pm.Signature[] p0, android.content.pm.Signature[] p1) { return false; }
    public static boolean areExactMatch(android.content.pm.SigningDetails p0, android.content.pm.SigningDetails p1) { return false; }
    public static boolean areExactMatch(android.content.pm.SigningDetails p0, android.content.pm.Signature[] p1) { return false; }
    public static android.content.pm.Signature bounce(java.security.cert.CertificateFactory p0, android.content.pm.Signature p1) throws java.security.cert.CertificateException { return null; }
    private static final int parseHexDigit(int p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.pm.Signature[] getChainSignatures() throws java.security.cert.CertificateEncodingException { return null; }
    public int getFlags() { return 0; }
    public java.security.PublicKey getPublicKey() throws java.security.cert.CertificateException { return null; }
    public int hashCode() { return 0; }
    public void setFlags(int p0) {}
    public byte[] toByteArray() { return null; }
    public char[] toChars() { return null; }
    public char[] toChars(char[] p0, int[] p1) { return null; }
    public java.lang.String toCharsString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToXmlAttributeBytesHex(com.android.modules.utils.TypedXmlSerializer p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException {}
}

package android.app.blob;

public final class BlobHandle implements android.os.Parcelable {
    public static final java.lang.String ALGO_SHA_256 = "SHA-256";
    public static final android.os.Parcelable.Creator<android.app.blob.BlobHandle> CREATOR = null;
    private static final int LIMIT_BLOB_LABEL_LENGTH = 100;
    private static final int LIMIT_BLOB_TAG_LENGTH = 128;
    private static final java.lang.String[] SUPPORTED_ALGOS = null;
    public final java.lang.String algorithm = null;
    public final byte[] digest = null;
    public final long expiryTimeMillis = 0L;
    public final java.lang.CharSequence label = null;
    public final java.lang.String tag = null;
    private BlobHandle(android.os.Parcel p0) {}
    private BlobHandle(java.lang.String p0, byte[] p1, java.lang.CharSequence p2, long p3, java.lang.String p4) {}
    public static android.app.blob.BlobHandle create(java.lang.String p0, byte[] p1, java.lang.CharSequence p2, long p3, java.lang.String p4) { return null; }
    public static android.app.blob.BlobHandle createFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException { return null; }
    public static android.app.blob.BlobHandle createWithSha256(byte[] p0, java.lang.CharSequence p1, long p2, java.lang.String p3) { return null; }
    private static java.lang.String encodeDigest(byte[] p0) { return null; }
    public static java.lang.String safeDigest(byte[] p0) { return null; }
    public void assertIsValid() {}
    public int describeContents() { return 0; }
    public void dump(android.util.IndentingPrintWriter p0, boolean p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public long getExpiryTimeMillis() { return 0L; }
    public java.lang.CharSequence getLabel() { return null; }
    public byte[] getSha256Digest() { return null; }
    public java.lang.String getTag() { return null; }
    public int hashCode() { return 0; }
    public boolean isExpired() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
}

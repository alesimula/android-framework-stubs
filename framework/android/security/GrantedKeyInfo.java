package android.security;

public final class GrantedKeyInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.GrantedKeyInfo> CREATOR = null;
    private final java.lang.String mAlias = null;
    private transient java.security.cert.X509Certificate mCertificate;
    private final byte[] mCertificateBytes = null;
    private GrantedKeyInfo(android.os.Parcel p0) {}
    public GrantedKeyInfo(java.lang.String p0, java.security.cert.X509Certificate p1) {}
    public int describeContents() { return 0; }
    public java.lang.String getAlias() { return null; }
    public java.security.cert.X509Certificate getCertificate() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

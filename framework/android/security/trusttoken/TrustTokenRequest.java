package android.security.trusttoken;

@android.annotation.SystemApi
public final class TrustTokenRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.trusttoken.TrustTokenRequest> CREATOR = null;
    private final java.util.List<byte[]> mAttestation = null;
    private final byte[] mBatchHash = null;
    private final java.util.List<byte[]> mPublicKeys = null;
    private final byte[] mSignature = null;
    private TrustTokenRequest(android.os.Parcel p0) {}
    private TrustTokenRequest(java.util.List<byte[]> p0, java.util.List<byte[]> p1, byte[] p2, byte[] p3) {}
    private static java.util.List<byte[]> readByteArrayList(android.os.Parcel p0) { return null; }
    private static void writeByteArrayList(android.os.Parcel p0, java.util.List<byte[]> p1) {}
    public int describeContents() { return 0; }
    public java.util.List<byte[]> getAttestation() { return null; }
    public byte[] getBatchHash() { return null; }
    public java.util.List<byte[]> getPublicKeys() { return null; }
    public byte[] getSignature() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<byte[]> mAttestation;
        private byte[] mBatchHash;
        private java.util.List<byte[]> mPublicKeys;
        private byte[] mSignature;
        public Builder() {}
        public android.security.trusttoken.TrustTokenRequest build() { return null; }
        public android.security.trusttoken.TrustTokenRequest.Builder setAttestation(java.util.List<byte[]> p0) { return null; }
        public android.security.trusttoken.TrustTokenRequest.Builder setBatchHash(byte[] p0) { return null; }
        public android.security.trusttoken.TrustTokenRequest.Builder setPublicKeys(java.util.List<byte[]> p0) { return null; }
        public android.security.trusttoken.TrustTokenRequest.Builder setSignature(byte[] p0) { return null; }
    }
}

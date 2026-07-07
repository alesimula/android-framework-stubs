package android.security.trusttoken;

@android.annotation.SystemApi
public final class TrustTokenResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.trusttoken.TrustTokenResponse> CREATOR = null;
    private final java.util.List<byte[]> mEncodedTokens = null;
    private final java.util.List<byte[]> mIntermediateCertificates = null;
    private final java.util.List<byte[]> mRootAuthorityKeys = null;
    private java.time.Instant mUpdateTime;
    private TrustTokenResponse(android.os.Parcel p0) {}
    private TrustTokenResponse(java.util.List<byte[]> p0, java.util.List<byte[]> p1, java.util.List<byte[]> p2, java.time.Instant p3) {}
    public int describeContents() { return 0; }
    public java.util.List<byte[]> getEncodedTokens() { return null; }
    public java.util.List<byte[]> getIntermediateCertificates() { return null; }
    public java.util.List<byte[]> getRootAuthorityKeys() { return null; }
    public java.time.Instant getUpdateTime() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.util.List<byte[]> mEncodedTokens = null;
        private final java.util.List<byte[]> mIntermediateCertificates = null;
        private final java.util.List<byte[]> mRootAuthorityKeys = null;
        private java.time.Instant mUpdateTime;
        public Builder() {}
        public android.security.trusttoken.TrustTokenResponse.Builder addEncodedToken(byte[] p0) { return null; }
        public android.security.trusttoken.TrustTokenResponse.Builder addIntermediateCertificate(byte[] p0) { return null; }
        public android.security.trusttoken.TrustTokenResponse.Builder addRootAuthorityKey(byte[] p0) { return null; }
        public android.security.trusttoken.TrustTokenResponse build() { return null; }
        public android.security.trusttoken.TrustTokenResponse.Builder setUpdateTime(java.time.Instant p0) { return null; }
    }
}

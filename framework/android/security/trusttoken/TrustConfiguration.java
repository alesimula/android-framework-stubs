package android.security.trusttoken;

public final class TrustConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.trusttoken.TrustConfiguration> CREATOR = null;
    private final java.util.List<byte[]> mIntermediateCertificates = null;
    private final java.util.List<byte[]> mRootKeys = null;
    private final java.time.Instant mUpdatedAt = null;
    private TrustConfiguration(java.util.List<byte[]> p0, java.util.List<byte[]> p1, java.time.Instant p2) {}
    public static android.security.trusttoken.TrustConfiguration deserialize(byte[] p0) throws java.io.IOException { return null; }
    private static android.security.trusttoken.TrustConfiguration fromPersistableBundle(android.os.PersistableBundle p0) { return null; }
    private android.os.PersistableBundle toPersistableBundle() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.List<byte[]> getIntermediateCertificates() { return null; }
    public java.util.List<byte[]> getRootKeys() { return null; }
    public java.time.Instant getUpdatedAt() { return null; }
    public int hashCode() { return 0; }
    public byte[] serialize() throws java.io.IOException { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<byte[]> mIntermediateCertificates;
        private java.util.List<byte[]> mRootKeys;
        private java.time.Instant mUpdatedAt;
        public Builder() {}
        public android.security.trusttoken.TrustConfiguration.Builder addIntermediateCertificate(byte[] p0) { return null; }
        public android.security.trusttoken.TrustConfiguration.Builder addRootKey(byte[] p0) { return null; }
        public android.security.trusttoken.TrustConfiguration build() { return null; }
        public android.security.trusttoken.TrustConfiguration.Builder setUpdatedAt(java.time.Instant p0) { return null; }
    }
}

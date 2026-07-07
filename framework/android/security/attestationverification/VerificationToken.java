package android.security.attestationverification;

public final class VerificationToken implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.attestationverification.VerificationToken> CREATOR = null;
    static com.android.internal.util.Parcelling<java.time.Instant> sParcellingForVerificationTime;
    private final android.security.attestationverification.AttestationProfile mAttestationProfile = null;
    private final byte[] mHmac = null;
    private final int mLocalBindingType = 0;
    private final android.os.Bundle mRequirements = null;
    private int mUid;
    private final int mVerificationResult = 0;
    private final java.time.Instant mVerificationTime = null;
    VerificationToken(android.os.Parcel p0) {}
    VerificationToken(android.security.attestationverification.AttestationProfile p0, int p1, android.os.Bundle p2, int p3, java.time.Instant p4, byte[] p5) {}
    public int describeContents() { return 0; }
    public android.security.attestationverification.AttestationProfile getAttestationProfile() { return null; }
    public byte[] getHmac() { return null; }
    public int getLocalBindingType() { return 0; }
    public android.os.Bundle getRequirements() { return null; }
    public int getVerificationResult() { return 0; }
    public java.time.Instant getVerificationTime() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.security.attestationverification.AttestationProfile mAttestationProfile;
        private long mBuilderFieldsSet;
        private byte[] mHmac;
        private int mLocalBindingType;
        private android.os.Bundle mRequirements;
        private int mVerificationResult;
        private java.time.Instant mVerificationTime;
        public Builder(android.security.attestationverification.AttestationProfile p0, int p1, android.os.Bundle p2, int p3, java.time.Instant p4, byte[] p5) {}
        private void checkNotUsed() {}
        public android.security.attestationverification.VerificationToken build() { return null; }
        public android.security.attestationverification.VerificationToken.Builder setAttestationProfile(android.security.attestationverification.AttestationProfile p0) { return null; }
        public android.security.attestationverification.VerificationToken.Builder setHmac(byte... p0) { return null; }
        public android.security.attestationverification.VerificationToken.Builder setLocalBindingType(int p0) { return null; }
        public android.security.attestationverification.VerificationToken.Builder setRequirements(android.os.Bundle p0) { return null; }
        public android.security.attestationverification.VerificationToken.Builder setVerificationResult(int p0) { return null; }
        public android.security.attestationverification.VerificationToken.Builder setVerificationTime(java.time.Instant p0) { return null; }
    }
}

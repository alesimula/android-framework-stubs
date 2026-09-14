package android.security.trusttoken;

public final class TrustTokenVerificationResult implements android.os.Parcelable {
    public static final int ATTESTATION_LEVEL_NOT_SET = 0;
    public static final int ATTESTATION_LEVEL_STRONG = 30;
    public static final int ATTESTATION_LEVEL_WEAK = 10;
    public static final android.os.Parcelable.Creator<android.security.trusttoken.TrustTokenVerificationResult> CREATOR = null;
    public static final int FAILURE_CHALLENGE_INCORRECT = 2;
    public static final int FAILURE_SIGNATURE_INVALID = 1;
    public static final int FAILURE_UNKNOWN = -1;
    public static final int SUCCESS = 0;
    private final int mAttestationLevel = 0;
    private final int mResultCode = 0;
    private TrustTokenVerificationResult(int p0, int p1) {}
    private TrustTokenVerificationResult(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getAttestationLevel() { return 0; }
    public int getResultCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mAttestationLevel;
        private int mResultCode;
        public Builder() {}
        public android.security.trusttoken.TrustTokenVerificationResult build() { return null; }
        public android.security.trusttoken.TrustTokenVerificationResult.Builder setAttestationLevel(int p0) { return null; }
        public android.security.trusttoken.TrustTokenVerificationResult.Builder setResultCode(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttestationLevel {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}

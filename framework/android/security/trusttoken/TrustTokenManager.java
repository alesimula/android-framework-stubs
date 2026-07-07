package android.security.trusttoken;

public class TrustTokenManager {
    public static final int VERIFICATION_FAILURE_CHALLENGE_INCORRECT = 2;
    public static final int VERIFICATION_FAILURE_SIGNATURE_INVALID = 1;
    public static final int VERIFICATION_FAILURE_UNKNOWN = -1;
    public static final int VERIFICATION_SUCCESS = 0;
    private final android.security.trusttoken.ITrustTokenManager mService = null;
    public TrustTokenManager(android.security.trusttoken.ITrustTokenManager p0) {}
    public android.security.trusttoken.TrustTokenIdentitySet acquirePreparedIdentitySet(byte[] p0) { return null; }
    public android.security.trusttoken.TrustTokenWithChallenge acquireVerifiedDeviceToken(byte[] p0) throws android.security.trusttoken.TrustTokenUnavailableException { return null; }
    public void updatePreparedIdentities(java.util.List<java.lang.String> p0) {}
    public java.util.List<java.lang.Integer> verifyIdentityTokens(android.security.trusttoken.TrustToken p0, android.security.trusttoken.TrustToken... p1) { return null; }
    public int verifyTrustToken(android.security.trusttoken.TrustToken p0, byte[] p1, byte[] p2) throws android.security.trusttoken.TrustTokenUnavailableException { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerificationResult {
    }
}

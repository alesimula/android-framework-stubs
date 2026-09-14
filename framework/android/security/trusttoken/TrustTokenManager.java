package android.security.trusttoken;

public class TrustTokenManager {
    private final android.security.trusttoken.ITrustTokenManager mService = null;
    public TrustTokenManager(android.security.trusttoken.ITrustTokenManager p0) {}
    public android.security.trusttoken.TrustTokenIdentitySet acquirePreparedIdentitySet(byte[] p0) { return null; }
    public android.security.trusttoken.TrustTokenWithChallenge acquireVerifiedDeviceToken(byte[] p0) throws android.security.trusttoken.TrustTokenUnavailableException { return null; }
    public boolean canVerifyTokens() { return false; }
    public void updatePreparedIdentities(java.util.List<java.lang.String> p0) {}
    public java.util.List<android.security.trusttoken.TrustTokenVerificationResult> verifyIdentityTokens(android.security.trusttoken.TrustToken p0, android.security.trusttoken.TrustToken... p1) { return null; }
    public android.security.trusttoken.TrustTokenVerificationResult verifyTrustToken(android.security.trusttoken.TrustToken p0, byte[] p1, byte[] p2) throws android.security.trusttoken.TrustTokenUnavailableException { return null; }
}

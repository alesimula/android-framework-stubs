package android.security.trusttoken;

public final class TrustTokenIdentitySet implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.trusttoken.TrustTokenIdentitySet> CREATOR = null;
    private final java.util.Map<java.lang.String, android.security.trusttoken.TrustToken> mIdentityTokens = null;
    private final byte[] mSecretKey = null;
    private final android.security.trusttoken.TrustTokenWithChallenge mVerifiedDeviceToken = null;
    private TrustTokenIdentitySet(android.os.Parcel p0) {}
    public TrustTokenIdentitySet(android.security.trusttoken.TrustTokenWithChallenge p0, java.util.Map<java.lang.String, android.security.trusttoken.TrustToken> p1, byte[] p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.security.trusttoken.TrustToken getIdentityToken(java.lang.String p0) { return null; }
    public byte[] getSecretKey() { return null; }
    public android.security.trusttoken.TrustTokenWithChallenge getVerifiedDeviceToken() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

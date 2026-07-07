package android.security.trusttoken;

public final class TrustTokenWithChallenge implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.security.trusttoken.TrustTokenWithChallenge> CREATOR = null;
    private final byte[] mChallengeResponse = null;
    private final android.security.trusttoken.TrustToken mToken = null;
    private TrustTokenWithChallenge(android.os.Parcel p0) {}
    public TrustTokenWithChallenge(android.security.trusttoken.TrustToken p0, byte[] p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public byte[] getChallengeResponse() { return null; }
    public android.security.trusttoken.TrustToken getToken() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.credentials;

public final class GetCandidateCredentialsRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.GetCandidateCredentialsRequest> CREATOR = null;
    private final java.util.List<android.credentials.CredentialOption> mCredentialOptions = null;
    private final android.os.Bundle mData = null;
    private java.lang.String mOrigin;
    private GetCandidateCredentialsRequest(android.os.Parcel p0) {}
    private GetCandidateCredentialsRequest(java.util.List<android.credentials.CredentialOption> p0, android.os.Bundle p1, java.lang.String p2) {}
    public int describeContents() { return 0; }
    public java.util.List<android.credentials.CredentialOption> getCredentialOptions() { return null; }
    public android.os.Bundle getData() { return null; }
    public java.lang.String getOrigin() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

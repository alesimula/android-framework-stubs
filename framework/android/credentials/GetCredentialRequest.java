package android.credentials;

public final class GetCredentialRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.GetCredentialRequest> CREATOR = null;
    private final boolean mAlwaysSendAppInfoToProvider = false;
    private final java.util.List<android.credentials.CredentialOption> mCredentialOptions = null;
    private final android.os.Bundle mData = null;
    private java.lang.String mOrigin;
    private GetCredentialRequest(android.os.Parcel p0) {}
    private GetCredentialRequest(java.util.List<android.credentials.CredentialOption> p0, android.os.Bundle p1, boolean p2, java.lang.String p3) {}
    public boolean alwaysSendAppInfoToProvider() { return false; }
    public int describeContents() { return 0; }
    public java.util.List<android.credentials.CredentialOption> getCredentialOptions() { return null; }
    public android.os.Bundle getData() { return null; }
    public java.lang.String getOrigin() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mAlwaysSendAppInfoToProvider;
        private java.util.List<android.credentials.CredentialOption> mCredentialOptions;
        private final android.os.Bundle mData = null;
        private java.lang.String mOrigin;
        public Builder(android.os.Bundle p0) {}
        public android.credentials.GetCredentialRequest.Builder addCredentialOption(android.credentials.CredentialOption p0) { return null; }
        public android.credentials.GetCredentialRequest build() { return null; }
        public android.credentials.GetCredentialRequest.Builder setAlwaysSendAppInfoToProvider(boolean p0) { return null; }
        public android.credentials.GetCredentialRequest.Builder setCredentialOptions(java.util.List<android.credentials.CredentialOption> p0) { return null; }
        public android.credentials.GetCredentialRequest.Builder setOrigin(java.lang.String p0) { return null; }
    }
}

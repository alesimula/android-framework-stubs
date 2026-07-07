package android.credentials;

public final class CreateCredentialRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.CreateCredentialRequest> CREATOR = null;
    private final boolean mAlwaysSendAppInfoToProvider = false;
    private final android.os.Bundle mCandidateQueryData = null;
    private final android.os.Bundle mCredentialData = null;
    private final boolean mIsSystemProviderRequired = false;
    private final java.lang.String mOrigin = null;
    private final java.lang.String mType = null;
    private CreateCredentialRequest(android.os.Parcel p0) {}
    private CreateCredentialRequest(java.lang.String p0, android.os.Bundle p1, android.os.Bundle p2, boolean p3, boolean p4, java.lang.String p5) {}
    public boolean alwaysSendAppInfoToProvider() { return false; }
    public int describeContents() { return 0; }
    public android.os.Bundle getCandidateQueryData() { return null; }
    public android.os.Bundle getCredentialData() { return null; }
    public java.lang.String getOrigin() { return null; }
    public java.lang.String getType() { return null; }
    public boolean isSystemProviderRequired() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mAlwaysSendAppInfoToProvider;
        private final android.os.Bundle mCandidateQueryData = null;
        private final android.os.Bundle mCredentialData = null;
        private boolean mIsSystemProviderRequired;
        private java.lang.String mOrigin;
        private java.lang.String mType;
        public Builder(java.lang.String p0, android.os.Bundle p1, android.os.Bundle p2) {}
        public android.credentials.CreateCredentialRequest build() { return null; }
        public android.credentials.CreateCredentialRequest.Builder setAlwaysSendAppInfoToProvider(boolean p0) { return null; }
        public android.credentials.CreateCredentialRequest.Builder setIsSystemProviderRequired(boolean p0) { return null; }
        public android.credentials.CreateCredentialRequest.Builder setOrigin(java.lang.String p0) { return null; }
    }
}

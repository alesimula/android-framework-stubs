package android.credentials;

public final class CredentialOption implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.CredentialOption> CREATOR = null;
    public static final java.lang.String SUPPORTED_ELEMENT_KEYS = "android.credentials.GetCredentialOption.SUPPORTED_ELEMENT_KEYS";
    private final android.util.ArraySet<android.content.ComponentName> mAllowedProviders = null;
    private final android.os.Bundle mCandidateQueryData = null;
    private final android.os.Bundle mCredentialRetrievalData = null;
    private final boolean mIsSystemProviderRequired = false;
    private final java.lang.String mType = null;
    private CredentialOption(android.os.Parcel p0) {}
    public CredentialOption(java.lang.String p0, android.os.Bundle p1, android.os.Bundle p2, boolean p3) {}
    private CredentialOption(java.lang.String p0, android.os.Bundle p1, android.os.Bundle p2, boolean p3, android.util.ArraySet<android.content.ComponentName> p4) {}
    public int describeContents() { return 0; }
    public java.util.Set<android.content.ComponentName> getAllowedProviders() { return null; }
    public android.os.Bundle getCandidateQueryData() { return null; }
    public android.os.Bundle getCredentialRetrievalData() { return null; }
    public java.lang.String getType() { return null; }
    public boolean isSystemProviderRequired() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.util.ArraySet<android.content.ComponentName> mAllowedProviders;
        private android.os.Bundle mCandidateQueryData;
        private android.os.Bundle mCredentialRetrievalData;
        private boolean mIsSystemProviderRequired;
        private java.lang.String mType;
        public Builder(java.lang.String p0, android.os.Bundle p1, android.os.Bundle p2) {}
        public android.credentials.CredentialOption.Builder addAllowedProvider(android.content.ComponentName p0) { return null; }
        public android.credentials.CredentialOption build() { return null; }
        public android.credentials.CredentialOption.Builder setAllowedProviders(java.util.Set<android.content.ComponentName> p0) { return null; }
        public android.credentials.CredentialOption.Builder setIsSystemProviderRequired(boolean p0) { return null; }
    }
}

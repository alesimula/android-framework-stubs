package android.service.credentials;

public final class BeginGetCredentialResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.BeginGetCredentialResponse> CREATOR = null;
    private final android.content.pm.ParceledListSlice<android.service.credentials.Action> mActions = null;
    private final android.content.pm.ParceledListSlice<android.service.credentials.Action> mAuthenticationEntries = null;
    private final android.content.pm.ParceledListSlice<android.service.credentials.CredentialEntry> mCredentialEntries = null;
    private final android.service.credentials.RemoteEntry mRemoteCredentialEntry = null;
    public BeginGetCredentialResponse() {}
    private BeginGetCredentialResponse(android.content.pm.ParceledListSlice<android.service.credentials.CredentialEntry> p0, android.content.pm.ParceledListSlice<android.service.credentials.Action> p1, android.content.pm.ParceledListSlice<android.service.credentials.Action> p2, android.service.credentials.RemoteEntry p3) {}
    private BeginGetCredentialResponse(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.util.List<android.service.credentials.Action> getActions() { return null; }
    public java.util.List<android.service.credentials.Action> getAuthenticationActions() { return null; }
    public java.util.List<android.service.credentials.CredentialEntry> getCredentialEntries() { return null; }
    public android.service.credentials.RemoteEntry getRemoteCredentialEntry() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<android.service.credentials.Action> mActions;
        private java.util.List<android.service.credentials.Action> mAuthenticationEntries;
        private java.util.List<android.service.credentials.CredentialEntry> mCredentialEntries;
        private android.service.credentials.RemoteEntry mRemoteCredentialEntry;
        public Builder() {}
        public android.service.credentials.BeginGetCredentialResponse.Builder addAction(android.service.credentials.Action p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder addAuthenticationAction(android.service.credentials.Action p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder addCredentialEntry(android.service.credentials.CredentialEntry p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse build() { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder setActions(java.util.List<android.service.credentials.Action> p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder setAuthenticationActions(java.util.List<android.service.credentials.Action> p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder setCredentialEntries(java.util.List<android.service.credentials.CredentialEntry> p0) { return null; }
        public android.service.credentials.BeginGetCredentialResponse.Builder setRemoteCredentialEntry(android.service.credentials.RemoteEntry p0) { return null; }
    }
}

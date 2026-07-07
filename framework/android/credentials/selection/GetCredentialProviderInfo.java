package android.credentials.selection;

@android.annotation.SystemApi
public final class GetCredentialProviderInfo {
    private final java.util.List<android.credentials.selection.Entry> mActionChips = null;
    private final java.util.List<android.credentials.selection.AuthenticationEntry> mAuthenticationEntries = null;
    private final java.util.List<android.credentials.selection.Entry> mCredentialEntries = null;
    private final java.lang.String mProviderName = null;
    private final android.credentials.selection.Entry mRemoteEntry = null;
    GetCredentialProviderInfo(java.lang.String p0, java.util.List<android.credentials.selection.Entry> p1, java.util.List<android.credentials.selection.Entry> p2, java.util.List<android.credentials.selection.AuthenticationEntry> p3, android.credentials.selection.Entry p4) {}
    public java.util.List<android.credentials.selection.Entry> getActionChips() { return null; }
    public java.util.List<android.credentials.selection.AuthenticationEntry> getAuthenticationEntries() { return null; }
    public java.util.List<android.credentials.selection.Entry> getCredentialEntries() { return null; }
    public java.lang.String getProviderName() { return null; }
    public android.credentials.selection.Entry getRemoteEntry() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        private java.util.List<android.credentials.selection.Entry> mActionChips;
        private java.util.List<android.credentials.selection.AuthenticationEntry> mAuthenticationEntries;
        private java.util.List<android.credentials.selection.Entry> mCredentialEntries;
        private java.lang.String mProviderName;
        private android.credentials.selection.Entry mRemoteEntry;
        public Builder(java.lang.String p0) {}
        public android.credentials.selection.GetCredentialProviderInfo build() { return null; }
        public android.credentials.selection.GetCredentialProviderInfo.Builder setActionChips(java.util.List<android.credentials.selection.Entry> p0) { return null; }
        public android.credentials.selection.GetCredentialProviderInfo.Builder setAuthenticationEntries(java.util.List<android.credentials.selection.AuthenticationEntry> p0) { return null; }
        public android.credentials.selection.GetCredentialProviderInfo.Builder setCredentialEntries(java.util.List<android.credentials.selection.Entry> p0) { return null; }
        public android.credentials.selection.GetCredentialProviderInfo.Builder setRemoteEntry(android.credentials.selection.Entry p0) { return null; }
    }
}

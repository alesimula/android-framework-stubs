package android.credentials.selection;

public final class GetCredentialProviderData extends android.credentials.selection.ProviderData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.selection.GetCredentialProviderData> CREATOR = null;
    private final java.util.List<android.credentials.selection.Entry> mActionChips = null;
    private final java.util.List<android.credentials.selection.AuthenticationEntry> mAuthenticationEntries = null;
    private final java.util.List<android.credentials.selection.Entry> mCredentialEntries = null;
    private final android.credentials.selection.Entry mRemoteEntry = null;
    private GetCredentialProviderData(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public GetCredentialProviderData(java.lang.String p0, java.util.List<android.credentials.selection.Entry> p1, java.util.List<android.credentials.selection.Entry> p2, java.util.List<android.credentials.selection.AuthenticationEntry> p3, android.credentials.selection.Entry p4) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public java.util.List<android.credentials.selection.Entry> getActionChips() { return null; }
    public java.util.List<android.credentials.selection.AuthenticationEntry> getAuthenticationEntries() { return null; }
    public java.util.List<android.credentials.selection.Entry> getCredentialEntries() { return null; }
    public android.credentials.selection.Entry getRemoteEntry() { return null; }
    public android.credentials.selection.GetCredentialProviderInfo toGetCredentialProviderInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<android.credentials.selection.Entry> mActionChips;
        private java.util.List<android.credentials.selection.AuthenticationEntry> mAuthenticationEntries;
        private java.util.List<android.credentials.selection.Entry> mCredentialEntries;
        private java.lang.String mProviderFlattenedComponentName;
        private android.credentials.selection.Entry mRemoteEntry;
        public Builder(java.lang.String p0) {}
        public android.credentials.selection.GetCredentialProviderData build() { return null; }
        public android.credentials.selection.GetCredentialProviderData.Builder setActionChips(java.util.List<android.credentials.selection.Entry> p0) { return null; }
        public android.credentials.selection.GetCredentialProviderData.Builder setAuthenticationEntries(java.util.List<android.credentials.selection.AuthenticationEntry> p0) { return null; }
        public android.credentials.selection.GetCredentialProviderData.Builder setCredentialEntries(java.util.List<android.credentials.selection.Entry> p0) { return null; }
        public android.credentials.selection.GetCredentialProviderData.Builder setRemoteEntry(android.credentials.selection.Entry p0) { return null; }
    }
}

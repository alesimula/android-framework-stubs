package android.credentials.selection;

@android.annotation.SystemApi
public final class CreateCredentialProviderInfo {
    private final java.lang.String mProviderName = null;
    private final android.credentials.selection.Entry mRemoteEntry = null;
    private final java.util.List<android.credentials.selection.Entry> mSaveEntries = null;
    CreateCredentialProviderInfo(java.lang.String p0, java.util.List<android.credentials.selection.Entry> p1, android.credentials.selection.Entry p2) {}
    public java.lang.String getProviderName() { return null; }
    public android.credentials.selection.Entry getRemoteEntry() { return null; }
    public java.util.List<android.credentials.selection.Entry> getSaveEntries() { return null; }

    @android.annotation.SystemApi
    public static final class Builder {
        private java.lang.String mProviderName;
        private android.credentials.selection.Entry mRemoteEntry;
        private java.util.List<android.credentials.selection.Entry> mSaveEntries;
        public Builder(java.lang.String p0) {}
        public android.credentials.selection.CreateCredentialProviderInfo build() { return null; }
        public android.credentials.selection.CreateCredentialProviderInfo.Builder setRemoteEntry(android.credentials.selection.Entry p0) { return null; }
        public android.credentials.selection.CreateCredentialProviderInfo.Builder setSaveEntries(java.util.List<android.credentials.selection.Entry> p0) { return null; }
    }
}

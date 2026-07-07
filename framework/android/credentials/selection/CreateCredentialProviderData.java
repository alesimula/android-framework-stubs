package android.credentials.selection;

public final class CreateCredentialProviderData extends android.credentials.selection.ProviderData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.selection.CreateCredentialProviderData> CREATOR = null;
    private final android.credentials.selection.Entry mRemoteEntry = null;
    private final java.util.List<android.credentials.selection.Entry> mSaveEntries = null;
    private CreateCredentialProviderData(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public CreateCredentialProviderData(java.lang.String p0, java.util.List<android.credentials.selection.Entry> p1, android.credentials.selection.Entry p2) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public android.credentials.selection.Entry getRemoteEntry() { return null; }
    public java.util.List<android.credentials.selection.Entry> getSaveEntries() { return null; }
    public android.credentials.selection.CreateCredentialProviderInfo toCreateCredentialProviderInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mProviderFlattenedComponentName;
        private android.credentials.selection.Entry mRemoteEntry;
        private java.util.List<android.credentials.selection.Entry> mSaveEntries;
        public Builder(java.lang.String p0) {}
        public android.credentials.selection.CreateCredentialProviderData build() { return null; }
        public android.credentials.selection.CreateCredentialProviderData.Builder setRemoteEntry(android.credentials.selection.Entry p0) { return null; }
        public android.credentials.selection.CreateCredentialProviderData.Builder setSaveEntries(java.util.List<android.credentials.selection.Entry> p0) { return null; }
    }
}

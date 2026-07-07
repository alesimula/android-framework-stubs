package android.service.credentials;

public final class BeginCreateCredentialResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.BeginCreateCredentialResponse> CREATOR = null;
    private final android.content.pm.ParceledListSlice<android.service.credentials.CreateEntry> mCreateEntries = null;
    private final android.service.credentials.RemoteEntry mRemoteCreateEntry = null;
    public BeginCreateCredentialResponse() {}
    BeginCreateCredentialResponse(android.content.pm.ParceledListSlice<android.service.credentials.CreateEntry> p0, android.service.credentials.RemoteEntry p1) {}
    private BeginCreateCredentialResponse(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.util.List<android.service.credentials.CreateEntry> getCreateEntries() { return null; }
    public android.service.credentials.RemoteEntry getRemoteCreateEntry() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<android.service.credentials.CreateEntry> mCreateEntries;
        private android.service.credentials.RemoteEntry mRemoteCreateEntry;
        public Builder() {}
        public android.service.credentials.BeginCreateCredentialResponse.Builder addCreateEntry(android.service.credentials.CreateEntry p0) { return null; }
        public android.service.credentials.BeginCreateCredentialResponse build() { return null; }
        public android.service.credentials.BeginCreateCredentialResponse.Builder setCreateEntries(java.util.List<android.service.credentials.CreateEntry> p0) { return null; }
        public android.service.credentials.BeginCreateCredentialResponse.Builder setRemoteCreateEntry(android.service.credentials.RemoteEntry p0) { return null; }
    }
}

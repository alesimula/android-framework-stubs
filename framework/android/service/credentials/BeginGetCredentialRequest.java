package android.service.credentials;

public final class BeginGetCredentialRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.BeginGetCredentialRequest> CREATOR = null;
    private final java.util.List<android.service.credentials.BeginGetCredentialOption> mBeginGetCredentialOptions = null;
    private final android.service.credentials.CallingAppInfo mCallingAppInfo = null;
    private BeginGetCredentialRequest(android.os.Parcel p0) {}
    private BeginGetCredentialRequest(android.service.credentials.CallingAppInfo p0, java.util.List<android.service.credentials.BeginGetCredentialOption> p1) {}
    public int describeContents() { return 0; }
    public java.util.List<android.service.credentials.BeginGetCredentialOption> getBeginGetCredentialOptions() { return null; }
    public android.service.credentials.CallingAppInfo getCallingAppInfo() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.util.List<android.service.credentials.BeginGetCredentialOption> mBeginGetCredentialOptions;
        private android.service.credentials.CallingAppInfo mCallingAppInfo;
        public Builder() {}
        public android.service.credentials.BeginGetCredentialRequest.Builder addBeginGetCredentialOption(android.service.credentials.BeginGetCredentialOption p0) { return null; }
        public android.service.credentials.BeginGetCredentialRequest build() { return null; }
        public android.service.credentials.BeginGetCredentialRequest.Builder setBeginGetCredentialOptions(java.util.List<android.service.credentials.BeginGetCredentialOption> p0) { return null; }
        public android.service.credentials.BeginGetCredentialRequest.Builder setCallingAppInfo(android.service.credentials.CallingAppInfo p0) { return null; }
    }
}

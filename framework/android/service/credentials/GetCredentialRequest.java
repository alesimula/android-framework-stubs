package android.service.credentials;

public final class GetCredentialRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.GetCredentialRequest> CREATOR = null;
    private final android.service.credentials.CallingAppInfo mCallingAppInfo = null;
    private final java.util.List<android.credentials.CredentialOption> mCredentialOptions = null;
    private GetCredentialRequest(android.os.Parcel p0) {}
    public GetCredentialRequest(android.service.credentials.CallingAppInfo p0, java.util.List<android.credentials.CredentialOption> p1) {}
    public int describeContents() { return 0; }
    public android.service.credentials.CallingAppInfo getCallingAppInfo() { return null; }
    public java.util.List<android.credentials.CredentialOption> getCredentialOptions() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

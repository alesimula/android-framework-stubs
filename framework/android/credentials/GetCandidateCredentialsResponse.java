package android.credentials;

public final class GetCandidateCredentialsResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.GetCandidateCredentialsResponse> CREATOR = null;
    private final java.util.List<android.credentials.selection.GetCredentialProviderData> mCandidateProviderDataList = null;
    private final android.content.Intent mIntent = null;
    private final android.content.ComponentName mPrimaryProviderComponentName = null;
    protected GetCandidateCredentialsResponse(android.os.Parcel p0) {}
    public GetCandidateCredentialsResponse(java.util.List<android.credentials.selection.GetCredentialProviderData> p0, android.content.Intent p1, android.content.ComponentName p2) {}
    public int describeContents() { return 0; }
    public java.util.List<android.credentials.selection.GetCredentialProviderData> getCandidateProviderDataList() { return null; }
    public android.content.Intent getIntent() { return null; }
    public android.content.ComponentName getPrimaryProviderComponentName() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

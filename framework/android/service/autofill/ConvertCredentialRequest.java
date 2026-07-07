package android.service.autofill;

public final class ConvertCredentialRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.ConvertCredentialRequest> CREATOR = null;
    private final android.os.Bundle mClientState = null;
    private final android.credentials.GetCredentialResponse mGetCredentialResponse = null;
    public ConvertCredentialRequest(android.credentials.GetCredentialResponse p0, android.os.Bundle p1) {}
    ConvertCredentialRequest(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public android.os.Bundle getClientState() { return null; }
    public android.credentials.GetCredentialResponse getGetCredentialResponse() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

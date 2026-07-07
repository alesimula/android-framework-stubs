package android.service.credentials;

public final class CreateCredentialRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.CreateCredentialRequest> CREATOR = null;
    private final android.service.credentials.CallingAppInfo mCallingAppInfo = null;
    private final android.os.Bundle mData = null;
    private final java.lang.String mType = null;
    private CreateCredentialRequest(android.os.Parcel p0) {}
    public CreateCredentialRequest(android.service.credentials.CallingAppInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    public int describeContents() { return 0; }
    public android.service.credentials.CallingAppInfo getCallingAppInfo() { return null; }
    public android.os.Bundle getData() { return null; }
    public java.lang.String getType() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

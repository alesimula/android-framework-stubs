package android.service.credentials;

public final class BeginCreateCredentialRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.BeginCreateCredentialRequest> CREATOR = null;
    private final android.service.credentials.CallingAppInfo mCallingAppInfo = null;
    private final android.os.Bundle mData = null;
    private final java.lang.String mType = null;
    private BeginCreateCredentialRequest(android.os.Parcel p0) {}
    public BeginCreateCredentialRequest(java.lang.String p0, android.os.Bundle p1) {}
    public BeginCreateCredentialRequest(java.lang.String p0, android.os.Bundle p1, android.service.credentials.CallingAppInfo p2) {}
    public int describeContents() { return 0; }
    public android.service.credentials.CallingAppInfo getCallingAppInfo() { return null; }
    public android.os.Bundle getData() { return null; }
    public java.lang.String getType() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

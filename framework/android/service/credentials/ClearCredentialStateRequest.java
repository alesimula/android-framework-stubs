package android.service.credentials;

public final class ClearCredentialStateRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.ClearCredentialStateRequest> CREATOR = null;
    private final android.service.credentials.CallingAppInfo mCallingAppInfo = null;
    private final android.os.Bundle mData = null;
    private ClearCredentialStateRequest(android.os.Parcel p0) {}
    public ClearCredentialStateRequest(android.service.credentials.CallingAppInfo p0, android.os.Bundle p1) {}
    public int describeContents() { return 0; }
    public android.service.credentials.CallingAppInfo getCallingAppInfo() { return null; }
    public android.os.Bundle getData() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

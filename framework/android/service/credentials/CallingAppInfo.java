package android.service.credentials;

public final class CallingAppInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.CallingAppInfo> CREATOR = null;
    private final java.lang.String mOrigin = null;
    private final java.lang.String mPackageName = null;
    private final android.content.pm.SigningInfo mSigningInfo = null;
    private CallingAppInfo(android.os.Parcel p0) {}
    public CallingAppInfo(java.lang.String p0, android.content.pm.SigningInfo p1) {}
    public CallingAppInfo(java.lang.String p0, android.content.pm.SigningInfo p1, java.lang.String p2) {}
    public int describeContents() { return 0; }
    public java.lang.String getOrigin() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.content.pm.SigningInfo getSigningInfo() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

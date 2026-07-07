package android.content.pm;

@android.annotation.SystemApi
public final class InstantAppRequestInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.pm.InstantAppRequestInfo> CREATOR = null;
    private final int[] mHostDigestPrefix = null;
    private final android.content.Intent mIntent = null;
    private final boolean mRequesterInstantApp = false;
    private final java.lang.String mToken = null;
    private final android.os.UserHandle mUserHandle = null;
    public InstantAppRequestInfo(android.content.Intent p0, int[] p1, android.os.UserHandle p2, boolean p3, java.lang.String p4) {}
    InstantAppRequestInfo(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public int[] getHostDigestPrefix() { return null; }
    public android.content.Intent getIntent() { return null; }
    public java.lang.String getToken() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    public boolean isRequesterInstantApp() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

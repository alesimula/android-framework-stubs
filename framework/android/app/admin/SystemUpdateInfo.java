package android.app.admin;

public final class SystemUpdateInfo implements android.os.Parcelable {
    private static final java.lang.String ATTR_ORIGINAL_BUILD = "original-build";
    private static final java.lang.String ATTR_RECEIVED_TIME = "received-time";
    private static final java.lang.String ATTR_SECURITY_PATCH_STATE = "security-patch-state";
    public static final android.os.Parcelable.Creator<android.app.admin.SystemUpdateInfo> CREATOR = null;
    public static final int SECURITY_PATCH_STATE_FALSE = 1;
    public static final int SECURITY_PATCH_STATE_TRUE = 2;
    public static final int SECURITY_PATCH_STATE_UNKNOWN = 0;
    private static final java.lang.String TAG = "SystemUpdateInfo";
    private final long mReceivedTime = 0L;
    private final int mSecurityPatchState = 0;
    private SystemUpdateInfo(long p0, int p1) {}
    private SystemUpdateInfo(android.os.Parcel p0) {}
    public static android.app.admin.SystemUpdateInfo of(long p0) { return null; }
    public static android.app.admin.SystemUpdateInfo of(long p0, boolean p1) { return null; }
    public static android.app.admin.SystemUpdateInfo readFromXml(com.android.modules.utils.TypedXmlPullParser p0) { return null; }
    private static java.lang.String securityPatchStateToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getReceivedTime() { return 0L; }
    public int getSecurityPatchState() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToXml(com.android.modules.utils.TypedXmlSerializer p0, java.lang.String p1) throws java.io.IOException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SecurityPatchState {
    }
}

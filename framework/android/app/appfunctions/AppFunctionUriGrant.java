package android.app.appfunctions;

public final class AppFunctionUriGrant implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.appfunctions.AppFunctionUriGrant> CREATOR = null;
    private final int mModeFlags = 0;
    private final android.net.Uri mUri = null;
    public AppFunctionUriGrant(android.net.Uri p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getModeFlags() { return 0; }
    public android.net.Uri getUri() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GrantUriMode {
    }
}

package android.app.admin;

@android.annotation.SystemApi
public final class EnforcingAdmin implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.EnforcingAdmin> CREATOR = null;
    private final android.app.admin.Authority mAuthority = null;
    private final android.content.ComponentName mComponentName = null;
    private final java.lang.String mPackageName = null;
    private final android.os.UserHandle mUserHandle = null;
    private EnforcingAdmin(android.os.Parcel p0) {}
    public EnforcingAdmin(java.lang.String p0, android.app.admin.Authority p1, android.os.UserHandle p2) {}
    public EnforcingAdmin(java.lang.String p0, android.app.admin.Authority p1, android.os.UserHandle p2, android.content.ComponentName p3) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.admin.Authority getAuthority() { return null; }
    public android.content.ComponentName getComponentName() { return null; }
    public java.lang.String getPackageName() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

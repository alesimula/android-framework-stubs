package android.app.admin.dataleakprevention;

public final class DestinationMatcher implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.dataleakprevention.DestinationMatcher> CREATOR = null;
    public static final int TRUSTED_MANAGED_LEVEL_SELF = 1;
    public static final int TRUSTED_MANAGED_LEVEL_UNTRUSTED = 2;
    private final android.app.admin.dataleakprevention.AppMatcher mAppMatcher = null;
    private final int[] mTrustedLevels = null;
    private DestinationMatcher(android.os.Parcel p0) {}
    public DestinationMatcher(int[] p0, android.app.admin.dataleakprevention.AppMatcher p1) {}
    private void checkTrustedLevel(int p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.admin.dataleakprevention.AppMatcher getAppMatcher() { return null; }
    public int[] getDestinationTrustedManagedLevels() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DestinationTrustedManagedLevel {
    }
}

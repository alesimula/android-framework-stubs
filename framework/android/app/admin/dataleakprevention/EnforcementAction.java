package android.app.admin.dataleakprevention;

public final class EnforcementAction implements android.os.Parcelable {
    public static final int ACCESS_CONTROL_ALLOWED = 1;
    public static final int ACCESS_CONTROL_BLOCKED = 2;
    public static final int ACCESS_CONTROL_REDACTED = 3;
    public static final android.os.Parcelable.Creator<android.app.admin.dataleakprevention.EnforcementAction> CREATOR = null;
    public static final android.app.admin.dataleakprevention.EnforcementAction DEFAULT_ALLOW = null;
    public static final int REPORTING_DISABLED = 1;
    public static final int REPORTING_ENABLED = 2;
    private final int mAccessControl = 0;
    private final int mReporting = 0;
    public EnforcementAction(int p0, int p1) {}
    private EnforcementAction(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAccessControl() { return 0; }
    public int getReporting() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AccessControl {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reporting {
    }
}

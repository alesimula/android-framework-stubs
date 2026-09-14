package android.app.admin.dataleakprevention;

public final class EnforcementAction implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.admin.dataleakprevention.EnforcementAction> CREATOR = null;
    public static final android.app.admin.dataleakprevention.EnforcementAction DEFAULT_ALLOW = null;
    public static final int VERDICT_ALLOWED = 1;
    public static final int VERDICT_ALLOWED_PRIORITY = 100000;
    public static final int VERDICT_BLOCKED = 2;
    public static final int VERDICT_BLOCKED_PRIORITY = 900000;
    public static final int VERDICT_REDACTED = 3;
    public static final int VERDICT_REDACTED_PRIORITY = 800000;
    private final boolean mReportingEnabled = false;
    private final int mVerdict = 0;
    public EnforcementAction(int p0, boolean p1) {}
    private EnforcementAction(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getRestrictivenessScore() { return 0; }
    public int getVerdict() { return 0; }
    public int hashCode() { return 0; }
    public boolean isReportingEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Verdict {
    }
}

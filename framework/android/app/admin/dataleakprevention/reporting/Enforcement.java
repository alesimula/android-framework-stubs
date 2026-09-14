package android.app.admin.dataleakprevention.reporting;

public final class Enforcement {
    public static final int VERDICT_ALLOWED = 1;
    public static final int VERDICT_BLOCKED = 2;
    public static final int VERDICT_REDACTED = 3;
    private final int mVerdict = 0;
    public Enforcement(int p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int getVerdict() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Verdict {
    }
}

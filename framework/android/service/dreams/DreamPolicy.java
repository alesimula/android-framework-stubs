package android.service.dreams;

public final class DreamPolicy {
    public static final int RESTRICTION_AMBIENT_DISPLAY_NOT_SUPPRESSED = 1;
    public static final int RESTRICTION_DEVICE_KEPT_AWAKE = 2;
    private final int dreamRestrictions = 0;
    private final boolean isDreamEnabled = false;
    private final boolean shouldKeepDreamingWhenUnplugged = false;
    private final boolean shouldRequestOnScreenTimeout = false;
    public DreamPolicy() {}
    public DreamPolicy(boolean p0, boolean p1, boolean p2, int p3) {}
    public static java.lang.String restrictionToString(int p0) { return null; }
    public static java.lang.String[] restrictionToStringArray(int p0) { return null; }
    public int dreamRestrictions() { return 0; }
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public boolean isDreamAllowed(int p0) { return false; }
    public boolean isDreamEnabled() { return false; }
    public boolean isSamePolicy(boolean p0, boolean p1, boolean p2, int p3) { return false; }
    public boolean shouldKeepDreamingWhenUnplugged() { return false; }
    public boolean shouldRequestOnScreenTimeout() { return false; }
    public java.lang.String toShortString() { return null; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Restriction {
    }
}

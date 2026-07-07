package android.flags;

public class FeatureFlagsFake extends android.flags.FeatureFlags {
    private final java.util.Map<android.flags.BooleanFlagBase, java.lang.Boolean> mFlagValues = null;
    private final java.util.Set<android.flags.BooleanFlagBase> mReadFlags = null;
    public FeatureFlagsFake(android.flags.IFeatureFlags p0) { super(null); }
    private boolean requireFlag(android.flags.BooleanFlagBase p0) { return false; }
    public boolean isCurrentlyEnabled(android.flags.DynamicBooleanFlag p0) { return false; }
    public boolean isEnabled(android.flags.BooleanFlag p0) { return false; }
    public boolean isEnabled(android.flags.FusedOffFlag p0) { return false; }
    public boolean isEnabled(android.flags.FusedOnFlag p0) { return false; }
    public void setFlagValue(android.flags.BooleanFlagBase p0, boolean p1) {}
    protected void syncInternal(java.util.Set<android.flags.Flag<?>> p0) {}
}

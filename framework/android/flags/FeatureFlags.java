package android.flags;

public class FeatureFlags {
    private static final java.lang.String TAG = "FeatureFlags";
    private static android.flags.FeatureFlags sInstance;
    private static final java.lang.Object sInstanceLock = null;
    private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> mBooleanOverrides = null;
    private final java.util.Set<android.flags.Flag<?>> mDirtyFlags = null;
    private android.flags.IFeatureFlags mIFeatureFlags;
    private final android.flags.IFeatureFlagsCallback mIFeatureFlagsCallback = null;
    private final java.util.Set<android.flags.Flag<?>> mKnownFlags = null;
    private final java.util.Set<android.flags.FeatureFlags.ChangeListener> mListeners = null;
    private FeatureFlags() {}
    public FeatureFlags(android.flags.IFeatureFlags p0) {}
    private void addBooleanOverride(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    private <T extends android.flags.Flag<?>> T addFlag(T p0) { return null; }
    private android.flags.IFeatureFlags bind() { return null; }
    public static android.flags.BooleanFlag booleanFlag(java.lang.String p0, java.lang.String p1, boolean p2) { return null; }
    public static android.flags.DynamicBooleanFlag dynamicBooleanFlag(java.lang.String p0, java.lang.String p1, boolean p2) { return null; }
    private static boolean flagEqualsSyncableFlag(android.flags.Flag<?> p0, android.flags.SyncableFlag p1) { return false; }
    private android.flags.SyncableFlag flagToSyncableFlag(android.flags.Flag<?> p0) { return null; }
    public static android.flags.FusedOffFlag fusedOffFlag(java.lang.String p0, java.lang.String p1) { return null; }
    public static android.flags.FusedOnFlag fusedOnFlag(java.lang.String p0, java.lang.String p1) { return null; }
    private boolean getBooleanInternal(android.flags.Flag<java.lang.Boolean> p0) { return false; }
    public static android.flags.FeatureFlags getInstance() { return null; }
    static boolean parseBoolean(java.lang.String p0) { return false; }
    public static void setInstance(android.flags.FeatureFlags p0) {}
    public void addChangeListener(android.flags.FeatureFlags.ChangeListener p0) {}
    public boolean isCurrentlyEnabled(android.flags.DynamicBooleanFlag p0) { return false; }
    public boolean isEnabled(android.flags.BooleanFlag p0) { return false; }
    public boolean isEnabled(android.flags.FusedOffFlag p0) { return false; }
    public boolean isEnabled(android.flags.FusedOnFlag p0) { return false; }
    protected void onFlagChange(android.flags.DynamicFlag<?> p0) {}
    public void removeChangeListener(android.flags.FeatureFlags.ChangeListener p0) {}
    public void sync() {}
    protected void syncInternal(java.util.Set<android.flags.Flag<?>> p0) {}

    public static interface ChangeListener {
        public void onFlagChanged(android.flags.DynamicFlag<?> p0);
    }
}

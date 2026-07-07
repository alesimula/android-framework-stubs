package com.android.internal.hidden_from_bootclasspath.android.view.flags;

final class FeatureFlagsImpl implements com.android.internal.hidden_from_bootclasspath.android.view.flags.FeatureFlags {
    private static final java.lang.String TAG = "FeatureFlagsImpl";
    private static boolean holdbackAtomicTraversalBarrier;
    private static volatile boolean isCached;
    FeatureFlagsImpl() {}
    private void init() {}
    public boolean holdbackAtomicTraversalBarrier() { return false; }
}

package com.android.internal.hidden_from_bootclasspath.com.android.nfc.module.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.nfc.module.flags.FeatureFlags {
    private java.util.Map<java.lang.String, java.lang.Boolean> mFinalizedFlags;
    private java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.nfc.module.flags.FeatureFlags, ?>, ?> mGetGenericValueImpl;
    private java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.nfc.module.flags.FeatureFlags>> mGetValueImpl;
    private java.util.Set<java.lang.String> mReadOnlyFlagsSet;
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.nfc.module.flags.FeatureFlags>> p0) {}
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.nfc.module.flags.FeatureFlags>> p0, java.util.function.BiFunction<java.lang.String, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.nfc.module.flags.FeatureFlags, ?>, ?> p1) {}
    public boolean deprecateAntennaInfo() { return false; }
    public boolean eventListenerOffhostAidSelected() { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
    protected <T extends java.lang.Object> T getGenericValue(java.lang.String p0, java.util.function.Function<com.android.internal.hidden_from_bootclasspath.com.android.nfc.module.flags.FeatureFlags, T> p1) { return null; }
    public boolean getPollingLoopFilters() { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.nfc.module.flags.FeatureFlags> p1) { return false; }
    public boolean isFlagFinalized(java.lang.String p0) { return false; }
    public boolean nfcHceLatencyEvents() { return false; }
    public boolean nfcPowerSavingMode() { return false; }
    public boolean nfcstack26q4Updates() { return false; }
    public boolean oemExtension25q4() { return false; }
    public boolean readerModeAnnotationsApi() { return false; }
    public boolean screenStateAttributeToggle() { return false; }
    public boolean tapToX() { return false; }
}

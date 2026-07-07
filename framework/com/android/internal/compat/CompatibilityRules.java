package com.android.internal.compat;

public final class CompatibilityRules {
    private static final java.lang.String TAG = "CompatibilityRules";
    private static final com.android.internal.compat.AndroidBuildClassifier sBuildClassifier = null;
    private static android.util.LongSparseArray<com.android.internal.compat.CompatibilityChangeInfo> sRules;
    public CompatibilityRules() {}
    private static boolean getBooleanAttribute(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, boolean p2) { return false; }
    private static int getIntAttribute(com.android.modules.utils.TypedXmlPullParser p0, java.lang.String p1, int p2) { return 0; }
    public static android.util.LongSparseArray<com.android.internal.compat.CompatibilityChangeInfo> getRules() { return null; }
    public static void init(android.util.LongSparseArray<com.android.internal.compat.CompatibilityChangeInfo> p0) {}
    public static void initRulesForTest(com.android.internal.compat.CompatibilityChangeInfo... p0) {}
    public static boolean isChangeEnabled(long p0, int p1) { return false; }
    static void loadConfigFromDir(java.io.File p0, android.util.LongSparseArray<com.android.internal.compat.CompatibilityChangeInfo> p1, java.util.function.Predicate<java.io.File> p2) {}
    public static void loadSystemRules() {}
    private static void loadSystemRules$ravenwood() {}
    private static void readConfigToMap(java.io.File p0, android.util.LongSparseArray<com.android.internal.compat.CompatibilityChangeInfo> p1) {}
    public static void reset() {}
}

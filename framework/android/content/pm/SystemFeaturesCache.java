package android.content.pm;

public final class SystemFeaturesCache {
    private static final int UNAVAILABLE_FEATURE_VERSION = -2147483648;
    private static volatile android.content.pm.SystemFeaturesCache sInstance;
    private final int[] mSdkFeatureVersions = null;
    public SystemFeaturesCache(android.util.ArrayMap<java.lang.String, android.content.pm.FeatureInfo> p0) {}
    public SystemFeaturesCache(java.util.Collection<android.content.pm.FeatureInfo> p0) {}
    public SystemFeaturesCache(int[] p0) {}
    public static void clearInstance() {}
    public static android.content.pm.SystemFeaturesCache getInstance() { return null; }
    public static boolean hasInstance() { return false; }
    public static void setInstance(android.content.pm.SystemFeaturesCache p0) {}
    public int[] getSdkFeatureVersions() { return null; }
    public java.lang.Boolean maybeHasFeature(java.lang.String p0, int p1) { return null; }
}

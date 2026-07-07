package android.content.pm;

public final class ConstrainDisplayApisConfig {
    private static final java.lang.String FLAG_ALWAYS_CONSTRAIN_DISPLAY_APIS = "always_constrain_display_apis";
    private static final java.lang.String FLAG_NEVER_CONSTRAIN_DISPLAY_APIS = "never_constrain_display_apis";
    private static final java.lang.String FLAG_NEVER_CONSTRAIN_DISPLAY_APIS_ALL_PACKAGES = "never_constrain_display_apis_all_packages";
    private static final java.lang.String TAG = null;
    private android.util.ArrayMap<java.lang.String, android.util.Pair<java.lang.Long, java.lang.Long>> mAlwaysConstrainConfigMap;
    private android.util.ArrayMap<java.lang.String, android.util.Pair<java.lang.Long, java.lang.Long>> mNeverConstrainConfigMap;
    private boolean mNeverConstrainDisplayApisAllPackages;
    public ConstrainDisplayApisConfig() {}
    private static android.util.ArrayMap<java.lang.String, android.util.Pair<java.lang.Long, java.lang.Long>> buildConfigMap(java.lang.String p0) { return null; }
    private static boolean flagHasMatchingPackageEntry(java.util.Map<java.lang.String, android.util.Pair<java.lang.Long, java.lang.Long>> p0, android.content.pm.ApplicationInfo p1) { return false; }
    private static boolean matchesApplicationInfo(android.util.Pair<java.lang.Long, java.lang.Long> p0, android.content.pm.ApplicationInfo p1) { return false; }
    private void updateCache() {}
    public boolean getAlwaysConstrainDisplayApis(android.content.pm.ApplicationInfo p0) { return false; }
    public boolean getNeverConstrainDisplayApis(android.content.pm.ApplicationInfo p0) { return false; }
}

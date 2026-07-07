package android.app;

public class ResourcesManager {
    private static final boolean DEBUG = false;
    public static final java.lang.String RESOURCE_CACHE_DIR = "/data/resource-cache/";
    static final java.lang.String TAG = "ResourcesManager";
    private static volatile android.app.ResourcesManager sResourcesManager;
    private final java.util.WeakHashMap<android.os.IBinder, android.app.ResourcesManager.ActivityResources> mActivityResourceReferences = null;
    private final java.util.ArrayList<java.lang.ref.WeakReference<android.content.res.Resources>> mAllResourceReferences = null;
    private final java.lang.ref.ReferenceQueue<android.content.res.Resources> mAllResourceReferencesQueue = null;
    private final java.lang.ref.ReferenceQueue<android.content.res.ApkAssets> mApkAssetsQueue = null;
    private final android.util.ArraySet<java.lang.String> mApplicationOwnedApks = null;
    private final android.util.ArrayMap<android.app.ResourcesManager.ApkKey, java.lang.ref.WeakReference<android.content.res.ApkAssets>> mCachedApkAssets = null;
    private final java.lang.Object mLock = null;
    private java.util.ArrayList<android.util.Pair<java.lang.String[], android.content.pm.ApplicationInfo>> mPendingAppInfoUpdates;
    private android.content.res.CompatibilityInfo mResCompatibilityInfo;
    private final android.content.res.Configuration mResConfiguration = null;
    private int mResDisplayId;
    private final android.util.ArrayMap<android.content.res.ResourcesKey, java.lang.ref.WeakReference<android.content.res.ResourcesImpl>> mResourceImpls = null;
    private final java.util.ArrayList<java.lang.ref.WeakReference<android.content.res.Resources>> mResourceReferences = null;
    private final java.lang.ref.ReferenceQueue<android.content.res.ResourcesImpl> mResourcesImplQueue = null;
    private final java.lang.ref.ReferenceQueue<android.content.res.Resources> mResourcesReferencesQueue = null;
    private final android.util.ArrayMap<java.lang.String, android.app.ResourcesManager.SharedLibraryAssets> mSharedLibAssetsMap = null;
    private final android.app.ResourcesManager.UpdateHandler mUpdateCallbacks = null;
    public ResourcesManager() {}
    private void addApplicationPathsLocked(java.lang.String p0, java.lang.String[] p1) {}
    private void appendLibAssetsLocked(android.app.ResourcesManager.SharedLibraryAssets p0) {}
    private void applyAllPendingAppInfoUpdates$ravenwood() {}
    private void applyConfigurationToResourcesLocked(android.content.res.Configuration p0, android.content.res.CompatibilityInfo p1, android.content.res.Configuration p2, android.content.res.ResourcesKey p3, android.content.res.ResourcesImpl p4) {}
    private static void applyDisplayMetricsToConfiguration(android.util.DisplayMetrics p0, android.content.res.Configuration p1) {}
    private void applyNewResourceDirsLocked(java.lang.String[] p0, android.content.pm.ApplicationInfo p1) {}
    private void cleanupApkAssetsLocked() {}
    private static <T extends java.lang.Object> void cleanupReferences(java.util.ArrayList<java.lang.ref.WeakReference<T>> p0, java.lang.ref.ReferenceQueue<T> p1) {}
    private static <C extends java.lang.Object, T extends java.lang.Object> void cleanupReferences(java.util.ArrayList<C> p0, java.lang.ref.ReferenceQueue<T> p1, java.util.function.Function<C, java.lang.ref.WeakReference<T>> p2) {}
    private void cleanupResourceImplsLocked() {}
    private static java.lang.String[] combinedOverlayPaths(java.lang.String[] p0, java.lang.String[] p1) { return null; }
    private static <T extends java.lang.Object> int countLiveReferences(java.util.Collection<java.lang.ref.WeakReference<T>> p0) { return 0; }
    private android.app.ResourcesManager.ApkAssetsSupplier createApkAssetsSupplierNotLocked(android.content.res.ResourcesKey p0) { return null; }
    private android.content.res.ResourcesKey createNewResourceKeyIfNeeded(android.content.res.ResourcesKey p0, android.content.res.ResourcesKey p1) { return null; }
    private android.content.res.Resources createResources(android.content.res.ResourcesKey p0, java.lang.ClassLoader p1, android.app.ResourcesManager.ApkAssetsSupplier p2) { return null; }
    private android.content.res.Resources createResourcesForActivity(android.os.IBinder p0, android.content.res.ResourcesKey p1, android.content.res.Configuration p2, java.lang.Integer p3, java.lang.ClassLoader p4, android.app.ResourcesManager.ApkAssetsSupplier p5) { return null; }
    private android.content.res.Resources createResourcesForActivityLocked(android.os.IBinder p0, android.content.res.Configuration p1, java.lang.Integer p2, java.lang.ClassLoader p3, android.content.res.ResourcesImpl p4, android.content.res.CompatibilityInfo p5) { return null; }
    private android.content.res.ResourcesImpl createResourcesImpl(android.content.res.ResourcesKey p0, android.app.ResourcesManager.ApkAssetsSupplier p1) { return null; }
    private android.content.res.Resources createResourcesLocked(java.lang.ClassLoader p0, android.content.res.ResourcesImpl p1, android.content.res.CompatibilityInfo p2) { return null; }
    private static java.util.ArrayList<android.app.ResourcesManager.ApkKey> extractApkKeys(android.content.res.ResourcesKey p0) { return null; }
    private android.content.res.ResourcesKey findKeyForResourceImplLocked(android.content.res.ResourcesImpl p0) { return null; }
    private android.content.res.ResourcesImpl findOrCreateResourcesImplForKeyLocked(android.content.res.ResourcesKey p0) { return null; }
    private android.content.res.ResourcesImpl findOrCreateResourcesImplForKeyLocked(android.content.res.ResourcesKey p0, android.app.ResourcesManager.ApkAssetsSupplier p1) { return null; }
    private android.content.res.Resources findResourcesForActivityLocked(android.os.IBinder p0, android.content.res.ResourcesKey p1, java.lang.ClassLoader p2) { return null; }
    private android.content.res.ResourcesImpl findResourcesImplPairForKeyLocked(android.content.res.ResourcesKey p0) { return null; }
    private int generateDisplayId(android.content.res.ResourcesKey p0) { return 0; }
    private static android.hardware.display.DisplayManagerGlobal getDisplayManager() { return null; }
    private android.util.DisplayMetrics getDisplayMetrics(android.content.res.Configuration p0) { return null; }
    public static android.app.ResourcesManager getInstance() { return null; }
    private android.app.ResourcesManager.ActivityResources getOrCreateActivityResourcesStructLocked(android.os.IBinder p0) { return null; }
    private static java.lang.String overlayPathToIdmapPath(java.lang.String p0) { return null; }
    private android.content.res.ResourcesKey rebaseActivityOverrideConfig(android.os.IBinder p0, android.app.ResourcesManager.ActivityResource p1, android.content.res.Configuration p2, int p3) { return null; }
    private void rebaseKeyForActivity(android.os.IBinder p0, android.content.res.ResourcesKey p1, boolean p2) {}
    private void rebaseKeyForDisplay(android.content.res.ResourcesKey p0, int p1) {}
    private void redirectAllResourcesToNewImplLocked(android.util.ArrayMap<android.content.res.ResourcesImpl, android.content.res.ResourcesKey> p0) {}
    private void redirectResourcesToNewImplLocked(android.util.ArrayMap<android.content.res.ResourcesImpl, android.content.res.ResourcesKey> p0) {}
    private android.content.res.ResourcesKey resourcesKeyFromAssets(android.content.res.AssetManager p0) { return null; }
    public static android.app.ResourcesManager setInstance(android.app.ResourcesManager p0) { return null; }
    public void appendLibAssetForMainAssetPath(java.lang.String p0, java.lang.String p1) {}
    public void appendLibAssetsForMainAssetPath(java.lang.String p0, java.lang.String[] p1) {}
    public void appendPendingAppInfoUpdate(java.lang.String[] p0, android.content.pm.ApplicationInfo p1) {}
    public final void applyAllPendingAppInfoUpdates() {}
    public boolean applyCompatConfiguration(int p0, android.content.res.Configuration p1) { return false; }
    public final boolean applyConfigurationToResources(android.content.res.Configuration p0, android.content.res.CompatibilityInfo p1) { return false; }
    protected android.content.res.AssetManager createAssetManager(android.content.res.ResourcesKey p0) { return null; }
    protected android.content.res.AssetManager createAssetManager(android.content.res.ResourcesKey p0, android.app.ResourcesManager.ApkAssetsSupplier p1) { return null; }
    public android.content.res.Resources createBaseTokenResources(android.os.IBinder p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String[] p4, java.lang.String[] p5, int p6, android.content.res.Configuration p7, android.content.res.CompatibilityInfo p8, java.lang.ClassLoader p9, java.util.List<android.content.res.loader.ResourcesLoader> p10) { return null; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public android.view.Display getAdjustedDisplay(int p0, android.content.res.Resources p1) { return null; }
    public android.content.res.Configuration getConfiguration() { return null; }
    public android.util.DisplayMetrics getDisplayMetrics() { return null; }
    public android.util.DisplayMetrics getDisplayMetrics(int p0, android.view.DisplayAdjustments p1) { return null; }
    public android.util.ArrayMap<java.lang.String, android.app.ResourcesManager.SharedLibraryAssets> getRegisteredResourcePaths() { return null; }
    public android.content.res.Resources getResources(android.os.IBinder p0, java.lang.String p1, java.lang.String[] p2, java.lang.String[] p3, java.lang.String[] p4, java.lang.String[] p5, java.lang.Integer p6, android.content.res.Configuration p7, android.content.res.CompatibilityInfo p8, java.lang.ClassLoader p9, java.util.List<android.content.res.loader.ResourcesLoader> p10) { return null; }
    public void initializeApplicationPaths(java.lang.String p0, java.lang.String[] p1) {}
    public void invalidatePath(java.lang.String p0) {}
    public boolean isSameResourcesOverrideConfig(android.os.IBinder p0, android.content.res.Configuration p1) { return false; }
    public android.content.res.ApkAssets loadApkAssets(android.app.ResourcesManager.ApkKey p0) throws java.io.IOException { return null; }
    protected android.content.res.ApkAssets loadApkAssetsRaw(android.app.ResourcesManager.ApkKey p0, int p1) throws java.io.IOException { return null; }
    public void registerAllResourcesReference(android.content.res.Resources p0) {}
    public void registerResourcePaths(java.lang.String p0, android.content.pm.ApplicationInfo p1) {}
    public android.util.Pair<android.content.res.AssetManager, java.lang.Integer> updateResourceImplAssetsWithRegisteredLibs(android.content.res.AssetManager p0, boolean p1) { return null; }
    public void updateResourcesForActivity(android.os.IBinder p0, android.content.res.Configuration p1, int p2) {}

    private static class ActivityResource {
        public final android.content.res.Configuration overrideConfig = null;
        public java.lang.Integer overrideDisplayId;
        public java.lang.ref.WeakReference<android.content.res.Resources> resources;
        private ActivityResource() {}
    }

    private static class ActivityResources {
        public final java.util.ArrayList<android.app.ResourcesManager.ActivityResource> activityResources = null;
        public final java.lang.ref.ReferenceQueue<android.content.res.Resources> activityResourcesQueue = null;
        public final android.content.res.Configuration overrideConfig = null;
        public int overrideDisplayId;
        private ActivityResources() {}
        public int countLiveReferences() { return 0; }
    }

    protected class ApkAssetsSupplier {
        final android.util.ArrayMap<android.app.ResourcesManager.ApkKey, android.content.res.ApkAssets> mLocalCache = null;
        protected ApkAssetsSupplier(android.app.ResourcesManager p0) {}
        android.content.res.ApkAssets load(android.app.ResourcesManager.ApkKey p0) throws java.io.IOException { return null; }
    }

    private static class ApkAssetsWeakReference extends java.lang.ref.WeakReference<android.content.res.ApkAssets> {
        final android.app.ResourcesManager.ApkKey key = null;
        ApkAssetsWeakReference(android.content.res.ApkAssets p0, java.lang.ref.ReferenceQueue<? super android.content.res.ApkAssets> p1, android.app.ResourcesManager.ApkKey p2) { super(null); }
    }

    public static class ApkKey {
        public final boolean overlay = false;
        public final java.lang.String path = null;
        public final boolean sharedLib = false;
        public ApkKey(java.lang.String p0, boolean p1, boolean p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private static class PathCollector {
        public final android.util.ArraySet<java.lang.String> libsSet = null;
        public final java.util.ArrayList<java.lang.String> orderedLibs = null;
        public final java.util.ArrayList<java.lang.String> orderedOverlays = null;
        public final android.content.res.ResourcesKey originalKey = null;
        public final android.util.ArraySet<java.lang.String> overlaysSet = null;
        PathCollector(android.content.res.ResourcesKey p0) {}
        static void appendAllNewPaths(java.lang.String[] p0, android.util.ArraySet<java.lang.String> p1, java.util.ArrayList<java.lang.String> p2) {}
        static void appendNewPath(java.lang.String p0, android.util.ArraySet<java.lang.String> p1, java.util.ArrayList<java.lang.String> p2) {}
        public void appendKey(android.content.res.ResourcesKey p0) {}
        android.content.res.ResourcesKey collectedKey() { return null; }
        boolean isSameAsOriginal() { return false; }
    }

    private static class ResourcesImplWeakReference extends java.lang.ref.WeakReference<android.content.res.ResourcesImpl> {
        final android.content.res.ResourcesKey key = null;
        ResourcesImplWeakReference(android.content.res.ResourcesImpl p0, java.lang.ref.ReferenceQueue<? super android.content.res.ResourcesImpl> p1, android.content.res.ResourcesKey p2) { super(null); }
    }

    public static class SharedLibraryAssets {
        private final android.content.res.ResourcesKey mResourcesKey = null;
        private SharedLibraryAssets(android.content.pm.ApplicationInfo p0, android.content.pm.ApplicationInfo p1) {}
        public android.content.res.ResourcesKey getResourcesKey() { return null; }
    }

    private class UpdateHandler implements android.content.res.Resources.UpdateCallbacks {
        private UpdateHandler(android.app.ResourcesManager p0) {}
        public void onLoaderUpdated(android.content.res.loader.ResourcesLoader p0) {}
        public void onLoadersChanged(android.content.res.Resources p0, java.util.List<android.content.res.loader.ResourcesLoader> p1) {}
    }
}

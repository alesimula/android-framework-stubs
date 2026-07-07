package android.app;

public class ApplicationLoaders {
    private static final java.lang.String TAG = "ApplicationLoaders";
    private static final android.app.ApplicationLoaders gApplicationLoaders = null;
    private final android.util.ArrayMap<java.lang.String, java.lang.ClassLoader> mLoaders = null;
    private java.util.Map<java.lang.String, android.app.ApplicationLoaders.CachedClassLoader> mSystemLibsCacheMap;
    public ApplicationLoaders() {}
    private void createAndCacheNonBootclasspathSystemClassLoader(android.content.pm.SharedLibraryInfo p0) {}
    private java.lang.ClassLoader getClassLoader(java.lang.String p0, int p1, boolean p2, java.lang.String p3, java.lang.String p4, java.lang.ClassLoader p5, java.lang.String p6, java.lang.String p7, java.util.List<java.lang.ClassLoader> p8, java.util.List<java.lang.String> p9, java.util.List<java.lang.ClassLoader> p10) { return null; }
    public static android.app.ApplicationLoaders getDefault() { return null; }
    private static boolean sharedLibrariesEquals(java.util.List<java.lang.ClassLoader> p0, java.util.List<java.lang.ClassLoader> p1) { return false; }
    void addNative(java.lang.ClassLoader p0, java.util.Collection<java.lang.String> p1) {}
    void addPath(java.lang.ClassLoader p0, java.lang.String p1) {}
    public void createAndCacheNonBootclasspathSystemClassLoaders(java.util.List<android.content.pm.SharedLibraryInfo> p0) {}
    public java.lang.ClassLoader createAndCacheWebViewClassLoader(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public java.lang.ClassLoader getCachedNonBootclasspathSystemLib(java.lang.String p0, java.lang.ClassLoader p1, java.lang.String p2, java.util.List<java.lang.ClassLoader> p3) { return null; }
    java.lang.ClassLoader getClassLoader(java.lang.String p0, int p1, boolean p2, java.lang.String p3, java.lang.String p4, java.lang.ClassLoader p5, java.lang.String p6) { return null; }
    java.lang.ClassLoader getClassLoaderWithSharedLibraries(java.lang.String p0, int p1, boolean p2, java.lang.String p3, java.lang.String p4, java.lang.ClassLoader p5, java.lang.String p6, java.util.List<java.lang.ClassLoader> p7, java.util.List<java.lang.String> p8, java.util.List<java.lang.ClassLoader> p9) { return null; }
    java.lang.ClassLoader getSharedLibraryClassLoaderWithSharedLibraries(java.lang.String p0, int p1, boolean p2, java.lang.String p3, java.lang.String p4, java.lang.ClassLoader p5, java.lang.String p6, java.util.List<java.lang.ClassLoader> p7, java.util.List<java.lang.ClassLoader> p8) { return null; }

    private static class CachedClassLoader {
        java.lang.ClassLoader loader;
        java.util.List<java.lang.ClassLoader> sharedLibraries;
        private CachedClassLoader() {}
    }
}

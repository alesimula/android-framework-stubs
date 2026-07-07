package android.filterfw.core;

public class FilterFactory {
    private static final java.lang.String TAG = "FilterFactory";
    private static java.lang.Object mClassLoaderGuard;
    private static java.lang.ClassLoader mCurrentClassLoader;
    private static java.util.HashSet<java.lang.String> mLibraries;
    private static boolean mLogVerbose;
    private static android.filterfw.core.FilterFactory mSharedFactory;
    private java.util.HashSet<java.lang.String> mPackages;
    public FilterFactory() {}
    public static void addFilterLibrary(java.lang.String p0) {}
    public static android.filterfw.core.FilterFactory sharedFactory() { return null; }
    public void addPackage(java.lang.String p0) {}
    public android.filterfw.core.Filter createFilterByClass(java.lang.Class p0, java.lang.String p1) { return null; }
    public android.filterfw.core.Filter createFilterByClassName(java.lang.String p0, java.lang.String p1) { return null; }
}

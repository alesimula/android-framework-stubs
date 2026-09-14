package android.content.res.loader;

public class ResourcesProvider implements java.lang.AutoCloseable, java.io.Closeable {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ResourcesProvider";
    private final android.content.res.ApkAssets mApkAssets = null;
    private final java.lang.ref.Cleaner.Cleanable mCleanable = null;
    private final android.content.res.loader.ResourcesProvider.State mState = null;
    private ResourcesProvider(android.content.res.ApkAssets p0) {}
    public static android.content.res.loader.ResourcesProvider empty(android.content.res.loader.AssetsProvider p0) { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromApk(android.os.ParcelFileDescriptor p0) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromApk(android.os.ParcelFileDescriptor p0, long p1, long p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromApk(android.os.ParcelFileDescriptor p0, android.content.res.loader.AssetsProvider p1) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromDirectory(java.lang.String p0, android.content.res.loader.AssetsProvider p1) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromSplit(android.content.Context p0, java.lang.String p1) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromTable(android.os.ParcelFileDescriptor p0, long p1, long p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadFromTable(android.os.ParcelFileDescriptor p0, android.content.res.loader.AssetsProvider p1) throws java.io.IOException { return null; }
    public static android.content.res.loader.ResourcesProvider loadOverlay(android.content.om.OverlayInfo p0) throws java.io.IOException { return null; }
    public void close() {}
    final void decrementRefCount() {}
    public android.content.res.ApkAssets getApkAssets() { return null; }
    final void incrementRefCount() {}

    private static final class LeakDetector implements java.lang.Runnable {
        private final java.lang.String mDescription = null;
        private final android.content.res.loader.ResourcesProvider.State mState = null;
        LeakDetector(android.content.res.loader.ResourcesProvider.State p0, java.lang.String p1) {}
        public void run() {}
    }

    private static final class State {
        boolean mOpen;
        int mOpenCount;
        private State() {}
    }
}

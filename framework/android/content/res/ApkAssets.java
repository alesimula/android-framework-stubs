package android.content.res;

public final class ApkAssets {
    private static final boolean DEBUG = false;
    private static final int FORMAT_APK = 0;
    private static final int FORMAT_ARSC = 2;
    private static final int FORMAT_DIR = 3;
    private static final int FORMAT_IDMAP = 1;
    public static final int PROPERTY_DISABLE_INCREMENTAL_HARDENING = 16;
    public static final int PROPERTY_DYNAMIC = 2;
    public static final int PROPERTY_LOADER = 4;
    public static final int PROPERTY_ONLY_OVERLAYABLES = 32;
    private static final int PROPERTY_OVERLAY = 8;
    public static final int PROPERTY_SYSTEM = 1;
    private static final int UPTODATE_ALWAYS_TRUE = 2;
    private static final int UPTODATE_FALSE = 0;
    private static final int UPTODATE_TRUE = 1;
    private final android.content.res.loader.AssetsProvider mAssets = null;
    private final int mFlags = 0;
    private final boolean mIsOverlay = false;
    private java.lang.String mName;
    private long mNativePtr;
    private int mPreviousUpToDateResult;
    private android.content.res.StringBlock mStringBlock;
    private ApkAssets(int p0, int p1, android.content.res.loader.AssetsProvider p2, java.lang.String p3) {}
    private ApkAssets(int p0, android.content.res.loader.AssetsProvider p1) {}
    private ApkAssets(int p0, java.io.FileDescriptor p1, java.lang.String p2, int p3, android.content.res.loader.AssetsProvider p4) throws java.io.IOException {}
    private ApkAssets(int p0, java.io.FileDescriptor p1, java.lang.String p2, long p3, long p4, int p5, android.content.res.loader.AssetsProvider p6) throws java.io.IOException {}
    private ApkAssets(int p0, java.lang.String p1, int p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException {}
    private static boolean[] getFlagValuesForNative(java.lang.String[] p0) { return null; }
    private static double intervalMs(long p0, long p1) { return 0.0; }
    public static android.content.res.ApkAssets loadEmptyForLoader(int p0, android.content.res.loader.AssetsProvider p1) { return null; }
    public static android.content.res.ApkAssets loadFromDir(java.lang.String p0, int p1, android.content.res.loader.AssetsProvider p2) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromFd(java.io.FileDescriptor p0, java.lang.String p1, int p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromFd(java.io.FileDescriptor p0, java.lang.String p1, long p2, long p3, int p4, android.content.res.loader.AssetsProvider p5) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadFromPath(java.lang.String p0, int p1, android.content.res.loader.AssetsProvider p2) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadOverlayFromPath(java.lang.String p0, int p1) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadTableFromFd(java.io.FileDescriptor p0, java.lang.String p1, int p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException { return null; }
    public static android.content.res.ApkAssets loadTableFromFd(java.io.FileDescriptor p0, java.lang.String p1, long p2, long p3, int p4, android.content.res.loader.AssetsProvider p5) throws java.io.IOException { return null; }
    private static native boolean nativeDefinesOverlayable(long p0) throws java.io.IOException;
    private static native void nativeDestroy(long p0);
    private static native java.lang.String nativeGetAssetPath(long p0);
    private static native java.lang.String nativeGetDebugName(long p0);
    private static native android.content.om.OverlayableInfo nativeGetOverlayableInfo(long p0, java.lang.String p1) throws java.io.IOException;
    private static native long nativeGetStringBlock(long p0);
    private static native int nativeIsUpToDate(long p0);
    private static native long nativeLoad(int p0, java.lang.String p1, int p2, android.content.res.loader.AssetsProvider p3) throws java.io.IOException;
    private static native long nativeLoadEmpty(int p0, android.content.res.loader.AssetsProvider p1);
    private static native long nativeLoadFd(int p0, java.io.FileDescriptor p1, java.lang.String p2, int p3, android.content.res.loader.AssetsProvider p4) throws java.io.IOException;
    private static native long nativeLoadFdOffsets(int p0, java.io.FileDescriptor p1, java.lang.String p2, long p3, long p4, int p5, android.content.res.loader.AssetsProvider p6) throws java.io.IOException;
    private static native long nativeOpenXml(long p0, java.lang.String p1) throws java.io.IOException;
    public void close() {}
    public boolean definesOverlayable() throws java.io.IOException { return false; }
    void dump(java.io.PrintWriter p0, java.lang.String p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.String getAssetPath() { return null; }
    public android.content.res.loader.AssetsProvider getAssetsProvider() { return null; }
    public java.lang.String getDebugName() { return null; }
    public android.content.om.OverlayableInfo getOverlayableInfo(java.lang.String p0) throws java.io.IOException { return null; }
    java.lang.CharSequence getStringFromPool(int p0) { return null; }
    public boolean isForLoader() { return false; }
    public boolean isOverlay() { return false; }
    public boolean isSharedLib() { return false; }
    public boolean isSystem() { return false; }
    public boolean isUpToDate() { return false; }
    public android.content.res.XmlResourceParser openXml(java.lang.String p0) throws java.io.IOException { return null; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FormatType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PropertyFlags {
    }
}

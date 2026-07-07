package com.android.internal.content;

public class NativeLibraryHelper {
    private static final int BITCODE_PRESENT = 1;
    public static final java.lang.String CLEAR_ABI_OVERRIDE = "-";
    private static final boolean DEBUG_NATIVE = false;
    public static final java.lang.String LIB64_DIR_NAME = "lib64";
    public static final java.lang.String LIB_DIR_NAME = "lib";
    private static final java.lang.String TAG = "NativeHelper";
    public NativeLibraryHelper() {}
    public static com.android.internal.content.NativeLibraryHelper.AlignmentResult checkAlignmentForCompatMode(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String p1, boolean p2, java.lang.String p3) { return null; }
    public static int copyNativeBinaries(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String p2) { return 0; }
    public static int copyNativeBinariesForSupportedAbi(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String[] p2, boolean p3, boolean p4) throws java.io.IOException { return 0; }
    public static int copyNativeBinariesWithOverride(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String p2, boolean p3) { return 0; }
    public static void createNativeLibrarySubdir(java.io.File p0) throws java.io.IOException {}
    public static int findSupportedAbi(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String[] p1) { return 0; }
    private static java.lang.String getRelativePath(java.io.File p0, java.io.File p1) { return null; }
    private static native int hasRenderscriptBitcode(long p0);
    public static boolean hasRenderscriptBitcode(com.android.internal.content.NativeLibraryHelper.Handle p0) throws java.io.IOException { return false; }
    private static int incrementalConfigureNativeBinariesForSupportedAbi(com.android.internal.content.NativeLibraryHelper.Handle p0, java.io.File p1, java.lang.String p2) { return 0; }
    private static native com.android.internal.content.NativeLibraryHelper.AlignmentResult nativeCheckAlignment(long p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4);
    private static native void nativeClose(long p0);
    private static native int nativeCopyNativeBinaries(long p0, java.lang.String p1, java.lang.String p2, boolean p3, boolean p4, boolean p5);
    private static native int nativeFindSupportedAbi(long p0, java.lang.String[] p1);
    private static native long nativeOpenApk(java.lang.String p0);
    private static native long nativeOpenApkFd(java.io.FileDescriptor p0, java.lang.String p1);
    private static native long nativeSumNativeBinaries(long p0, java.lang.String p1);
    public static void removeNativeBinariesFromDirLI(java.io.File p0, boolean p1) {}
    public static void removeNativeBinariesLI(java.lang.String p0) {}
    private static long sumNativeBinaries(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String p1) { return 0L; }
    private static long sumNativeBinariesForSupportedAbi(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String[] p1) { return 0L; }
    public static long sumNativeBinariesWithOverride(com.android.internal.content.NativeLibraryHelper.Handle p0, java.lang.String p1) throws java.io.IOException { return 0L; }

    public static class AlignmentResult {
        public final int flags = 0;
        public final com.android.internal.content.LibraryAlignmentInfo[] unalignedLibraries = null;
        public AlignmentResult(int p0, com.android.internal.content.LibraryAlignmentInfo[] p1) {}
    }

    public static class Handle implements java.io.Closeable {
        final long[] apkHandles = null;
        final java.lang.String[] apkPaths = null;
        final boolean debuggable = false;
        final boolean extractNativeLibs = false;
        private volatile boolean mClosed;
        final boolean multiArch = false;
        final boolean pageSizeCompatDisabled = false;
        Handle(java.lang.String[] p0, long[] p1, boolean p2, boolean p3, boolean p4, boolean p5) {}
        public static com.android.internal.content.NativeLibraryHelper.Handle create(android.content.pm.parsing.PackageLite p0) throws java.io.IOException { return null; }
        public static com.android.internal.content.NativeLibraryHelper.Handle create(java.io.File p0) throws java.io.IOException { return null; }
        public static com.android.internal.content.NativeLibraryHelper.Handle create(java.util.List<java.lang.String> p0, boolean p1, boolean p2, boolean p3, boolean p4) throws java.io.IOException { return null; }
        public static com.android.internal.content.NativeLibraryHelper.Handle createFd(android.content.pm.parsing.PackageLite p0, java.io.FileDescriptor p1) throws java.io.IOException { return null; }
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
    }
}

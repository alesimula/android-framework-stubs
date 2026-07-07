package android.internal.modules.utils.build;

public final class UnboundedSdkLevel {
    private static final android.util.SparseArray<java.util.Set<java.lang.String>> PREVIOUS_CODENAMES = null;
    private static final android.internal.modules.utils.build.UnboundedSdkLevel sInstance = null;
    private final java.lang.String mCodename = null;
    private final boolean mIsReleaseBuild = false;
    private final java.util.Set<java.lang.String> mKnownCodenames = null;
    private final int mSdkInt = 0;
    UnboundedSdkLevel(int p0, java.lang.String p1, java.util.Set<java.lang.String> p2) {}
    public static boolean isAtLeast(java.lang.String p0) { return false; }
    public static boolean isAtMost(java.lang.String p0) { return false; }
    private boolean isCodename(java.lang.String p0) { return false; }
    private static java.util.Set<java.lang.String> setOf(java.lang.String... p0) { return null; }
    boolean isAtLeastInternal(java.lang.String p0) { return false; }
    boolean isAtMostInternal(java.lang.String p0) { return false; }
    java.lang.String removeFingerprint(java.lang.String p0) { return null; }
}

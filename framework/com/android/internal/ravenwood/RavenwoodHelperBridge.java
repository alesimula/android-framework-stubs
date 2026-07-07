package com.android.internal.ravenwood;

public final class RavenwoodHelperBridge {
    public static final java.lang.String TAG = "RavenwoodHelperBridge";
    private static com.android.internal.ravenwood.RavenwoodHelperBridge sInstance;
    public RavenwoodHelperBridge() {}
    public static long enterMethod(java.lang.Class<?> p0, java.lang.Object p1, java.lang.String p2, java.lang.String p3, java.lang.Object[] p4) { return 0L; }
    public static void exitMethod(long p0, java.lang.Class<?> p1, java.lang.Object p2, java.lang.String p3, java.lang.String p4, java.lang.Object p5) {}
    public static void exitMethod(long p0, java.lang.Class<?> p1, java.lang.Object p2, java.lang.String p3, java.lang.String p4, java.lang.Object p5, java.lang.Throwable p6) {}
    public static int forExperimentalApiTest() { return 0; }
    public static com.android.internal.ravenwood.RavenwoodHelperBridge getInstance() { return null; }
    public static java.lang.Throwable getStackTrace(java.lang.String p0) { return null; }
    private boolean isRunningOnRavenwood$ravenwood() { return false; }
    private static java.lang.RuntimeException notSupportedOnDevice() { return null; }
    public <T extends java.lang.Object> T fromAddress(long p0) { return null; }
    @java.lang.Deprecated
    public java.lang.String getRavenwoodRuntimePath() { return null; }
    @java.lang.Deprecated
    public boolean isRunningOnRavenwood() { return false; }

    public static class CompatIdsForTest {
        public static final long TEST_COMPAT_ID_1 = 368131859L;
        public static final long TEST_COMPAT_ID_2 = 368131701L;
        public static final long TEST_COMPAT_ID_3 = 368131659L;
        public static final long TEST_COMPAT_ID_4 = 368132057L;
        public static final long TEST_COMPAT_ID_5 = 387558811L;
        public CompatIdsForTest() {}
    }
}

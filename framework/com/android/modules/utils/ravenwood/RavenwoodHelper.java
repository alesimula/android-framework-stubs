package com.android.modules.utils.ravenwood;

public class RavenwoodHelper {
    private RavenwoodHelper() {}
    public static java.lang.String getRavenwoodAconfigStoragePath() { return null; }
    public static java.lang.String getRavenwoodRuntimePath() { return null; }
    public static boolean isRunningOnRavenwood() { return false; }
    private static void throwIfCalledOnDevice() {}

    public static class RavenwoodInternal {
        public static final java.lang.String RAVENWOOD_RUNTIME_PATH_JAVA_SYSPROP = "android.ravenwood.runtime_path";
        public static final java.lang.String RAVENWOOD_VERSION_JAVA_SYSPROP = "android.ravenwood.version";
        private RavenwoodInternal() {}
    }
}

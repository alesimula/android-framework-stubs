package com.android.internal.os;

public class RuntimeInit {
    static final boolean DEBUG = false;
    private static final java.lang.String SYSPROP_CRASH_COUNT = "sys.system_server.crash_java";
    static final java.lang.String TAG = "AndroidRuntime";
    private static boolean initialized;
    private static android.os.IBinder mApplicationObject;
    private static int mCrashCount;
    private static volatile boolean mCrashing;
    private static volatile com.android.internal.os.RuntimeInit.ApplicationWtfHandler sDefaultApplicationWtfHandler;
    public RuntimeInit() {}
    private static int Clog_e(java.lang.String p0, java.lang.String p1, java.lang.Throwable p2) { return 0; }
    protected static java.lang.Runnable applicationInit(int p0, long[] p1, long[] p2, java.lang.String[] p3, java.lang.ClassLoader p4) { return null; }
    private static void closeLogStreams() {}
    protected static final void commonInit() {}
    private static void enableDdms() {}
    protected static java.lang.Runnable findStaticMain(java.lang.String p0, java.lang.String[] p1, java.lang.ClassLoader p2) { return null; }
    public static final android.os.IBinder getApplicationObject() { return null; }
    private static java.lang.String getDefaultUserAgent() { return null; }
    public static void logUncaught(java.lang.String p0, java.lang.String p1, int p2, java.lang.Throwable p3) {}
    public static final void main(java.lang.String[] p0) {}
    private static final native void nativeFinishInit();
    private static final native void nativeSetExitWithoutCleanup(boolean p0);
    public static void preForkInit() {}
    public static void redirectLogStreams() {}
    public static final void setApplicationObject(android.os.IBinder p0) {}
    public static void setDefaultApplicationWtfHandler(com.android.internal.os.RuntimeInit.ApplicationWtfHandler p0) {}
    public static void wtf(java.lang.String p0, java.lang.Throwable p1, boolean p2) {}

    public static interface ApplicationWtfHandler {
        public boolean handleApplicationWtf(android.os.IBinder p0, java.lang.String p1, boolean p2, android.app.ApplicationErrorReport.ParcelableCrashInfo p3, int p4);
    }

    static class Arguments {
        java.lang.String[] startArgs;
        java.lang.String startClass;
        Arguments(java.lang.String[] p0) throws java.lang.IllegalArgumentException {}
        private void parseArgs(java.lang.String[] p0) throws java.lang.IllegalArgumentException {}
    }

    private static class KillApplicationHandler implements java.lang.Thread.UncaughtExceptionHandler {
        private final com.android.internal.os.RuntimeInit.LoggingHandler mLoggingHandler = null;
        public KillApplicationHandler(com.android.internal.os.RuntimeInit.LoggingHandler p0) {}
        private void ensureLogging(java.lang.Thread p0, java.lang.Throwable p1) {}
        public void uncaughtException(java.lang.Thread p0, java.lang.Throwable p1) {}
    }

    private static class LoggingHandler implements java.lang.Thread.UncaughtExceptionHandler {
        public volatile boolean mTriggered;
        private LoggingHandler() {}
        public void uncaughtException(java.lang.Thread p0, java.lang.Throwable p1) {}
    }

    static class MethodAndArgsCaller implements java.lang.Runnable {
        private final java.lang.String[] mArgs = null;
        private final java.lang.reflect.Method mMethod = null;
        public MethodAndArgsCaller(java.lang.reflect.Method p0, java.lang.String[] p1) {}
        public void run() {}
    }
}

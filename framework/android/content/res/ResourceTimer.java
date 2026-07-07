package android.content.res;

public final class ResourceTimer {
    private static boolean ENABLE_DEBUG;
    private static final java.lang.String TAG = "ResourceTimer";
    private static android.os.Handler mHandler;
    private static int[] sApiMap;
    private static android.content.res.ResourceTimer.Config sConfig;
    private static int sCurrentPoint;
    private static boolean sEnabled;
    private static boolean sIncrementalMetrics;
    private static long sLastUpdated;
    private static final java.lang.Object sLock = null;
    private static android.content.res.ResourceTimer sManager;
    private static final long sProcessStart = Long.valueOf(0L);
    private static final long[] sPublicationPoints = null;
    private static android.content.res.ResourceTimer.Timer[] sTimers;
    private ResourceTimer() {}
    public static void dumpTimers(java.io.FileDescriptor p0, java.lang.String... p1) {}
    private static void handleMessage(android.os.Message p0) {}
    private static native int nativeEnableTimers(android.content.res.ResourceTimer.Config p0);
    private static native int nativeGetTimers(android.content.res.ResourceTimer.Timer[] p0, boolean p1);
    private static java.lang.String packedString(int[] p0) { return null; }
    private static void publish() {}
    public static void start() {}
    private static void startTimer() {}
    private static void update(boolean p0) {}

    private static class Config {
        int maxBuckets;
        int maxLargest;
        int maxTimer;
        java.lang.String[] timers;
        private Config() {}
    }

    private static class Timer {
        int count;
        int[] largest;
        int maxtime;
        int mintime;
        int[] percentile;
        long total;
        private Timer() {}
        public java.lang.String toString() { return null; }
    }
}

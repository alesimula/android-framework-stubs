package android.os;

public final class Looper {
    public static final long LOOPER_CLEARS_THREAD_INTERRUPTED = 458413887L;
    private static final java.lang.String TAG = "Looper";
    private static volatile boolean sIsLooperClearsThreadInterruptedEnabled;
    private static final java.lang.invoke.VarHandle sLooperDoctor = null;
    private static android.os.Looper sMainLooper;
    private static android.os.Looper.Observer sObserver;
    static final java.lang.ThreadLocal<android.os.Looper> sThreadLocal = null;
    private android.os.LooperDoctor.LooperDoctorAlarm mAlarm;
    private boolean mInLoop;
    private android.util.Printer mLogging;
    private volatile android.os.LooperDoctor mLooperDoctor;
    final android.os.MessageQueue mQueue = null;
    private boolean mSlowDeliveryDetected;
    private long mSlowDeliveryThresholdMs;
    private long mSlowDispatchThresholdMs;
    final java.lang.Thread mThread = null;
    private long mTraceTag;
    private Looper(boolean p0) {}
    public static void clearMainLooperForTest() {}
    public static android.os.Looper getMainLooper() { return null; }
    private static int getThreadGroup() { return 0; }
    private static int getThresholdOverride() { return 0; }
    private static boolean isLooperClearsThreadInterruptedEnabled() { return false; }
    public static void loop() {}
    private static boolean loopOnce(android.os.Looper p0, long p1, int p2) { return false; }
    public static android.os.Looper myLooper() { return null; }
    public static android.os.MessageQueue myQueue() { return null; }
    public static void prepare() {}
    private static void prepare(boolean p0) {}
    @java.lang.Deprecated
    public static void prepareMainLooper() {}
    public static void setMainLooperForTest(android.os.Looper p0) {}
    public static void setObserver(android.os.Looper.Observer p0) {}
    private static boolean showSlowLog(long p0, long p1, long p2, java.lang.String p3, android.os.Message p4) { return false; }
    private static java.lang.String threadGroupToString(int p0) { return null; }
    public void clearLooperDoctor() {}
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1, android.os.Handler p2) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public android.os.MessageQueue getQueue() { return null; }
    public java.lang.Thread getThread() { return null; }
    public boolean isCurrentThread() { return false; }
    public void quit() {}
    public void quitSafely() {}
    public void setLooperDoctor(android.os.LooperDoctor p0) {}
    public void setMessageLogging(android.util.Printer p0) {}
    public void setSlowLogThresholdMs(long p0, long p1) {}
    public void setTraceTag(long p0) {}
    public java.lang.String toString() { return null; }

    private static class NoImagePreloadHolder {
        private static final boolean sVerboseLogging = Boolean.valueOf(false);
        private NoImagePreloadHolder() {}
    }

    public static interface Observer {
        public void dispatchingThrewException(java.lang.Object p0, android.os.Message p1, java.lang.Exception p2);
        public java.lang.Object messageDispatchStarting();
        public void messageDispatched(java.lang.Object p0, android.os.Message p1);
    }
}

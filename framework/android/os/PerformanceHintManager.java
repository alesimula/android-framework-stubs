package android.os;

public final class PerformanceHintManager {
    private final long mNativeManagerPtr = 0L;
    private PerformanceHintManager(long p0) {}
    public static android.os.PerformanceHintManager create() throws android.os.ServiceManager.ServiceNotFoundException { return null; }
    private static native long nativeAcquireManager();
    private static native void nativeCloseSession(long p0);
    private static native long nativeCreateSession(long p0, int[] p1, long p2);
    private static native long nativeGetPreferredUpdateRateNanos(long p0);
    private static native int[] nativeGetThreadIds(long p0);
    private static native void nativeReportActualWorkDuration(long p0, long p1);
    private static native void nativeReportActualWorkDuration(long p0, long p1, long p2, long p3, long p4);
    private static native void nativeSendHint(long p0, int p1);
    private static native void nativeSetPreferPowerEfficiency(long p0, boolean p1);
    private static native void nativeSetThreads(long p0, int[] p1);
    private static native void nativeUpdateTargetWorkDuration(long p0, long p1);
    public android.os.PerformanceHintManager.Session createHintSession(int[] p0, long p1) { return null; }
    public long getPreferredUpdateRateNanos() { return 0L; }

    public static class Session implements java.io.Closeable {
        public static final int CPU_LOAD_DOWN = 1;
        public static final int CPU_LOAD_RESET = 2;
        public static final int CPU_LOAD_RESUME = 3;
        public static final int CPU_LOAD_UP = 0;
        public static final int GPU_LOAD_DOWN = 6;
        public static final int GPU_LOAD_RESET = 7;
        public static final int GPU_LOAD_UP = 5;
        public long mNativeSessionPtr;
        public Session(long p0) {}
        public void close() {}
        protected void finalize() throws java.lang.Throwable {}
        public int[] getThreadIds() { return null; }
        public void reportActualWorkDuration(long p0) {}
        public void reportActualWorkDuration(android.os.WorkDuration p0) {}
        public void sendHint(int p0) {}
        public void setPreferPowerEfficiency(boolean p0) {}
        public void setThreads(int[] p0) {}
        public void updateTargetWorkDuration(long p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Hint {
        }
    }
}

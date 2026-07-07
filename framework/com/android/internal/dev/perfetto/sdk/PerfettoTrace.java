package com.android.internal.dev.perfetto.sdk;

public final class PerfettoTrace {
    private static final int PERFETTO_TE_TYPE_COUNTER = 4;
    private static final int PERFETTO_TE_TYPE_INSTANT = 3;
    private static final int PERFETTO_TE_TYPE_SLICE_BEGIN = 1;
    private static final int PERFETTO_TE_TYPE_SLICE_END = 2;
    private static final java.lang.String TAG = "PerfettoTrace";
    private static final java.util.concurrent.atomic.AtomicBoolean sAttemptedSystemRegistration = null;
    private static final java.util.concurrent.atomic.AtomicInteger sFlowEventId = null;
    private static boolean sIsDebug;
    private static final com.android.internal.dev.perfetto.sdk.PerfettoNativeMemoryCleaner sNativeMemoryCleaner = null;
    public PerfettoTrace() {}
    public static void activateTrigger(java.lang.String p0, int p1) {}
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder begin(com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p0, java.lang.String p1) { return null; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder counter(com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p0, double p1) { return null; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder counter(com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p0, double p1, java.lang.String p2) { return null; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder counter(com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p0, long p1) { return null; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder counter(com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p0, long p1, java.lang.String p2) { return null; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder counterWithDynamicName(com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p0, double p1, java.lang.String p2) { return null; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder counterWithDynamicName(com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p0, long p1, java.lang.String p2) { return null; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder end(com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p0) { return null; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder expensiveDebugCallStack(com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p0, java.lang.String p1, java.lang.StackTraceElement[] p2) { return null; }
    public static boolean getAttempedSystemRegistration() { return false; }
    public static int getFlowId() { return 0; }
    public static long getGlobalTrackUuid() { return 0L; }
    public static long getProcessTrackUuid() { return 0L; }
    public static long getThreadTrackUuid(long p0) { return 0L; }
    public static com.android.internal.dev.perfetto.sdk.PerfettoTrackEventBuilder instant(com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category p0, java.lang.String p1) { return null; }
    private static native void native_activate_trigger(java.lang.String p0, int p1);
    private static native long native_get_process_track_uuid();
    private static native long native_get_thread_track_uuid(long p0);
    private static native void native_register(boolean p0);
    private static native long native_start_session(boolean p0, byte[] p1);
    private static native byte[] native_stop_session(long p0);
    private static byte[] native_stop_session$ravenwood(long p0) { return null; }
    public static void register(boolean p0) {}
    public static void registerWithDebugChecks(boolean p0) {}

    public static class Category implements com.android.internal.dev.perfetto.sdk.PerfettoTrackEventExtra.PerfettoPointer {
        private volatile boolean mIsRegistered;
        private final java.lang.String mName = null;
        private volatile long mPtr;
        private final java.util.List<java.lang.String> mTags = null;
        public Category(java.lang.String p0) {}
        public Category(java.lang.String p0, java.util.List<java.lang.String> p1) {}
        private static native long native_delete();
        private static native long native_init(java.lang.String p0, java.lang.String[] p1);
        private static native boolean native_is_enabled(long p0);
        private static native void native_register(long p0);
        private static native void native_unregister(long p0);
        public java.lang.String getName() { return null; }
        public long getPtr() { return 0L; }
        public java.util.List<java.lang.String> getTags() { return null; }
        public boolean isEnabled() { return false; }
        public boolean isRegistered() { return false; }
        public com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category register() { return null; }
        public com.android.internal.dev.perfetto.sdk.PerfettoTrace.Category unregister() { return null; }
    }

    public static final class Session {
        private final long mPtr = 0L;
        public Session(boolean p0, byte[] p1) {}
        public byte[] close() { return null; }
    }
}

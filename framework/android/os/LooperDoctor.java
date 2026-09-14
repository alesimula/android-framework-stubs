package android.os;

public final class LooperDoctor {
    private static final boolean DEBUG = false;
    public static final java.lang.String LOOPER_DOCTOR_EVENT_LATE_HANDLER = "LateHandlerWithCallstack";
    public static final java.lang.String LOOPER_DOCTOR_TRIGGER_LATE_HANDLER = "com.android.LooperDoctor.LateHandler";
    public static final java.lang.String LOOPER_DOCTOR_TRIGGER_LATE_MESSAGE = "com.android.LooperDoctor.LateMessage";
    public static final java.lang.String LOOPER_DOCTOR_TRIGGER_QUEUE_LENGTH = "com.android.LooperDoctor.QueueLength";
    private static final long MAX_HANDLER_RUNTIME_MS_DEFAULT = 500L;
    private static final long MAX_QUEUE_LENGTH_DEFAULT = 1000L;
    private static final long MESSAGE_DEADLINE_MS_DEFAULT = 5000L;
    private static final long MIN_TRIGGER_INTERVAL_MS_DEFAULT = 21600000L;
    private static final int PERFETTO_TRIGGER_WAIT_MS = 1000;
    private static final java.lang.String TAG = "LooperDoctor";
    public static boolean sDropThreadRefOnExit;
    private static final java.lang.invoke.VarHandle sLastTriggerTimeMs = null;
    private static final android.os.LooperDoctor sLooperDoctor = null;
    private static final java.lang.invoke.VarHandle sMaxQueueLength = null;
    private static final java.util.concurrent.atomic.AtomicReference<android.os.LooperDoctor.LooperDoctorThread> sThreadRefValue = null;
    private volatile long mLastTriggerTimeMs;
    private final long mLateMessageThresholdMs = 0L;
    private final long mMaxHandlerRuntimeMs = 0L;
    private volatile long mMaxQueueLength;
    private final long mMinTriggerIntervalMs = 0L;
    private LooperDoctor(android.os.LooperDoctor.Builder p0) {}
    private boolean checkAndSetTriggerTime(long p0) { return false; }
    public static void install(android.os.HandlerThread p0) {}
    private static boolean isMqTracingEnabled() { return false; }
    private void maybeStartLooperDoctorThread() {}
    private void maybeStopLooperDoctorThread() {}
    public void checkMessageQueueLength(long p0) {}
    public long getLateMessageThresholdMs() { return 0L; }
    public long getMaxHandlerRuntimeMs() { return 0L; }
    public long getMaxQueueLength() { return 0L; }
    public void messageDequeuedForDelivery(android.os.Message p0, long p1) {}
    public void messageEnqueued(android.os.Message p0) {}
    public void notifyLooperQuit(android.os.LooperDoctor.LooperDoctorAlarm p0) {}
    public android.os.LooperDoctor.LooperDoctorAlarm notifyLooperStartedLooping(java.lang.Thread p0) { return null; }
    public void startMessageTimer(android.os.LooperDoctor.LooperDoctorAlarm p0) {}
    public void stopMessageTimer(android.os.LooperDoctor.LooperDoctorAlarm p0) {}

    public static class Builder {
        private long mLateMessageThresholdMs;
        private long mMaxHandlerRuntimeMs;
        private long mMaxQueueLength;
        private long mMinTriggerIntervalMs;
        public Builder() {}
        public android.os.LooperDoctor build() { return null; }
        public android.os.LooperDoctor.Builder setLateMessageThresholdMs(long p0) { return null; }
        public android.os.LooperDoctor.Builder setMaxHandlerRuntimeMs(long p0) { return null; }
        public android.os.LooperDoctor.Builder setMaxQueueLength(long p0) { return null; }
        public android.os.LooperDoctor.Builder setMinTriggerIntervalMs(long p0) { return null; }
    }

    public static class LooperDoctorAlarm {
        public static final java.lang.invoke.VarHandle sWhen = null;
        public android.os.LooperDoctor mDoctor;
        public java.lang.Thread mLooperThread;
        public volatile long mWhen;
        public LooperDoctorAlarm() {}
    }

    static class LooperDoctorThread extends java.lang.Thread {
        private static final java.lang.String TAG = "LooperDoctorThread";
        static final java.lang.String THREAD_NAME = "LooperDoctorThread";
        static final long WAKEUP_NEVER = 9223372036854775807L;
        static final java.util.concurrent.atomic.AtomicLong sAlarmThreadCountValue = null;
        static final java.util.concurrent.CopyOnWriteArrayList<android.os.LooperDoctor.LooperDoctorAlarm> sList = null;
        volatile long mNextWakeup;
        volatile boolean mShutdown;
        LooperDoctorThread() { super(); }
        private static android.os.LooperDoctor.LooperDoctorAlarm addAlarm(android.os.LooperDoctor p0, java.lang.Thread p1) { return null; }
        private static void removeAlarm(android.os.LooperDoctor.LooperDoctorAlarm p0) {}
        public void run() {}
    }
}

package android.app;

public class AlarmManager {
    public static final java.lang.String ACTION_NEXT_ALARM_CLOCK_CHANGED = "android.app.action.NEXT_ALARM_CLOCK_CHANGED";
    public static final java.lang.String ACTION_SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED = "android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED";
    public static final int ELAPSED_REALTIME = 3;
    public static final int ELAPSED_REALTIME_WAKEUP = 2;
    public static final long ENABLE_USE_EXACT_ALARM = 218533173L;
    public static final long ENFORCE_MINIMUM_WINDOW_ON_INEXACT_ALARMS = 185199076L;
    public static final long EXACT_LISTENER_ALARMS_DROPPED_ON_CACHED = 265195908L;
    public static final int FLAG_ALLOW_WHILE_IDLE = 4;
    public static final int FLAG_ALLOW_WHILE_IDLE_COMPAT = 32;
    public static final int FLAG_ALLOW_WHILE_IDLE_UNRESTRICTED = 8;
    public static final int FLAG_IDLE_UNTIL = 16;
    public static final int FLAG_PRIORITIZE = 64;
    public static final int FLAG_STANDALONE = 1;
    public static final int FLAG_WAKE_FROM_IDLE = 2;
    private static final java.lang.String GENERATED_TAG_PREFIX = "$android.alarm.generated";
    public static final long INTERVAL_DAY = 86400000L;
    public static final long INTERVAL_FIFTEEN_MINUTES = 900000L;
    public static final long INTERVAL_HALF_DAY = 43200000L;
    public static final long INTERVAL_HALF_HOUR = 1800000L;
    public static final long INTERVAL_HOUR = 3600000L;
    public static final long REQUIRE_EXACT_ALARM_PERMISSION = 171306433L;
    public static final int RTC = 1;
    public static final int RTC_WAKEUP = 0;
    public static final long SCHEDULE_EXACT_ALARM_DENIED_BY_DEFAULT = 226439802L;
    public static final long SCHEDULE_EXACT_ALARM_DOES_NOT_ELEVATE_BUCKET = 262645982L;
    private static final java.lang.String TAG = "AlarmManager";
    public static final long WINDOW_EXACT = 0L;
    public static final long WINDOW_HEURISTIC = -1L;
    private static java.util.WeakHashMap<android.app.AlarmManager.OnAlarmListener, java.lang.ref.WeakReference<android.app.AlarmManager.ListenerWrapper>> sWrappers;
    private final boolean mAlwaysExact = false;
    private final android.content.Context mContext = null;
    private final android.os.Handler mMainThreadHandler = null;
    private final java.lang.String mPackageName = null;
    private final android.app.IAlarmManager mService = null;
    private final int mTargetSdkVersion = 0;
    AlarmManager(android.app.IAlarmManager p0, android.content.Context p1) {}
    private long legacyExactLength() { return 0L; }
    private static java.lang.String makeTag(long p0, android.os.WorkSource p1) { return null; }
    private void setImpl(int p0, long p1, long p2, long p3, int p4, android.app.PendingIntent p5, android.app.AlarmManager.OnAlarmListener p6, java.lang.String p7, android.os.Handler p8, android.os.WorkSource p9, android.app.AlarmManager.AlarmClockInfo p10) {}
    private void setImpl(int p0, long p1, long p2, long p3, int p4, android.app.PendingIntent p5, android.app.AlarmManager.OnAlarmListener p6, java.lang.String p7, java.util.concurrent.Executor p8, android.os.WorkSource p9, android.app.AlarmManager.AlarmClockInfo p10) {}
    public boolean canScheduleExactAlarms() { return false; }
    public void cancel(android.app.AlarmManager.OnAlarmListener p0) {}
    public void cancel(android.app.PendingIntent p0) {}
    public void cancelAll() {}
    public android.app.AlarmManager.AlarmClockInfo getNextAlarmClock() { return null; }
    public android.app.AlarmManager.AlarmClockInfo getNextAlarmClock(int p0) { return null; }
    public long getNextWakeFromIdleTime() { return 0L; }
    public long getPrioritizedAlarmDelay() { return 0L; }
    public boolean hasScheduleExactAlarm(java.lang.String p0, int p1) { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void set(int p0, long p1, long p2, long p3, android.app.AlarmManager.OnAlarmListener p4, android.os.Handler p5, android.os.WorkSource p6) {}
    @android.annotation.SystemApi
    public void set(int p0, long p1, long p2, long p3, android.app.PendingIntent p4, android.os.WorkSource p5) {}
    public void set(int p0, long p1, long p2, long p3, java.lang.String p4, android.app.AlarmManager.OnAlarmListener p5, android.os.Handler p6, android.os.WorkSource p7) {}
    public void set(int p0, long p1, android.app.PendingIntent p2) {}
    public void set(int p0, long p1, java.lang.String p2, android.app.AlarmManager.OnAlarmListener p3, android.os.Handler p4) {}
    public void setAlarmClock(android.app.AlarmManager.AlarmClockInfo p0, android.app.PendingIntent p1) {}
    public void setAndAllowWhileIdle(int p0, long p1, android.app.PendingIntent p2) {}
    public void setExact(int p0, long p1, android.app.PendingIntent p2) {}
    public void setExact(int p0, long p1, java.lang.String p2, android.app.AlarmManager.OnAlarmListener p3, android.os.Handler p4) {}
    @android.annotation.SystemApi
    public void setExact(int p0, long p1, java.lang.String p2, java.util.concurrent.Executor p3, android.os.WorkSource p4, android.app.AlarmManager.OnAlarmListener p5) {}
    public void setExactAndAllowWhileIdle(int p0, long p1, android.app.PendingIntent p2) {}
    public void setExactAndAllowWhileIdle(int p0, long p1, java.lang.String p2, java.util.concurrent.Executor p3, android.app.AlarmManager.OnAlarmListener p4) {}
    @android.annotation.SystemApi
    public void setExactAndAllowWhileIdle(int p0, long p1, java.lang.String p2, java.util.concurrent.Executor p3, android.os.WorkSource p4, android.app.AlarmManager.OnAlarmListener p5) {}
    public void setIdleUntil(int p0, long p1, java.lang.String p2, android.app.AlarmManager.OnAlarmListener p3, android.os.Handler p4) {}
    public void setInexactRepeating(int p0, long p1, long p2, android.app.PendingIntent p3) {}
    @android.annotation.SystemApi
    public void setPrioritized(int p0, long p1, long p2, java.lang.String p3, java.util.concurrent.Executor p4, android.app.AlarmManager.OnAlarmListener p5) {}
    public void setRepeating(int p0, long p1, long p2, android.app.PendingIntent p3) {}
    public void setTime(long p0) {}
    public void setTimeZone(java.lang.String p0) {}
    public void setWindow(int p0, long p1, long p2, android.app.PendingIntent p3) {}
    public void setWindow(int p0, long p1, long p2, java.lang.String p3, android.app.AlarmManager.OnAlarmListener p4, android.os.Handler p5) {}
    public void setWindow(int p0, long p1, long p2, java.lang.String p3, java.util.concurrent.Executor p4, android.app.AlarmManager.OnAlarmListener p5) {}
    @android.annotation.SystemApi
    public void setWindow(int p0, long p1, long p2, java.lang.String p3, java.util.concurrent.Executor p4, android.os.WorkSource p5, android.app.AlarmManager.OnAlarmListener p6) {}

    public static final class AlarmClockInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.AlarmManager.AlarmClockInfo> CREATOR = null;
        private final android.app.PendingIntent mShowIntent = null;
        private final long mTriggerTime = 0L;
        public AlarmClockInfo(long p0, android.app.PendingIntent p1) {}
        AlarmClockInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public android.app.PendingIntent getShowIntent() { return null; }
        public long getTriggerTime() { return 0L; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlarmType {
    }

    final class ListenerWrapper extends android.app.IAlarmListener.Stub implements java.lang.Runnable {
        android.app.IAlarmCompleteListener mCompletion;
        java.util.concurrent.Executor mExecutor;
        final android.app.AlarmManager.OnAlarmListener mListener = null;
        public ListenerWrapper(android.app.AlarmManager p0, android.app.AlarmManager.OnAlarmListener p1) { super(); }
        public void cancel() {}
        public void doAlarm(android.app.IAlarmCompleteListener p0) {}
        public void run() {}
        void setExecutor(java.util.concurrent.Executor p0) {}
    }

    public static interface OnAlarmListener {
        public void onAlarm();
    }
}

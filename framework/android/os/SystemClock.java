package android.os;

public final class SystemClock {
    private static final java.lang.String TAG = "SystemClock";
    private static volatile android.app.IAlarmManager sIAlarmManager;
    private SystemClock() {}
    public static java.time.Clock currentGnssTimeClock() { return null; }
    public static java.time.Clock currentNetworkTimeClock() { return null; }
    public static long currentNetworkTimeMillis() { return 0L; }
    public static native long currentThreadTimeMicro();
    public static native long currentThreadTimeMillis();
    public static native long currentTimeMicro();
    public static long currentTimeMicro$ravenwood() { return 0L; }
    public static native long elapsedRealtime();
    public static long elapsedRealtime$ravenwood() { return 0L; }
    public static java.time.Clock elapsedRealtimeClock() { return null; }
    public static native long elapsedRealtimeNanos();
    public static long elapsedRealtimeNanos$ravenwood() { return 0L; }
    private static android.app.IAlarmManager getIAlarmManager() { return null; }
    public static boolean setCurrentTimeMillis(long p0) { return false; }
    public static void sleep(long p0) {}
    public static java.time.Clock uptimeClock() { return null; }
    public static native long uptimeMillis();
    public static long uptimeMillis$ravenwood() { return 0L; }
    public static native long uptimeNanos();
    public static long uptimeNanos$ravenwood() { return 0L; }
}

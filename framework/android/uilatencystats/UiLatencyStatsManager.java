package android.uilatencystats;

public class UiLatencyStatsManager {
    public static final int EVENT_LAUNCHER_SHOWN = 1;
    public static final int EVENT_LOCK_SCREEN_UNLOCK_START = 2;
    private final android.uilatencystats.IUiLatencyStats mService = null;
    public UiLatencyStatsManager(android.content.Context p0, android.uilatencystats.IUiLatencyStats p1) {}
    public static android.uilatencystats.EventType getEventType(int p0) { return null; }
    public void reportEvent(int p0) {}
    public void reportEvent(int p0, long p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Event {
    }
}

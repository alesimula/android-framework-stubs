package android.app.time;

public final class TimeManager {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "time.TimeManager";
    private final android.app.timedetector.ITimeDetectorService mITimeDetectorService = null;
    private final android.app.timezonedetector.ITimeZoneDetectorService mITimeZoneDetectorService = null;
    private final java.lang.Object mLock = null;
    private android.util.ArrayMap<android.app.time.TimeManager.TimeZoneDetectorListener, android.app.time.TimeManager.TimeZoneDetectorListener> mTimeZoneDetectorListeners;
    private android.app.time.ITimeZoneDetectorListener mTimeZoneDetectorReceiver;
    public TimeManager() throws android.os.ServiceManager.ServiceNotFoundException {}
    private void notifyTimeZoneDetectorListeners() {}
    @android.annotation.SystemApi
    public void addTimeZoneDetectorListener(java.util.concurrent.Executor p0, android.app.time.TimeManager.TimeZoneDetectorListener p1) {}
    @android.annotation.SystemApi
    public boolean confirmTime(android.app.time.UnixEpochTime p0) { return false; }
    @android.annotation.SystemApi
    public boolean confirmTimeZone(java.lang.String p0) { return false; }
    public java.util.TimeZone getHomeTimeZone() { return null; }
    @android.annotation.SystemApi
    public android.app.time.TimeCapabilitiesAndConfig getTimeCapabilitiesAndConfig() { return null; }
    @android.annotation.SystemApi
    public android.app.time.TimeState getTimeState() { return null; }
    @android.annotation.SystemApi
    public android.app.time.TimeZoneCapabilitiesAndConfig getTimeZoneCapabilitiesAndConfig() { return null; }
    @android.annotation.SystemApi
    public android.app.time.TimeZoneState getTimeZoneState() { return null; }
    @android.annotation.SystemApi
    public void removeTimeZoneDetectorListener(android.app.time.TimeManager.TimeZoneDetectorListener p0) {}
    @android.annotation.SystemApi
    public boolean setManualTime(android.app.time.UnixEpochTime p0) { return false; }
    @android.annotation.SystemApi
    public boolean setManualTimeZone(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public void suggestExternalTime(android.app.time.ExternalTimeSuggestion p0) {}
    @android.annotation.SystemApi
    public boolean updateTimeConfiguration(android.app.time.TimeConfiguration p0) { return false; }
    @android.annotation.SystemApi
    public boolean updateTimeZoneConfiguration(android.app.time.TimeZoneConfiguration p0) { return false; }

    @android.annotation.SystemApi
    @java.lang.FunctionalInterface
    public static interface TimeZoneDetectorListener {
        public void onChange();
    }
}

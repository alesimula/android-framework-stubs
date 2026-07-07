package android.service.timezone;

@android.annotation.SystemApi
public abstract class TimeZoneProviderService extends android.app.Service {
    public static final java.lang.String PRIMARY_LOCATION_TIME_ZONE_PROVIDER_SERVICE_INTERFACE = "android.service.timezone.PrimaryLocationTimeZoneProviderService";
    public static final java.lang.String SECONDARY_LOCATION_TIME_ZONE_PROVIDER_SERVICE_INTERFACE = "android.service.timezone.SecondaryLocationTimeZoneProviderService";
    private static final java.lang.String TAG = "TimeZoneProviderService";
    public static final java.lang.String TEST_COMMAND_RESULT_ERROR_KEY = "ERROR";
    public static final java.lang.String TEST_COMMAND_RESULT_SUCCESS_KEY = "SUCCESS";
    private long mEventFilteringAgeThresholdMillis;
    private final android.os.Handler mHandler = null;
    private android.service.timezone.TimeZoneProviderEvent mLastEventSent;
    private final java.lang.Object mLock = null;
    private android.service.timezone.ITimeZoneProviderManager mManager;
    private final android.service.timezone.TimeZoneProviderService.TimeZoneProviderServiceWrapper mWrapper = null;
    public TimeZoneProviderService() { super(); }
    private void onStartUpdatesInternal(android.service.timezone.ITimeZoneProviderManager p0, long p1, long p2) {}
    private void onStopUpdatesInternal() {}
    private void reportSuggestionInternal(android.service.timezone.TimeZoneProviderSuggestion p0, android.service.timezone.TimeZoneProviderStatus p1) {}
    private void reportUncertainInternal(android.service.timezone.TimeZoneProviderStatus p0) {}
    private boolean shouldSendEvent(android.service.timezone.TimeZoneProviderEvent p0) { return false; }
    protected void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onStartUpdates(long p0);
    public abstract void onStopUpdates();
    public final void reportPermanentFailure(java.lang.Throwable p0) {}
    public final void reportSuggestion(android.service.timezone.TimeZoneProviderSuggestion p0) {}
    public final void reportSuggestion(android.service.timezone.TimeZoneProviderSuggestion p0, android.service.timezone.TimeZoneProviderStatus p1) {}
    public final void reportUncertain() {}
    public final void reportUncertain(android.service.timezone.TimeZoneProviderStatus p0) {}

    private class TimeZoneProviderServiceWrapper extends android.service.timezone.ITimeZoneProvider.Stub {
        private TimeZoneProviderServiceWrapper(android.service.timezone.TimeZoneProviderService p0) { super(); }
        public void startUpdates(android.service.timezone.ITimeZoneProviderManager p0, long p1, long p2) {}
        public void stopUpdates() {}
    }
}

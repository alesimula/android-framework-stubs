package android.app.usage;

public final class EventListRateLimiter {
    private static final java.util.Set<java.lang.Integer> ACTIVITY_EVENTS = null;
    private static final java.util.Set<java.lang.Integer> FGS_EVENTS = null;
    static final int GENERAL_EVENTS_COUNT_LIMIT = 1000;
    static final long GENERAL_EVENT_THRESHOLD_WINDOW_MS = 10000L;
    private static final long INVALID_EVENT_WINDOW_END_TIME = -1L;
    private static final java.lang.String TAG = "UsageEventListRateLimiter";
    private static final int THRESHOLD_MAPS_SIZE_LIMIT = 200;
    private static final java.util.Set<java.lang.Integer> USER_ACTION_BASED_EVENTS = null;
    static final int USER_EVENTS_COUNT_LIMIT = 60;
    static final long USER_EVENT_THRESHOLD_WINDOW_MS = 1000L;
    private final android.util.SparseIntArray mActivityEventCounts = null;
    private final android.util.SparseLongArray mActivityEventWindowEndTimes = null;
    private final android.util.ArrayMap<java.lang.String, java.lang.Integer> mFgsEventCounts = null;
    private final android.util.ArrayMap<java.lang.String, java.lang.Long> mFgsEventWindowEndTimes = null;
    private final android.util.SparseArrayMap<java.lang.String, java.lang.Integer> mGeneralEventCounts = null;
    private final android.util.SparseArrayMap<java.lang.String, java.lang.Long> mGeneralEventWindowEndTimes = null;
    EventListRateLimiter() {}
    private void cleanUpActivityTrackingMapsIfNeeded() {}
    private void cleanUpEventTrackingMapsIfNeeded(int p0) {}
    private void cleanUpFgsTrackingMapsIfNeeded() {}
    private boolean shouldInsertActivityEvent(android.app.usage.UsageEvents.Event p0) { return false; }
    private boolean shouldInsertFgsEvent(android.app.usage.UsageEvents.Event p0) { return false; }
    boolean areMatchingEvents(android.app.usage.UsageEvents.Event p0, android.app.usage.UsageEvents.Event p1) { return false; }
    boolean shouldInsert(android.app.usage.UsageEvents.Event p0) { return false; }
}

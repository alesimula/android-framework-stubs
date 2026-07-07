package android.appwidget;

public final class AppWidgetEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.appwidget.AppWidgetEvent> CREATOR = null;
    public static final int MAX_NUM_ITEMS = 10;
    private final int mAppWidgetId = 0;
    private final int[] mClickedIds = null;
    private final java.time.Instant mEnd = null;
    private final android.graphics.Rect mPosition = null;
    private final int[] mScrolledIds = null;
    private final java.time.Instant mStart = null;
    private final java.time.Duration mVisibleDuration = null;
    private AppWidgetEvent(int p0, long p1, long p2, long p3, android.graphics.Rect p4, int[] p5, int[] p6) {}
    private AppWidgetEvent(android.os.Parcel p0) {}
    public static android.appwidget.AppWidgetEvent fromUsageEvent(android.app.usage.UsageEvents.Event p0) { return null; }
    public static boolean isAppWidgetEvent(android.app.usage.UsageEvents.Event p0) { return false; }
    public int describeContents() { return 0; }
    public int getAppWidgetId() { return 0; }
    public int[] getClickedIds() { return null; }
    public java.time.Instant getEnd() { return null; }
    public android.graphics.Rect getPosition() { return null; }
    public int[] getScrolledIds() { return null; }
    public java.time.Instant getStart() { return null; }
    public java.time.Duration getVisibleDuration() { return null; }
    public android.os.PersistableBundle toBundle() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private int mAppWidgetId;
        private final android.util.ArraySet<java.lang.Integer> mClickedIds = null;
        private long mDurationMillis;
        private long mEnd;
        private long mLastVisibilityChangeMillis;
        private android.graphics.Rect mPosition;
        private final android.util.ArraySet<java.lang.Integer> mScrolledIds = null;
        private long mStart;
        public Builder() {}
        private static void addAllUntilMax(android.util.ArraySet<java.lang.Integer> p0, int[] p1) {}
        private static int[] toIntArray(android.util.ArraySet<java.lang.Integer> p0) { return null; }
        public android.appwidget.AppWidgetEvent.Builder addClickedId(int p0) { return null; }
        public android.appwidget.AppWidgetEvent.Builder addScrolledId(int p0) { return null; }
        public android.appwidget.AppWidgetEvent build() { return null; }
        public void clear() {}
        public android.appwidget.AppWidgetEvent.Builder endVisibility() { return null; }
        public boolean isEmpty() { return false; }
        public void merge(android.appwidget.AppWidgetEvent p0) {}
        public android.appwidget.AppWidgetEvent.Builder setAppWidgetId(int p0) { return null; }
        public android.appwidget.AppWidgetEvent.Builder setPosition(android.graphics.Rect p0) { return null; }
        public android.appwidget.AppWidgetEvent.Builder startVisibility() { return null; }
    }
}

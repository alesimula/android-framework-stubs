package android.service.personalcontext.insight.interaction;

@android.annotation.SystemApi
public final class InsightEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.insight.interaction.InsightEvent> CREATOR = null;
    public static final int EVENT_HIDE = 2;
    public static final int EVENT_RETIRED = 9;
    public static final int EVENT_SHOW = 1;
    public static final int EVENT_UNKNOWN = 0;
    public static final int EVENT_USER_ATTRIBUTION_REQUESTED = 6;
    public static final int EVENT_USER_DISMISS = 5;
    public static final int EVENT_USER_FEEDBACK_NEGATIVE = 8;
    public static final int EVENT_USER_FEEDBACK_POSITIVE = 7;
    public static final int EVENT_USER_LONG_PRESS = 4;
    public static final int EVENT_USER_TAP = 3;
    private final android.service.personalcontext.insight.ContextInsight mContextInsight = null;
    private final int mEventType = 0;
    private final long mTimestamp = 0L;
    public InsightEvent(int p0, android.service.personalcontext.insight.ContextInsight p1, long p2) {}
    private InsightEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.service.personalcontext.insight.ContextInsight getContextInsight() { return null; }
    public int getEventType() { return 0; }
    @android.annotation.SystemApi
    public android.service.personalcontext.insight.PublishedContextInsight getInsight() { return null; }
    public android.service.personalcontext.RenderToken getRenderToken() { return null; }
    public long getTimestamp() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}

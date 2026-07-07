package android.service.timezone;

public final class TimeZoneProviderEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.timezone.TimeZoneProviderEvent> CREATOR = null;
    public static final int EVENT_TYPE_PERMANENT_FAILURE = 1;
    public static final int EVENT_TYPE_SUGGESTION = 2;
    public static final int EVENT_TYPE_UNCERTAIN = 3;
    private final long mCreationElapsedMillis = 0L;
    private final java.lang.String mFailureCause = null;
    private final android.service.timezone.TimeZoneProviderSuggestion mSuggestion = null;
    private final android.service.timezone.TimeZoneProviderStatus mTimeZoneProviderStatus = null;
    private final int mType = 0;
    private TimeZoneProviderEvent(int p0, long p1, android.service.timezone.TimeZoneProviderSuggestion p2, java.lang.String p3, android.service.timezone.TimeZoneProviderStatus p4) {}
    public static android.service.timezone.TimeZoneProviderEvent createPermanentFailureEvent(long p0, java.lang.String p1) { return null; }
    public static android.service.timezone.TimeZoneProviderEvent createSuggestionEvent(long p0, android.service.timezone.TimeZoneProviderSuggestion p1, android.service.timezone.TimeZoneProviderStatus p2) { return null; }
    public static android.service.timezone.TimeZoneProviderEvent createUncertainEvent(long p0, android.service.timezone.TimeZoneProviderStatus p1) { return null; }
    private static int validateEventType(int p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public long getCreationElapsedMillis() { return 0L; }
    public java.lang.String getFailureCause() { return null; }
    public android.service.timezone.TimeZoneProviderSuggestion getSuggestion() { return null; }
    public android.service.timezone.TimeZoneProviderStatus getTimeZoneProviderStatus() { return null; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public boolean isEquivalentTo(android.service.timezone.TimeZoneProviderEvent p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE, java.lang.annotation.ElementType.TYPE_PARAMETER})
    public static @interface EventType {
    }
}

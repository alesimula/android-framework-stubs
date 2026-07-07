package android.media.projection;

public final class MediaProjectionEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.projection.MediaProjectionEvent> CREATOR = null;
    public static final int PROJECTION_STARTED_DURING_CALL_AND_ACTIVE_POST_CALL = 0;
    private final int mEventType = 0;
    private final long mTimestampMillis = 0L;
    public MediaProjectionEvent(int p0, long p1) {}
    private MediaProjectionEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getEventType() { return 0; }
    public long getTimestampMillis() { return 0L; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EventType {
    }
}

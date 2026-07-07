package android.media.quality;

public final class AmbientBacklightEvent implements android.os.Parcelable {
    public static final int AMBIENT_BACKLIGHT_EVENT_DISABLED = 2;
    public static final int AMBIENT_BACKLIGHT_EVENT_ENABLED = 1;
    public static final int AMBIENT_BACKLIGHT_EVENT_INTERRUPTED = 4;
    public static final int AMBIENT_BACKLIGHT_EVENT_METADATA_AVAILABLE = 3;
    public static final android.os.Parcelable.Creator<android.media.quality.AmbientBacklightEvent> CREATOR = null;
    private final int mEventType = 0;
    private final android.media.quality.AmbientBacklightMetadata mMetadata = null;
    public AmbientBacklightEvent(int p0, android.media.quality.AmbientBacklightMetadata p1) {}
    private AmbientBacklightEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getEventType() { return 0; }
    public android.media.quality.AmbientBacklightMetadata getMetadata() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}

package android.media;

public class MediaSyncEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.MediaSyncEvent> CREATOR = null;
    public static final int SYNC_EVENT_NONE = 0;
    public static final int SYNC_EVENT_PRESENTATION_COMPLETE = 1;
    @android.annotation.SystemApi
    public static final int SYNC_EVENT_SHARE_AUDIO_HISTORY = 100;
    private int mAudioSession;
    private final int mType = 0;
    private MediaSyncEvent(int p0) {}
    private MediaSyncEvent(android.os.Parcel p0) {}
    public static android.media.MediaSyncEvent createEvent(int p0) throws java.lang.IllegalArgumentException { return null; }
    private static boolean isValidType(int p0) { return false; }
    public static java.lang.String typeToString(int p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAudioSessionId() { return 0; }
    public int getType() { return 0; }
    public int hashCode() { return 0; }
    public android.media.MediaSyncEvent setAudioSessionId(int p0) throws java.lang.IllegalArgumentException { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

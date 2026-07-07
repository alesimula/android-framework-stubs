package android.media.tv;

public final class AdRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.AdRequest> CREATOR = null;
    public static final java.lang.String KEY_AUDIO_METADATA = "key_audio_metadata";
    public static final java.lang.String KEY_VIDEO_METADATA = "key_video_metadata";
    public static final int REQUEST_TYPE_START = 1;
    public static final int REQUEST_TYPE_STOP = 2;
    private final long mEchoInterval = 0L;
    private final android.os.ParcelFileDescriptor mFileDescriptor = null;
    private final int mId = 0;
    private final java.lang.String mMediaFileType = null;
    private final android.os.Bundle mMetadata = null;
    private final int mRequestType = 0;
    private final long mStartTime = 0L;
    private final long mStopTime = 0L;
    private final android.net.Uri mUri = null;
    public AdRequest(int p0, int p1, android.net.Uri p2, long p3, long p4, long p5, android.os.Bundle p6) {}
    public AdRequest(int p0, int p1, android.os.ParcelFileDescriptor p2, long p3, long p4, long p5, java.lang.String p6, android.os.Bundle p7) {}
    private AdRequest(int p0, int p1, android.os.ParcelFileDescriptor p2, android.net.Uri p3, long p4, long p5, long p6, java.lang.String p7, android.os.Bundle p8) {}
    private AdRequest(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getEchoIntervalMillis() { return 0L; }
    public android.os.ParcelFileDescriptor getFileDescriptor() { return null; }
    public int getId() { return 0; }
    public java.lang.String getMediaFileType() { return null; }
    public android.os.Bundle getMetadata() { return null; }
    public int getRequestType() { return 0; }
    public long getStartTimeMillis() { return 0L; }
    public long getStopTimeMillis() { return 0L; }
    public android.net.Uri getUri() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RequestType {
    }
}

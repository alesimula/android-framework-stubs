package android.media.tv;

public final class AdResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.AdResponse> CREATOR = null;
    public static final int RESPONSE_TYPE_BUFFERING = 5;
    public static final int RESPONSE_TYPE_ERROR = 4;
    public static final int RESPONSE_TYPE_FINISHED = 2;
    public static final int RESPONSE_TYPE_PLAYING = 1;
    public static final int RESPONSE_TYPE_STOPPED = 3;
    private final long mElapsedTime = 0L;
    private final int mId = 0;
    private final int mResponseType = 0;
    public AdResponse(int p0, int p1, long p2) {}
    private AdResponse(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getElapsedTimeMillis() { return 0L; }
    public int getId() { return 0; }
    public int getResponseType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResponseType {
    }
}

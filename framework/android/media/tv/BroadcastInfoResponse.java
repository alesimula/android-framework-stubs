package android.media.tv;

public abstract class BroadcastInfoResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.tv.BroadcastInfoResponse> CREATOR = null;
    public static final int RESPONSE_RESULT_CANCEL = 3;
    public static final int RESPONSE_RESULT_ERROR = 1;
    public static final int RESPONSE_RESULT_OK = 2;
    private final int mRequestId = 0;
    private final int mResponseResult = 0;
    private final int mSequence = 0;
    private final int mType = 0;
    BroadcastInfoResponse(int p0, int p1, int p2, int p3) {}
    BroadcastInfoResponse(int p0, android.os.Parcel p1) {}
    public int describeContents() { return 0; }
    public int getRequestId() { return 0; }
    public int getResponseResult() { return 0; }
    public int getSequence() { return 0; }
    public int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResponseResult {
    }
}

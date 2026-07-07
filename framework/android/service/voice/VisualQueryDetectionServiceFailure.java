package android.service.voice;

@android.annotation.SystemApi
public final class VisualQueryDetectionServiceFailure implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.voice.VisualQueryDetectionServiceFailure> CREATOR = null;
    public static final int ERROR_CODE_BINDING_DIED = 2;
    public static final int ERROR_CODE_BIND_FAILURE = 1;
    public static final int ERROR_CODE_ILLEGAL_ATTENTION_STATE = 3;
    public static final int ERROR_CODE_ILLEGAL_STREAMING_STATE = 4;
    public static final int ERROR_CODE_REMOTE_EXCEPTION = 5;
    public static final int ERROR_CODE_UNKNOWN = 0;
    private int mErrorCode;
    private java.lang.String mErrorMessage;
    public VisualQueryDetectionServiceFailure(int p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public int getErrorCode() { return 0; }
    public java.lang.String getErrorMessage() { return null; }
    public int getSuggestedAction() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VisualQueryDetectionServiceErrorCode {
    }
}

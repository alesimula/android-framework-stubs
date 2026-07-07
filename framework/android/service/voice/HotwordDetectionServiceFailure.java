package android.service.voice;

@android.annotation.SystemApi
public final class HotwordDetectionServiceFailure implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.voice.HotwordDetectionServiceFailure> CREATOR = null;
    public static final int ERROR_CODE_BINDING_DIED = 2;
    public static final int ERROR_CODE_BIND_FAILURE = 1;
    public static final int ERROR_CODE_COPY_AUDIO_DATA_FAILURE = 3;
    public static final int ERROR_CODE_DETECT_TIMEOUT = 4;
    public static final int ERROR_CODE_ON_DETECTED_SECURITY_EXCEPTION = 5;
    public static final int ERROR_CODE_ON_DETECTED_STREAM_COPY_FAILURE = 6;
    public static final int ERROR_CODE_REMOTE_EXCEPTION = 7;
    public static final int ERROR_CODE_SHUTDOWN_HDS_ON_VOICE_ACTIVATION_OP_DISABLED = 10;
    public static final int ERROR_CODE_UNKNOWN = 0;
    private int mErrorCode;
    private java.lang.String mErrorMessage;
    public HotwordDetectionServiceFailure(int p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public int getErrorCode() { return 0; }
    public java.lang.String getErrorMessage() { return null; }
    public int getSuggestedAction() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HotwordDetectionServiceErrorCode {
    }
}

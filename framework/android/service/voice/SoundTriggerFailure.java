package android.service.voice;

@android.annotation.SystemApi
public final class SoundTriggerFailure implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.voice.SoundTriggerFailure> CREATOR = null;
    public static final int ERROR_CODE_MODULE_DIED = 1;
    public static final int ERROR_CODE_RECOGNITION_RESUME_FAILED = 2;
    public static final int ERROR_CODE_UNEXPECTED_PREEMPTION = 3;
    public static final int ERROR_CODE_UNKNOWN = 0;
    private final int mErrorCode = 0;
    private final java.lang.String mErrorMessage = null;
    private final int mSuggestedAction = 0;
    public SoundTriggerFailure(int p0, java.lang.String p1) {}
    public SoundTriggerFailure(int p0, java.lang.String p1, int p2) {}
    private static int getSuggestedActionBasedOnErrorCode(int p0) { return 0; }
    public int describeContents() { return 0; }
    public int getErrorCode() { return 0; }
    public java.lang.String getErrorMessage() { return null; }
    public int getSuggestedAction() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SoundTriggerErrorCode {
    }
}

package android.app;

@android.annotation.SystemApi
public final class RemoteLockscreenValidationResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.RemoteLockscreenValidationResult> CREATOR = null;
    public static final int RESULT_GUESS_INVALID = 2;
    public static final int RESULT_GUESS_VALID = 1;
    public static final int RESULT_LOCKOUT = 3;
    public static final int RESULT_NO_REMAINING_ATTEMPTS = 4;
    public static final int RESULT_SESSION_EXPIRED = 5;
    private int mResultCode;
    private long mTimeoutMillis;
    private RemoteLockscreenValidationResult() {}
    private RemoteLockscreenValidationResult(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getResultCode() { return 0; }
    public long getTimeoutMillis() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.app.RemoteLockscreenValidationResult mInstance;
        public Builder() {}
        public android.app.RemoteLockscreenValidationResult build() { return null; }
        public android.app.RemoteLockscreenValidationResult.Builder setResultCode(int p0) { return null; }
        public android.app.RemoteLockscreenValidationResult.Builder setTimeoutMillis(long p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ResultCode {
    }
}

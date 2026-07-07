package android.app;

@android.annotation.SystemApi
public final class RemoteLockscreenValidationSession implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.RemoteLockscreenValidationSession> CREATOR = null;
    private int mLockType;
    private int mRemainingAttempts;
    private byte[] mSourcePublicKey;
    private RemoteLockscreenValidationSession() {}
    private RemoteLockscreenValidationSession(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getLockType() { return 0; }
    public int getRemainingAttempts() { return 0; }
    public byte[] getSourcePublicKey() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.app.RemoteLockscreenValidationSession mInstance;
        public Builder() {}
        public android.app.RemoteLockscreenValidationSession build() { return null; }
        public android.app.RemoteLockscreenValidationSession.Builder setLockType(int p0) { return null; }
        public android.app.RemoteLockscreenValidationSession.Builder setRemainingAttempts(int p0) { return null; }
        public android.app.RemoteLockscreenValidationSession.Builder setSourcePublicKey(byte[] p0) { return null; }
    }
}

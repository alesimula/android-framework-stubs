package android.service.rotationresolver;

@android.annotation.SystemApi
public final class RotationResolutionRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.rotationresolver.RotationResolutionRequest> CREATOR = null;
    private final int mCurrentRotation = 0;
    private final java.lang.String mForegroundPackageName = null;
    private final int mProposedRotation = 0;
    private final boolean mShouldUseCamera = false;
    private final long mTimeoutMillis = 0L;
    RotationResolutionRequest(android.os.Parcel p0) {}
    public RotationResolutionRequest(java.lang.String p0, int p1, int p2, boolean p3, long p4) {}
    @java.lang.Deprecated
    private void __metadata() {}
    public int describeContents() { return 0; }
    public int getCurrentRotation() { return 0; }
    public java.lang.String getForegroundPackageName() { return null; }
    public int getProposedRotation() { return 0; }
    public long getTimeoutMillis() { return 0L; }
    public boolean shouldUseCamera() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

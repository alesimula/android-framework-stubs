package android.hardware.face;

public final class FaceDataFrame implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.face.FaceDataFrame> CREATOR = null;
    private final int mAcquiredInfo = 0;
    private final float mDistance = 0.0f;
    private final boolean mIsCancellable = false;
    private final float mPan = 0.0f;
    private final float mTilt = 0.0f;
    private final int mVendorCode = 0;
    public FaceDataFrame(int p0, int p1) {}
    public FaceDataFrame(int p0, int p1, float p2, float p3, float p4, boolean p5) {}
    private FaceDataFrame(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getAcquiredInfo() { return 0; }
    public float getDistance() { return 0.0f; }
    public float getPan() { return 0.0f; }
    public float getTilt() { return 0.0f; }
    public int getVendorCode() { return 0; }
    public boolean isCancellable() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

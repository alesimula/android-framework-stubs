package android.hardware.face;

public final class FaceEnrollFrame implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.face.FaceEnrollFrame> CREATOR = null;
    private final android.hardware.face.FaceEnrollCell mCell = null;
    private final android.hardware.face.FaceDataFrame mData = null;
    private final int mStage = 0;
    public FaceEnrollFrame(android.hardware.face.FaceEnrollCell p0, int p1, android.hardware.face.FaceDataFrame p2) {}
    private FaceEnrollFrame(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.hardware.face.FaceEnrollCell getCell() { return null; }
    public android.hardware.face.FaceDataFrame getData() { return null; }
    public int getStage() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

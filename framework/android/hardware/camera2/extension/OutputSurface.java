package android.hardware.camera2.extension;

public class OutputSurface implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.OutputSurface> CREATOR = null;
    public int colorSpace;
    public long dynamicRangeProfile;
    public int imageFormat;
    public android.hardware.camera2.extension.Size size;
    public android.view.Surface surface;
    public OutputSurface() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

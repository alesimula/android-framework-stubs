package android.hardware.biometrics.face;

public class BaseFrame implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.BaseFrame> CREATOR = null;
    public byte acquiredInfo;
    public float distance;
    public boolean isCancellable;
    public float pan;
    public float tilt;
    public int vendorCode;
    public BaseFrame() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

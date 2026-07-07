package android.hardware.biometrics.face;

public class Cell implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.Cell> CREATOR = null;
    public int x;
    public int y;
    public int z;
    public Cell() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

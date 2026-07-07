package android.hardware.cas;

public class SubSample implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.cas.SubSample> CREATOR = null;
    public int numBytesOfClearData;
    public int numBytesOfEncryptedData;
    public SubSample() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

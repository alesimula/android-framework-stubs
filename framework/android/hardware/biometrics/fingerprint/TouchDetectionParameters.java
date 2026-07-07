package android.hardware.biometrics.fingerprint;

public class TouchDetectionParameters implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.TouchDetectionParameters> CREATOR = null;
    public float minOverlap;
    public float targetSize;
    public TouchDetectionParameters() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

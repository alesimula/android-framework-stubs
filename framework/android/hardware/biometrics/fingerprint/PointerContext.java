package android.hardware.biometrics.fingerprint;

public class PointerContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.PointerContext> CREATOR = null;
    public long gestureStart;
    public boolean isAod;
    public float major;
    public float minor;
    public float orientation;
    public int pointerId;
    public long time;
    public float x;
    public float y;
    public PointerContext() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public final int getStability() { return 0; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

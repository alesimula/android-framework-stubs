package android.hardware.thermal;

public class Temperature implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.thermal.Temperature> CREATOR = null;
    public java.lang.String name;
    public int throttlingStatus;
    public int type;
    public float value;
    public Temperature() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

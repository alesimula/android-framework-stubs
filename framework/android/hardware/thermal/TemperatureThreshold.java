package android.hardware.thermal;

public class TemperatureThreshold implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.thermal.TemperatureThreshold> CREATOR = null;
    public float[] coldThrottlingThresholds;
    public float[] hotThrottlingThresholds;
    public java.lang.String name;
    public int type;
    public TemperatureThreshold() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

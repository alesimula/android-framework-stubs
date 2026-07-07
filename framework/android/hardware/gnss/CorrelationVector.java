package android.hardware.gnss;

public class CorrelationVector implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.gnss.CorrelationVector> CREATOR = null;
    public double frequencyOffsetMps;
    public int[] magnitude;
    public double samplingStartM;
    public double samplingWidthM;
    public CorrelationVector() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

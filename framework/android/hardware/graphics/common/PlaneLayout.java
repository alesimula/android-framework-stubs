package android.hardware.graphics.common;

public class PlaneLayout implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.graphics.common.PlaneLayout> CREATOR = null;
    public android.hardware.graphics.common.PlaneLayoutComponent[] components;
    public long heightInSamples;
    public long horizontalSubsampling;
    public long offsetInBytes;
    public long sampleIncrementInBits;
    public long strideInBytes;
    public long totalSizeInBytes;
    public long verticalSubsampling;
    public long widthInSamples;
    public PlaneLayout() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

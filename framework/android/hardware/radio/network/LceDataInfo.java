package android.hardware.radio.network;

public class LceDataInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.LceDataInfo> CREATOR = null;
    public byte confidenceLevel;
    public int lastHopCapacityKbps;
    public boolean lceSuspended;
    public LceDataInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

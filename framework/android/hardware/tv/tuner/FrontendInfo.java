package android.hardware.tv.tuner;

public class FrontendInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendInfo> CREATOR = null;
    public long acquireRange;
    public int exclusiveGroupId;
    public android.hardware.tv.tuner.FrontendCapabilities frontendCaps;
    public long maxFrequency;
    public int maxSymbolRate;
    public long minFrequency;
    public int minSymbolRate;
    public int[] statusCaps;
    public int type;
    public FrontendInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

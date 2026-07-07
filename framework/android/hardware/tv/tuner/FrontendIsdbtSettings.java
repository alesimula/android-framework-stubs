package android.hardware.tv.tuner;

public class FrontendIsdbtSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIsdbtSettings> CREATOR = null;
    public int bandwidth;
    public long endFrequency;
    public long frequency;
    public int guardInterval;
    public int inversion;
    public android.hardware.tv.tuner.FrontendIsdbtLayerSettings[] layerSettings;
    public int mode;
    public int partialReceptionFlag;
    public int serviceAreaId;
    public FrontendIsdbtSettings() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

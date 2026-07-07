package android.hardware.tv.tuner;

public class FrontendIptvSettingsFec implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.tv.tuner.FrontendIptvSettingsFec> CREATOR = null;
    public int fecColNum;
    public int fecRowNum;
    public int type;
    public FrontendIptvSettingsFec() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

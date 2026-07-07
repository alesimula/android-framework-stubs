package android.hardware.radio.data;

public class ImsDataNetworkInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.ImsDataNetworkInfo> CREATOR = null;
    public int accessNetwork;
    public int dataNetworkState;
    public int physicalNetworkModemId;
    public int physicalTransportType;
    public ImsDataNetworkInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

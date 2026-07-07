package android.hardware.radio.sim;

public class CarrierInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.CarrierInfo> CREATOR = null;
    public java.util.List<android.hardware.radio.sim.Plmn> ehplmn;
    public java.lang.String gid1;
    public java.lang.String gid2;
    public java.lang.String iccid;
    public java.lang.String impi;
    public java.lang.String imsiPrefix;
    public java.lang.String mcc;
    public java.lang.String mnc;
    public java.lang.String spn;
    public CarrierInfo() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

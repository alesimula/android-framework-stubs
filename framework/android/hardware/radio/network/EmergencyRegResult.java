package android.hardware.radio.network;

public class EmergencyRegResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.EmergencyRegResult> CREATOR = null;
    public int accessNetwork;
    public int emcDomain;
    public boolean isEmcBearerSupported;
    public boolean isVopsSupported;
    public java.lang.String mcc;
    public java.lang.String mnc;
    public byte nwProvidedEmc;
    public byte nwProvidedEmf;
    public int regState;
    public EmergencyRegResult() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

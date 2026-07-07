package android.hardware.radio.network;

public class CellularIdentifierDisclosure implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellularIdentifierDisclosure> CREATOR = null;
    public int identifier;
    public boolean isEmergency;
    public java.lang.String plmn;
    public int protocolMessage;
    public CellularIdentifierDisclosure() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

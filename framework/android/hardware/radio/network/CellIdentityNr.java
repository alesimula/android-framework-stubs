package android.hardware.radio.network;

public class CellIdentityNr implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentityNr> CREATOR = null;
    public java.lang.String[] additionalPlmns;
    public int[] bands;
    public java.lang.String mcc;
    public java.lang.String mnc;
    public long nci;
    public int nrarfcn;
    public android.hardware.radio.network.OperatorInfo operatorNames;
    public int pci;
    public int tac;
    public CellIdentityNr() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

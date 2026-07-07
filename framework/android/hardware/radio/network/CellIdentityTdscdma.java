package android.hardware.radio.network;

public class CellIdentityTdscdma implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentityTdscdma> CREATOR = null;
    public java.lang.String[] additionalPlmns;
    public int cid;
    public int cpid;
    public android.hardware.radio.network.ClosedSubscriberGroupInfo csgInfo;
    public int lac;
    public java.lang.String mcc;
    public java.lang.String mnc;
    public android.hardware.radio.network.OperatorInfo operatorNames;
    public int uarfcn;
    public CellIdentityTdscdma() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

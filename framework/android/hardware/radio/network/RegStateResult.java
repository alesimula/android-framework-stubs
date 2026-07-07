package android.hardware.radio.network;

public class RegStateResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.RegStateResult> CREATOR = null;
    public android.hardware.radio.network.AccessTechnologySpecificInfo accessTechnologySpecificInfo;
    public android.hardware.radio.network.CellIdentity cellIdentity;
    public int rat;
    public int reasonForDenial;
    public int regState;
    public java.lang.String registeredPlmn;
    public RegStateResult() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

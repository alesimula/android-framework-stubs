package android.telephony.satellite.stub;

public class SystemSelectionSpecifier implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.satellite.stub.SystemSelectionSpecifier> CREATOR = null;
    @java.lang.Deprecated
    public int[] mBands;
    public int[] mEarfcs;
    public java.lang.String mIccId;
    @java.lang.Deprecated
    public java.lang.String mMccMnc;
    public java.lang.String[] mMccMncs;
    public android.telephony.satellite.stub.SatelliteInfo[] satelliteInfos;
    public int[] tagIds;
    public SystemSelectionSpecifier() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.telephony;

public final class CellInfoGsm extends android.telephony.CellInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoGsm> CREATOR = null;
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "CellInfoGsm";
    private android.telephony.CellIdentityGsm mCellIdentityGsm;
    private android.telephony.CellSignalStrengthGsm mCellSignalStrengthGsm;
    public CellInfoGsm() { super(); }
    public CellInfoGsm(int p0, boolean p1, long p2, android.telephony.CellIdentityGsm p3, android.telephony.CellSignalStrengthGsm p4) { super(); }
    private CellInfoGsm(android.os.Parcel p0) { super(); }
    public CellInfoGsm(android.telephony.CellInfoGsm p0) { super(); }
    protected static android.telephony.CellInfoGsm createFromParcelBody(android.os.Parcel p0) { return null; }
    private static void log(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.CellIdentityGsm getCellIdentity() { return null; }
    public android.telephony.CellSignalStrengthGsm getCellSignalStrength() { return null; }
    public int hashCode() { return 0; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityGsm p0) {}
    public void setCellSignalStrength(android.telephony.CellSignalStrengthGsm p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

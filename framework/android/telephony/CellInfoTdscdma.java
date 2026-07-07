package android.telephony;

public final class CellInfoTdscdma extends android.telephony.CellInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoTdscdma> CREATOR = null;
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "CellInfoTdscdma";
    private android.telephony.CellIdentityTdscdma mCellIdentityTdscdma;
    private android.telephony.CellSignalStrengthTdscdma mCellSignalStrengthTdscdma;
    public CellInfoTdscdma() { super(); }
    public CellInfoTdscdma(int p0, boolean p1, long p2, android.telephony.CellIdentityTdscdma p3, android.telephony.CellSignalStrengthTdscdma p4) { super(); }
    private CellInfoTdscdma(android.os.Parcel p0) { super(); }
    public CellInfoTdscdma(android.telephony.CellInfoTdscdma p0) { super(); }
    protected static android.telephony.CellInfoTdscdma createFromParcelBody(android.os.Parcel p0) { return null; }
    private static void log(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.CellIdentityTdscdma getCellIdentity() { return null; }
    public android.telephony.CellSignalStrengthTdscdma getCellSignalStrength() { return null; }
    public int hashCode() { return 0; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityTdscdma p0) {}
    public void setCellSignalStrength(android.telephony.CellSignalStrengthTdscdma p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

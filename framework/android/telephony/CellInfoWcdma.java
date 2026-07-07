package android.telephony;

public final class CellInfoWcdma extends android.telephony.CellInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoWcdma> CREATOR = null;
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "CellInfoWcdma";
    private android.telephony.CellIdentityWcdma mCellIdentityWcdma;
    private android.telephony.CellSignalStrengthWcdma mCellSignalStrengthWcdma;
    public CellInfoWcdma() { super(); }
    public CellInfoWcdma(int p0, boolean p1, long p2, android.telephony.CellIdentityWcdma p3, android.telephony.CellSignalStrengthWcdma p4) { super(); }
    private CellInfoWcdma(android.os.Parcel p0) { super(); }
    public CellInfoWcdma(android.telephony.CellInfoWcdma p0) { super(); }
    protected static android.telephony.CellInfoWcdma createFromParcelBody(android.os.Parcel p0) { return null; }
    private static void log(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.CellIdentityWcdma getCellIdentity() { return null; }
    public android.telephony.CellSignalStrengthWcdma getCellSignalStrength() { return null; }
    public int hashCode() { return 0; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityWcdma p0) {}
    public void setCellSignalStrength(android.telephony.CellSignalStrengthWcdma p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

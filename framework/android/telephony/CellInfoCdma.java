package android.telephony;

@java.lang.Deprecated
public final class CellInfoCdma extends android.telephony.CellInfo implements android.os.Parcelable {
    @java.lang.Deprecated
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoCdma> CREATOR = null;
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "CellInfoCdma";
    private android.telephony.CellIdentityCdma mCellIdentityCdma;
    private android.telephony.CellSignalStrengthCdma mCellSignalStrengthCdma;
    public CellInfoCdma() { super(); }
    public CellInfoCdma(int p0, boolean p1, long p2, android.telephony.CellIdentityCdma p3, android.telephony.CellSignalStrengthCdma p4) { super(); }
    private CellInfoCdma(android.os.Parcel p0) { super(); }
    public CellInfoCdma(android.telephony.CellInfoCdma p0) { super(); }
    protected static android.telephony.CellInfoCdma createFromParcelBody(android.os.Parcel p0) { return null; }
    private static void log(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @java.lang.Deprecated
    public android.telephony.CellIdentityCdma getCellIdentity() { return null; }
    @java.lang.Deprecated
    public android.telephony.CellSignalStrengthCdma getCellSignalStrength() { return null; }
    public int hashCode() { return 0; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityCdma p0) {}
    public void setCellSignalStrength(android.telephony.CellSignalStrengthCdma p0) {}
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.telephony;

public final class CellInfoLte extends android.telephony.CellInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoLte> CREATOR = null;
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "CellInfoLte";
    private android.telephony.CellConfigLte mCellConfig;
    private android.telephony.CellIdentityLte mCellIdentityLte;
    private android.telephony.CellSignalStrengthLte mCellSignalStrengthLte;
    public CellInfoLte() { super(); }
    public CellInfoLte(int p0, boolean p1, long p2, android.telephony.CellIdentityLte p3, android.telephony.CellSignalStrengthLte p4, android.telephony.CellConfigLte p5) { super(); }
    private CellInfoLte(android.os.Parcel p0) { super(); }
    public CellInfoLte(android.telephony.CellInfoLte p0) { super(); }
    protected static android.telephony.CellInfoLte createFromParcelBody(android.os.Parcel p0) { return null; }
    private static void log(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.CellConfigLte getCellConfig() { return null; }
    public android.telephony.CellIdentityLte getCellIdentity() { return null; }
    public android.telephony.CellSignalStrengthLte getCellSignalStrength() { return null; }
    public int hashCode() { return 0; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellConfig(android.telephony.CellConfigLte p0) {}
    public void setCellIdentity(android.telephony.CellIdentityLte p0) {}
    public void setCellSignalStrength(android.telephony.CellSignalStrengthLte p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

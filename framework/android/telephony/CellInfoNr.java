package android.telephony;

public final class CellInfoNr extends android.telephony.CellInfo {
    public static final android.os.Parcelable.Creator<android.telephony.CellInfoNr> CREATOR = null;
    private static final java.lang.String TAG = "CellInfoNr";
    private android.telephony.CellIdentityNr mCellIdentity;
    private final android.telephony.CellSignalStrengthNr mCellSignalStrength = null;
    public CellInfoNr() { super(); }
    public CellInfoNr(int p0, boolean p1, long p2, android.telephony.CellIdentityNr p3, android.telephony.CellSignalStrengthNr p4) { super(); }
    private CellInfoNr(android.os.Parcel p0) { super(); }
    private CellInfoNr(android.telephony.CellInfoNr p0, boolean p1) { super(); }
    protected static android.telephony.CellInfoNr createFromParcelBody(android.os.Parcel p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.telephony.CellIdentity getCellIdentity() { return null; }
    public android.telephony.CellSignalStrength getCellSignalStrength() { return null; }
    public int hashCode() { return 0; }
    public android.telephony.CellInfo sanitizeLocationInfo() { return null; }
    public void setCellIdentity(android.telephony.CellIdentityNr p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

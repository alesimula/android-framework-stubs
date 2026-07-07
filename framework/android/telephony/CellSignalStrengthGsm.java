package android.telephony;

public final class CellSignalStrengthGsm extends android.telephony.CellSignalStrength implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.CellSignalStrengthGsm> CREATOR = null;
    private static final boolean DBG = false;
    private static final int GSM_RSSI_GOOD = -97;
    private static final int GSM_RSSI_GREAT = -89;
    private static final int GSM_RSSI_MAX = -51;
    private static final int GSM_RSSI_MIN = -113;
    private static final int GSM_RSSI_MODERATE = -103;
    private static final int GSM_RSSI_POOR = -107;
    private static final java.lang.String LOG_TAG = "CellSignalStrengthGsm";
    private static final android.telephony.CellSignalStrengthGsm sInvalid = null;
    private static final int[] sRssiThresholds = null;
    private int mBitErrorRate;
    private int mLevel;
    private int mRssi;
    private int mTimingAdvance;
    public CellSignalStrengthGsm() { super(); }
    public CellSignalStrengthGsm(int p0, int p1, int p2) { super(); }
    private CellSignalStrengthGsm(android.os.Parcel p0) { super(); }
    public CellSignalStrengthGsm(android.telephony.CellSignalStrengthGsm p0) { super(); }
    private static void log(java.lang.String p0) {}
    public android.telephony.CellSignalStrengthGsm copy() { return null; }
    protected void copyFrom(android.telephony.CellSignalStrengthGsm p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAsuLevel() { return 0; }
    public int getBitErrorRate() { return 0; }
    public int getDbm() { return 0; }
    public int getLevel() { return 0; }
    public int getRssi() { return 0; }
    public int getTimingAdvance() { return 0; }
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    public void setDefaultValues() {}
    public java.lang.String toString() { return null; }
    public void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

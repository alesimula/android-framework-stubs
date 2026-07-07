package android.telephony;

public final class CellSignalStrengthLte extends android.telephony.CellSignalStrength implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.CellSignalStrengthLte> CREATOR = null;
    private static final boolean DBG = false;
    private static final java.lang.String LOG_TAG = "CellSignalStrengthLte";
    private static final int MAX_LTE_RSRP = -44;
    private static final int MIN_LTE_RSRP = -140;
    private static final int SIGNAL_STRENGTH_LTE_RSSI_ASU_UNKNOWN = 99;
    private static final int SIGNAL_STRENGTH_LTE_RSSI_VALID_ASU_MAX_VALUE = 31;
    private static final int SIGNAL_STRENGTH_LTE_RSSI_VALID_ASU_MIN_VALUE = 0;
    public static final int USE_RSRP = 1;
    public static final int USE_RSRQ = 2;
    public static final int USE_RSSNR = 4;
    private static final android.telephony.CellSignalStrengthLte sInvalid = null;
    private static final int sRsrpBoost = 0;
    private static final int[] sRsrpThresholds = null;
    private static final int[] sRsrqThresholds = null;
    private static final int[] sRssnrThresholds = null;
    private int mCqi;
    private int mCqiTableIndex;
    private int mLevel;
    private int mParametersUseForLevel;
    private int mRsrp;
    private int mRsrq;
    private int mRssi;
    private int mRssnr;
    private int mSignalStrength;
    private int mTimingAdvance;
    public CellSignalStrengthLte() { super(); }
    public CellSignalStrengthLte(int p0, int p1, int p2, int p3, int p4, int p5) { super(); }
    public CellSignalStrengthLte(int p0, int p1, int p2, int p3, int p4, int p5, int p6) { super(); }
    private CellSignalStrengthLte(android.os.Parcel p0) { super(); }
    public CellSignalStrengthLte(android.telephony.CellSignalStrengthLte p0) { super(); }
    public static int convertRssiAsuToDBm(int p0) { return 0; }
    public static int convertRssnrUnitFromTenDbToDB(int p0) { return 0; }
    private boolean isLevelForParameter(int p0) { return false; }
    private static void log(java.lang.String p0) {}
    private int updateLevelWithMeasure(int p0, int[] p1) { return 0; }
    public android.telephony.CellSignalStrengthLte copy() { return null; }
    protected void copyFrom(android.telephony.CellSignalStrengthLte p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getAsuLevel() { return 0; }
    public int getCqi() { return 0; }
    public int getCqiTableIndex() { return 0; }
    public int getDbm() { return 0; }
    public int getLevel() { return 0; }
    public int getRsrp() { return 0; }
    public int getRsrq() { return 0; }
    public int getRssi() { return 0; }
    public int getRssnr() { return 0; }
    public int getTimingAdvance() { return 0; }
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    public void setDefaultValues() {}
    public java.lang.String toString() { return null; }
    public void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1) {}
    public void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1, boolean p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

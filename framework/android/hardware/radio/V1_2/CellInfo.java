package android.hardware.radio.V1_2;

public final class CellInfo {
    public java.util.ArrayList<android.hardware.radio.V1_2.CellInfoCdma> cdma;
    public int cellInfoType;
    public int connectionStatus;
    public java.util.ArrayList<android.hardware.radio.V1_2.CellInfoGsm> gsm;
    public java.util.ArrayList<android.hardware.radio.V1_2.CellInfoLte> lte;
    public boolean registered;
    public java.util.ArrayList<android.hardware.radio.V1_2.CellInfoTdscdma> tdscdma;
    public long timeStamp;
    public int timeStampType;
    public java.util.ArrayList<android.hardware.radio.V1_2.CellInfoWcdma> wcdma;
    public CellInfo() {}
    public static final java.util.ArrayList<android.hardware.radio.V1_2.CellInfo> readVectorFromParcel(android.os.HwParcel p0) { return null; }
    public static final void writeVectorToParcel(android.os.HwParcel p0, java.util.ArrayList<android.hardware.radio.V1_2.CellInfo> p1) {}
    public final boolean equals(java.lang.Object p0) { return false; }
    public final int hashCode() { return 0; }
    public final void readEmbeddedFromParcel(android.os.HwParcel p0, android.os.HwBlob p1, long p2) {}
    public final void readFromParcel(android.os.HwParcel p0) {}
    public final java.lang.String toString() { return null; }
    public final void writeEmbeddedToBlob(android.os.HwBlob p0, long p1) {}
    public final void writeToParcel(android.os.HwParcel p0) {}
}

package android.hardware.radio.network;

public final class CellInfoRatSpecificInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellInfoRatSpecificInfo> CREATOR = null;
    public static final int cdma = 5;
    public static final int gsm = 0;
    public static final int lte = 3;
    public static final int nr = 4;
    public static final int tdscdma = 2;
    public static final int wcdma = 1;
    private int _tag;
    private java.lang.Object _value;
    public CellInfoRatSpecificInfo() {}
    private CellInfoRatSpecificInfo(int p0, java.lang.Object p1) {}
    private CellInfoRatSpecificInfo(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    @java.lang.Deprecated
    public static android.hardware.radio.network.CellInfoRatSpecificInfo cdma(android.hardware.radio.network.CellInfoCdma p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.radio.network.CellInfoRatSpecificInfo gsm(android.hardware.radio.network.CellInfoGsm p0) { return null; }
    public static android.hardware.radio.network.CellInfoRatSpecificInfo lte(android.hardware.radio.network.CellInfoLte p0) { return null; }
    public static android.hardware.radio.network.CellInfoRatSpecificInfo nr(android.hardware.radio.network.CellInfoNr p0) { return null; }
    public static android.hardware.radio.network.CellInfoRatSpecificInfo tdscdma(android.hardware.radio.network.CellInfoTdscdma p0) { return null; }
    public static android.hardware.radio.network.CellInfoRatSpecificInfo wcdma(android.hardware.radio.network.CellInfoWcdma p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.radio.network.CellInfoCdma getCdma() { return null; }
    public android.hardware.radio.network.CellInfoGsm getGsm() { return null; }
    public android.hardware.radio.network.CellInfoLte getLte() { return null; }
    public android.hardware.radio.network.CellInfoNr getNr() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public android.hardware.radio.network.CellInfoTdscdma getTdscdma() { return null; }
    public android.hardware.radio.network.CellInfoWcdma getWcdma() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setCdma(android.hardware.radio.network.CellInfoCdma p0) {}
    public void setGsm(android.hardware.radio.network.CellInfoGsm p0) {}
    public void setLte(android.hardware.radio.network.CellInfoLte p0) {}
    public void setNr(android.hardware.radio.network.CellInfoNr p0) {}
    public void setTdscdma(android.hardware.radio.network.CellInfoTdscdma p0) {}
    public void setWcdma(android.hardware.radio.network.CellInfoWcdma p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        @java.lang.Deprecated
        public static final int cdma = 5;
        public static final int gsm = 0;
        public static final int lte = 3;
        public static final int nr = 4;
        public static final int tdscdma = 2;
        public static final int wcdma = 1;
    }
}

package android.hardware.radio.network;

public final class CellIdentity implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.CellIdentity> CREATOR = null;
    public static final int cdma = 4;
    public static final int gsm = 1;
    public static final int lte = 5;
    public static final int noinit = 0;
    public static final int nr = 6;
    public static final int tdscdma = 3;
    public static final int wcdma = 2;
    private int _tag;
    private java.lang.Object _value;
    public CellIdentity() {}
    private CellIdentity(int p0, java.lang.Object p1) {}
    private CellIdentity(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    @java.lang.Deprecated
    public static android.hardware.radio.network.CellIdentity cdma(android.hardware.radio.network.CellIdentityCdma p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.radio.network.CellIdentity gsm(android.hardware.radio.network.CellIdentityGsm p0) { return null; }
    public static android.hardware.radio.network.CellIdentity lte(android.hardware.radio.network.CellIdentityLte p0) { return null; }
    public static android.hardware.radio.network.CellIdentity noinit(boolean p0) { return null; }
    public static android.hardware.radio.network.CellIdentity nr(android.hardware.radio.network.CellIdentityNr p0) { return null; }
    public static android.hardware.radio.network.CellIdentity tdscdma(android.hardware.radio.network.CellIdentityTdscdma p0) { return null; }
    public static android.hardware.radio.network.CellIdentity wcdma(android.hardware.radio.network.CellIdentityWcdma p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.radio.network.CellIdentityCdma getCdma() { return null; }
    public android.hardware.radio.network.CellIdentityGsm getGsm() { return null; }
    public android.hardware.radio.network.CellIdentityLte getLte() { return null; }
    public boolean getNoinit() { return false; }
    public android.hardware.radio.network.CellIdentityNr getNr() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public android.hardware.radio.network.CellIdentityTdscdma getTdscdma() { return null; }
    public android.hardware.radio.network.CellIdentityWcdma getWcdma() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setCdma(android.hardware.radio.network.CellIdentityCdma p0) {}
    public void setGsm(android.hardware.radio.network.CellIdentityGsm p0) {}
    public void setLte(android.hardware.radio.network.CellIdentityLte p0) {}
    public void setNoinit(boolean p0) {}
    public void setNr(android.hardware.radio.network.CellIdentityNr p0) {}
    public void setTdscdma(android.hardware.radio.network.CellIdentityTdscdma p0) {}
    public void setWcdma(android.hardware.radio.network.CellIdentityWcdma p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        @java.lang.Deprecated
        public static final int cdma = 4;
        public static final int gsm = 1;
        public static final int lte = 5;
        public static final int noinit = 0;
        public static final int nr = 6;
        public static final int tdscdma = 3;
        public static final int wcdma = 2;
    }
}

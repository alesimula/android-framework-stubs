package android.hardware.biometrics.fingerprint.virtualhal;

public final class AcquiredInfoAndVendorCode implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.virtualhal.AcquiredInfoAndVendorCode> CREATOR = null;
    public static final int acquiredInfo = 0;
    public static final int vendorCode = 1;
    private int _tag;
    private java.lang.Object _value;
    public AcquiredInfoAndVendorCode() {}
    private AcquiredInfoAndVendorCode(int p0, java.lang.Object p1) {}
    private AcquiredInfoAndVendorCode(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    public static android.hardware.biometrics.fingerprint.virtualhal.AcquiredInfoAndVendorCode acquiredInfo(byte p0) { return null; }
    public static android.hardware.biometrics.fingerprint.virtualhal.AcquiredInfoAndVendorCode vendorCode(int p0) { return null; }
    public int describeContents() { return 0; }
    public byte getAcquiredInfo() { return 0; }
    public int getTag() { return 0; }
    public int getVendorCode() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setAcquiredInfo(byte p0) {}
    public void setVendorCode(int p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int acquiredInfo = 0;
        public static final int vendorCode = 1;
    }
}

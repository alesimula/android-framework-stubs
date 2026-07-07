package android.hardware.biometrics.fingerprint;

public final class SensorLocationData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.SensorLocationData> CREATOR = null;
    public static final int homeButtonLocation = 4;
    public static final int powerButtonDisplayLocation = 1;
    public static final int powerButtonPhysicalLocation = 2;
    public static final int rearLocation = 5;
    public static final int standaloneLocation = 3;
    public static final int underDisplayLocation = 0;
    private int _tag;
    private java.lang.Object _value;
    public SensorLocationData() {}
    private SensorLocationData(int p0, java.lang.Object p1) {}
    private SensorLocationData(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.biometrics.fingerprint.SensorLocationData homeButtonLocation(android.hardware.biometrics.fingerprint.location.HomeButtonLocation p0) { return null; }
    public static android.hardware.biometrics.fingerprint.SensorLocationData powerButtonDisplayLocation(android.hardware.biometrics.fingerprint.location.PowerButtonDisplayLocation p0) { return null; }
    public static android.hardware.biometrics.fingerprint.SensorLocationData powerButtonPhysicalLocation(android.hardware.biometrics.fingerprint.location.PowerButtonPhysicalLocation p0) { return null; }
    public static android.hardware.biometrics.fingerprint.SensorLocationData rearLocation(android.hardware.biometrics.fingerprint.location.RearLocation p0) { return null; }
    public static android.hardware.biometrics.fingerprint.SensorLocationData standaloneLocation(android.hardware.biometrics.fingerprint.location.StandaloneLocation p0) { return null; }
    public static android.hardware.biometrics.fingerprint.SensorLocationData underDisplayLocation(android.hardware.biometrics.fingerprint.location.UnderDisplayLocation p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.biometrics.fingerprint.location.HomeButtonLocation getHomeButtonLocation() { return null; }
    public android.hardware.biometrics.fingerprint.location.PowerButtonDisplayLocation getPowerButtonDisplayLocation() { return null; }
    public android.hardware.biometrics.fingerprint.location.PowerButtonPhysicalLocation getPowerButtonPhysicalLocation() { return null; }
    public android.hardware.biometrics.fingerprint.location.RearLocation getRearLocation() { return null; }
    public final int getStability() { return 0; }
    public android.hardware.biometrics.fingerprint.location.StandaloneLocation getStandaloneLocation() { return null; }
    public int getTag() { return 0; }
    public android.hardware.biometrics.fingerprint.location.UnderDisplayLocation getUnderDisplayLocation() { return null; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setHomeButtonLocation(android.hardware.biometrics.fingerprint.location.HomeButtonLocation p0) {}
    public void setPowerButtonDisplayLocation(android.hardware.biometrics.fingerprint.location.PowerButtonDisplayLocation p0) {}
    public void setPowerButtonPhysicalLocation(android.hardware.biometrics.fingerprint.location.PowerButtonPhysicalLocation p0) {}
    public void setRearLocation(android.hardware.biometrics.fingerprint.location.RearLocation p0) {}
    public void setStandaloneLocation(android.hardware.biometrics.fingerprint.location.StandaloneLocation p0) {}
    public void setUnderDisplayLocation(android.hardware.biometrics.fingerprint.location.UnderDisplayLocation p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int homeButtonLocation = 4;
        public static final int powerButtonDisplayLocation = 1;
        public static final int powerButtonPhysicalLocation = 2;
        public static final int rearLocation = 5;
        public static final int standaloneLocation = 3;
        public static final int underDisplayLocation = 0;
    }
}

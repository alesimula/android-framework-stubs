package android.hardware.fingerprint;

public class FingerprintSensorConfigurations implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.fingerprint.FingerprintSensorConfigurations> CREATOR = null;
    private static final java.lang.String TAG = "FingerprintSensorConfigurations";
    private final boolean mResetLockoutRequiresHardwareAuthToken = false;
    private final java.util.Map<java.lang.String, android.hardware.biometrics.fingerprint.SensorProps[]> mSensorPropsMap = null;
    protected FingerprintSensorConfigurations(android.os.Parcel p0) {}
    public FingerprintSensorConfigurations(boolean p0) {}
    public static android.hardware.biometrics.fingerprint.IFingerprint getIFingerprint(java.lang.String p0) { return null; }
    public static java.lang.String remapFqName(java.lang.String p0) { return null; }
    public void addAidlSensors(java.lang.String[] p0) {}
    public void addHidlSensors(java.lang.String[] p0, android.content.Context p1) {}
    public int describeContents() { return 0; }
    public boolean doesInstanceExist(java.lang.String p0) { return false; }
    public boolean getResetLockoutRequiresHardwareAuthToken() { return false; }
    public java.lang.String getSensorInstance() { return null; }
    public java.lang.String getSensorNameNotForInstance(java.lang.String p0) { return null; }
    public android.hardware.biometrics.fingerprint.SensorProps[] getSensorPropForInstance(java.lang.String p0) { return null; }
    public boolean hasSensorConfigurations() { return false; }
    public boolean isSingleSensorConfigurationPresent() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

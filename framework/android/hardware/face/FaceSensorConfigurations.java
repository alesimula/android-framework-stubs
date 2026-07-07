package android.hardware.face;

public class FaceSensorConfigurations implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.face.FaceSensorConfigurations> CREATOR = null;
    private static final java.lang.String TAG = "FaceSensorConfigurations";
    private final boolean mResetLockoutRequiresChallenge = false;
    private final java.util.Map<java.lang.String, android.hardware.biometrics.face.SensorProps[]> mSensorPropsMap = null;
    protected FaceSensorConfigurations(android.os.Parcel p0) {}
    public FaceSensorConfigurations(boolean p0) {}
    public static android.hardware.biometrics.face.IFace getIFace(java.lang.String p0) { return null; }
    public static java.lang.String remapFqName(java.lang.String p0) { return null; }
    public void addAidlConfigs(java.lang.String[] p0) {}
    public void addHidlConfigs(java.lang.String[] p0, android.content.Context p1) {}
    public int describeContents() { return 0; }
    public boolean doesInstanceExist(java.lang.String p0) { return false; }
    public boolean getResetLockoutRequiresChallenge() { return false; }
    public java.lang.String getSensorInstance() { return null; }
    public java.lang.String getSensorNameNotForInstance(java.lang.String p0) { return null; }
    public android.hardware.biometrics.face.SensorProps[] getSensorPropForInstance(java.lang.String p0) { return null; }
    public boolean hasSensorConfigurations() { return false; }
    public boolean isSingleSensorConfigurationPresent() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

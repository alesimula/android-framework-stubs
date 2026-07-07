package android.hardware.biometrics.fingerprint;

public class SensorProps implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.SensorProps> CREATOR = null;
    public android.hardware.biometrics.common.CommonProps commonProps;
    public boolean halControlsIllumination;
    public boolean halHandlesDisplayTouches;
    public android.hardware.biometrics.fingerprint.SensorLocation[] sensorLocations;
    public byte sensorType;
    public boolean supportsDetectInteraction;
    public boolean supportsNavigationGestures;
    public android.hardware.biometrics.fingerprint.TouchDetectionParameters touchDetectionParameters;
    public SensorProps() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

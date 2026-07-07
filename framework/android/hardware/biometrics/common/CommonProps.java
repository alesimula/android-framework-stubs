package android.hardware.biometrics.common;

public class CommonProps implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.CommonProps> CREATOR = null;
    public android.hardware.biometrics.common.ComponentInfo[] componentInfo;
    public int maxEnrollmentsPerUser;
    public int sensorId;
    public byte sensorStrength;
    public CommonProps() {}
    private int describeContents(java.lang.Object p0) { return 0; }
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

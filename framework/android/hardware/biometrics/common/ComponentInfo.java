package android.hardware.biometrics.common;

public class ComponentInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.ComponentInfo> CREATOR = null;
    public java.lang.String componentId;
    public java.lang.String firmwareVersion;
    public java.lang.String hardwareVersion;
    public java.lang.String serialNumber;
    public java.lang.String softwareVersion;
    public ComponentInfo() {}
    public int describeContents() { return 0; }
    public final int getStability() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

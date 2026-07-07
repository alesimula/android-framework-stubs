package android.hardware.input;

public class IInputDeviceBatteryState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.IInputDeviceBatteryState> CREATOR = null;
    public float capacity;
    public int deviceId;
    public boolean isPresent;
    public int status;
    public long updateTime;
    public IInputDeviceBatteryState() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

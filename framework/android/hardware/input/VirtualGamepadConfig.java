package android.hardware.input;

public class VirtualGamepadConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualGamepadConfig> CREATOR = null;
    public int associatedDisplayId;
    public java.lang.String name;
    public int productId;
    public boolean registerTriggerAxes;
    public int vendorId;
    public VirtualGamepadConfig() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.hardware.hid;

public class HidDeviceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.hid.HidDeviceInfo> CREATOR = null;
    public java.lang.String hidrawPath;
    public java.lang.String name;
    public java.lang.String physicalAddress;
    public int productId;
    public byte[] reportDescriptor;
    public int transport;
    public java.lang.String uniqueId;
    public int vendorId;
    public HidDeviceInfo() {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

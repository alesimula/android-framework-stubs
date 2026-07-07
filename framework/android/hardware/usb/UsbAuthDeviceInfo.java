package android.hardware.usb;

public class UsbAuthDeviceInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.usb.UsbAuthDeviceInfo> CREATOR = null;
    public byte bDeviceClass;
    public byte bDeviceProtocol;
    public byte bDeviceSubClass;
    public byte bInterfaceClass;
    public byte bInterfaceNumber;
    public byte bInterfaceProtocol;
    public byte bInterfaceSubClass;
    public int bcdDevice;
    public int busNumber;
    public byte deviceClass;
    public int deviceNumber;
    public java.lang.String manufacturer;
    public int productId;
    public java.lang.String productName;
    public java.lang.String serialNumber;
    public java.lang.String syspath;
    public int vendorId;
    public UsbAuthDeviceInfo() {}
    public int describeContents() { return 0; }
    public final void readFromParcel(android.os.Parcel p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.hardware.usb;

public class DeviceFilter {
    private static final java.lang.String CLASS_ATTR = "class";
    private static final java.lang.String INTERFACE_NAME_ATTR = "interface-name";
    private static final java.lang.String MANUFACTURER_NAME_ATTR = "manufacturer-name";
    private static final java.lang.String PRODUCT_ID_ATTR = "product-id";
    private static final java.lang.String PRODUCT_NAME_ATTR = "product-name";
    private static final java.lang.String PROTOCOL_ATTR = "protocol";
    private static final java.lang.String SERIAL_NAME_ATTR = "serial-number";
    private static final java.lang.String SUBCLASS_ATTR = "subclass";
    private static final java.lang.String TAG = null;
    private static final java.lang.String VENDOR_ID_ATTR = "vendor-id";
    public static final java.lang.String XML_ROOT_NAME = "usb-device";
    public final int mClass = 0;
    public final java.lang.String mInterfaceName = null;
    public final java.lang.String mManufacturerName = null;
    public final int mProductId = 0;
    public final java.lang.String mProductName = null;
    public final int mProtocol = 0;
    public final java.lang.String mSerialNumber = null;
    public final int mSubclass = 0;
    public final int mVendorId = 0;
    public DeviceFilter(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8) {}
    public DeviceFilter(android.hardware.usb.DeviceFilter p0) {}
    public DeviceFilter(android.hardware.usb.UsbDevice p0) {}
    private boolean matches(int p0, int p1, int p2) { return false; }
    private boolean matches(int p0, int p1, int p2, java.lang.String p3) { return false; }
    public static android.hardware.usb.DeviceFilter read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public boolean contains(android.hardware.usb.DeviceFilter p0) { return false; }
    public void dump(com.android.internal.util.dump.DualDumpOutputStream p0, java.lang.String p1, long p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean matches(android.hardware.usb.UsbDevice p0) { return false; }
    public java.lang.String toString() { return null; }
    public void write(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException {}
}

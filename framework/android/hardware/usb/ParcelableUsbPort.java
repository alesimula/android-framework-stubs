package android.hardware.usb;

public final class ParcelableUsbPort implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.usb.ParcelableUsbPort> CREATOR = null;
    private final java.lang.String mId = null;
    private final int mSupportedAltModesMask = 0;
    private final int mSupportedContaminantProtectionModes = 0;
    private final int mSupportedModes = 0;
    private final boolean mSupportsComplianceWarnings = false;
    private final boolean mSupportsEnableContaminantPresenceDetection = false;
    private final boolean mSupportsEnableContaminantPresenceProtection = false;
    private final boolean mSupportsPartnerBc12Type = false;
    private final boolean mSupportsPowerProfiles = false;
    private ParcelableUsbPort(java.lang.String p0, int p1, int p2, boolean p3, boolean p4, boolean p5, int p6, boolean p7, boolean p8) {}
    public static android.hardware.usb.ParcelableUsbPort of(android.hardware.usb.UsbPort p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.usb.UsbPort getUsbPort(android.hardware.usb.UsbManager p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

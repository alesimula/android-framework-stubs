package android.companion.virtual;

public final class VirtualDevice implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.companion.virtual.VirtualDevice> CREATOR = null;
    public static final int DEVICE_PROFILE_APP_STREAMING = 102;
    public static final int DEVICE_PROFILE_AUTOMOTIVE_PROJECTION = 101;
    public static final int DEVICE_PROFILE_COMPUTER_CONTROL = 1;
    public static final int DEVICE_PROFILE_NEARBY_DEVICE_STREAMING = 103;
    public static final int DEVICE_PROFILE_SHELL = 0;
    public static final int DEVICE_PROFILE_UNKNOWN = -1;
    public static final int DEVICE_PROFILE_VIRTUAL_DEVICE = 104;
    private final java.lang.CharSequence mDisplayName = null;
    private final int mId = 0;
    private final java.lang.String mName = null;
    private final java.lang.String mPersistentId = null;
    private final int mProfile = 0;
    private final android.companion.virtual.IVirtualDevice mVirtualDevice = null;
    public VirtualDevice(android.companion.virtual.IVirtualDevice p0, int p1, int p2, java.lang.String p3, java.lang.String p4, java.lang.CharSequence p5) {}
    private VirtualDevice(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getDeviceId() { return 0; }
    public int getDeviceProfile() { return 0; }
    public int[] getDisplayIds() { return null; }
    public java.lang.CharSequence getDisplayName() { return null; }
    public java.lang.String getName() { return null; }
    public java.lang.String getPersistentDeviceId() { return null; }
    @android.annotation.SystemApi
    public boolean hasCustomAudioInputSupport() { return false; }
    @android.annotation.SystemApi
    public boolean hasCustomCameraSupport() { return false; }
    public boolean hasCustomSensorSupport() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_PARAMETER, java.lang.annotation.ElementType.TYPE_USE})
    public static @interface DeviceProfile {
    }
}

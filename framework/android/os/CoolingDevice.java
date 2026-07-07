package android.os;

public final class CoolingDevice implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.os.CoolingDevice> CREATOR = null;
    public static final int TYPE_BATTERY = 1;
    public static final int TYPE_CAMERA = 12;
    public static final int TYPE_COMPONENT = 6;
    public static final int TYPE_CPU = 2;
    public static final int TYPE_DISPLAY = 9;
    public static final int TYPE_FAN = 0;
    public static final int TYPE_FLASHLIGHT = 13;
    public static final int TYPE_GPU = 3;
    public static final int TYPE_MODEM = 4;
    public static final int TYPE_NPU = 5;
    public static final int TYPE_POWER_AMPLIFIER = 8;
    public static final int TYPE_SPEAKER = 10;
    public static final int TYPE_TPU = 7;
    public static final int TYPE_USB_PORT = 14;
    public static final int TYPE_WIFI = 11;
    private final java.lang.String mName = null;
    private final int mType = 0;
    private final long mValue = 0L;
    public CoolingDevice(long p0, int p1, java.lang.String p2) {}
    public static boolean isValidType(int p0) { return false; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getName() { return null; }
    public int getType() { return 0; }
    public long getValue() { return 0L; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}

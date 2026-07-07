package android.hardware.cas;

public final class DestinationBuffer implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.cas.DestinationBuffer> CREATOR = null;
    public static final int nonsecureMemory = 0;
    public static final int secureMemory = 1;
    private int _tag;
    private java.lang.Object _value;
    public DestinationBuffer() {}
    private DestinationBuffer(int p0, java.lang.Object p1) {}
    private DestinationBuffer(android.os.Parcel p0) {}
    private void _assertTag(int p0) {}
    private void _set(int p0, java.lang.Object p1) {}
    private java.lang.String _tagString(int p0) { return null; }
    private int describeContents(java.lang.Object p0) { return 0; }
    public static android.hardware.cas.DestinationBuffer nonsecureMemory(android.hardware.cas.SharedBuffer p0) { return null; }
    public static android.hardware.cas.DestinationBuffer secureMemory(android.hardware.common.NativeHandle p0) { return null; }
    public int describeContents() { return 0; }
    public android.hardware.cas.SharedBuffer getNonsecureMemory() { return null; }
    public android.hardware.common.NativeHandle getSecureMemory() { return null; }
    public final int getStability() { return 0; }
    public int getTag() { return 0; }
    public void readFromParcel(android.os.Parcel p0) {}
    public void setNonsecureMemory(android.hardware.cas.SharedBuffer p0) {}
    public void setSecureMemory(android.hardware.common.NativeHandle p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface Tag {
        public static final int nonsecureMemory = 0;
        public static final int secureMemory = 1;
    }
}

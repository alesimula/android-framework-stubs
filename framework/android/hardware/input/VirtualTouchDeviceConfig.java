package android.hardware.input;

abstract class VirtualTouchDeviceConfig extends android.hardware.input.VirtualInputDeviceConfig {
    private final int mHeight = 0;
    private final int mWidth = 0;
    VirtualTouchDeviceConfig(android.hardware.input.VirtualTouchDeviceConfig.Builder<? extends android.hardware.input.VirtualTouchDeviceConfig.Builder<?>> p0) { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    VirtualTouchDeviceConfig(android.os.Parcel p0) { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    java.lang.String additionalFieldsToString() { return null; }
    public int getHeight() { return 0; }
    public int getWidth() { return 0; }
    void writeToParcel(android.os.Parcel p0, int p1) {}

    static abstract class Builder<T extends android.hardware.input.VirtualTouchDeviceConfig.Builder<T>> extends android.hardware.input.VirtualInputDeviceConfig.Builder<T> {
        private final int mHeight = 0;
        private final int mWidth = 0;
        Builder(int p0, int p1) { super(); }
    }
}

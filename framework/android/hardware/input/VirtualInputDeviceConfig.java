package android.hardware.input;

@android.annotation.SystemApi
public abstract class VirtualInputDeviceConfig {
    private static final android.hardware.input.ViewBehaviorConfig DEFAULT_VIEW_BEHAVIOR_CONFIG = null;
    private static final int DEVICE_NAME_MAX_LENGTH = 80;
    private final int mAssociatedDisplayId = 0;
    private final java.lang.String mInputDeviceName = null;
    private final int mProductId = 0;
    private final int mVendorId = 0;
    private final android.hardware.input.ViewBehaviorConfig mViewBehaviorConfig = null;
    protected VirtualInputDeviceConfig(android.hardware.input.VirtualInputDeviceConfig.Builder<? extends android.hardware.input.VirtualInputDeviceConfig.Builder<?>> p0) {}
    protected VirtualInputDeviceConfig(android.os.Parcel p0) {}
    java.lang.String additionalFieldsToString() { return null; }
    public void checkForAssociatedDisplay() {}
    public int getAssociatedDisplayId() { return 0; }
    public java.lang.String getInputDeviceName() { return null; }
    public int getProductId() { return 0; }
    public int getVendorId() { return 0; }
    public android.hardware.input.ViewBehaviorConfig getViewBehaviorConfig() { return null; }
    public android.hardware.input.ViewBehaviorConfig getViewBehaviorConfigOrDefault(android.hardware.input.ViewBehaviorConfig p0) { return null; }
    public java.lang.String toString() { return null; }
    void writeToParcel(android.os.Parcel p0, int p1) {}

    public static abstract class Builder<T extends android.hardware.input.VirtualInputDeviceConfig.Builder<T>> {
        private int mAssociatedDisplayId;
        private java.lang.String mInputDeviceName;
        private int mProductId;
        private int mVendorId;
        private android.hardware.input.ViewBehaviorConfig mViewBehaviorConfig;
        public Builder() {}
        T self() { return null; }
        public T setAssociatedDisplayId(int p0) { return null; }
        public T setInputDeviceName(java.lang.String p0) { return null; }
        public T setProductId(int p0) { return null; }
        public T setVendorId(int p0) { return null; }
        public T setViewBehaviorConfig(android.hardware.input.ViewBehaviorConfig p0) { return null; }
    }
}

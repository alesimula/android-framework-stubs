package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualNavigationTouchpadConfig extends android.hardware.input.VirtualInputDeviceConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualNavigationTouchpadConfig> CREATOR = null;
    private final int mHeight = 0;
    private final int mWidth = 0;
    private VirtualNavigationTouchpadConfig(android.hardware.input.VirtualNavigationTouchpadConfig.Builder p0) { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    private VirtualNavigationTouchpadConfig(android.os.Parcel p0) { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    java.lang.String additionalFieldsToString() { return null; }
    public int describeContents() { return 0; }
    public int getHeight() { return 0; }
    public int getWidth() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder extends android.hardware.input.VirtualInputDeviceConfig.Builder<android.hardware.input.VirtualNavigationTouchpadConfig.Builder> {
        private final int mHeight = 0;
        private final int mWidth = 0;
        public Builder(int p0, int p1) { super(); }
        public android.hardware.input.VirtualNavigationTouchpadConfig build() { return null; }
    }
}

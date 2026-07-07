package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualTouchscreenConfig extends android.hardware.input.VirtualTouchDeviceConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualTouchscreenConfig> CREATOR = null;
    private VirtualTouchscreenConfig(android.hardware.input.VirtualTouchscreenConfig.Builder p0) { super((android.hardware.input.VirtualTouchDeviceConfig.Builder)null); }
    private VirtualTouchscreenConfig(android.os.Parcel p0) { super((android.hardware.input.VirtualTouchDeviceConfig.Builder)null); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder extends android.hardware.input.VirtualTouchDeviceConfig.Builder<android.hardware.input.VirtualTouchscreenConfig.Builder> {
        public Builder(int p0, int p1) { super(0, 0); }
        public android.hardware.input.VirtualTouchscreenConfig build() { return null; }
    }
}

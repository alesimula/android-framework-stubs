package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualKeyboardConfig extends android.hardware.input.VirtualInputDeviceConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualKeyboardConfig> CREATOR = null;
    public static final java.lang.String DEFAULT_LANGUAGE_TAG = "en-Latn-US";
    public static final java.lang.String DEFAULT_LAYOUT_TYPE = "qwerty";
    private final java.lang.String mLanguageTag = null;
    private final java.lang.String mLayoutType = null;
    private VirtualKeyboardConfig(android.hardware.input.VirtualKeyboardConfig.Builder p0) { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    private VirtualKeyboardConfig(android.os.Parcel p0) { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    java.lang.String additionalFieldsToString() { return null; }
    public int describeContents() { return 0; }
    public java.lang.String getLanguageTag() { return null; }
    public java.lang.String getLayoutType() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder extends android.hardware.input.VirtualInputDeviceConfig.Builder<android.hardware.input.VirtualKeyboardConfig.Builder> {
        private java.lang.String mLanguageTag;
        private java.lang.String mLayoutType;
        public Builder() { super(); }
        public android.hardware.input.VirtualKeyboardConfig build() { return null; }
        public android.hardware.input.VirtualKeyboardConfig.Builder setLanguageTag(java.lang.String p0) { return null; }
        public android.hardware.input.VirtualKeyboardConfig.Builder setLayoutType(java.lang.String p0) { return null; }
    }
}

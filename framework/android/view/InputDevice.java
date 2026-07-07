package android.view;

public final class InputDevice implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.InputDevice> CREATOR = null;
    public static final int KEYBOARD_TYPE_ALPHABETIC = 2;
    public static final int KEYBOARD_TYPE_NONE = 0;
    public static final int KEYBOARD_TYPE_NON_ALPHABETIC = 1;
    private static final int MAX_RANGES = 1000;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_ORIENTATION = 8;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_PRESSURE = 2;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_SIZE = 3;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_TOOL_MAJOR = 6;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_TOOL_MINOR = 7;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_TOUCH_MAJOR = 4;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_TOUCH_MINOR = 5;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_X = 0;
    @java.lang.Deprecated
    public static final int MOTION_RANGE_Y = 1;
    public static final int SOURCE_ANY = -256;
    public static final int SOURCE_BLUETOOTH_STYLUS = 49154;
    public static final int SOURCE_CLASS_BUTTON = 1;
    public static final int SOURCE_CLASS_JOYSTICK = 16;
    public static final int SOURCE_CLASS_MASK = 255;
    public static final int SOURCE_CLASS_NONE = 0;
    public static final int SOURCE_CLASS_POINTER = 2;
    public static final int SOURCE_CLASS_POSITION = 8;
    public static final int SOURCE_CLASS_TRACKBALL = 4;
    public static final int SOURCE_DPAD = 513;
    public static final int SOURCE_GAMEPAD = 1025;
    public static final int SOURCE_HDMI = 33554433;
    public static final int SOURCE_JOYSTICK = 16777232;
    public static final int SOURCE_KEYBOARD = 257;
    public static final int SOURCE_MOUSE = 8194;
    public static final int SOURCE_MOUSE_RELATIVE = 131076;
    public static final int SOURCE_ROTARY_ENCODER = 4194304;
    public static final int SOURCE_SENSOR = 67108864;
    public static final int SOURCE_STYLUS = 16386;
    public static final int SOURCE_TOUCHPAD = 1048584;
    public static final int SOURCE_TOUCHSCREEN = 4098;
    public static final int SOURCE_TOUCH_NAVIGATION = 2097152;
    public static final int SOURCE_TRACKBALL = 65540;
    public static final int SOURCE_UNKNOWN = 0;
    public static final int UNSPECIFIED_PRIMARY_DIRECTIONAL_MOTION_AXIS = -1;
    private static final int VIBRATOR_ID_ALL = -1;
    private final int mAssociatedDisplayId = 0;
    private final int mControllerNumber = 0;
    private final java.lang.String mDescriptor = null;
    private final int mDeviceBus = 0;
    private final boolean mEnabled = false;
    private final int mGeneration = 0;
    private final boolean mHasBattery = false;
    private final boolean mHasMicrophone = false;
    private final boolean mHasSensor = false;
    private final boolean mHasVibrator = false;
    private final android.hardware.input.HostUsiVersion mHostUsiVersion = null;
    private final int mId = 0;
    private final android.hardware.input.InputDeviceIdentifier mIdentifier = null;
    private final boolean mIsExternal = false;
    private final boolean mIsVirtualDevice = false;
    private final android.view.KeyCharacterMap mKeyCharacterMap = null;
    private final java.lang.String mKeyboardLanguageTag = null;
    private final java.lang.String mKeyboardLayoutType = null;
    private final int mKeyboardType = 0;
    private android.hardware.lights.LightsManager mLightsManager;
    private final java.util.ArrayList<android.view.InputDevice.MotionRange> mMotionRanges = null;
    private final java.lang.String mName = null;
    private final int mProductId = 0;
    private android.hardware.SensorManager mSensorManager;
    private final int mSources = 0;
    private final int mVendorId = 0;
    private android.os.Vibrator mVibrator;
    private android.os.VibratorManager mVibratorManager;
    private final android.view.InputDevice.ViewBehavior mViewBehavior = null;
    private InputDevice(int p0, int p1, int p2, java.lang.String p3, int p4, int p5, int p6, java.lang.String p7, boolean p8, boolean p9, int p10, int p11, android.view.KeyCharacterMap p12, java.lang.String p13, java.lang.String p14, boolean p15, boolean p16, boolean p17, boolean p18, int p19, int p20, int p21, boolean p22) {}
    private InputDevice(android.os.Parcel p0) {}
    private void addMotionRange(int p0, int p1, float p2, float p3, float p4, float p5, float p6) {}
    private void appendSourceDescriptionIfApplicable(java.lang.StringBuilder p0, int p1, java.lang.String p2) {}
    public static android.view.InputDevice getDevice(int p0) { return null; }
    public static int[] getDeviceIds() { return null; }
    private void setPrimaryDirectionalMotionAxis(int p0) {}
    private void setShouldSmoothScroll(boolean p0) {}
    public int describeContents() { return 0; }
    public void disable() {}
    public void enable() {}
    public int getAssociatedDisplayId() { return 0; }
    public android.hardware.BatteryState getBatteryState() { return null; }
    public java.lang.String getBluetoothAddress() { return null; }
    public int getControllerNumber() { return 0; }
    public java.lang.String getDescriptor() { return null; }
    public int getDeviceBus() { return 0; }
    public int getGeneration() { return 0; }
    public android.hardware.input.HostUsiVersion getHostUsiVersion() { return null; }
    public int getId() { return 0; }
    public android.hardware.input.InputDeviceIdentifier getIdentifier() { return null; }
    public android.view.KeyCharacterMap getKeyCharacterMap() { return null; }
    public int getKeyCodeForKeyLocation(int p0) { return 0; }
    public java.lang.String getKeyboardLanguageTag() { return null; }
    public java.lang.String getKeyboardLayoutType() { return null; }
    public int getKeyboardType() { return 0; }
    public android.hardware.lights.LightsManager getLightsManager() { return null; }
    public android.view.InputDevice.MotionRange getMotionRange(int p0) { return null; }
    public android.view.InputDevice.MotionRange getMotionRange(int p0, int p1) { return null; }
    public java.util.List<android.view.InputDevice.MotionRange> getMotionRanges() { return null; }
    public java.lang.String getName() { return null; }
    public int getProductId() { return 0; }
    public android.hardware.SensorManager getSensorManager() { return null; }
    public int getSources() { return 0; }
    public int getSupportedButtons() { return 0; }
    public int getVendorId() { return 0; }
    @java.lang.Deprecated
    public android.os.Vibrator getVibrator() { return null; }
    public android.os.VibratorManager getVibratorManager() { return null; }
    public android.view.InputDevice.ViewBehavior getViewBehavior() { return null; }
    public boolean hasBattery() { return false; }
    public boolean[] hasKeys(int... p0) { return null; }
    public boolean hasMicrophone() { return false; }
    public boolean hasSensor() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isExternal() { return false; }
    public boolean isFullKeyboard() { return false; }
    public boolean isPhysicalDevice() { return false; }
    public boolean isVirtual() { return false; }
    public boolean supportsSource(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private int mAssociatedDisplayId;
        private int mControllerNumber;
        private java.lang.String mDescriptor;
        private int mDeviceBus;
        private boolean mEnabled;
        private int mGeneration;
        private boolean mHasBattery;
        private boolean mHasMicrophone;
        private boolean mHasSensor;
        private boolean mHasVibrator;
        private int mId;
        private boolean mIsExternal;
        private boolean mIsVirtualDevice;
        private android.view.KeyCharacterMap mKeyCharacterMap;
        private java.lang.String mKeyboardLanguageTag;
        private java.lang.String mKeyboardLayoutType;
        private int mKeyboardType;
        private java.util.List<android.view.InputDevice.MotionRange> mMotionRanges;
        private java.lang.String mName;
        private int mPrimaryDirectionalMotionAxis;
        private int mProductId;
        private boolean mShouldSmoothScroll;
        private int mSources;
        private int mUsiVersionMajor;
        private int mUsiVersionMinor;
        private int mVendorId;
        public Builder() {}
        public android.view.InputDevice.Builder addMotionRange(int p0, int p1, float p2, float p3, float p4, float p5, float p6) { return null; }
        public android.view.InputDevice build() { return null; }
        public android.view.InputDevice.Builder setAssociatedDisplayId(int p0) { return null; }
        public android.view.InputDevice.Builder setControllerNumber(int p0) { return null; }
        public android.view.InputDevice.Builder setDescriptor(java.lang.String p0) { return null; }
        public android.view.InputDevice.Builder setDeviceBus(int p0) { return null; }
        public android.view.InputDevice.Builder setEnabled(boolean p0) { return null; }
        public android.view.InputDevice.Builder setExternal(boolean p0) { return null; }
        public android.view.InputDevice.Builder setGeneration(int p0) { return null; }
        public android.view.InputDevice.Builder setHasBattery(boolean p0) { return null; }
        public android.view.InputDevice.Builder setHasMicrophone(boolean p0) { return null; }
        public android.view.InputDevice.Builder setHasSensor(boolean p0) { return null; }
        public android.view.InputDevice.Builder setHasVibrator(boolean p0) { return null; }
        public android.view.InputDevice.Builder setId(int p0) { return null; }
        public android.view.InputDevice.Builder setIsVirtualDevice(boolean p0) { return null; }
        public android.view.InputDevice.Builder setKeyCharacterMap(android.view.KeyCharacterMap p0) { return null; }
        public android.view.InputDevice.Builder setKeyboardLanguageTag(java.lang.String p0) { return null; }
        public android.view.InputDevice.Builder setKeyboardLayoutType(java.lang.String p0) { return null; }
        public android.view.InputDevice.Builder setKeyboardType(int p0) { return null; }
        public android.view.InputDevice.Builder setName(java.lang.String p0) { return null; }
        public android.view.InputDevice.Builder setPrimaryDirectionalMotionAxis(int p0) { return null; }
        public android.view.InputDevice.Builder setProductId(int p0) { return null; }
        public android.view.InputDevice.Builder setShouldSmoothScroll(boolean p0) { return null; }
        public android.view.InputDevice.Builder setSources(int p0) { return null; }
        public android.view.InputDevice.Builder setUsiVersion(android.hardware.input.HostUsiVersion p0) { return null; }
        public android.view.InputDevice.Builder setVendorId(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface InputSourceClass {
    }

    public static final class MotionRange {
        private int mAxis;
        private float mFlat;
        private float mFuzz;
        private float mMax;
        private float mMin;
        private float mResolution;
        private int mSource;
        private MotionRange(int p0, int p1, float p2, float p3, float p4, float p5, float p6) {}
        public int getAxis() { return 0; }
        public float getFlat() { return 0.0f; }
        public float getFuzz() { return 0.0f; }
        public float getMax() { return 0.0f; }
        public float getMin() { return 0.0f; }
        public float getRange() { return 0.0f; }
        public float getResolution() { return 0.0f; }
        public int getSource() { return 0; }
        public boolean isFromSource(int p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Source {
    }

    public static final class ViewBehavior {
        public static final boolean DEFAULT_SHOULD_SMOOTH_SCROLL = false;
        private final android.view.InputDevice mInputDevice = null;
        private int mPrimaryDirectionalMotionAxis;
        private boolean mShouldSmoothScroll;
        public ViewBehavior(android.view.InputDevice p0) {}
        public int getPrimaryDirectionalMotionAxis() { return 0; }
        public boolean hasPrimaryDirectionalMotionAxis() { return false; }
        public boolean shouldSmoothScroll(int p0, int p1) { return false; }
    }
}

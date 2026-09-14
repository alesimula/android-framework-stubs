package android.hardware.display;

public final class VirtualDisplayConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.display.VirtualDisplayConfig> CREATOR = null;
    private final android.hardware.display.IBrightnessListener mBrightnessListener = null;
    private final float mDefaultBrightness = 0.0f;
    private final int mDensityDpi = 0;
    private final float mDimBrightness = 0.0f;
    private final android.util.ArraySet<java.lang.String> mDisplayCategories = null;
    private final android.view.DisplayCutout mDisplayCutout = null;
    private final int mFlags = 0;
    private final int mHeight = 0;
    private final boolean mIgnoreActivitySizeRestrictions = false;
    private final boolean mIsHomeSupported = false;
    private final android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig mMirroringDisplayConfig = null;
    private final java.lang.String mName = null;
    private final float mRequestedRefreshRate = 0.0f;
    private final android.view.Surface mSurface = null;
    private final java.lang.String mUniqueId = null;
    private final int mWidth = 0;
    private VirtualDisplayConfig(android.os.Parcel p0) {}
    private VirtualDisplayConfig(java.lang.String p0, int p1, int p2, int p3, int p4, android.view.Surface p5, java.lang.String p6, android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig p7, android.util.ArraySet<java.lang.String> p8, float p9, boolean p10, android.view.DisplayCutout p11, boolean p12, float p13, float p14, android.hardware.display.IBrightnessListener p15) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.hardware.display.IBrightnessListener getBrightnessListener() { return null; }
    public float getDefaultBrightness() { return 0.0f; }
    public int getDensityDpi() { return 0; }
    public float getDimBrightness() { return 0.0f; }
    public java.util.Set<java.lang.String> getDisplayCategories() { return null; }
    @android.annotation.SystemApi
    public android.view.DisplayCutout getDisplayCutout() { return null; }
    public int getFlags() { return 0; }
    public int getHeight() { return 0; }
    @android.annotation.SystemApi
    public android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig getMirroringDisplayConfig() { return null; }
    public java.lang.String getName() { return null; }
    public float getRequestedRefreshRate() { return 0.0f; }
    public android.view.Surface getSurface() { return null; }
    @android.annotation.SystemApi
    public java.lang.String getUniqueId() { return null; }
    public int getWidth() { return 0; }
    public int hashCode() { return 0; }
    @android.annotation.SystemApi
    public boolean isHomeSupported() { return false; }
    @android.annotation.SystemApi
    public boolean isIgnoreActivitySizeRestrictions() { return false; }
    public boolean isWindowManagerMirroringEnabled() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class MirroringDisplayConfig implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig> CREATOR = null;
        private final int mDisplayIdToMirror = 0;
        private final android.view.WindowId mLowestExcludedLayer = null;
        private final boolean mSensitiveContentProtectionEnabled = false;
        private final android.app.ActivityOptions.LaunchCookie mTaskToMirror = null;
        private final boolean mWindowManagerMirroringEnabled = false;
        private MirroringDisplayConfig(int p0, android.app.ActivityOptions.LaunchCookie p1, boolean p2, boolean p3, android.view.WindowId p4) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.view.WindowId getCaptureLayersBelow() { return null; }
        public int getDisplayIdToMirror() { return 0; }
        public android.app.ActivityOptions.LaunchCookie getTaskToMirror() { return null; }
        public int hashCode() { return 0; }
        public boolean isSensitiveContentProtectionEnabled() { return false; }
        public boolean isWindowManagerMirroringEnabled() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private int mDisplayIdToMirror;
            private android.view.WindowId mLowestExcludedLayer;
            private boolean mSensitiveContentProtectionEnabled;
            private android.app.ActivityOptions.LaunchCookie mTaskToMirror;
            private boolean mWindowManagerMirroringEnabled;
            public Builder() {}
            public Builder(android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig p0) {}
            public android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig build() { return null; }
            public android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig.Builder setCaptureLayersBelow(android.view.WindowId p0) { return null; }
            public android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig.Builder setDisplayIdToMirror(int p0) { return null; }
            public android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig.Builder setSensitiveContentProtectionEnabled(boolean p0) { return null; }
            public android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig.Builder setTaskToMirror(android.app.ActivityOptions.LaunchCookie p0) { return null; }
            public android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig.Builder setWindowManagerMirroringEnabled(boolean p0) { return null; }
        }
    }

    private static class BrightnessListenerDelegate extends android.hardware.display.IBrightnessListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.hardware.display.VirtualDisplayConfig.BrightnessListener mListener = null;
        BrightnessListenerDelegate(java.util.concurrent.Executor p0, android.hardware.display.VirtualDisplayConfig.BrightnessListener p1) { super(); }
        public void onBrightnessChanged(float p0) {}
    }

    public static interface BrightnessListener {
        public void onBrightnessChanged(float p0);
    }

    public static final class Builder {
        private android.hardware.display.IBrightnessListener mBrightnessListener;
        private float mDefaultBrightness;
        private final int mDensityDpi = 0;
        private float mDimBrightness;
        private android.util.ArraySet<java.lang.String> mDisplayCategories;
        private android.view.DisplayCutout mDisplayCutout;
        private int mFlags;
        private final int mHeight = 0;
        private boolean mIgnoreActivitySizeRestrictions;
        private boolean mIsHomeSupported;
        private android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig.Builder mMirroringDisplayConfigBuilder;
        private final java.lang.String mName = null;
        private float mRequestedRefreshRate;
        private android.view.Surface mSurface;
        private java.lang.String mUniqueId;
        private final int mWidth = 0;
        public Builder(android.hardware.display.VirtualDisplayConfig p0) {}
        public Builder(java.lang.String p0, int p1, int p2, int p3) {}
        private boolean isValidBrightness(float p0) { return false; }
        public android.hardware.display.VirtualDisplayConfig.Builder addDisplayCategory(java.lang.String p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig build() { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setBrightnessListener(java.util.concurrent.Executor p0, android.hardware.display.VirtualDisplayConfig.BrightnessListener p1) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setDefaultBrightness(float p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setDimBrightness(float p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setDisplayCategories(java.util.Set<java.lang.String> p0) { return null; }
        @android.annotation.SystemApi
        public android.hardware.display.VirtualDisplayConfig.Builder setDisplayCutout(android.view.DisplayCutout p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setFlags(int p0) { return null; }
        @android.annotation.SystemApi
        public android.hardware.display.VirtualDisplayConfig.Builder setHomeSupported(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.hardware.display.VirtualDisplayConfig.Builder setIgnoreActivitySizeRestrictions(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.hardware.display.VirtualDisplayConfig.Builder setMirroringDisplayConfig(android.hardware.display.VirtualDisplayConfig.MirroringDisplayConfig p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setRequestedRefreshRate(float p0) { return null; }
        public android.hardware.display.VirtualDisplayConfig.Builder setSurface(android.view.Surface p0) { return null; }
        @android.annotation.SystemApi
        public android.hardware.display.VirtualDisplayConfig.Builder setUniqueId(java.lang.String p0) { return null; }
    }
}

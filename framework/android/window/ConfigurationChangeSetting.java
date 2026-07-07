package android.window;

public abstract class ConfigurationChangeSetting implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.ConfigurationChangeSetting> CREATOR = null;
    public static final int SETTING_TYPE_DISPLAY_DENSITY = 0;
    public static final int SETTING_TYPE_FONT_SCALE = 1;
    public static final int SETTING_TYPE_UNKNOWN = -1;
    private final int mSettingType = 0;
    private ConfigurationChangeSetting(int p0) {}
    public void apply(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static interface ConfigurationChangeSettingInternal {
        public android.window.ConfigurationChangeSetting createImplFromParcel(int p0, android.os.Parcel p1);
    }

    public static class CreatorImpl implements android.os.Parcelable.Creator<android.window.ConfigurationChangeSetting> {
        private final boolean mIsSystem = false;
        private CreatorImpl() {}
        public CreatorImpl(boolean p0) {}
        public android.window.ConfigurationChangeSetting createFromParcel(android.os.Parcel p0) { return null; }
        public android.window.ConfigurationChangeSetting[] newArray(int p0) { return null; }
    }

    public static class DensitySetting extends android.window.ConfigurationChangeSetting {
        public static final android.os.Parcelable.Creator<android.window.ConfigurationChangeSetting.DensitySetting> CREATOR = null;
        protected final int mDensity = 0;
        protected final int mDisplayId = 0;
        public DensitySetting(int p0, int p1) { super(0); }
        protected DensitySetting(android.os.Parcel p0) { super(0); }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static class FontScaleSetting extends android.window.ConfigurationChangeSetting {
        public static final android.os.Parcelable.Creator<android.window.ConfigurationChangeSetting.FontScaleSetting> CREATOR = null;
        protected final float mFontScaleFactor = 0.0f;
        public FontScaleSetting(float p0) { super(0); }
        protected FontScaleSetting(android.os.Parcel p0) { super(0); }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SettingType {
    }
}

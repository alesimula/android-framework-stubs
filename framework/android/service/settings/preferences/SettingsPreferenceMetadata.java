package android.service.settings.preferences;

public final class SettingsPreferenceMetadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.SettingsPreferenceMetadata> CREATOR = null;
    public static final int DEEPLINK_ONLY = 2;
    public static final int EXPECT_POST_CONFIRMATION = 1;
    public static final int NO_DIRECT_ACCESS = 3;
    public static final int NO_SENSITIVITY = 0;
    private final boolean mAvailable = false;
    private final java.util.List<java.lang.String> mBreadcrumbs = null;
    private final boolean mEnabled = false;
    private final android.os.Bundle mExtras = null;
    private final java.lang.String mKey = null;
    private final android.content.Intent mLaunchIntent = null;
    private final java.util.List<java.lang.String> mReadPermissions = null;
    private final boolean mRestricted = false;
    private final java.lang.String mScreenKey = null;
    private final int mSensitivity = 0;
    private final java.lang.String mSummary = null;
    private final java.lang.String mTitle = null;
    private final boolean mWritable = false;
    private final java.util.List<java.lang.String> mWritePermissions = null;
    private SettingsPreferenceMetadata(android.os.Parcel p0) {}
    private SettingsPreferenceMetadata(android.service.settings.preferences.SettingsPreferenceMetadata.Builder p0) {}
    public int describeContents() { return 0; }
    public java.util.List<java.lang.String> getBreadcrumbs() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String getKey() { return null; }
    public android.content.Intent getLaunchIntent() { return null; }
    public java.util.List<java.lang.String> getReadPermissions() { return null; }
    public java.lang.String getScreenKey() { return null; }
    public java.lang.String getSummary() { return null; }
    public java.lang.String getTitle() { return null; }
    public java.util.List<java.lang.String> getWritePermissions() { return null; }
    public int getWriteSensitivity() { return 0; }
    public boolean isAvailable() { return false; }
    public boolean isEnabled() { return false; }
    public boolean isRestricted() { return false; }
    public boolean isWritable() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mAvailable;
        private java.util.List<java.lang.String> mBreadcrumbs;
        private boolean mEnabled;
        private android.os.Bundle mExtras;
        private final java.lang.String mKey = null;
        private android.content.Intent mLaunchIntent;
        private java.util.List<java.lang.String> mReadPermissions;
        private boolean mRestricted;
        private final java.lang.String mScreenKey = null;
        private int mSensitivity;
        private java.lang.String mSummary;
        private java.lang.String mTitle;
        private boolean mWritable;
        private java.util.List<java.lang.String> mWritePermissions;
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.service.settings.preferences.SettingsPreferenceMetadata build() { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setAvailable(boolean p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setBreadcrumbs(java.util.List<java.lang.String> p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setEnabled(boolean p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setLaunchIntent(android.content.Intent p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setReadPermissions(java.util.List<java.lang.String> p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setRestricted(boolean p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setSummary(java.lang.String p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setTitle(java.lang.String p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setWritable(boolean p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setWritePermissions(java.util.List<java.lang.String> p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceMetadata.Builder setWriteSensitivity(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WriteSensitivity {
    }
}

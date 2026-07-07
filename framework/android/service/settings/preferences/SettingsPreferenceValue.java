package android.service.settings.preferences;

public final class SettingsPreferenceValue implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.SettingsPreferenceValue> CREATOR = null;
    private static final int MAX_TYPE_VALUE = 4;
    public static final int TYPE_BOOLEAN = 0;
    public static final int TYPE_DOUBLE = 2;
    public static final int TYPE_INT = 4;
    public static final int TYPE_LONG = 1;
    public static final int TYPE_STRING = 3;
    private final int mType = 0;
    private final java.lang.Object mValue = null;
    private SettingsPreferenceValue(android.os.Parcel p0) {}
    private SettingsPreferenceValue(android.service.settings.preferences.SettingsPreferenceValue.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean getBooleanValue() { return false; }
    public double getDoubleValue() { return 0.0; }
    public int getIntValue() { return 0; }
    public long getLongValue() { return 0L; }
    public java.lang.String getStringValue() { return null; }
    public int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final int mType = 0;
        private java.lang.Object mValue;
        public Builder(int p0) {}
        private void checkType(int p0) {}
        public android.service.settings.preferences.SettingsPreferenceValue build() { return null; }
        public android.service.settings.preferences.SettingsPreferenceValue.Builder setBooleanValue(boolean p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceValue.Builder setDoubleValue(double p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceValue.Builder setIntValue(int p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceValue.Builder setLongValue(long p0) { return null; }
        public android.service.settings.preferences.SettingsPreferenceValue.Builder setStringValue(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Type {
    }
}

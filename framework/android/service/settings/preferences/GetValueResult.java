package android.service.settings.preferences;

public final class GetValueResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.GetValueResult> CREATOR = null;
    public static final int RESULT_DISALLOW = 4;
    public static final int RESULT_INTERNAL_ERROR = 6;
    public static final int RESULT_INVALID_REQUEST = 5;
    public static final int RESULT_OK = 0;
    public static final int RESULT_REQUIRE_APP_PERMISSION = 3;
    public static final int RESULT_UNAVAILABLE = 2;
    public static final int RESULT_UNSUPPORTED = 1;
    private final android.service.settings.preferences.SettingsPreferenceMetadata mMetadata = null;
    private final int mResultCode = 0;
    private final android.service.settings.preferences.SettingsPreferenceValue mValue = null;
    private GetValueResult(android.os.Parcel p0) {}
    private GetValueResult(android.service.settings.preferences.GetValueResult.Builder p0) {}
    public int describeContents() { return 0; }
    public android.service.settings.preferences.SettingsPreferenceMetadata getMetadata() { return null; }
    public int getResultCode() { return 0; }
    public android.service.settings.preferences.SettingsPreferenceValue getValue() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.service.settings.preferences.SettingsPreferenceMetadata mMetadata;
        private final int mResultCode = 0;
        private android.service.settings.preferences.SettingsPreferenceValue mValue;
        public Builder(int p0) {}
        public android.service.settings.preferences.GetValueResult build() { return null; }
        public android.service.settings.preferences.GetValueResult.Builder setMetadata(android.service.settings.preferences.SettingsPreferenceMetadata p0) { return null; }
        public android.service.settings.preferences.GetValueResult.Builder setValue(android.service.settings.preferences.SettingsPreferenceValue p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResultCode {
    }
}

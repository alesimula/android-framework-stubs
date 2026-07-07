package android.service.settings.preferences;

public final class SetValueRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.SetValueRequest> CREATOR = null;
    private final java.lang.String mPreferenceKey = null;
    private final android.service.settings.preferences.SettingsPreferenceValue mPreferenceValue = null;
    private final java.lang.String mScreenKey = null;
    private SetValueRequest(android.os.Parcel p0) {}
    private SetValueRequest(android.service.settings.preferences.SetValueRequest.Builder p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getPreferenceKey() { return null; }
    public android.service.settings.preferences.SettingsPreferenceValue getPreferenceValue() { return null; }
    public java.lang.String getScreenKey() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.lang.String mPreferenceKey = null;
        private final android.service.settings.preferences.SettingsPreferenceValue mPreferenceValue = null;
        private final java.lang.String mScreenKey = null;
        public Builder(java.lang.String p0, java.lang.String p1, android.service.settings.preferences.SettingsPreferenceValue p2) {}
        public android.service.settings.preferences.SetValueRequest build() { return null; }
    }
}

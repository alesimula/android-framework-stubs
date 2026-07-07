package android.service.settings.preferences;

public final class GetValueRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.settings.preferences.GetValueRequest> CREATOR = null;
    private final java.lang.String mPreferenceKey = null;
    private final java.lang.String mScreenKey = null;
    private GetValueRequest(android.os.Parcel p0) {}
    private GetValueRequest(android.service.settings.preferences.GetValueRequest.Builder p0) {}
    public int describeContents() { return 0; }
    public java.lang.String getPreferenceKey() { return null; }
    public java.lang.String getScreenKey() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.lang.String mPreferenceKey = null;
        private final java.lang.String mScreenKey = null;
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.service.settings.preferences.GetValueRequest build() { return null; }
    }
}

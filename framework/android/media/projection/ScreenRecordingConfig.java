package android.media.projection;

public final class ScreenRecordingConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.projection.ScreenRecordingConfig> CREATOR = null;
    private final android.app.PendingIntent mCompletionIntent = null;
    private final android.net.Uri mCustomSaveLocationUri = null;
    private ScreenRecordingConfig(android.net.Uri p0, android.app.PendingIntent p1) {}
    private ScreenRecordingConfig(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.PendingIntent getCompletionIntent() { return null; }
    public android.net.Uri getCustomSaveLocationUri() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.app.PendingIntent mCompletionIntent;
        private android.net.Uri mCustomSaveLocationUri;
        public Builder() {}
        public android.media.projection.ScreenRecordingConfig build() { return null; }
        public android.media.projection.ScreenRecordingConfig.Builder setCompletionIntent(android.app.PendingIntent p0) { return null; }
        public android.media.projection.ScreenRecordingConfig.Builder setCustomSaveLocationUri(android.net.Uri p0) { return null; }
    }
}

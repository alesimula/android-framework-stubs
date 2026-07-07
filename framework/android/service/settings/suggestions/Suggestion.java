package android.service.settings.suggestions;

@android.annotation.SystemApi
public final class Suggestion implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.settings.suggestions.Suggestion> CREATOR = null;
    public static final int FLAG_HAS_BUTTON = 1;
    public static final int FLAG_ICON_TINTABLE = 2;
    private final int mFlags = 0;
    private final android.graphics.drawable.Icon mIcon = null;
    private final java.lang.String mId = null;
    private final android.app.PendingIntent mPendingIntent = null;
    private final java.lang.CharSequence mSummary = null;
    private final java.lang.CharSequence mTitle = null;
    private Suggestion(android.os.Parcel p0) {}
    private Suggestion(android.service.settings.suggestions.Suggestion.Builder p0) {}
    public int describeContents() { return 0; }
    public int getFlags() { return 0; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.String getId() { return null; }
    public android.app.PendingIntent getPendingIntent() { return null; }
    public java.lang.CharSequence getSummary() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private int mFlags;
        private android.graphics.drawable.Icon mIcon;
        private final java.lang.String mId = null;
        private android.app.PendingIntent mPendingIntent;
        private java.lang.CharSequence mSummary;
        private java.lang.CharSequence mTitle;
        public Builder(java.lang.String p0) {}
        public android.service.settings.suggestions.Suggestion build() { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setFlags(int p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setPendingIntent(android.app.PendingIntent p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setSummary(java.lang.CharSequence p0) { return null; }
        public android.service.settings.suggestions.Suggestion.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }
}

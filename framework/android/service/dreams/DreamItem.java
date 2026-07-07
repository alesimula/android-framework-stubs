package android.service.dreams;

public final class DreamItem implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.dreams.DreamItem> CREATOR = null;
    public final android.content.ComponentName componentName = null;
    public final java.lang.CharSequence description = null;
    public final android.graphics.drawable.Icon icon = null;
    public final android.graphics.drawable.Icon previewImage = null;
    public final android.content.ComponentName settingsActivity = null;
    public final java.lang.CharSequence title = null;
    private DreamItem(android.os.Parcel p0) {}
    private DreamItem(android.service.dreams.DreamItem.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.content.ComponentName mComponentName = null;
        private java.lang.CharSequence mDescription;
        private android.graphics.drawable.Icon mIcon;
        private android.graphics.drawable.Icon mPreviewImage;
        private android.content.ComponentName mSettingsActivity;
        private java.lang.CharSequence mTitle;
        public Builder(android.content.ComponentName p0) {}
        public android.service.dreams.DreamItem build() { return null; }
        public android.service.dreams.DreamItem.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.service.dreams.DreamItem.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.service.dreams.DreamItem.Builder setPreviewImage(android.graphics.drawable.Icon p0) { return null; }
        public android.service.dreams.DreamItem.Builder setSettingsActivity(android.content.ComponentName p0) { return null; }
        public android.service.dreams.DreamItem.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }
}

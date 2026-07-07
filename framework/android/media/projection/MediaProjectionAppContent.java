package android.media.projection;

public final class MediaProjectionAppContent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.media.projection.MediaProjectionAppContent> CREATOR = null;
    private android.graphics.drawable.Icon mIcon;
    private final int mId = 0;
    private android.graphics.Bitmap mThumbnail;
    private final java.lang.CharSequence mTitle = null;
    private MediaProjectionAppContent(android.media.projection.MediaProjectionAppContent.Builder p0) {}
    private MediaProjectionAppContent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public int getId() { return 0; }
    public android.graphics.Bitmap getThumbnail() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public void optimizeResources(android.util.Size p0, android.util.Size p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.graphics.drawable.Icon mIcon;
        private final int mId = 0;
        private android.graphics.Bitmap mThumbnail;
        private java.lang.CharSequence mTitle;
        public Builder(int p0) {}
        public android.media.projection.MediaProjectionAppContent build() { return null; }
        public android.media.projection.MediaProjectionAppContent.Builder setIcon(android.graphics.drawable.Icon p0) { return null; }
        public android.media.projection.MediaProjectionAppContent.Builder setThumbnail(android.graphics.Bitmap p0) { return null; }
        public android.media.projection.MediaProjectionAppContent.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }
}

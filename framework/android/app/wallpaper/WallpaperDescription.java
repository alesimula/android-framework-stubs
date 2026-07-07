package android.app.wallpaper;

public final class WallpaperDescription implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.wallpaper.WallpaperDescription> CREATOR = null;
    private static final java.lang.String TAG = "WallpaperDescription";
    private static final java.lang.String XML_TAG_CONTENT = "content";
    private static final java.lang.String XML_TAG_DESCRIPTION = "description";
    private final android.content.ComponentName mComponent = null;
    private final android.os.PersistableBundle mContent = null;
    private final java.lang.CharSequence mContextDescription = null;
    private final android.net.Uri mContextUri = null;
    private final android.util.SparseArray<android.graphics.Rect> mCropHints = null;
    private final java.util.List<java.lang.CharSequence> mDescription = null;
    private final java.lang.String mId = null;
    private final java.lang.String mOptionsName = null;
    private final float mSampleSize = 0.0f;
    private final android.net.Uri mThumbnail = null;
    private final java.lang.CharSequence mTitle = null;
    private WallpaperDescription(android.content.ComponentName p0, java.lang.String p1, android.net.Uri p2, java.lang.CharSequence p3, java.util.List<java.lang.CharSequence> p4, android.net.Uri p5, java.lang.CharSequence p6, android.os.PersistableBundle p7, android.util.SparseArray<android.graphics.Rect> p8, java.lang.String p9, float p10) {}
    WallpaperDescription(android.os.Parcel p0) {}
    private static java.lang.CharSequence fromHtml(java.lang.String p0) { return null; }
    private static java.lang.CharSequence removeTrailingWhitespace(java.lang.CharSequence p0) { return null; }
    public static android.app.wallpaper.WallpaperDescription restoreFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    private static java.util.List<android.util.Pair<java.lang.Integer, java.lang.String>> screenDimensionPairs() { return null; }
    private static java.lang.String toHtml(java.lang.CharSequence p0) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.ComponentName getComponent() { return null; }
    public android.os.PersistableBundle getContent() { return null; }
    public java.lang.CharSequence getContextDescription() { return null; }
    public android.net.Uri getContextUri() { return null; }
    @android.annotation.SystemApi
    public android.util.SparseArray<android.graphics.Rect> getCropHints() { return null; }
    public java.util.List<java.lang.CharSequence> getDescription() { return null; }
    public java.lang.String getId() { return null; }
    public java.lang.String getOptionsName() { return null; }
    public float getSampleSize() { return 0.0f; }
    public android.net.Uri getThumbnail() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public int hashCode() { return 0; }
    public void saveToXml(com.android.modules.utils.TypedXmlSerializer p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {}
    public android.app.wallpaper.WallpaperDescription.Builder toBuilder() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.content.ComponentName mComponent;
        private android.os.PersistableBundle mContent;
        private java.lang.CharSequence mContextDescription;
        private android.net.Uri mContextUri;
        private android.util.SparseArray<android.graphics.Rect> mCropHints;
        private java.util.List<java.lang.CharSequence> mDescription;
        private java.lang.String mId;
        private java.lang.String mOptionsName;
        private float mSampleSize;
        private android.net.Uri mThumbnail;
        private java.lang.CharSequence mTitle;
        public Builder() {}
        public android.app.wallpaper.WallpaperDescription build() { return null; }
        @android.annotation.SystemApi
        public android.app.wallpaper.WallpaperDescription.Builder setComponent(android.content.ComponentName p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setContent(android.os.PersistableBundle p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setContextDescription(java.lang.CharSequence p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setContextUri(android.net.Uri p0) { return null; }
        @android.annotation.SystemApi
        public android.app.wallpaper.WallpaperDescription.Builder setCropHints(android.util.SparseArray<android.graphics.Rect> p0) { return null; }
        @android.annotation.SystemApi
        public android.app.wallpaper.WallpaperDescription.Builder setCropHints(java.util.Map<android.graphics.Point, android.graphics.Rect> p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setDescription(java.util.List<java.lang.CharSequence> p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setId(java.lang.String p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setOptionsName(java.lang.String p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setSampleSize(float p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setThumbnail(android.net.Uri p0) { return null; }
        public android.app.wallpaper.WallpaperDescription.Builder setTitle(java.lang.CharSequence p0) { return null; }
    }
}

package android.app.wallpaper;

public final class WallpaperInstance implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.wallpaper.WallpaperInstance> CREATOR = null;
    public static final java.lang.String DEFAULT_ID = "default_id";
    private final android.app.wallpaper.WallpaperDescription mDescription = null;
    private final java.lang.String mIdOverride = null;
    private final android.app.WallpaperInfo mInfo = null;
    public WallpaperInstance(android.app.WallpaperInfo p0, android.app.wallpaper.WallpaperDescription p1) {}
    public WallpaperInstance(android.app.WallpaperInfo p0, android.app.wallpaper.WallpaperDescription p1, java.lang.String p2) {}
    WallpaperInstance(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.wallpaper.WallpaperDescription getDescription() { return null; }
    public java.lang.String getId() { return null; }
    public android.app.WallpaperInfo getInfo() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

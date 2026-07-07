package android.content.theming;

public final class ThemeSettings implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.theming.ThemeSettings> CREATOR = null;
    private final java.time.Instant mAppliedTimestamp = null;
    private final boolean mIsWallpaperSeed = false;
    private final java.util.List<android.graphics.Color> mSeedColors = null;
    private final int mThemeStyle = 0;
    private ThemeSettings(android.os.Parcel p0) {}
    ThemeSettings(java.time.Instant p0, int p1, boolean p2, java.util.List<android.graphics.Color> p3) {}
    public static android.content.theming.ThemeSettingsBuilder.StyleSelector builder() { return null; }
    public static android.content.theming.ThemeSettings createSettingsForService(java.time.Instant p0, int p1, boolean p2, java.util.List<android.graphics.Color> p3) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isWallpaperSeed() { return false; }
    public java.util.List<android.graphics.Color> seedColors() { return null; }
    public int themeStyle() { return 0; }
    public java.time.Instant timeStamp() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

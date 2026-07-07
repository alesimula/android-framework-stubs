package android.app;

public final class WallpaperColors implements android.os.Parcelable {
    private static final float BRIGHT_IMAGE_MEAN_LUMINANCE = Float.valueOf(0.0f);
    public static final android.os.Parcelable.Creator<android.app.WallpaperColors> CREATOR = null;
    private static final float DARK_PIXEL_CONTRAST = 5.5f;
    private static final float DARK_THEME_MEAN_LUMINANCE = 0.30000001192092896f;
    private static final boolean DEBUG_DARK_PIXELS = false;
    public static final int HINT_FROM_BITMAP = 4;
    public static final int HINT_SUPPORTS_DARK_TEXT = 1;
    public static final int HINT_SUPPORTS_DARK_THEME = 2;
    private static final int MAX_BITMAP_SIZE = 112;
    private static final float MAX_DARK_AREA = Float.valueOf(0.0f);
    private static final int MAX_WALLPAPER_EXTRACTION_AREA = 12544;
    private final java.util.Map<java.lang.Integer, java.lang.Integer> mAllColors = null;
    private int mColorHints;
    private final java.util.List<android.graphics.Color> mMainColors = null;
    public WallpaperColors(android.graphics.Color p0, android.graphics.Color p1, android.graphics.Color p2) {}
    public WallpaperColors(android.graphics.Color p0, android.graphics.Color p1, android.graphics.Color p2, int p3) {}
    public WallpaperColors(android.os.Parcel p0) {}
    public WallpaperColors(java.util.Map<java.lang.Integer, java.lang.Integer> p0, int p1) {}
    private static int calculateDarkHints(android.graphics.Bitmap p0, float p1) { return 0; }
    private static android.util.Size calculateOptimalSize(int p0, int p1) { return null; }
    private static java.util.Map<java.lang.Integer, java.lang.Double> colorToHueProportion(java.util.Set<java.lang.Integer> p0, java.util.Map<java.lang.Integer, com.android.internal.graphics.cam.Cam> p1, double[] p2) { return null; }
    public static android.app.WallpaperColors fromBitmap(android.graphics.Bitmap p0) { return null; }
    public static android.app.WallpaperColors fromBitmap(android.graphics.Bitmap p0, float p1) { return null; }
    public static android.app.WallpaperColors fromDrawable(android.graphics.drawable.Drawable p0) { return null; }
    private static double hueDiff(com.android.internal.graphics.cam.Cam p0, com.android.internal.graphics.cam.Cam p1) { return 0.0; }
    private static double[] hueProportions(java.util.Map<java.lang.Integer, com.android.internal.graphics.cam.Cam> p0, java.util.Map<java.lang.Integer, java.lang.Integer> p1) { return null; }
    private static double score(com.android.internal.graphics.cam.Cam p0, double p1) { return 0.0; }
    private static int wrapDegrees(int p0) { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.util.Map<java.lang.Integer, java.lang.Integer> getAllColors() { return null; }
    public int getColorHints() { return 0; }
    public java.util.List<android.graphics.Color> getMainColors() { return null; }
    public android.graphics.Color getPrimaryColor() { return null; }
    public android.graphics.Color getSecondaryColor() { return null; }
    public android.graphics.Color getTertiaryColor() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ColorsHints {
    }
}

package android.service.wallpaper;

public class EngineWindowPage {
    private java.util.Set<android.graphics.RectF> mCallbackAreas;
    private volatile long mLastUpdateTime;
    private java.util.Map<android.graphics.RectF, android.app.WallpaperColors> mRectFColors;
    private android.graphics.Bitmap mScreenShot;
    public EngineWindowPage() {}
    public void addArea(android.graphics.RectF p0) {}
    public void addWallpaperColors(android.graphics.RectF p0, android.app.WallpaperColors p1) {}
    public java.util.Set<android.graphics.RectF> getAreas() { return null; }
    public android.graphics.Bitmap getBitmap() { return null; }
    public android.app.WallpaperColors getColors(android.graphics.RectF p0) { return null; }
    public long getLastUpdateTime() { return 0L; }
    public void removeArea(android.graphics.RectF p0) {}
    public void removeColor(android.graphics.RectF p0) {}
    public void setBitmap(android.graphics.Bitmap p0) {}
    public void setLastUpdateTime(long p0) {}
}

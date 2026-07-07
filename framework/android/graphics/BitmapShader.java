package android.graphics;

public class BitmapShader extends android.graphics.Shader {
    public static final int FILTER_MODE_DEFAULT = 0;
    public static final int FILTER_MODE_LINEAR = 2;
    public static final int FILTER_MODE_NEAREST = 1;
    android.graphics.Bitmap mBitmap;
    private boolean mFilterFromPaint;
    private int mFilterMode;
    private boolean mIsDirectSampled;
    private int mMaxAniso;
    private android.graphics.Gainmap mOverrideGainmap;
    private boolean mRequestDirectSampling;
    private int mTileX;
    private int mTileY;
    private BitmapShader(android.graphics.Bitmap p0, int p1, int p2) { super(); }
    public BitmapShader(android.graphics.Bitmap p0, android.graphics.Shader.TileMode p1, android.graphics.Shader.TileMode p2) { super(); }
    private static native long nativeCreate(long p0, long p1, int p2, int p3, int p4, boolean p5, boolean p6, long p7);
    protected long createNativeInstance(long p0, boolean p1) { return 0L; }
    public int getFilterMode() { return 0; }
    public int getMaxAnisotropy() { return 0; }
    long getNativeInstanceWithDirectSampling() { return 0L; }
    public void setFilterMode(int p0) {}
    public void setMaxAnisotropy(int p0) {}
    public void setOverrideGainmap(android.graphics.Gainmap p0) {}
    protected boolean shouldDiscardNativeInstance(boolean p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FilterMode {
    }
}

package android.graphics.drawable;

public class BitmapDrawable extends android.graphics.drawable.Drawable {
    private static final int DEFAULT_PAINT_FLAGS = 6;
    private static final java.lang.String TAG = "BitmapDrawable";
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_DISABLED = -1;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;
    private static final int TILE_MODE_UNDEFINED = -2;
    private int mBitmapHeight;
    private android.graphics.drawable.BitmapDrawable.BitmapState mBitmapState;
    private int mBitmapWidth;
    private android.graphics.BlendModeColorFilter mBlendModeFilter;
    private final android.graphics.Rect mDstRect = null;
    private boolean mDstRectAndInsetsDirty;
    private android.graphics.Matrix mMirrorMatrix;
    private boolean mMutated;
    private android.graphics.Insets mOpticalInsets;
    private int mTargetDensity;
    @java.lang.Deprecated
    public BitmapDrawable() { super(); }
    @java.lang.Deprecated
    public BitmapDrawable(android.content.res.Resources p0) { super(); }
    public BitmapDrawable(android.content.res.Resources p0, android.graphics.Bitmap p1) { super(); }
    public BitmapDrawable(android.content.res.Resources p0, java.io.InputStream p1) { super(); }
    public BitmapDrawable(android.content.res.Resources p0, java.lang.String p1) { super(); }
    @java.lang.Deprecated
    public BitmapDrawable(android.graphics.Bitmap p0) { super(); }
    private BitmapDrawable(android.graphics.drawable.BitmapDrawable.BitmapState p0, android.content.res.Resources p1) { super(); }
    @java.lang.Deprecated
    public BitmapDrawable(java.io.InputStream p0) { super(); }
    @java.lang.Deprecated
    public BitmapDrawable(java.lang.String p0) { super(); }
    private void computeBitmapSize() {}
    private android.graphics.Matrix getOrCreateMirrorMatrix() { return null; }
    private android.content.res.ColorStateList getTint() { return null; }
    private android.graphics.PorterDuff.Mode getTintMode() { return null; }
    private void init(android.graphics.drawable.BitmapDrawable.BitmapState p0, android.content.res.Resources p1) {}
    private boolean needMirroring() { return false; }
    private static android.graphics.Shader.TileMode parseTileMode(int p0) { return null; }
    private void updateDstRectAndInsetsIfDirty() {}
    private void updateLocalState(android.content.res.Resources p0) {}
    private void updateShaderMatrix(android.graphics.Bitmap p0, android.graphics.Paint p1, android.graphics.Shader p2, boolean p3) {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0, int p1) throws org.xmlpull.v1.XmlPullParserException {}
    private void verifyRequiredAttributes(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public boolean canApplyTheme() { return false; }
    public void clearMutated() {}
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public final android.graphics.Bitmap getBitmap() { return null; }
    public int getChangingConfigurations() { return 0; }
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public int getGravity() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public int getOpacity() { return 0; }
    public android.graphics.Insets getOpticalInsets() { return null; }
    public void getOutline(android.graphics.Outline p0) {}
    public final android.graphics.Paint getPaint() { return null; }
    public android.graphics.Shader.TileMode getTileModeX() { return null; }
    public android.graphics.Shader.TileMode getTileModeY() { return null; }
    public boolean hasAntiAlias() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    public boolean hasMipMap() { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public final boolean isAutoMirrored() { return false; }
    public boolean isFilterBitmap() { return false; }
    public boolean isStateful() { return false; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected boolean onStateChange(int[] p0) { return false; }
    public void setAlpha(int p0) {}
    public void setAntiAlias(boolean p0) {}
    public void setAutoMirrored(boolean p0) {}
    public void setBitmap(android.graphics.Bitmap p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setDither(boolean p0) {}
    public void setFilterBitmap(boolean p0) {}
    public void setGravity(int p0) {}
    public void setMipMap(boolean p0) {}
    public void setTargetDensity(int p0) {}
    public void setTargetDensity(android.graphics.Canvas p0) {}
    public void setTargetDensity(android.util.DisplayMetrics p0) {}
    public void setTileModeX(android.graphics.Shader.TileMode p0) {}
    public void setTileModeXY(android.graphics.Shader.TileMode p0, android.graphics.Shader.TileMode p1) {}
    public final void setTileModeY(android.graphics.Shader.TileMode p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setXfermode(android.graphics.Xfermode p0) {}

    static final class BitmapState extends android.graphics.drawable.Drawable.ConstantState {
        boolean mAutoMirrored;
        float mBaseAlpha;
        android.graphics.Bitmap mBitmap;
        android.graphics.BlendMode mBlendMode;
        int mChangingConfigurations;
        int mGravity;
        final android.graphics.Paint mPaint = null;
        boolean mRebuildShader;
        int mSrcDensityOverride;
        int mTargetDensity;
        int[] mThemeAttrs;
        android.graphics.Shader.TileMode mTileModeX;
        android.graphics.Shader.TileMode mTileModeY;
        android.content.res.ColorStateList mTint;
        BitmapState(android.graphics.Bitmap p0) { super(); }
        BitmapState(android.graphics.drawable.BitmapDrawable.BitmapState p0) { super(); }
        public boolean canApplyTheme() { return false; }
        public int getChangingConfigurations() { return 0; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}

package android.view;

public class TextureView extends android.view.View {
    private static final java.lang.String LOG_TAG = "TextureView";
    private android.graphics.Canvas mCanvas;
    private boolean mHadSurface;
    private long mLastFrameTimeMillis;
    private android.graphics.TextureLayer mLayer;
    private android.view.TextureView.SurfaceTextureListener mListener;
    private final java.lang.Object[] mLock = null;
    private final android.graphics.Matrix mMatrix = null;
    private boolean mMatrixChanged;
    private long mMinusTwoFrameIntervalMillis;
    private long mNativeWindow;
    private final java.lang.Object[] mNativeWindowLock = null;
    private boolean mOpaque;
    private int mSaveCount;
    private android.graphics.SurfaceTexture mSurface;
    private boolean mUpdateLayer;
    private final android.graphics.SurfaceTexture.OnFrameAvailableListener mUpdateListener = null;
    private boolean mUpdateSurface;
    public TextureView(android.content.Context p0) { super((android.content.Context)null); }
    public TextureView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextureView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextureView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void applyTransformMatrix() {}
    private void applyUpdate() {}
    private void destroyHardwareLayer() {}
    private native void nCreateNativeWindow(android.graphics.SurfaceTexture p0);
    private native void nDestroyNativeWindow();
    private static native boolean nLockCanvas(long p0, android.graphics.Canvas p1, android.graphics.Rect p2);
    private static native void nUnlockCanvasAndPost(long p0, android.graphics.Canvas p1);
    private void releaseSurfaceTexture() {}
    private void updateLayer() {}
    private void updateLayerAndInvalidate() {}
    public void buildLayer() {}
    protected int calculateFrameRateCategory() { return 0; }
    protected void destroyHardwareResources() {}
    public final void draw(android.graphics.Canvas p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public android.graphics.Bitmap getBitmap() { return null; }
    public android.graphics.Bitmap getBitmap(int p0, int p1) { return null; }
    public android.graphics.Bitmap getBitmap(android.graphics.Bitmap p0) { return null; }
    public int getLayerType() { return 0; }
    public android.graphics.SurfaceTexture getSurfaceTexture() { return null; }
    public android.view.TextureView.SurfaceTextureListener getSurfaceTextureListener() { return null; }
    android.graphics.TextureLayer getTextureLayer() { return null; }
    public android.graphics.Matrix getTransform(android.graphics.Matrix p0) { return null; }
    public boolean isAvailable() { return false; }
    public boolean isOpaque() { return false; }
    public android.graphics.Canvas lockCanvas() { return null; }
    public android.graphics.Canvas lockCanvas(android.graphics.Rect p0) { return null; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindowInternal() {}
    protected final void onDraw(android.graphics.Canvas p0) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setForeground(android.graphics.drawable.Drawable p0) {}
    public void setLayerPaint(android.graphics.Paint p0) {}
    public void setLayerType(int p0, android.graphics.Paint p1) {}
    public void setOpaque(boolean p0) {}
    public void setSurfaceTexture(android.graphics.SurfaceTexture p0) {}
    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener p0) {}
    public void setTransform(android.graphics.Matrix p0) {}
    public void unlockCanvasAndPost(android.graphics.Canvas p0) {}
    protected void votePreferredFrameRate() {}

    public static interface SurfaceTextureListener {
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture p0, int p1, int p2);
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture p0);
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture p0, int p1, int p2);
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture p0);
    }
}

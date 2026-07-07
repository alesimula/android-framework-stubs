package com.android.internal.widget.remotecompose.player.platform;

public class AndroidPaintContext extends com.android.internal.widget.remotecompose.core.PaintContext {
    private static final java.lang.String SYSTEM_FONTS_PATH = "/system/fonts/";
    java.util.HashMap<android.graphics.Bitmap, android.graphics.Canvas> mCCache;
    private android.graphics.Paint.FontMetrics mCachedFontMetrics;
    com.android.internal.widget.remotecompose.core.operations.paint.PaintChanges mCachedPaintChanges;
    android.graphics.Canvas mCanvas;
    private final java.util.LinkedHashMap<java.lang.String, android.graphics.fonts.Font.Builder> mFontBuilderCache = null;
    android.graphics.Canvas mMainCanvas;
    android.graphics.RenderNode mNode;
    android.graphics.Paint mPaint;
    java.util.List<android.graphics.Paint> mPaintList;
    private final java.util.LinkedHashMap<java.lang.String, java.lang.String> mPathCache = null;
    android.graphics.Canvas mPreviousCanvas;
    android.graphics.Rect mTmpRect;
    private final java.util.LinkedHashMap<java.lang.String, android.graphics.Typeface> mTypefaceCache = null;
    public AndroidPaintContext(com.android.internal.widget.remotecompose.core.RemoteContext p0, android.graphics.Canvas p1) { super(null); }
    private android.graphics.Path getPath(int p0, float p1, float p2) { return null; }
    private android.graphics.Path getPath(int p0, int p1, float p2, float p3, float p4) { return null; }
    private android.graphics.Path getPath(float[] p0, float p1, float p2) { return null; }
    private float[] getPathArray(int p0, int p1, float p2) { return null; }
    private com.android.internal.widget.remotecompose.core.operations.ShaderData getShaderData(int p0) { return null; }
    private static android.graphics.BlendMode remoteToAndroidBlendMode(int p0) { return null; }
    private static android.graphics.PorterDuff.Mode remoteToAndroidPorterDuffMode(int p0) { return null; }
    public void applyPaint(com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p0) {}
    public void clipPath(int p0, int p1) {}
    public void clipRect(float p0, float p1, float p2, float p3) {}
    public void combinePath(int p0, int p1, int p2, byte p3) {}
    public void drawArc(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void drawBitmap(int p0, float p1, float p2, float p3, float p4) {}
    public void drawBitmap(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    public void drawCircle(float p0, float p1, float p2) {}
    public void drawComplexText(com.android.internal.widget.remotecompose.core.RcPlatformServices.ComputedTextLayout p0) {}
    public void drawLine(float p0, float p1, float p2, float p3) {}
    public void drawOval(float p0, float p1, float p2, float p3) {}
    public void drawPath(int p0, float p1, float p2) {}
    public void drawRect(float p0, float p1, float p2, float p3) {}
    public void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void drawSector(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void drawTextOnPath(int p0, int p1, float p2, float p3) {}
    public void drawTextRun(int p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7) {}
    public void drawToBitmap(int p0, int p1, int p2) {}
    public void drawTweenPath(int p0, int p1, float p2, float p3, float p4) {}
    public void endGraphicsLayer() {}
    public android.graphics.Canvas getCanvas() { return null; }
    public java.lang.String getText(int p0) { return null; }
    public void getTextBounds(int p0, int p1, int p2, int p3, float[] p4) {}
    public boolean getTightBoundingBox(android.text.StaticLayout p0, android.graphics.Rect p1) { return false; }
    public boolean isLineHyphenated(android.text.StaticLayout p0, java.lang.CharSequence p1, int p2) { return false; }
    public com.android.internal.widget.remotecompose.core.RcPlatformServices.ComputedTextLayout layoutComplexText(int p0, int p1, int p2, int p3, int p4, int p5, float p6, float p7, float p8, float p9, float p10, int p11, int p12, int p13, boolean p14, boolean p15, int p16) { return null; }
    public void matrixFromPath(int p0, float p1, float p2, int p3) {}
    public void matrixRestore() {}
    public void matrixRotate(float p0, float p1, float p2) {}
    public void matrixSave() {}
    public void matrixScale(float p0, float p1, float p2, float p3) {}
    public void matrixSkew(float p0, float p1) {}
    public void matrixTranslate(float p0, float p1) {}
    public void replacePaint(com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p0) {}
    public void reset() {}
    public void restore() {}
    public void restorePaint() {}
    public void roundedClipRect(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void save() {}
    public void saveLayer(float p0, float p1, float p2, float p3) {}
    public void savePaint() {}
    public void scale(float p0, float p1) {}
    public void setCanvas(android.graphics.Canvas p0) {}
    public void setGraphicsLayer(java.util.HashMap<java.lang.Integer, java.lang.Object> p0) {}
    public void startGraphicsLayer(int p0, int p1) {}
    public void translate(float p0, float p1) {}
    public void tweenPath(int p0, int p1, int p2, float p3) {}
}

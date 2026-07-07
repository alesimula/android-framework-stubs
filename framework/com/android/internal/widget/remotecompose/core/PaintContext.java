package com.android.internal.widget.remotecompose.core;

public abstract class PaintContext {
    public static final int TEXT_COMPLEX = 8;
    public static final int TEXT_MEASURE_AUTOSIZE = 16;
    public static final int TEXT_MEASURE_FONT_HEIGHT = 2;
    public static final int TEXT_MEASURE_MONOSPACE_WIDTH = 1;
    public static final int TEXT_MEASURE_SPACES = 4;
    protected com.android.internal.widget.remotecompose.core.RemoteContext mContext;
    private int mMeasureVersion;
    private boolean mNeedsRepaint;
    public PaintContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public abstract void applyPaint(com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p0);
    public void clearNeedsRepaint() {}
    public abstract void clipPath(int p0, int p1);
    public abstract void clipRect(float p0, float p1, float p2, float p3);
    public abstract void combinePath(int p0, int p1, int p2, byte p3);
    public boolean doesNeedsRepaint() { return false; }
    public abstract void drawArc(float p0, float p1, float p2, float p3, float p4, float p5);
    public abstract void drawBitmap(int p0, float p1, float p2, float p3, float p4);
    public abstract void drawBitmap(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9);
    public abstract void drawCircle(float p0, float p1, float p2);
    public abstract void drawComplexText(com.android.internal.widget.remotecompose.core.RcPlatformServices.ComputedTextLayout p0);
    public abstract void drawLine(float p0, float p1, float p2, float p3);
    public abstract void drawOval(float p0, float p1, float p2, float p3);
    public abstract void drawPath(int p0, float p1, float p2);
    public abstract void drawRect(float p0, float p1, float p2, float p3);
    public abstract void drawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5);
    public abstract void drawSector(float p0, float p1, float p2, float p3, float p4, float p5);
    public abstract void drawTextOnPath(int p0, int p1, float p2, float p3);
    public abstract void drawTextRun(int p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7);
    public abstract void drawToBitmap(int p0, int p1, int p2);
    public abstract void drawTweenPath(int p0, int p1, float p2, float p3, float p4);
    public abstract void endGraphicsLayer();
    public com.android.internal.widget.remotecompose.core.RemoteClock getClock() { return null; }
    public com.android.internal.widget.remotecompose.core.RemoteContext getContext() { return null; }
    public float getDensity() { return 0.0f; }
    public int getDensityBehavior() { return 0; }
    public int getMeasureVersion() { return 0; }
    public abstract java.lang.String getText(int p0);
    public abstract void getTextBounds(int p0, int p1, int p2, int p3, float[] p4);
    public boolean isAnimationEnabled() { return false; }
    public boolean isDebug() { return false; }
    public boolean isVisualDebug() { return false; }
    public abstract com.android.internal.widget.remotecompose.core.RcPlatformServices.ComputedTextLayout layoutComplexText(int p0, int p1, int p2, int p3, int p4, int p5, float p6, float p7, float p8, float p9, float p10, int p11, int p12, int p13, boolean p14, boolean p15, int p16);
    public void log(java.lang.String p0) {}
    public abstract void matrixFromPath(int p0, float p1, float p2, int p3);
    public abstract void matrixRestore();
    public abstract void matrixRotate(float p0, float p1, float p2);
    public abstract void matrixSave();
    public abstract void matrixScale(float p0, float p1, float p2, float p3);
    public abstract void matrixSkew(float p0, float p1);
    public abstract void matrixTranslate(float p0, float p1);
    public void needsRepaint() {}
    public abstract void replacePaint(com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p0);
    public abstract void reset();
    public void restore() {}
    public abstract void restorePaint();
    public abstract void roundedClipRect(float p0, float p1, float p2, float p3, float p4, float p5);
    public void save() {}
    public void saveLayer(float p0, float p1, float p2, float p3) {}
    public abstract void savePaint();
    public abstract void scale(float p0, float p1);
    public void setContext(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public abstract void setGraphicsLayer(java.util.HashMap<java.lang.Integer, java.lang.Object> p0);
    public void setMeasureVersion(int p0) {}
    public abstract void startGraphicsLayer(int p0, int p1);
    public boolean supportsVersion(int p0, int p1, int p2) { return false; }
    public abstract void translate(float p0, float p1);
    public abstract void tweenPath(int p0, int p1, int p2, float p3);
    public boolean useFeature(short p0) { return false; }
    public void wakeIn(float p0) {}
}

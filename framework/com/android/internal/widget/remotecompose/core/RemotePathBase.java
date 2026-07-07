package com.android.internal.widget.remotecompose.core;

public class RemotePathBase {
    public static final int CLOSE = 15;
    public static final float CLOSE_NAN = Float.valueOf(0.0f);
    public static final int CONIC = 13;
    public static final float CONIC_NAN = Float.valueOf(0.0f);
    public static final int CUBIC = 14;
    public static final float CUBIC_NAN = Float.valueOf(0.0f);
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    public static final int DONE = 16;
    public static final float DONE_NAN = Float.valueOf(0.0f);
    public static final int LINE = 11;
    public static final float LINE_NAN = Float.valueOf(0.0f);
    public static final int MOVE = 10;
    public static final float MOVE_NAN = Float.valueOf(0.0f);
    public static final int QUADRATIC = 12;
    public static final float QUADRATIC_NAN = Float.valueOf(0.0f);
    float mCx;
    float mCy;
    int mMaxSize;
    float[] mPath;
    int mSize;
    public RemotePathBase() {}
    public RemotePathBase(int p0) {}
    public RemotePathBase(java.lang.String p0) {}
    private void parsePathData(java.lang.String p0) {}
    private void resize(int p0) {}
    public void add(int p0) {}
    public void add(int p0, float p1, float p2) {}
    public void add(int p0, float p1, float p2, float p3, float p4) {}
    public void add(int p0, float p1, float p2, float p3, float p4, float p5) {}
    public void add(int p0, float p1, float p2, float p3, float p4, float p5, float p6) {}
    public void addArc(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6) {}
    public void addMove(int p0, float p1, float p2) {}
    public void arcTo(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6) {}
    public void close() {}
    public void conicTo(float p0, float p1, float p2, float p3, float p4) {}
    public float[] createFloatArray() { return null; }
    public void cubicTo(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public float getCurrentX() { return 0.0f; }
    public float getCurrentY() { return 0.0f; }
    public float[] getPath() { return null; }
    public int getSize() { return 0; }
    public void incReserve(int p0) {}
    public boolean isEmpty() { return false; }
    public void lineTo(float p0, float p1) {}
    public void moveTo(float p0, float p1) {}
    public void quadTo(float p0, float p1, float p2, float p3) {}
    public void rConicTo(float p0, float p1, float p2, float p3, float p4) {}
    public void rCubicTo(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void rLineTo(float p0, float p1) {}
    public void rMoveTo(float p0, float p1) {}
    public void rQuadTo(float p0, float p1, float p2, float p3) {}
    public void reset() {}
    public void rewind() {}
    public java.lang.String toString() { return null; }
}

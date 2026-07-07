package com.android.internal.widget.remotecompose.core.operations.utilities;

public class PathGenerator {
    public static final int LINEAR = 4;
    public static final int MONOTONIC = 2;
    public static final int SPLINE = 0;
    private final com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression mExpression = null;
    private com.android.internal.widget.remotecompose.core.operations.utilities.PathGenerator.Linear mLinear;
    private com.android.internal.widget.remotecompose.core.operations.utilities.PathGenerator.Monotonic mMonotonic;
    private com.android.internal.widget.remotecompose.core.operations.utilities.PathGenerator.Spline mSpline;
    float[] mXData;
    float[] mYData;
    public PathGenerator() {}
    public int getPath(float[] p0, float[] p1, float[] p2, float p3, float p4, int p5, int p6, boolean p7, com.android.internal.widget.remotecompose.core.operations.utilities.CollectionsAccess p8) { return 0; }
    public int getPath(float[] p0, float[] p1, float[] p2, int p3, boolean p4) { return 0; }
    public int getPolarPath(float[] p0, float[] p1, float[] p2, float p3, float p4, int p5, int p6, boolean p7, com.android.internal.widget.remotecompose.core.operations.utilities.CollectionsAccess p8) { return 0; }
    public int getReturnLength(int p0, boolean p1) { return 0; }

    private static class Linear {
        com.android.internal.widget.remotecompose.core.operations.utilities.PathGenerator.Path mPath;
        private Linear() {}
        public com.android.internal.widget.remotecompose.core.operations.utilities.PathGenerator.Path asPath(float[] p0, float[] p1, boolean p2) { return null; }
    }

    private static class Monotonic {
        float[] mDxSeg;
        float[] mDxTan;
        float[] mDySeg;
        float[] mDyTan;
        float[] mH;
        com.android.internal.widget.remotecompose.core.operations.utilities.PathGenerator.Path mPath;
        private Monotonic() {}
        private void monotoneTangents(float[] p0, float[] p1, float[] p2, boolean p3) {}
        public com.android.internal.widget.remotecompose.core.operations.utilities.PathGenerator.Path asPath(float[] p0, float[] p1, boolean p2) { return null; }
    }

    private static class Path {
        public static final int CLOSE = 15;
        public static final float CLOSE_NAN = Float.valueOf(0.0f);
        public static final int CUBIC = 14;
        public static final float CUBIC_NAN = Float.valueOf(0.0f);
        public static final int MOVE = 10;
        public static final float MOVE_NAN = Float.valueOf(0.0f);
        float mCx;
        float mCy;
        int mMaxSize;
        float[] mPath;
        int mSize;
        Path(int p0) {}
        public void closePath() {}
        public int copyPoints(float[] p0) { return 0; }
        public void cubicTo(float p0, float p1, float p2, float p3, float p4, float p5) {}
        public void moveTo(float p0, float p1) {}
        public void reset() {}
    }

    private static class Spline {
        float[] mDxSeg;
        float[] mDxTan;
        float[] mDySeg;
        float[] mDyTan;
        float[] mH;
        com.android.internal.widget.remotecompose.core.operations.utilities.PathGenerator.Path mPath;
        private Spline() {}
        private void smoothTangents(float[] p0, float[] p1, float[] p2, boolean p3) {}
        public com.android.internal.widget.remotecompose.core.operations.utilities.PathGenerator.Path asPath(float[] p0, float[] p1, boolean p2) { return null; }
    }
}

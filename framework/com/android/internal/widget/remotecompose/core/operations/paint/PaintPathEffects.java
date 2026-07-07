package com.android.internal.widget.remotecompose.core.operations.paint;

public abstract class PaintPathEffects {
    public static final int COMPOSE = 5;
    public static final int DASH = 1;
    public static final int DISCRETE_PATH = 2;
    public static final int PATH_DASH = 3;
    public static final int SUM = 4;
    protected int mDataLength;
    protected int mType;
    public PaintPathEffects() {}
    public static float[] compose(float[] p0, float[] p1) { return null; }
    public static float[] dash(float p0, float... p1) { return null; }
    public static float[] discrete(float p0, float p1) { return null; }
    public static float[] encode(com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects p0) { return null; }
    public static float[] fuze(int p0, float[] p1, float[] p2) { return null; }
    static int getIds(int[] p0, int p1, com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects.Register p2) { return 0; }
    public static com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects parse(float[] p0, int p1) { return null; }
    public static float[] pathDash(int p0, float p1, float p2, int p3) { return null; }
    private static void registerIfId(int[] p0, int p1, com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects.Register p2) {}
    public static float[] sum(float[] p0, float[] p1) { return null; }
    public int getType() { return 0; }
    abstract float[] toFloatArray();

    public static class Compose extends com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects {
        public com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects mInnerPE;
        public com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects mOuterPE;
        public Compose(com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects p0, com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects p1) { super(); }
        public static com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects decode(float[] p0, int p1) { return null; }
        public static int gitIds(int[] p0, int p1, com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects.Register p2) { return 0; }
        float[] toFloatArray() { return null; }
    }

    public static class Dash extends com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects {
        public float[] mIntervals;
        public float mPhase;
        public Dash(float p0, float... p1) { super(); }
        public static com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects decode(float[] p0, int p1) { return null; }
        static int gitIds(int[] p0, int p1, com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects.Register p2) { return 0; }
        float[] toFloatArray() { return null; }
    }

    public static class Discrete extends com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects {
        public float mDeviation;
        public float mSegmentLength;
        public Discrete(float p0, float p1) { super(); }
        public static com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects decode(float[] p0, int p1) { return null; }
        public static int gitIds(int[] p0, int p1, com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects.Register p2) { return 0; }
        float[] toFloatArray() { return null; }
    }

    public static class PathDash extends com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects {
        public float mAdvance;
        public float mPhase;
        public int mShapeId;
        public int mStyle;
        public PathDash(int p0, float p1, float p2, int p3) { super(); }
        public static com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects decode(float[] p0, int p1) { return null; }
        public static int gitIds(int[] p0, int p1, com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects.Register p2) { return 0; }
        float[] toFloatArray() { return null; }
    }

    public static interface Register {
        public void id(int p0);
    }

    public static class Sum extends com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects {
        public com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects mFirst;
        public com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects mSecond;
        public Sum(com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects p0, com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects p1) { super(); }
        public static com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects decode(float[] p0, int p1) { return null; }
        public static int gitIds(int[] p0, int p1, com.android.internal.widget.remotecompose.core.operations.paint.PaintPathEffects.Register p2) { return 0; }
        float[] toFloatArray() { return null; }
    }
}

package com.android.internal.widget.remotecompose.core.operations.utilities;

public class ImageScaling {
    private static final boolean DEBUG = false;
    public static final int SCALE_CROP = 5;
    public static final int SCALE_FILL_BOUNDS = 6;
    public static final int SCALE_FILL_HEIGHT = 3;
    public static final int SCALE_FILL_WIDTH = 2;
    public static final int SCALE_FIT = 4;
    public static final int SCALE_FIXED_SCALE = 7;
    public static final int SCALE_INSIDE = 1;
    public static final int SCALE_NONE = 0;
    private float mDstBottom;
    private float mDstLeft;
    private float mDstRight;
    private float mDstTop;
    public float mFinalDstBottom;
    public float mFinalDstLeft;
    public float mFinalDstRight;
    public float mFinalDstTop;
    private float mScaleFactor;
    private int mScaleType;
    private float mSrcBottom;
    private float mSrcLeft;
    private float mSrcRight;
    private float mSrcTop;
    public ImageScaling() {}
    public ImageScaling(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, int p8, float p9) {}
    private void adjustDrawToType() {}
    static java.lang.String str(float p0) { return null; }
    public static java.lang.String typeToString(int p0) { return null; }
    void print(java.lang.String p0, float p1, float p2, float p3, float p4) {}
    public void setup(float p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, int p8, float p9) {}
}

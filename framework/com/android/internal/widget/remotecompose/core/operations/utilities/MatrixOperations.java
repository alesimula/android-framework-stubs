package com.android.internal.widget.remotecompose.core.operations.utilities;

public class MatrixOperations {
    public static final float IDENTITY = Float.valueOf(0.0f);
    public static final int LAST_OP = 3276854;
    public static final float MUL = Float.valueOf(0.0f);
    static final int[] NO_OF_OPS = null;
    public static final int OFFSET = 3276800;
    private static final int OP_IDENTITY = 3276801;
    private static final int OP_MUL = 3276815;
    private static final int OP_PROJECTION = 3276818;
    private static final int OP_ROT_AXIS = 3276817;
    private static final int OP_ROT_PZ = 3276816;
    private static final int OP_ROT_X = 3276802;
    private static final int OP_ROT_Y = 3276803;
    private static final int OP_ROT_Z = 3276804;
    private static final int OP_SCALE2 = 3276813;
    private static final int OP_SCALE3 = 3276814;
    private static final int OP_SCALE_X = 3276810;
    private static final int OP_SCALE_Y = 3276811;
    private static final int OP_SCALE_Z = 3276812;
    private static final int OP_TRANSLATE2 = 3276808;
    private static final int OP_TRANSLATE3 = 3276809;
    private static final int OP_TRANSLATE_X = 3276805;
    private static final int OP_TRANSLATE_Y = 3276806;
    private static final int OP_TRANSLATE_Z = 3276807;
    public static final float PROJECTION = Float.valueOf(0.0f);
    public static final float ROT_AXIS = Float.valueOf(0.0f);
    public static final float ROT_PZ = Float.valueOf(0.0f);
    public static final float ROT_X = Float.valueOf(0.0f);
    public static final float ROT_Y = Float.valueOf(0.0f);
    public static final float ROT_Z = Float.valueOf(0.0f);
    public static final float SCALE2 = Float.valueOf(0.0f);
    public static final float SCALE3 = Float.valueOf(0.0f);
    public static final float SCALE_X = Float.valueOf(0.0f);
    public static final float SCALE_Y = Float.valueOf(0.0f);
    public static final float SCALE_Z = Float.valueOf(0.0f);
    public static final float TRANSLATE2 = Float.valueOf(0.0f);
    public static final float TRANSLATE3 = Float.valueOf(0.0f);
    public static final float TRANSLATE_X = Float.valueOf(0.0f);
    public static final float TRANSLATE_Y = Float.valueOf(0.0f);
    public static final float TRANSLATE_Z = Float.valueOf(0.0f);
    static com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.String> sNames;
    com.android.internal.widget.remotecompose.core.operations.utilities.Matrix[] mMatrices;
    int mMatrixIndex;
    float[] mStack;
    com.android.internal.widget.remotecompose.core.operations.utilities.Matrix mTmpMatrix;
    float[] mVar;
    public MatrixOperations() {}
    public static float asNan(int p0) { return 0.0f; }
    public static int fromNaN(float p0) { return 0; }
    public static int getMaxOpForLevel(int p0) { return 0; }
    static boolean infix(int p0) { return false; }
    public static boolean isOperator(float p0) { return false; }
    public static java.lang.String toMathName(float p0) { return null; }
    static java.lang.String toString(float[] p0, int p1) { return null; }
    public static java.lang.String toString(float[] p0, java.lang.String[] p1) { return null; }
    public com.android.internal.widget.remotecompose.core.operations.utilities.Matrix eval(float[] p0, float... p1) { return null; }
    void opEval(int p0, int p1) {}

    static interface Op {
        public int eval(int p0);
    }
}

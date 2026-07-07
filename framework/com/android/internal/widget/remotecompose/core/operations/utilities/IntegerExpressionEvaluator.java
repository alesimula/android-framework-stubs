package com.android.internal.widget.remotecompose.core.operations.utilities;

public class IntegerExpressionEvaluator {
    public static final int I_ABS = 65552;
    public static final int I_ADD = 65537;
    public static final int I_AND = 65546;
    public static final int I_CLAMP = 65557;
    public static final int I_COPY_SIGN = 65548;
    public static final int I_DECR = 65554;
    public static final int I_DIV = 65540;
    public static final int I_IFELSE = 65558;
    public static final int I_INCR = 65553;
    public static final int I_MAD = 65559;
    public static final int I_MAX = 65550;
    public static final int I_MIN = 65549;
    public static final int I_MOD = 65541;
    public static final int I_MUL = 65539;
    public static final int I_NEG = 65551;
    public static final int I_NOT = 65555;
    public static final int I_OR = 65545;
    public static final int I_SHL = 65542;
    public static final int I_SHR = 65543;
    public static final int I_SIGN = 65556;
    public static final int I_SUB = 65538;
    public static final int I_USHR = 65544;
    public static final int I_VAR1 = 65560;
    public static final int I_VAR2 = 65561;
    public static final int I_XOR = 65547;
    public static final float LAST_OP = 25.0f;
    static final int[] NO_OF_OPS = null;
    public static final int OFFSET = 65536;
    private static final int OP_ABS = 65552;
    private static final int OP_ADD = 65537;
    private static final int OP_AND = 65546;
    private static final int OP_CLAMP = 65557;
    private static final int OP_COPY_SIGN = 65548;
    private static final int OP_DECR = 65554;
    private static final int OP_DIV = 65540;
    private static final int OP_FIRST_VAR = 65560;
    private static final int OP_INCR = 65553;
    private static final int OP_MAD = 65559;
    private static final int OP_MAX = 65550;
    private static final int OP_MIN = 65549;
    private static final int OP_MOD = 65541;
    private static final int OP_MUL = 65539;
    private static final int OP_NEG = 65551;
    private static final int OP_NOT = 65555;
    private static final int OP_OR = 65545;
    private static final int OP_SECOND_VAR = 65561;
    private static final int OP_SHL = 65542;
    private static final int OP_SHR = 65543;
    private static final int OP_SIGN = 65556;
    private static final int OP_SUB = 65538;
    private static final int OP_TERNARY_CONDITIONAL = 65558;
    private static final int OP_THIRD_VAR = 65562;
    private static final int OP_USHR = 65544;
    private static final int OP_XOR = 65547;
    static com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.String> sNames;
    int[] mLocalStack;
    int[] mStack;
    int[] mVar;
    public IntegerExpressionEvaluator() {}
    static boolean infix(int p0) { return false; }
    public static boolean isOperation(int p0, int p1) { return false; }
    public static java.lang.String toMathName(int p0) { return null; }
    public static java.lang.String toString(int p0, int[] p1) { return null; }
    static java.lang.String toString(int p0, int[] p1, int p2) { return null; }
    public static java.lang.String toString(int p0, int[] p1, java.lang.String[] p2) { return null; }
    public static java.lang.String toStringInfix(int p0, int[] p1) { return null; }
    public int eval(int p0, int[] p1, int p2, int... p3) { return 0; }
    public int eval(int p0, int[] p1, int... p2) { return 0; }
    public int evalDB(int p0, int[] p1, int... p2) { return 0; }
    int opEval(int p0, int p1) { return 0; }

    static interface Op {
        public int eval(int p0);
    }
}

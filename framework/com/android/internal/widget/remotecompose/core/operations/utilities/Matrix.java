package com.android.internal.widget.remotecompose.core.operations.utilities;

public class Matrix {
    public static float[] sTempInVec;
    public static float[] sTempOutVec;
    public static final com.android.internal.widget.remotecompose.core.operations.utilities.Matrix sTmpMatrix1 = null;
    public static final com.android.internal.widget.remotecompose.core.operations.utilities.Matrix sTmpMatrix2 = null;
    int mDim0;
    int mDim1;
    float[] mMatrix;
    public Matrix() {}
    public Matrix(int p0, int p1) {}
    public static void copy(com.android.internal.widget.remotecompose.core.operations.utilities.Matrix p0, com.android.internal.widget.remotecompose.core.operations.utilities.Matrix p1) {}
    private int getIndex(int p0, int p1) { return 0; }
    public static void multiply(com.android.internal.widget.remotecompose.core.operations.utilities.Matrix p0, com.android.internal.widget.remotecompose.core.operations.utilities.Matrix p1, com.android.internal.widget.remotecompose.core.operations.utilities.Matrix p2) {}
    private static java.lang.String six(java.lang.String p0) { return null; }
    public void copyFrom(com.android.internal.widget.remotecompose.core.operations.utilities.Matrix p0) {}
    public void copyFrom(float[] p0) {}
    public void evalPerspective(float[] p0, float[] p1) {}
    public float get(int p0, int p1) { return 0.0f; }
    public void multiply(float[] p0, float[] p1) {}
    public void projection(float p0, float p1, float p2, float p3) {}
    public void putValues(float[] p0) {}
    public void rotateAroundAxis(float p0, float p1, float p2, float p3) {}
    public void rotateX(float p0) {}
    public void rotateY(float p0) {}
    public void rotateZ(float p0) {}
    public void rotateZ(float p0, float p1, float p2) {}
    public void set(int p0, int p1, float p2) {}
    public void setDimensions(int p0, int p1) {}
    public void setIdentity() {}
    public void setScale(float p0, float p1, float p2) {}
    public java.lang.String toString() { return null; }
    public void translate(float p0, float p1, float p2) {}
}

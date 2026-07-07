package android.graphics;

public class Path {
    static final android.graphics.Path.FillType[] sFillTypeArray = null;
    public final long mNativePath = 0L;
    public Path() {}
    public Path(android.graphics.Path p0) {}
    private static native void nAddArc(long p0, float p1, float p2, float p3, float p4, float p5, float p6);
    private static native void nAddCircle(long p0, float p1, float p2, float p3, int p4);
    private static native void nAddOval(long p0, float p1, float p2, float p3, float p4, int p5);
    private static native void nAddPath(long p0, long p1);
    private static native void nAddPath(long p0, long p1, float p2, float p3);
    private static native void nAddPath(long p0, long p1, long p2);
    private static native void nAddRect(long p0, float p1, float p2, float p3, float p4, int p5);
    private static native void nAddRoundRect(long p0, float p1, float p2, float p3, float p4, float p5, float p6, int p7);
    private static native void nAddRoundRect(long p0, float p1, float p2, float p3, float p4, float[] p5, int p6);
    private static native float[] nApproximate(long p0, float p1);
    private static native void nArcTo(long p0, float p1, float p2, float p3, float p4, float p5, float p6, boolean p7);
    private static native void nClose(long p0);
    private static native void nComputeBounds(long p0, android.graphics.RectF p1);
    private static native void nConicTo(long p0, float p1, float p2, float p3, float p4, float p5);
    private static native void nCubicTo(long p0, float p1, float p2, float p3, float p4, float p5, float p6);
    private static native int nGetFillType(long p0);
    private static native long nGetFinalizer();
    private static native int nGetGenerationID(long p0);
    private static native void nIncReserve(long p0, int p1);
    private static native long nInit();
    private static native long nInit(long p0);
    private static native boolean nInterpolate(long p0, long p1, float p2, long p3);
    private static native boolean nIsConvex(long p0);
    private static native boolean nIsEmpty(long p0);
    private static native boolean nIsInterpolatable(long p0, long p1);
    private static native boolean nIsRect(long p0, android.graphics.RectF p1);
    private static native void nLineTo(long p0, float p1, float p2);
    private static native void nMoveTo(long p0, float p1, float p2);
    private static native void nOffset(long p0, float p1, float p2);
    private static native boolean nOp(long p0, long p1, int p2, long p3);
    private static native void nQuadTo(long p0, float p1, float p2, float p3, float p4);
    private static native void nRConicTo(long p0, float p1, float p2, float p3, float p4, float p5);
    private static native void nRCubicTo(long p0, float p1, float p2, float p3, float p4, float p5, float p6);
    private static native void nRLineTo(long p0, float p1, float p2);
    private static native void nRMoveTo(long p0, float p1, float p2);
    private static native void nRQuadTo(long p0, float p1, float p2, float p3, float p4);
    private static native void nReset(long p0);
    private static native void nRewind(long p0);
    private static native void nSet(long p0, long p1);
    private static native void nSetFillType(long p0, int p1);
    private static native void nSetLastPoint(long p0, float p1, float p2);
    private static native void nTransform(long p0, long p1);
    private static native void nTransform(long p0, long p1, long p2);
    public void addArc(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void addArc(android.graphics.RectF p0, float p1, float p2) {}
    public void addCircle(float p0, float p1, float p2, android.graphics.Path.Direction p3) {}
    public void addOval(float p0, float p1, float p2, float p3, android.graphics.Path.Direction p4) {}
    public void addOval(android.graphics.RectF p0, android.graphics.Path.Direction p1) {}
    public void addPath(android.graphics.Path p0) {}
    public void addPath(android.graphics.Path p0, float p1, float p2) {}
    public void addPath(android.graphics.Path p0, android.graphics.Matrix p1) {}
    public void addRect(float p0, float p1, float p2, float p3, android.graphics.Path.Direction p4) {}
    public void addRect(android.graphics.RectF p0, android.graphics.Path.Direction p1) {}
    public void addRoundRect(float p0, float p1, float p2, float p3, float p4, float p5, android.graphics.Path.Direction p6) {}
    public void addRoundRect(float p0, float p1, float p2, float p3, float[] p4, android.graphics.Path.Direction p5) {}
    public void addRoundRect(android.graphics.RectF p0, float p1, float p2, android.graphics.Path.Direction p3) {}
    public void addRoundRect(android.graphics.RectF p0, float[] p1, android.graphics.Path.Direction p2) {}
    public float[] approximate(float p0) { return null; }
    public void arcTo(float p0, float p1, float p2, float p3, float p4, float p5, boolean p6) {}
    public void arcTo(android.graphics.RectF p0, float p1, float p2) {}
    public void arcTo(android.graphics.RectF p0, float p1, float p2, boolean p3) {}
    public void close() {}
    public void computeBounds(android.graphics.RectF p0) {}
    public void computeBounds(android.graphics.RectF p0, boolean p1) {}
    public void conicTo(float p0, float p1, float p2, float p3, float p4) {}
    public void cubicTo(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public android.graphics.Path.FillType getFillType() { return null; }
    public int getGenerationId() { return 0; }
    public android.graphics.PathIterator getPathIterator() { return null; }
    public void incReserve(int p0) {}
    public boolean interpolate(android.graphics.Path p0, float p1, android.graphics.Path p2) { return false; }
    @java.lang.Deprecated
    public boolean isConvex() { return false; }
    public boolean isEmpty() { return false; }
    public boolean isInterpolatable(android.graphics.Path p0) { return false; }
    public boolean isInverseFillType() { return false; }
    public boolean isRect(android.graphics.RectF p0) { return false; }
    public void lineTo(float p0, float p1) {}
    public void moveTo(float p0, float p1) {}
    final long mutateNI() { return 0L; }
    public void offset(float p0, float p1) {}
    public void offset(float p0, float p1, android.graphics.Path p2) {}
    public boolean op(android.graphics.Path p0, android.graphics.Path.Op p1) { return false; }
    public boolean op(android.graphics.Path p0, android.graphics.Path p1, android.graphics.Path.Op p2) { return false; }
    public void quadTo(float p0, float p1, float p2, float p3) {}
    public void rConicTo(float p0, float p1, float p2, float p3, float p4) {}
    public void rCubicTo(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void rLineTo(float p0, float p1) {}
    public void rMoveTo(float p0, float p1) {}
    public void rQuadTo(float p0, float p1, float p2, float p3) {}
    public final long readOnlyNI() { return 0L; }
    public void reset() {}
    public void rewind() {}
    public void set(android.graphics.Path p0) {}
    public void setFillType(android.graphics.Path.FillType p0) {}
    public void setLastPoint(float p0, float p1) {}
    public void toggleInverseFillType() {}
    public void transform(android.graphics.Matrix p0) {}
    public void transform(android.graphics.Matrix p0, android.graphics.Path p1) {}

    public static enum Direction {
        CCW,
        CW;
        private static final android.graphics.Path.Direction[] $VALUES = null;
        final int nativeInt = 0;
        private Direction() {}
    }

    public static enum FillType {
        EVEN_ODD,
        INVERSE_EVEN_ODD,
        INVERSE_WINDING,
        WINDING;
        private static final android.graphics.Path.FillType[] $VALUES = null;
        final int nativeInt = 0;
        private FillType() {}
    }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }

    public static enum Op {
        DIFFERENCE,
        INTERSECT,
        REVERSE_DIFFERENCE,
        UNION,
        XOR;
        private static final android.graphics.Path.Op[] $VALUES = null;
        private Op() {}
    }
}

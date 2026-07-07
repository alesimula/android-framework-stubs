package android.graphics;

public class Mesh {
    public static final int TRIANGLES = 0;
    public static final int TRIANGLE_STRIP = 1;
    private boolean mIsIndexed;
    private long mNativeMeshWrapper;
    public Mesh(android.graphics.MeshSpecification p0, int p1, java.nio.Buffer p2, int p3, android.graphics.RectF p4) {}
    public Mesh(android.graphics.MeshSpecification p0, int p1, java.nio.Buffer p2, int p3, java.nio.ShortBuffer p4, android.graphics.RectF p5) {}
    private void meshSetup(long p0, boolean p1) {}
    private static native long nativeGetFinalizer();
    private static native long nativeMake(long p0, int p1, java.nio.Buffer p2, boolean p3, int p4, int p5, float p6, float p7, float p8, float p9);
    private static native long nativeMakeIndexed(long p0, int p1, java.nio.Buffer p2, boolean p3, int p4, int p5, java.nio.ShortBuffer p6, boolean p7, int p8, int p9, float p10, float p11, float p12, float p13);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, float p2, float p3, float p4, float p5, int p6);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, float[] p2, boolean p3);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, int[] p2);
    private void setFloatUniform(java.lang.String p0, float p1, float p2, float p3, float p4, int p5) {}
    private void setIntUniform(java.lang.String p0, int p1, int p2, int p3, int p4, int p5) {}
    private void setUniform(java.lang.String p0, float[] p1, boolean p2) {}
    long getNativeWrapperInstance() { return 0L; }
    public void setColorUniform(java.lang.String p0, int p1) {}
    public void setColorUniform(java.lang.String p0, long p1) {}
    public void setColorUniform(java.lang.String p0, android.graphics.Color p1) {}
    public void setFloatUniform(java.lang.String p0, float p1) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2, float p3) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2, float p3, float p4) {}
    public void setFloatUniform(java.lang.String p0, float[] p1) {}
    public void setIntUniform(java.lang.String p0, int p1) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2, int p3) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2, int p3, int p4) {}
    public void setIntUniform(java.lang.String p0, int[] p1) {}

    private static class MeshHolder {
        private MeshHolder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface Mode {
    }
}

package android.graphics;

public class RuntimeColorFilter extends android.graphics.ColorFilter {
    private java.lang.String mAgsl;
    public RuntimeColorFilter(java.lang.String p0) { super(); }
    private static native long nativeCreateRuntimeColorFilter(java.lang.String p0);
    private static native void nativeUpdateChild(long p0, java.lang.String p1, long p2);
    private static native void nativeUpdateInputColorFilter(long p0, java.lang.String p1, long p2);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, float p2, float p3, float p4, float p5, int p6);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, float[] p2, boolean p3);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, int[] p2);
    private void setFloatUniform(java.lang.String p0, float p1, float p2, float p3, float p4, int p5) {}
    private void setIntUniform(java.lang.String p0, int p1, int p2, int p3, int p4, int p5) {}
    private void setUniform(java.lang.String p0, float[] p1, boolean p2) {}
    protected long createNativeInstance() { return 0L; }
    public void setColorUniform(java.lang.String p0, int p1) {}
    public void setColorUniform(java.lang.String p0, long p1) {}
    public void setColorUniform(java.lang.String p0, android.graphics.Color p1) {}
    public void setFloatUniform(java.lang.String p0, float p1) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2, float p3) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2, float p3, float p4) {}
    public void setFloatUniform(java.lang.String p0, float[] p1) {}
    public void setInputColorFilter(java.lang.String p0, android.graphics.ColorFilter p1) {}
    public void setInputShader(java.lang.String p0, android.graphics.Shader p1) {}
    public void setInputXfermode(java.lang.String p0, android.graphics.RuntimeXfermode p1) {}
    public void setIntUniform(java.lang.String p0, int p1) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2, int p3) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2, int p3, int p4) {}
    public void setIntUniform(java.lang.String p0, int[] p1) {}
}

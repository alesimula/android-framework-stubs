package android.graphics;

public class RuntimeShader extends android.graphics.Shader {
    private android.util.ArrayMap<java.lang.String, android.graphics.ColorFilter> mColorFilterUniforms;
    private long mNativeInstanceRuntimeShaderBuilder;
    private android.util.ArrayMap<java.lang.String, android.graphics.Shader> mShaderUniforms;
    private android.graphics.ColorSpace mWorkingColorSpace;
    private android.util.ArrayMap<java.lang.String, android.graphics.RuntimeXfermode> mXfermodeUniforms;
    public RuntimeShader(java.lang.String p0) { super(); }
    private static native long nativeCreateBuilder(java.lang.String p0);
    private static native long nativeCreateShader(long p0, long p1);
    private static native long nativeCreateShader(long p0, long p1, long p2);
    private static native long nativeGetFinalizer();
    private static native void nativeUpdateChild(long p0, java.lang.String p1, long p2);
    private static native void nativeUpdateColorFilter(long p0, java.lang.String p1, long p2);
    private static native void nativeUpdateShader(long p0, java.lang.String p1, long p2);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, float p2, float p3, float p4, float p5, int p6);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, float[] p2, boolean p3);
    private static native void nativeUpdateUniforms(long p0, java.lang.String p1, int[] p2);
    private void setFloatUniform(java.lang.String p0, float p1, float p2, float p3, float p4, int p5) {}
    private void setIntUniform(java.lang.String p0, int p1, int p2, int p3, int p4, int p5) {}
    private void setUniform(java.lang.String p0, float[] p1, boolean p2) {}
    protected long createNativeInstance(long p0, boolean p1) { return 0L; }
    protected long getNativeShaderBuilder() { return 0L; }
    public void setColorUniform(java.lang.String p0, int p1) {}
    public void setColorUniform(java.lang.String p0, long p1) {}
    public void setColorUniform(java.lang.String p0, android.graphics.Color p1) {}
    public void setFloatUniform(java.lang.String p0, float p1) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2, float p3) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2, float p3, float p4) {}
    public void setFloatUniform(java.lang.String p0, float[] p1) {}
    public void setInputBuffer(java.lang.String p0, android.graphics.BitmapShader p1) {}
    public void setInputColorFilter(java.lang.String p0, android.graphics.ColorFilter p1) {}
    public void setInputShader(java.lang.String p0, android.graphics.Shader p1) {}
    public void setInputXfermode(java.lang.String p0, android.graphics.RuntimeXfermode p1) {}
    public void setIntUniform(java.lang.String p0, int p1) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2, int p3) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2, int p3, int p4) {}
    public void setIntUniform(java.lang.String p0, int[] p1) {}
    public void setWorkingColorSpace(android.graphics.ColorSpace p0) {}

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }
}

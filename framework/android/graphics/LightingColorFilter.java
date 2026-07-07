package android.graphics;

public class LightingColorFilter extends android.graphics.ColorFilter {
    private int mAdd;
    private int mMul;
    public LightingColorFilter(int p0, int p1) { super(); }
    private static native long native_CreateLightingFilter(int p0, int p1);
    private static native void native_SetLightingFilterAdd(long p0, int p1);
    private static native void native_SetLightingFilterMul(long p0, int p1);
    long createNativeInstance() { return 0L; }
    public int getColorAdd() { return 0; }
    public int getColorMultiply() { return 0; }
    public void setColorAdd(int p0) {}
    public void setColorMultiply(int p0) {}
}

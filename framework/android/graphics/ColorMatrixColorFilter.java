package android.graphics;

public class ColorMatrixColorFilter extends android.graphics.ColorFilter {
    public ColorMatrixColorFilter(android.graphics.ColorMatrix p0) { super(); }
    public ColorMatrixColorFilter(float[] p0) { super(); }
    private static native long nativeColorMatrixFilter(float[] p0);
    private static native void nativeSetColorMatrix(long p0, float[] p1);
    long createNativeInstance() { return 0L; }
    public void getColorMatrix(android.graphics.ColorMatrix p0) {}
    public void setColorMatrix(android.graphics.ColorMatrix p0) {}
    public void setColorMatrixArray(float[] p0) {}
}

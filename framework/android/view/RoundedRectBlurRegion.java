package android.view;

public final class RoundedRectBlurRegion extends android.view.BlurRegion {
    private final float[] mCornerRadii = null;
    private final android.graphics.RectF mRect = null;
    public RoundedRectBlurRegion() { super(); }
    public RoundedRectBlurRegion(android.graphics.RectF p0, float[] p1, float p2, float p3) { super(); }
    private RoundedRectBlurRegion(android.view.RoundedRectBlurRegion p0) { super(); }
    private static native void nGetBounds(long p0, android.graphics.RectF p1);
    private static native void nGetCornerRadii(long p0, float[] p1);
    private static native void nSetBounds(long p0, float p1, float p2, float p3, float p4);
    private static native void nSetCornerRadii(long p0, float[] p1);
    private static native void nSetUniformCornerRadius(long p0, float p1);
    public android.view.RoundedRectBlurRegion copy() { return null; }
    public android.graphics.RectF getBounds() { return null; }
    public float[] getCornerRadii() { return null; }
    public void setBounds(android.graphics.RectF p0) {}
    public void setCornerRadii(float p0) {}
    public void setCornerRadii(float[] p0) {}
}

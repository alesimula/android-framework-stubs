package android.view;

public abstract class BlurRegion {
    private float mAlpha;
    private float mBlurRadius;
    protected BlurRegion() {}
    protected BlurRegion(float p0, float p1) {}
    protected BlurRegion(android.view.BlurRegion p0) {}
    public abstract android.view.BlurRegion copy();
    public boolean equals(java.lang.Object p0) { return false; }
    public float getAlpha() { return 0.0f; }
    public float getBlurRadius() { return 0.0f; }
    public int hashCode() { return 0; }
    public void setAlpha(float p0) {}
    public void setBlurRadius(float p0) {}
    public abstract float[] toFloatArray(int p0, int p1, float p2, float p3);
}

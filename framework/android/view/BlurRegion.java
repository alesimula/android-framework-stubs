package android.view;

public abstract class BlurRegion {
    public final long mNativePtr = 0L;
    protected BlurRegion() {}
    protected BlurRegion(float p0, float p1) {}
    protected BlurRegion(android.view.BlurRegion p0) {}
    private static native long nCopy(long p0);
    private static native long nCreate(float p0, float p1);
    private static native boolean nEquals(long p0, long p1);
    private static native float nGetAlpha(long p0);
    private static native float nGetBlurRadius(long p0);
    private static native long nGetFinalizer();
    private static native int nHashCode(long p0);
    private static native void nSetAlpha(long p0, float p1);
    private static native void nSetBlurRadius(long p0, float p1);
    public abstract android.view.BlurRegion copy();
    public boolean equals(java.lang.Object p0) { return false; }
    public float getAlpha() { return 0.0f; }
    public float getBlurRadius() { return 0.0f; }
    public int hashCode() { return 0; }
    public void setAlpha(float p0) {}
    public void setBlurRadius(float p0) {}

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }
}

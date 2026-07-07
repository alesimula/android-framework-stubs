package android.graphics;

public class Shader {
    private java.lang.Runnable mCleaner;
    private final android.graphics.ColorSpace mColorSpace = null;
    private android.graphics.Matrix mLocalMatrix;
    private long mNativeInstance;
    @java.lang.Deprecated
    public Shader() {}
    protected Shader(android.graphics.ColorSpace p0) {}
    protected static long[] convertColors(int[] p0) { return null; }
    protected static android.graphics.ColorSpace detectColorSpace(long[] p0) { return null; }
    private void discardNativeInstanceLocked() {}
    private static native long nativeGetFinalizer();
    protected android.graphics.ColorSpace colorSpace() { return null; }
    protected long createNativeInstance(long p0, boolean p1) { return 0L; }
    protected final void discardNativeInstance() {}
    public boolean getLocalMatrix(android.graphics.Matrix p0) { return false; }
    public final long getNativeInstance() { return 0L; }
    public final long getNativeInstance(boolean p0) { return 0L; }
    public void setLocalMatrix(android.graphics.Matrix p0) {}
    protected boolean shouldDiscardNativeInstance(boolean p0) { return false; }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }

    public static enum TileMode {
        CLAMP,
        DECAL,
        MIRROR,
        REPEAT;
        private static final android.graphics.Shader.TileMode[] $VALUES = null;
        final int nativeInt = 0;
        private TileMode() {}
    }
}

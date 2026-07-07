package android.graphics.animation;

@android.graphics.animation.HasNativeInterpolator
public class FallbackLUTInterpolator implements android.graphics.animation.NativeInterpolator, android.animation.TimeInterpolator {
    private static final int MAX_SAMPLE_POINTS = 300;
    private final float[] mLut = null;
    private android.animation.TimeInterpolator mSourceInterpolator;
    public FallbackLUTInterpolator(android.animation.TimeInterpolator p0, long p1) {}
    private static float[] createLUT(android.animation.TimeInterpolator p0, long p1) { return null; }
    public static long createNativeInterpolator(android.animation.TimeInterpolator p0, long p1) { return 0L; }
    public long createNativeInterpolator() { return 0L; }
    public float getInterpolation(float p0) { return 0.0f; }
}

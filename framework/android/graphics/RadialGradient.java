package android.graphics;

public class RadialGradient extends android.graphics.Shader {
    private int mCenterColor;
    private final long[] mColorLongs = null;
    private int[] mColors;
    private int mEdgeColor;
    private final float mFocalRadius = 0.0f;
    private final float mFocalX = 0.0f;
    private final float mFocalY = 0.0f;
    private float[] mPositions;
    private float mRadius;
    private android.graphics.Shader.TileMode mTileMode;
    private float mX;
    private float mY;
    public RadialGradient(float p0, float p1, float p2, float p3, float p4, float p5, long[] p6, float[] p7, android.graphics.Shader.TileMode p8) { super(); }
    private RadialGradient(float p0, float p1, float p2, float p3, float p4, float p5, long[] p6, float[] p7, android.graphics.Shader.TileMode p8, android.graphics.ColorSpace p9) { super(); }
    public RadialGradient(float p0, float p1, float p2, int p3, int p4, android.graphics.Shader.TileMode p5) { super(); }
    public RadialGradient(float p0, float p1, float p2, long p3, long p4, android.graphics.Shader.TileMode p5) { super(); }
    public RadialGradient(float p0, float p1, float p2, int[] p3, float[] p4, android.graphics.Shader.TileMode p5) { super(); }
    public RadialGradient(float p0, float p1, float p2, long[] p3, float[] p4, android.graphics.Shader.TileMode p5) { super(); }
    private static native long nativeCreate(long p0, float p1, float p2, float p3, float p4, float p5, float p6, long[] p7, float[] p8, int p9, long p10);
    protected long createNativeInstance(long p0, boolean p1) { return 0L; }
}

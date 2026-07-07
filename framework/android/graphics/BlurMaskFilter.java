package android.graphics;

public class BlurMaskFilter extends android.graphics.MaskFilter {
    public BlurMaskFilter(float p0, android.graphics.BlurMaskFilter.Blur p1) { super(); }
    private static native long nativeConstructor(float p0, int p1);

    public static enum Blur {
        INNER,
        NORMAL,
        OUTER,
        SOLID;
        private static final android.graphics.BlurMaskFilter.Blur[] $VALUES = null;
        final int native_int = 0;
        private Blur() {}
    }
}

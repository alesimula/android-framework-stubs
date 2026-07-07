package android.graphics;

public class PathDashPathEffect extends android.graphics.PathEffect {
    public PathDashPathEffect(android.graphics.Path p0, float p1, float p2, android.graphics.PathDashPathEffect.Style p3) { super(); }
    private static native long nativeCreate(long p0, float p1, float p2, int p3);

    public static enum Style {
        MORPH,
        ROTATE,
        TRANSLATE;
        private static final android.graphics.PathDashPathEffect.Style[] $VALUES = null;
        int native_style;
        private Style() {}
    }
}

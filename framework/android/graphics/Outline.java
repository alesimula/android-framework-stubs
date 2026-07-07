package android.graphics;

public final class Outline {
    public static final int MODE_EMPTY = 0;
    public static final int MODE_PATH = 2;
    public static final int MODE_ROUND_RECT = 1;
    private static final float RADIUS_UNDEFINED = Float.NEGATIVE_INFINITY;
    public float mAlpha;
    public int mMode;
    public android.graphics.Path mPath;
    public float mRadius;
    public final android.graphics.Rect mRect = null;
    public Outline() {}
    public Outline(android.graphics.Outline p0) {}
    public boolean canClip() { return false; }
    public float getAlpha() { return 0.0f; }
    public float getRadius() { return 0.0f; }
    public boolean getRect(android.graphics.Rect p0) { return false; }
    public boolean isEmpty() { return false; }
    public void offset(int p0, int p1) {}
    public void set(android.graphics.Outline p0) {}
    public void setAlpha(float p0) {}
    @java.lang.Deprecated
    public void setConvexPath(android.graphics.Path p0) {}
    public void setEmpty() {}
    public void setOval(int p0, int p1, int p2, int p3) {}
    public void setOval(android.graphics.Rect p0) {}
    public void setPath(android.graphics.Path p0) {}
    public void setRect(int p0, int p1, int p2, int p3) {}
    public void setRect(android.graphics.Rect p0) {}
    public void setRoundRect(int p0, int p1, int p2, int p3, float p4) {}
    public void setRoundRect(android.graphics.Rect p0, float p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Mode {
    }
}

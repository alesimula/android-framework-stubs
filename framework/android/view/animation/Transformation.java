package android.view.animation;

public class Transformation {
    public static final int TYPE_ALPHA = 1;
    public static final int TYPE_BOTH = 3;
    public static final int TYPE_IDENTITY = 0;
    public static final int TYPE_MATRIX = 2;
    protected float mAlpha;
    private android.graphics.Rect mClipRect;
    private boolean mHasClipRect;
    private android.graphics.Insets mInsets;
    protected android.graphics.Matrix mMatrix;
    protected int mTransformationType;
    public Transformation() {}
    public void clear() {}
    public void compose(android.view.animation.Transformation p0) {}
    public float getAlpha() { return 0.0f; }
    public android.graphics.Rect getClipRect() { return null; }
    public android.graphics.Insets getInsets() { return null; }
    public android.graphics.Matrix getMatrix() { return null; }
    public int getTransformationType() { return 0; }
    public boolean hasClipRect() { return false; }
    public void postCompose(android.view.animation.Transformation p0) {}
    public void printShortString(java.io.PrintWriter p0) {}
    public void set(android.view.animation.Transformation p0) {}
    public void setAlpha(float p0) {}
    public void setClipRect(int p0, int p1, int p2, int p3) {}
    public void setClipRect(android.graphics.Rect p0) {}
    public void setInsets(int p0, int p1, int p2, int p3) {}
    public void setInsets(android.graphics.Insets p0) {}
    public void setTransformationType(int p0) {}
    public java.lang.String toShortString() { return null; }
    public void toShortString(java.lang.StringBuilder p0) {}
    public java.lang.String toString() { return null; }
}

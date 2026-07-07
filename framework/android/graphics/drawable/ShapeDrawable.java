package android.graphics.drawable;

public class ShapeDrawable extends android.graphics.drawable.Drawable {
    private android.graphics.BlendModeColorFilter mBlendModeColorFilter;
    private boolean mMutated;
    private android.graphics.drawable.ShapeDrawable.ShapeState mShapeState;
    public ShapeDrawable() { super(); }
    private ShapeDrawable(android.graphics.drawable.ShapeDrawable.ShapeState p0, android.content.res.Resources p1) { super(); }
    public ShapeDrawable(android.graphics.drawable.shapes.Shape p0) { super(); }
    private static int modulateAlpha(int p0, int p1) { return 0; }
    private void updateLocalState() {}
    private void updateShape() {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public void clearMutated() {}
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public int getChangingConfigurations() { return 0; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public int getIntrinsicHeight() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public int getOpacity() { return 0; }
    public void getOutline(android.graphics.Outline p0) {}
    public boolean getPadding(android.graphics.Rect p0) { return false; }
    public android.graphics.Paint getPaint() { return null; }
    public android.graphics.drawable.ShapeDrawable.ShaderFactory getShaderFactory() { return null; }
    public android.graphics.drawable.shapes.Shape getShape() { return null; }
    public boolean hasFocusStateSpecified() { return false; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    protected boolean inflateTag(java.lang.String p0, android.content.res.Resources p1, org.xmlpull.v1.XmlPullParser p2, android.util.AttributeSet p3) { return false; }
    public boolean isStateful() { return false; }
    public android.graphics.drawable.Drawable mutate() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected void onDraw(android.graphics.drawable.shapes.Shape p0, android.graphics.Canvas p1, android.graphics.Paint p2) {}
    protected boolean onStateChange(int[] p0) { return false; }
    public void setAlpha(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public void setDither(boolean p0) {}
    public void setIntrinsicHeight(int p0) {}
    public void setIntrinsicWidth(int p0) {}
    public void setPadding(int p0, int p1, int p2, int p3) {}
    public void setPadding(android.graphics.Rect p0) {}
    public void setShaderFactory(android.graphics.drawable.ShapeDrawable.ShaderFactory p0) {}
    public void setShape(android.graphics.drawable.shapes.Shape p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setXfermode(android.graphics.Xfermode p0) {}

    public static abstract class ShaderFactory {
        public ShaderFactory() {}
        public abstract android.graphics.Shader resize(int p0, int p1);
    }

    static final class ShapeState extends android.graphics.drawable.Drawable.ConstantState {
        int mAlpha;
        android.graphics.BlendMode mBlendMode;
        int mChangingConfigurations;
        int mIntrinsicHeight;
        int mIntrinsicWidth;
        android.graphics.Rect mPadding;
        final android.graphics.Paint mPaint = null;
        android.graphics.drawable.ShapeDrawable.ShaderFactory mShaderFactory;
        android.graphics.drawable.shapes.Shape mShape;
        int[] mThemeAttrs;
        android.content.res.ColorStateList mTint;
        ShapeState() { super(); }
        ShapeState(android.graphics.drawable.ShapeDrawable.ShapeState p0) { super(); }
        public boolean canApplyTheme() { return false; }
        public int getChangingConfigurations() { return 0; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}

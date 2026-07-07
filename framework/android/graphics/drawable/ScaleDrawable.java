package android.graphics.drawable;

public class ScaleDrawable extends android.graphics.drawable.DrawableWrapper {
    private static final int MAX_LEVEL = 10000;
    private android.graphics.drawable.ScaleDrawable.ScaleState mState;
    private final android.graphics.Rect mTmpRect = null;
    ScaleDrawable() { super((android.graphics.drawable.Drawable)null); }
    public ScaleDrawable(android.graphics.drawable.Drawable p0, int p1, float p2, float p3) { super((android.graphics.drawable.Drawable)null); }
    private ScaleDrawable(android.graphics.drawable.ScaleDrawable.ScaleState p0, android.content.res.Resources p1) { super((android.graphics.drawable.Drawable)null); }
    private static float getPercent(android.content.res.TypedArray p0, int p1, float p2) { return 0.0f; }
    private void updateLocalState() {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    private void verifyRequiredAttributes(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public void draw(android.graphics.Canvas p0) {}
    public int getOpacity() { return 0; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    android.graphics.drawable.DrawableWrapper.DrawableWrapperState mutateConstantState() { return null; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    protected boolean onLevelChange(int p0) { return false; }

    static final class ScaleState extends android.graphics.drawable.DrawableWrapper.DrawableWrapperState {
        private static final float DO_NOT_SCALE = -1.0f;
        int mGravity;
        int mInitialLevel;
        float mScaleHeight;
        float mScaleWidth;
        private int[] mThemeAttrs;
        boolean mUseIntrinsicSizeAsMin;
        ScaleState(android.graphics.drawable.ScaleDrawable.ScaleState p0, android.content.res.Resources p1) { super(null, null); }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
    }
}

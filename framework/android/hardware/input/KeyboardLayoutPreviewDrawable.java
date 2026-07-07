package android.hardware.input;

final class KeyboardLayoutPreviewDrawable extends android.graphics.drawable.Drawable {
    private static final int GRAVITY_BOTTOM = 8;
    private static final int GRAVITY_LEFT = 1;
    private static final int GRAVITY_RIGHT = 2;
    private static final int GRAVITY_TOP = 4;
    private static final int KEYBOARD_PADDING_IN_DP = 10;
    private static final int KEYBOARD_RADIUS_IN_DP = 10;
    private static final int KEY_PADDING_IN_DP = 3;
    private static final int KEY_RADIUS_IN_DP = 5;
    private static final int MAX_GLYPH_TEXT_SIZE_IN_SP = 20;
    private static final int MIN_GLYPH_TEXT_SIZE_IN_SP = 10;
    private static final java.lang.String TAG = "KeyboardLayoutPreview";
    private static final int TEXT_PADDING_IN_DP = 1;
    private final int mHeight = 0;
    private final java.util.List<android.hardware.input.KeyboardLayoutPreviewDrawable.KeyDrawable> mKeyDrawables = null;
    private final android.hardware.input.PhysicalKeyLayout mKeyLayout = null;
    private final android.graphics.RectF mKeyboardBackground = null;
    private final android.hardware.input.KeyboardLayoutPreviewDrawable.ResourceProvider mResourceProvider = null;
    private final int mWidth = 0;
    public KeyboardLayoutPreviewDrawable(android.content.Context p0, android.hardware.input.PhysicalKeyLayout p1, int p2, int p3) { super(); }
    private static android.graphics.Paint createFillPaint(int p0) { return null; }
    private static android.graphics.Paint createGreyedOutPaint(android.graphics.Paint p0) { return null; }
    private static android.graphics.Paint createTextPaint(int p0, float p1, android.graphics.Typeface p2) { return null; }
    public void draw(android.graphics.Canvas p0) {}
    public int getIntrinsicHeight() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public int getOpacity() { return 0; }
    protected void onBoundsChange(android.graphics.Rect p0) {}
    public void setAlpha(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}

    private static final class GlyphDrawable {
        private final int gravity = 0;
        private final android.graphics.Paint paint = null;
        private final android.graphics.RectF rect = null;
        private final java.lang.String text = null;
        private GlyphDrawable(java.lang.String p0, android.graphics.RectF p1, int p2, android.graphics.Paint p3) {}
        public final boolean equals(java.lang.Object p0) { return false; }
        public int gravity() { return 0; }
        public final int hashCode() { return 0; }
        public android.graphics.Paint paint() { return null; }
        public android.graphics.RectF rect() { return null; }
        public java.lang.String text() { return null; }
        public final java.lang.String toString() { return null; }
    }

    private static class IsoEnterKey implements android.hardware.input.KeyboardLayoutPreviewDrawable.KeyDrawable {
        private final android.graphics.Paint mKeyPaint = null;
        private final android.graphics.Path mPath = null;
        private IsoEnterKey(android.graphics.Paint p0, android.graphics.Path p1) {}
        public void draw(android.graphics.Canvas p0) {}

        private static class Builder {
            private float mBottomWidth;
            private final android.graphics.Paint mKeyPaint = null;
            private final float mKeyRadius = 0.0f;
            private float mLeft;
            private float mLeftHeight;
            private float mRightHeight;
            private float mTop;
            private float mTopWidth;
            private Builder(float p0, android.graphics.Paint p1) {}
            private android.hardware.input.KeyboardLayoutPreviewDrawable.IsoEnterKey build() { return null; }
            private android.hardware.input.KeyboardLayoutPreviewDrawable.IsoEnterKey.Builder setBottomWidth(float p0) { return null; }
            private android.hardware.input.KeyboardLayoutPreviewDrawable.IsoEnterKey.Builder setStartPoint(float p0, float p1) { return null; }
            private android.hardware.input.KeyboardLayoutPreviewDrawable.IsoEnterKey.Builder setTopWidth(float p0) { return null; }
            private android.hardware.input.KeyboardLayoutPreviewDrawable.IsoEnterKey.Builder setVerticalEdges(float p0, float p1) { return null; }
        }
    }

    private static interface KeyDrawable {
        public void draw(android.graphics.Canvas p0);
    }

    private static class ResourceProvider {
        private final android.graphics.Paint mBackgroundPaint = null;
        private final float mBackgroundRadius = 0.0f;
        private final android.graphics.Paint.FontMetrics mFontMetrics = null;
        private final int mKeyPadding = 0;
        private final float mKeyRadius = 0.0f;
        private final int mKeyboardPadding = 0;
        private final android.graphics.Paint mPrimaryGlyphPaint = null;
        private final android.graphics.Paint mSecondaryGlyphPaint = null;
        private final float mSpToPxMultiplier = 0.0f;
        private final android.graphics.Paint mSpecialKeyPaint = null;
        private final float mTextPadding = 0.0f;
        private final android.graphics.Paint mTypingKeyPaint = null;
        private ResourceProvider(android.content.Context p0) {}
        private void calculateBestTextSizeForKey(float p0) {}
        private android.graphics.Paint getBackgroundPaint() { return null; }
        private float getBackgroundRadius() { return 0.0f; }
        private int getKeyPadding() { return 0; }
        private float getKeyRadius() { return 0.0f; }
        private int getKeyboardPadding() { return 0; }
        private android.graphics.Paint getPrimaryGlyphPaint() { return null; }
        private android.graphics.Paint getSecondaryGlyphPaint() { return null; }
        private android.graphics.Paint getSpecialKeyPaint() { return null; }
        private float getTextPadding() { return 0.0f; }
        private android.graphics.Paint getTypingKeyPaint() { return null; }
        private void updateTextSize(float p0) {}
    }

    private static class TypingKey implements android.hardware.input.KeyboardLayoutPreviewDrawable.KeyDrawable {
        private final android.graphics.Paint mBaseTextPaint = null;
        private final java.util.List<android.hardware.input.KeyboardLayoutPreviewDrawable.GlyphDrawable> mGlyphDrawables = null;
        private final android.graphics.Paint mKeyPaint = null;
        private final float mKeyRadius = 0.0f;
        private final android.graphics.RectF mKeyRect = null;
        private final android.graphics.Paint mModifierTextPaint = null;
        private final float mTextPadding = 0.0f;
        private TypingKey(android.hardware.input.PhysicalKeyLayout.KeyGlyph p0, android.graphics.RectF p1, float p2, float p3, android.graphics.Paint p4, android.graphics.Paint p5, android.graphics.Paint p6) {}
        private void createGlyphs(android.hardware.input.PhysicalKeyLayout.KeyGlyph p0) {}
        private void initGlyphs(android.hardware.input.PhysicalKeyLayout.KeyGlyph p0) {}
        private void measureGlyphs() {}
        public void draw(android.graphics.Canvas p0) {}
    }

    private static class UnsureTypingKey extends android.hardware.input.KeyboardLayoutPreviewDrawable.TypingKey {
        private UnsureTypingKey(android.hardware.input.PhysicalKeyLayout.KeyGlyph p0, android.graphics.RectF p1, float p2, float p3, android.graphics.Paint p4, android.graphics.Paint p5, android.graphics.Paint p6) { super(null, null, 0.0f, 0.0f, null, null, null); }
    }
}

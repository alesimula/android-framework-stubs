package android.text;

public class StaticLayout extends android.text.Layout {
    private static final char CHAR_NEW_LINE = (char)0x000a;
    private static final int COLUMNS_ELLIPSIZE = 7;
    private static final int COLUMNS_NORMAL = 5;
    private static final int DEFAULT_MAX_LINE_HEIGHT = -1;
    private static final int DESCENT = 2;
    private static final int DIR = 0;
    private static final int DIR_SHIFT = 30;
    private static final int ELLIPSIS_COUNT = 6;
    private static final int ELLIPSIS_START = 5;
    private static final int END_HYPHEN_MASK = 7;
    private static final int EXTRA = 3;
    private static final double EXTRA_ROUNDING = 0.5;
    private static final int HYPHEN = 4;
    private static final int HYPHEN_MASK = 255;
    private static final int START = 0;
    private static final int START_HYPHEN_BITS_SHIFT = 3;
    private static final int START_HYPHEN_MASK = 24;
    private static final int START_MASK = 536870911;
    private static final int TAB = 0;
    private static final float TAB_INCREMENT = 20.0f;
    private static final int TAB_MASK = 536870912;
    static final java.lang.String TAG = "StaticLayout";
    private static final int TOP = 1;
    private int mBottomPadding;
    private int mColumns;
    private android.graphics.RectF mDrawingBounds;
    private boolean mEllipsized;
    private int[] mLeftIndents;
    private int mLineCount;
    private android.text.Layout.Directions[] mLineDirections;
    private int[] mLines;
    private int mMaxLineHeight;
    private int mMaximumVisibleLineCount;
    private int[] mRightIndents;
    private int mTopPadding;
    private StaticLayout() { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    private StaticLayout(android.text.StaticLayout.Builder p0, boolean p1, int p2) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, float p6, float p7, boolean p8) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, float p6, float p7, boolean p8, android.text.TextUtils.TruncateAt p9, int p10) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4, android.text.Layout.Alignment p5, android.text.TextDirectionHeuristic p6, float p7, float p8, boolean p9, android.text.TextUtils.TruncateAt p10, int p11, int p12) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    @java.lang.Deprecated
    public StaticLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, boolean p6) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    private void calculateEllipsis(int p0, int p1, android.text.MeasuredParagraph p2, int p3, float p4, android.text.TextUtils.TruncateAt p5, int p6, float p7, android.text.TextPaint p8, boolean p9) {}
    private static int getBaseHyphenationFrequency(int p0) { return 0; }
    private float getTotalInsets(int p0) { return 0.0f; }
    private int out(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, float p8, float p9, android.text.style.LineHeightSpan[] p10, int[] p11, android.graphics.Paint.FontMetricsInt p12, boolean p13, int p14, boolean p15, android.text.MeasuredParagraph p16, int p17, boolean p18, boolean p19, boolean p20, char[] p21, int p22, android.text.TextUtils.TruncateAt p23, float p24, float p25, android.text.TextPaint p26, boolean p27) { return 0; }
    static int packHyphenEdit(int p0, int p1) { return 0; }
    static int unpackEndHyphenEdit(int p0) { return 0; }
    static int unpackStartHyphenEdit(int p0) { return 0; }
    public android.graphics.RectF computeDrawingBoundingBox() { return null; }
    void generate(android.text.StaticLayout.Builder p0, boolean p1, boolean p2) {}
    public int getBottomPadding() { return 0; }
    public int getEllipsisCount(int p0) { return 0; }
    public int getEllipsisStart(int p0) { return 0; }
    public int getEndHyphenEdit(int p0) { return 0; }
    public int getHeight(boolean p0) { return 0; }
    public int getIndentAdjust(int p0, android.text.Layout.Alignment p1) { return 0; }
    public boolean getLineContainsTab(int p0) { return false; }
    public int getLineCount() { return 0; }
    public int getLineDescent(int p0) { return 0; }
    public final android.text.Layout.Directions getLineDirections(int p0) { return null; }
    public int getLineExtra(int p0) { return 0; }
    public int getLineForVertical(int p0) { return 0; }
    public int getLineStart(int p0) { return 0; }
    public int getLineTop(int p0) { return 0; }
    public int getParagraphDirection(int p0) { return 0; }
    public int getStartHyphenEdit(int p0) { return 0; }
    public int getTopPadding() { return 0; }

    public static final class Builder {
        private static final android.util.Pools.SynchronizedPool<android.text.StaticLayout.Builder> sPool = null;
        private boolean mAddLastLineLineSpacing;
        private android.text.Layout.Alignment mAlignment;
        private int mBreakStrategy;
        private boolean mCalculateBounds;
        private android.text.TextUtils.TruncateAt mEllipsize;
        private int mEllipsizedWidth;
        private int mEnd;
        private boolean mFallbackLineSpacing;
        private final android.graphics.Paint.FontMetricsInt mFontMetricsInt = null;
        private int mHyphenationFrequency;
        private boolean mIncludePad;
        private int mJustificationMode;
        private int[] mLeftIndents;
        private android.graphics.text.LineBreakConfig mLineBreakConfig;
        private int mMaxLines;
        private android.graphics.Paint.FontMetrics mMinimumFontMetrics;
        private android.text.TextPaint mPaint;
        private int[] mRightIndents;
        private boolean mShiftDrawingOffsetForStartOverhang;
        private float mSpacingAdd;
        private float mSpacingMult;
        private int mStart;
        private java.lang.CharSequence mText;
        private android.text.TextDirectionHeuristic mTextDir;
        private boolean mUseBoundsForWidth;
        private int mWidth;
        private Builder() {}
        public static android.text.StaticLayout.Builder obtain(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4) { return null; }
        private static void recycle(android.text.StaticLayout.Builder p0) {}
        public android.text.StaticLayout build() { return null; }
        android.text.StaticLayout buildPartialStaticLayoutForDynamicLayout(boolean p0, android.text.StaticLayout p1) { return null; }
        void finish() {}
        android.text.StaticLayout.Builder setAddLastLineLineSpacing(boolean p0) { return null; }
        public android.text.StaticLayout.Builder setAlignment(android.text.Layout.Alignment p0) { return null; }
        public android.text.StaticLayout.Builder setBreakStrategy(int p0) { return null; }
        public android.text.StaticLayout.Builder setCalculateBounds(boolean p0) { return null; }
        public android.text.StaticLayout.Builder setEllipsize(android.text.TextUtils.TruncateAt p0) { return null; }
        public android.text.StaticLayout.Builder setEllipsizedWidth(int p0) { return null; }
        public android.text.StaticLayout.Builder setHyphenationFrequency(int p0) { return null; }
        public android.text.StaticLayout.Builder setIncludePad(boolean p0) { return null; }
        public android.text.StaticLayout.Builder setIndents(int[] p0, int[] p1) { return null; }
        public android.text.StaticLayout.Builder setJustificationMode(int p0) { return null; }
        public android.text.StaticLayout.Builder setLineBreakConfig(android.graphics.text.LineBreakConfig p0) { return null; }
        public android.text.StaticLayout.Builder setLineSpacing(float p0, float p1) { return null; }
        public android.text.StaticLayout.Builder setMaxLines(int p0) { return null; }
        public android.text.StaticLayout.Builder setMinimumFontMetrics(android.graphics.Paint.FontMetrics p0) { return null; }
        public android.text.StaticLayout.Builder setPaint(android.text.TextPaint p0) { return null; }
        public android.text.StaticLayout.Builder setShiftDrawingOffsetForStartOverhang(boolean p0) { return null; }
        public android.text.StaticLayout.Builder setText(java.lang.CharSequence p0) { return null; }
        public android.text.StaticLayout.Builder setText(java.lang.CharSequence p0, int p1, int p2) { return null; }
        public android.text.StaticLayout.Builder setTextDirection(android.text.TextDirectionHeuristic p0) { return null; }
        public android.text.StaticLayout.Builder setUseBoundsForWidth(boolean p0) { return null; }
        public android.text.StaticLayout.Builder setUseLineSpacingFromFallbacks(boolean p0) { return null; }
        public android.text.StaticLayout.Builder setWidth(int p0) { return null; }
    }

    static class LineBreaks {
        private static final int INITIAL_SIZE = 16;
        public float[] ascents;
        public int[] breaks;
        public float[] descents;
        public int[] flags;
        public float[] widths;
        LineBreaks() {}
    }
}

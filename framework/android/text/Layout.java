package android.text;

public abstract class Layout {
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final float DEFAULT_LINESPACING_ADDITION = 0.0f;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;
    public static final android.text.Layout.Directions DIRS_ALL_LEFT_TO_RIGHT = null;
    public static final android.text.Layout.Directions DIRS_ALL_RIGHT_TO_LEFT = null;
    public static final int DIR_LEFT_TO_RIGHT = 1;
    static final int DIR_REQUEST_DEFAULT_LTR = 2;
    static final int DIR_REQUEST_DEFAULT_RTL = -2;
    static final int DIR_REQUEST_LTR = 1;
    static final int DIR_REQUEST_RTL = -1;
    public static final int DIR_RIGHT_TO_LEFT = -1;
    private static final float HIGH_CONTRAST_TEXT_BACKGROUND_ALPHA_PERCENTAGE = 0.699999988079071f;
    static final float HIGH_CONTRAST_TEXT_BACKGROUND_CORNER_RADIUS_FACTOR = 0.5f;
    static final float HIGH_CONTRAST_TEXT_BACKGROUND_CORNER_RADIUS_MIN_DP = 5.0f;
    private static final float HIGH_CONTRAST_TEXT_BORDER_WIDTH_FACTOR = 0.0f;
    private static final float HIGH_CONTRAST_TEXT_BORDER_WIDTH_MIN_PX = 0.0f;
    public static final int HYPHENATION_FREQUENCY_FULL = 2;
    public static final int HYPHENATION_FREQUENCY_FULL_FAST = 4;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final int HYPHENATION_FREQUENCY_NORMAL_FAST = 3;
    public static final android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_ANY_OVERLAP = null;
    public static final android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_CONTAINS_ALL = null;
    public static final android.text.Layout.TextInclusionStrategy INCLUSION_STRATEGY_CONTAINS_CENTER = null;
    public static final int JUSTIFICATION_MODE_INTER_CHARACTER = 2;
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    private static final android.text.style.ParagraphStyle[] NO_PARA_SPANS = null;
    static final int RUN_LENGTH_MASK = 67108863;
    static final int RUN_LEVEL_MASK = 63;
    static final int RUN_LEVEL_SHIFT = 26;
    static final int RUN_RTL_FLAG = 67108864;
    private static final float TAB_INCREMENT = 20.0f;
    public static final int TEXT_SELECTION_LAYOUT_LEFT_TO_RIGHT = 1;
    public static final int TEXT_SELECTION_LAYOUT_RIGHT_TO_LEFT = 0;
    private static final android.graphics.Rect sTempRect = null;
    private android.text.Layout.Alignment mAlignment;
    private int mBreakStrategy;
    private android.text.TextUtils.TruncateAt mEllipsize;
    private int mEllipsizedWidth;
    private boolean mFallbackLineSpacing;
    private int mHyphenationFrequency;
    private boolean mIncludePad;
    private int mJustificationMode;
    private int[] mLeftIndents;
    private android.text.SpanSet<android.text.style.LineBackgroundSpan> mLineBackgroundSpans;
    private android.graphics.text.LineBreakConfig mLineBreakConfig;
    private android.text.TextLine.LineInfo mLineInfo;
    private int mMaxLines;
    private android.graphics.Paint.FontMetrics mMinimumFontMetrics;
    private android.text.TextPaint mPaint;
    private int[] mRightIndents;
    private boolean mShiftDrawingOffsetForStartOverhang;
    private float mSpacingAdd;
    private float mSpacingMult;
    private android.text.SpanColors mSpanColors;
    private boolean mSpannedText;
    private java.lang.CharSequence mText;
    private android.text.TextDirectionHeuristic mTextDir;
    private boolean mUseBoundsForWidth;
    private int mWidth;
    private final android.text.TextPaint mWorkPaint = null;
    private final android.graphics.Paint mWorkPlainPaint = null;
    protected Layout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5) {}
    protected Layout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, android.text.TextDirectionHeuristic p4, float p5, float p6, boolean p7, boolean p8, int p9, android.text.TextUtils.TruncateAt p10, int p11, int p12, int p13, int[] p14, int[] p15, int p16, android.graphics.text.LineBreakConfig p17, boolean p18, boolean p19, android.graphics.Paint.FontMetrics p20) {}
    private void addSelection(int p0, int p1, int p2, int p3, int p4, android.text.Layout.SelectionRectangleConsumer p5) {}
    private android.graphics.BlendMode determineHighContrastHighlightBlendMode(android.graphics.Canvas p0) { return null; }
    private void drawHighContrastBackground(android.graphics.Canvas p0, int p1, int p2) {}
    private void ellipsize(int p0, int p1, int p2, char[] p3, int p4, android.text.TextUtils.TruncateAt p5) {}
    private void fillHorizontalBoundsForLine(int p0, float[] p1) {}
    private void forEachCharacterBounds(int p0, int p1, int p2, int p3, android.text.Layout.CharacterBoundsListener p4) {}
    public static float getDesiredWidth(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3) { return 0.0f; }
    public static float getDesiredWidth(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, android.text.TextDirectionHeuristic p4) { return 0.0f; }
    public static float getDesiredWidth(java.lang.CharSequence p0, android.text.TextPaint p1) { return 0.0f; }
    public static float getDesiredWidthWithLimit(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, android.text.TextDirectionHeuristic p4, float p5, boolean p6) { return 0.0f; }
    private static int getEndOffsetForAreaWithinRun(android.graphics.RectF p0, int p1, int p2, int p3, int p4, float[] p5, int p6, int p7, float p8, float p9, boolean p10, android.text.SegmentFinder p11, android.text.Layout.TextInclusionStrategy p12) { return 0; }
    private float getHorizontal(int p0, boolean p1) { return 0.0f; }
    private float getHorizontal(int p0, boolean p1, int p2, boolean p3) { return 0.0f; }
    private float getHorizontal(int p0, boolean p1, boolean p2) { return 0.0f; }
    private float getJustifyWidth(int p0) { return 0.0f; }
    private float getLineExtent(int p0, android.text.Layout.TabStops p1, boolean p2) { return 0.0f; }
    private float getLineExtent(int p0, boolean p1) { return 0.0f; }
    private float[] getLineHorizontals(int p0, boolean p1, boolean p2) { return null; }
    private int getLineStartPos(int p0, int p1, int p2) { return 0; }
    private int getLineVisibleEnd(int p0, int p1, int p2, boolean p3) { return 0; }
    private int getOffsetAtStartOf(int p0) { return 0; }
    private int getOffsetToLeftRightOf(int p0, boolean p1) { return 0; }
    private int getParagraphLeadingMargin(int p0) { return 0; }
    static <T extends java.lang.Object> T[] getParagraphSpans(android.text.Spanned p0, int p1, int p2, java.lang.Class<T> p3) { return null; }
    private static int getStartOffsetForAreaWithinRun(android.graphics.RectF p0, int p1, int p2, int p3, int p4, float[] p5, int p6, int p7, float p8, float p9, boolean p10, android.text.SegmentFinder p11, android.text.Layout.TextInclusionStrategy p12) { return 0; }
    private int getStartOrEndOffsetForAreaWithinLine(int p0, android.graphics.RectF p1, android.text.SegmentFinder p2, android.text.Layout.TextInclusionStrategy p3, boolean p4) { return 0; }
    private void initSpanColors() {}
    private boolean isHighContrastTextDark(int p0) { return false; }
    private boolean isJustificationRequired(int p0) { return false; }
    private static float measurePara(android.text.TextPaint p0, java.lang.CharSequence p1, int p2, int p3, android.text.TextDirectionHeuristic p4, android.graphics.RectF p5) { return 0.0f; }
    static float nextTab(java.lang.CharSequence p0, int p1, int p2, float p3, java.lang.Object[] p4) { return 0.0f; }
    private static android.graphics.Paint setToHighlightPaint(android.graphics.Paint p0, android.graphics.BlendMode p1, android.graphics.Paint p2) { return null; }
    private static boolean shouldDrawHighlightsOnTop(android.graphics.Canvas p0) { return false; }
    public android.graphics.RectF computeDrawingBoundingBox() { return null; }
    public void draw(android.graphics.Canvas p0) {}
    public void draw(android.graphics.Canvas p0, android.graphics.Path p1, android.graphics.Paint p2, int p3) {}
    public void draw(android.graphics.Canvas p0, java.util.List<android.graphics.Path> p1, java.util.List<android.graphics.Paint> p2, android.graphics.Path p3, android.graphics.Paint p4, int p5) {}
    public void drawBackground(android.graphics.Canvas p0) {}
    public void drawBackground(android.graphics.Canvas p0, int p1, int p2) {}
    public void drawHighlights(android.graphics.Canvas p0, java.util.List<android.graphics.Path> p1, java.util.List<android.graphics.Paint> p2, android.graphics.Path p3, android.graphics.Paint p4, int p5, int p6, int p7) {}
    public void drawText(android.graphics.Canvas p0) {}
    public void drawText(android.graphics.Canvas p0, int p1, int p2) {}
    public void drawWithoutText(android.graphics.Canvas p0, java.util.List<android.graphics.Path> p1, java.util.List<android.graphics.Paint> p2, android.graphics.Path p3, android.graphics.Paint p4, int p5, int p6, int p7) {}
    public void fillCharacterBounds(int p0, int p1, float[] p2, int p3) {}
    public final android.text.Layout.Alignment getAlignment() { return null; }
    public abstract int getBottomPadding();
    public final int getBreakStrategy() { return 0; }
    public void getCursorPath(int p0, android.graphics.Path p1, java.lang.CharSequence p2) {}
    public abstract int getEllipsisCount(int p0);
    public abstract int getEllipsisStart(int p0);
    public final android.text.TextUtils.TruncateAt getEllipsize() { return null; }
    public int getEllipsizedWidth() { return 0; }
    public int getEndHyphenEdit(int p0) { return 0; }
    public int getHeight() { return 0; }
    public int getHeight(boolean p0) { return 0; }
    public final int getHyphenationFrequency() { return 0; }
    public int getIndentAdjust(int p0, android.text.Layout.Alignment p1) { return 0; }
    public final int getJustificationMode() { return 0; }
    public final int[] getLeftIndents() { return null; }
    public final int getLineAscent(int p0) { return 0; }
    public final int getLineBaseline(int p0) { return 0; }
    public final int getLineBottom(int p0) { return 0; }
    public int getLineBottom(int p0, boolean p1) { return 0; }
    public int getLineBounds(int p0, android.graphics.Rect p1) { return 0; }
    public android.graphics.text.LineBreakConfig getLineBreakConfig() { return null; }
    public abstract boolean getLineContainsTab(int p0);
    public abstract int getLineCount();
    public abstract int getLineDescent(int p0);
    public abstract android.text.Layout.Directions getLineDirections(int p0);
    public final int getLineEnd(int p0) { return 0; }
    public int getLineExtra(int p0) { return 0; }
    public int getLineForOffset(int p0) { return 0; }
    public int getLineForVertical(int p0) { return 0; }
    public float getLineLeft(int p0) { return 0.0f; }
    public int getLineLetterSpacingUnitCount(int p0, boolean p1) { return 0; }
    public float getLineMax(int p0) { return 0.0f; }
    public long getLineRangeForDraw(android.graphics.Canvas p0) { return 0L; }
    public float getLineRight(int p0) { return 0.0f; }
    public final float getLineSpacingAmount() { return 0.0f; }
    public final float getLineSpacingMultiplier() { return 0.0f; }
    public abstract int getLineStart(int p0);
    public abstract int getLineTop(int p0);
    public int getLineVisibleEnd(int p0) { return 0; }
    public float getLineWidth(int p0) { return 0.0f; }
    public final int getMaxLines() { return 0; }
    public android.graphics.Paint.FontMetrics getMinimumFontMetrics() { return null; }
    public int getOffsetForHorizontal(int p0, float p1) { return 0; }
    public int getOffsetForHorizontal(int p0, float p1, boolean p2) { return 0; }
    public int getOffsetToLeftOf(int p0) { return 0; }
    public int getOffsetToRightOf(int p0) { return 0; }
    public final android.text.TextPaint getPaint() { return null; }
    public final android.text.Layout.Alignment getParagraphAlignment(int p0) { return null; }
    public abstract int getParagraphDirection(int p0);
    public final int getParagraphLeft(int p0) { return 0; }
    public final int getParagraphRight(int p0) { return 0; }
    public float getPrimaryHorizontal(int p0) { return 0.0f; }
    public float getPrimaryHorizontal(int p0, boolean p1) { return 0.0f; }
    public int[] getRangeForRect(android.graphics.RectF p0, android.text.SegmentFinder p1, android.text.Layout.TextInclusionStrategy p2) { return null; }
    public final int[] getRightIndents() { return null; }
    public long getRunRange(int p0) { return 0L; }
    public float getSecondaryHorizontal(int p0) { return 0.0f; }
    public float getSecondaryHorizontal(int p0, boolean p1) { return 0.0f; }
    public final void getSelection(int p0, int p1, android.text.Layout.SelectionRectangleConsumer p2) {}
    public void getSelectionPath(int p0, int p1, android.graphics.Path p2) {}
    public boolean getShiftDrawingOffsetForStartOverhang() { return false; }
    public final float getSpacingAdd() { return 0.0f; }
    public final float getSpacingMultiplier() { return 0.0f; }
    public int getStartHyphenEdit(int p0) { return 0; }
    public final java.lang.CharSequence getText() { return null; }
    public final android.text.TextDirectionHeuristic getTextDirectionHeuristic() { return null; }
    public abstract int getTopPadding();
    public boolean getUseBoundsForWidth() { return false; }
    public final int getWidth() { return 0; }
    public final void increaseWidthTo(int p0) {}
    public boolean isFallbackLineSpacingEnabled() { return false; }
    public final boolean isFontPaddingIncluded() { return false; }
    public boolean isLevelBoundary(int p0) { return false; }
    public boolean isRtlCharAt(int p0) { return false; }
    protected final boolean isSpanned() { return false; }
    public boolean primaryIsTrailingPrevious(int p0) { return false; }
    public boolean[] primaryIsTrailingPreviousAllLineOffsets(int p0) { return null; }
    void replaceWith(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5) {}
    public boolean shouldClampCursor(int p0) { return false; }

    public static enum Alignment {
        ALIGN_CENTER,
        ALIGN_LEFT,
        ALIGN_NORMAL,
        ALIGN_OPPOSITE,
        ALIGN_RIGHT;
        private static final android.text.Layout.Alignment[] $VALUES = null;
        private Alignment() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BreakStrategy {
    }

    public static final class Builder {
        private android.text.Layout.Alignment mAlignment;
        private int mBreakStrategy;
        private android.text.TextUtils.TruncateAt mEllipsize;
        private int mEllipsizedWidth;
        private final int mEnd = 0;
        private boolean mFallbackLineSpacing;
        private int mHyphenationFrequency;
        private boolean mIncludePad;
        private int mJustificationMode;
        private int[] mLeftIndents;
        private android.graphics.text.LineBreakConfig mLineBreakConfig;
        private int mMaxLines;
        private android.graphics.Paint.FontMetrics mMinimumFontMetrics;
        private final android.text.TextPaint mPaint = null;
        private int[] mRightIndents;
        private boolean mShiftDrawingOffsetForStartOverhang;
        private float mSpacingAdd;
        private float mSpacingMult;
        private final int mStart = 0;
        private final java.lang.CharSequence mText = null;
        private android.text.TextDirectionHeuristic mTextDir;
        private boolean mUseBoundsForWidth;
        private final int mWidth = 0;
        public Builder(java.lang.CharSequence p0, int p1, int p2, android.text.TextPaint p3, int p4) {}
        private android.text.BoringLayout.Metrics isBoring() { return null; }
        public android.text.Layout build() { return null; }
        public android.text.Layout.Builder setAlignment(android.text.Layout.Alignment p0) { return null; }
        public android.text.Layout.Builder setBreakStrategy(int p0) { return null; }
        public android.text.Layout.Builder setEllipsize(android.text.TextUtils.TruncateAt p0) { return null; }
        public android.text.Layout.Builder setEllipsizedWidth(int p0) { return null; }
        public android.text.Layout.Builder setFallbackLineSpacingEnabled(boolean p0) { return null; }
        public android.text.Layout.Builder setFontPaddingIncluded(boolean p0) { return null; }
        public android.text.Layout.Builder setHyphenationFrequency(int p0) { return null; }
        public android.text.Layout.Builder setJustificationMode(int p0) { return null; }
        public android.text.Layout.Builder setLeftIndents(int[] p0) { return null; }
        public android.text.Layout.Builder setLineBreakConfig(android.graphics.text.LineBreakConfig p0) { return null; }
        public android.text.Layout.Builder setLineSpacingAmount(float p0) { return null; }
        public android.text.Layout.Builder setLineSpacingMultiplier(float p0) { return null; }
        public android.text.Layout.Builder setMaxLines(int p0) { return null; }
        public android.text.Layout.Builder setMinimumFontMetrics(android.graphics.Paint.FontMetrics p0) { return null; }
        public android.text.Layout.Builder setRightIndents(int[] p0) { return null; }
        public android.text.Layout.Builder setShiftDrawingOffsetForStartOverhang(boolean p0) { return null; }
        public android.text.Layout.Builder setTextDirectionHeuristic(android.text.TextDirectionHeuristic p0) { return null; }
        public android.text.Layout.Builder setUseBoundsForWidth(boolean p0) { return null; }
    }

    private static interface CharacterBoundsListener {
        public void onCharacterBounds(int p0, int p1, float p2, float p3, float p4, float p5);
        default public void onEnd() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Direction {
    }

    public static class Directions {
        public int[] mDirections;
        public Directions(int[] p0) {}
        public int getRunCount() { return 0; }
        public int getRunLength(int p0) { return 0; }
        public int getRunLevel(int p0) { return 0; }
        public int getRunStart(int p0) { return 0; }
        public boolean isRunRtl(int p0) { return false; }
    }

    static class Ellipsizer implements java.lang.CharSequence, android.text.GetChars {
        android.text.Layout mLayout;
        android.text.TextUtils.TruncateAt mMethod;
        java.lang.CharSequence mText;
        int mWidth;
        public Ellipsizer(java.lang.CharSequence p0) {}
        public char charAt(int p0) { return 0; }
        public void getChars(int p0, int p1, char[] p2, int p3) {}
        public int length() { return 0; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public java.lang.String toString() { return null; }
    }

    private class HorizontalMeasurementProvider {
        private float[] mHorizontals;
        private final int mLine = 0;
        private int mLineStartOffset;
        private final boolean mPrimary = false;
        HorizontalMeasurementProvider(android.text.Layout p0, int p1, boolean p2) {}
        private void init() {}
        float get(int p0) { return 0.0f; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface HyphenationFrequency {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface JustificationMode {
    }

    @java.lang.FunctionalInterface
    public static interface SelectionRectangleConsumer {
        public void accept(float p0, float p1, float p2, float p3, int p4);
    }

    static class SpannedEllipsizer extends android.text.Layout.Ellipsizer implements android.text.Spanned {
        private android.text.Spanned mSpanned;
        public SpannedEllipsizer(java.lang.CharSequence p0) { super(null); }
        public int getSpanEnd(java.lang.Object p0) { return 0; }
        public int getSpanFlags(java.lang.Object p0) { return 0; }
        public int getSpanStart(java.lang.Object p0) { return 0; }
        public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
        public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
    }

    public static class TabStops {
        private float mIncrement;
        private int mNumStops;
        private float[] mStops;
        public TabStops(float p0, java.lang.Object[] p1) {}
        public static float nextDefaultStop(float p0, float p1) { return 0.0f; }
        float nextTab(float p0) { return 0.0f; }
        void reset(float p0, java.lang.Object[] p1) {}
    }

    @java.lang.FunctionalInterface
    public static interface TextInclusionStrategy {
        public boolean isSegmentInside(android.graphics.RectF p0, android.graphics.RectF p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TextSelectionLayout {
    }
}

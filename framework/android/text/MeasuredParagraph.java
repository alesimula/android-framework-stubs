package android.text;

public class MeasuredParagraph {
    private static final char OBJECT_REPLACEMENT_CHARACTER = (char)0xfffc;
    private static final android.util.Pools.SynchronizedPool<android.text.MeasuredParagraph> sPool = null;
    private android.graphics.Paint.FontMetricsInt mCachedFm;
    private final android.text.TextPaint mCachedPaint = null;
    private char[] mCopiedBuffer;
    private android.text.AutoGrowArray.IntArray mFontMetrics;
    private android.text.AutoGrowArray.ByteArray mLevels;
    private final android.graphics.text.LineBreakConfig.Builder mLineBreakConfigBuilder = null;
    private boolean mLtrWithoutBidi;
    private android.graphics.text.MeasuredText mMeasuredText;
    private int mParaDir;
    private android.text.AutoGrowArray.IntArray mSpanEndCache;
    private android.text.Spanned mSpanned;
    private int mTextLength;
    private int mTextStart;
    private float mWholeWidth;
    private android.text.AutoGrowArray.FloatArray mWidths;
    private MeasuredParagraph() {}
    private void applyMetricsAffectingSpan(android.text.TextPaint p0, android.graphics.text.LineBreakConfig p1, android.text.style.MetricAffectingSpan[] p2, android.text.style.LineBreakConfigSpan[] p3, int p4, int p5, android.graphics.text.MeasuredText.Builder p6, android.text.MeasuredParagraph.StyleRunCallback p7) {}
    private void applyReplacementRun(android.text.style.ReplacementSpan p0, int p1, int p2, android.text.TextPaint p3, android.graphics.text.MeasuredText.Builder p4, android.text.MeasuredParagraph.StyleRunCallback p5) {}
    private void applyStyleRun(int p0, int p1, android.text.TextPaint p2, android.graphics.text.LineBreakConfig p3, android.graphics.text.MeasuredText.Builder p4, android.text.MeasuredParagraph.StyleRunCallback p5) {}
    public static android.text.MeasuredParagraph buildForBidi(java.lang.CharSequence p0, int p1, int p2, android.text.TextDirectionHeuristic p3, android.text.MeasuredParagraph p4) { return null; }
    public static android.text.MeasuredParagraph buildForMeasurement(android.text.TextPaint p0, java.lang.CharSequence p1, int p2, int p3, android.text.TextDirectionHeuristic p4, android.text.MeasuredParagraph p5) { return null; }
    public static android.text.MeasuredParagraph buildForStaticLayout(android.text.TextPaint p0, android.graphics.text.LineBreakConfig p1, java.lang.CharSequence p2, int p3, int p4, android.text.TextDirectionHeuristic p5, int p6, boolean p7, boolean p8, android.text.MeasuredParagraph p9, android.text.MeasuredParagraph p10) { return null; }
    private static android.text.MeasuredParagraph buildForStaticLayoutInternal(android.text.TextPaint p0, android.graphics.text.LineBreakConfig p1, java.lang.CharSequence p2, int p3, int p4, android.text.TextDirectionHeuristic p5, int p6, boolean p7, boolean p8, android.text.MeasuredParagraph p9, android.text.MeasuredParagraph p10, android.text.MeasuredParagraph.StyleRunCallback p11) { return null; }
    public static android.text.MeasuredParagraph buildForStaticLayoutTest(android.text.TextPaint p0, android.graphics.text.LineBreakConfig p1, java.lang.CharSequence p2, int p3, int p4, android.text.TextDirectionHeuristic p5, int p6, boolean p7, android.text.MeasuredParagraph.StyleRunCallback p8) { return null; }
    private static android.text.MeasuredParagraph obtain() { return null; }
    private void reset() {}
    private void resetAndAnalyzeBidi(java.lang.CharSequence p0, int p1, int p2, android.text.TextDirectionHeuristic p3) {}
    int breakText(int p0, boolean p1, float p2) { return 0; }
    public void getBounds(int p0, int p1, android.graphics.Rect p2) {}
    public float getCharWidthAt(int p0) { return 0.0f; }
    public char[] getChars() { return null; }
    public android.text.Layout.Directions getDirections(int p0, int p1) { return null; }
    public android.text.AutoGrowArray.IntArray getFontMetrics() { return null; }
    public void getFontMetricsInt(int p0, int p1, android.graphics.Paint.FontMetricsInt p2) {}
    public android.graphics.text.MeasuredText getMeasuredText() { return null; }
    public int getMemoryUsage() { return 0; }
    public int getParagraphDir() { return 0; }
    public android.text.AutoGrowArray.IntArray getSpanEndCache() { return null; }
    public int getTextLength() { return 0; }
    public float getWholeWidth() { return 0.0f; }
    public float getWidth(int p0, int p1) { return 0.0f; }
    public android.text.AutoGrowArray.FloatArray getWidths() { return null; }
    float measure(int p0, int p1) { return 0.0f; }
    public void recycle() {}
    public void release() {}

    public static interface StyleRunCallback {
        public void onAppendReplacementRun(android.graphics.Paint p0, int p1, float p2);
        public void onAppendStyleRun(android.graphics.Paint p0, android.graphics.text.LineBreakConfig p1, int p2, boolean p3);
    }
}

package android.text;

public class TextLine {
    private static final boolean DEBUG = false;
    private static final char TAB_CHAR = (char)0x0009;
    private static final int TAB_INCREMENT = 20;
    private static final android.text.TextLine[] sCached = null;
    private final android.text.TextPaint mActivePaint = null;
    private float mAddedLetterSpacingInPx;
    private float mAddedWordSpacingInPx;
    private final android.text.SpanSet<android.text.style.CharacterStyle> mCharacterStyleSpanSet = null;
    private char[] mChars;
    private boolean mCharsValid;
    private android.text.PrecomputedText mComputed;
    private final android.text.TextLine.DecorationInfo mDecorationInfo = null;
    private final java.util.ArrayList<android.text.TextLine.DecorationInfo> mDecorations = null;
    private int mDir;
    private android.text.Layout.Directions mDirections;
    private int mEllipsisEnd;
    private int mEllipsisStart;
    private boolean mHasTabs;
    private boolean mIsJustifying;
    private int mLen;
    private final android.text.SpanSet<android.text.style.MetricAffectingSpan> mMetricAffectingSpanSpanSet = null;
    private android.text.TextPaint mPaint;
    private final android.text.SpanSet<android.text.style.ReplacementSpan> mReplacementSpanSpanSet = null;
    private android.graphics.Paint.RunInfo mRunInfo;
    private android.text.Spanned mSpanned;
    private int mStart;
    private android.text.Layout.TabStops mTabs;
    private java.lang.CharSequence mText;
    private android.graphics.RectF mTmpRectForMeasure;
    private android.graphics.RectF mTmpRectForPaintAPI;
    private android.graphics.Rect mTmpRectForPrecompute;
    private boolean mUseFallbackExtent;
    private final android.text.TextPaint mWorkPaint = null;
    public TextLine() {}
    private int adjustEndHyphenEdit(int p0, int p1) { return 0; }
    private int adjustStartHyphenEdit(int p0, int p1) { return 0; }
    public static int calculateRunFlag(int p0, int p1, int p2) { return 0; }
    private char charAt(int p0) { return 0; }
    private int countStretchableSpaces(int p0, int p1) { return 0; }
    private float drawRun(android.graphics.Canvas p0, int p1, int p2, boolean p3, float p4, int p5, int p6, int p7, boolean p8, int p9) { return 0.0f; }
    private static void drawStroke(android.text.TextPaint p0, android.graphics.Canvas p1, int p2, float p3, float p4, float p5, float p6, float p7) {}
    private void drawTextRun(android.graphics.Canvas p0, android.text.TextPaint p1, int p2, int p3, int p4, int p5, boolean p6, float p7, int p8) {}
    private static boolean equalAttributes(android.text.TextPaint p0, android.text.TextPaint p1) { return false; }
    private static void expandMetricsFromPaint(android.graphics.Paint.FontMetricsInt p0, android.text.TextPaint p1) {}
    private void expandMetricsFromPaint(android.text.TextPaint p0, int p1, int p2, int p3, int p4, boolean p5, android.graphics.Paint.FontMetricsInt p6) {}
    private void extractDecorationInfo(android.text.TextPaint p0, android.text.TextLine.DecorationInfo p1) {}
    private int getOffsetBeforeAfter(int p0, int p1, int p2, boolean p3, int p4, boolean p5) { return 0; }
    private float getRunAdvance(android.text.TextPaint p0, int p1, int p2, int p3, int p4, boolean p5, int p6, float[] p7, int p8, android.graphics.RectF p9, android.text.TextLine.LineInfo p10) { return 0.0f; }
    private float handleReplacement(android.text.style.ReplacementSpan p0, android.text.TextPaint p1, int p2, int p3, boolean p4, android.graphics.Canvas p5, float p6, int p7, int p8, int p9, android.graphics.Paint.FontMetricsInt p10, boolean p11) { return 0.0f; }
    private float handleRun(int p0, int p1, int p2, boolean p3, android.graphics.Canvas p4, android.text.TextShaper.GlyphsConsumer p5, float p6, int p7, int p8, int p9, android.graphics.Paint.FontMetricsInt p10, android.graphics.RectF p11, boolean p12, float[] p13, int p14, android.text.TextLine.LineInfo p15, int p16) { return 0.0f; }
    private float handleText(android.text.TextPaint p0, int p1, int p2, int p3, int p4, boolean p5, android.graphics.Canvas p6, android.text.TextShaper.GlyphsConsumer p7, float p8, int p9, int p10, int p11, android.graphics.Paint.FontMetricsInt p12, android.graphics.RectF p13, boolean p14, int p15, java.util.ArrayList<android.text.TextLine.DecorationInfo> p16, float[] p17, int p18, android.text.TextLine.LineInfo p19, int p20) { return 0.0f; }
    public static boolean isLineEndSpace(char p0) { return false; }
    private boolean isStretchableWhitespace(int p0) { return false; }
    private float measureRun(int p0, int p1, int p2, boolean p3, android.graphics.Paint.FontMetricsInt p4, android.graphics.RectF p5, float[] p6, int p7, float p8, android.text.TextLine.LineInfo p9, int p10) { return 0.0f; }
    public static android.text.TextLine obtain() { return null; }
    public static android.text.TextLine recycle(android.text.TextLine p0) { return null; }
    public static int resolveRunFlagForSubSequence(int p0, boolean p1, int p2, int p3, int p4, int p5) { return 0; }
    private float shapeRun(android.text.TextShaper.GlyphsConsumer p0, int p1, int p2, boolean p3, float p4, boolean p5, int p6) { return 0.0f; }
    private void shapeTextRun(android.text.TextShaper.GlyphsConsumer p0, android.text.TextPaint p1, int p2, int p3, int p4, int p5, boolean p6, float p7) {}
    static void updateMetrics(android.graphics.Paint.FontMetricsInt p0, int p1, int p2, int p3, int p4, int p5) {}
    void draw(android.graphics.Canvas p0, float p1, int p2, int p3, int p4) {}
    public float getAddedLetterSpacingInPx() { return 0.0f; }
    public float getAddedWordSpacingInPx() { return 0.0f; }
    int getOffsetToLeftRightOf(int p0, boolean p1) { return 0; }
    public boolean isJustifying() { return false; }
    public void justify(int p0, float p1) {}
    public float measure(int p0, boolean p1, android.graphics.Paint.FontMetricsInt p2, android.graphics.RectF p3, android.text.TextLine.LineInfo p4) { return 0.0f; }
    public void measureAllBounds(float[] p0, float[] p1) {}
    public float[] measureAllOffsets(boolean[] p0, android.graphics.Paint.FontMetricsInt p1) { return null; }
    public float metrics(android.graphics.Paint.FontMetricsInt p0, android.graphics.RectF p1, boolean p2, android.text.TextLine.LineInfo p3) { return 0.0f; }
    float nextTab(float p0) { return 0.0f; }
    public void set(android.text.TextPaint p0, java.lang.CharSequence p1, int p2, int p3, int p4, android.text.Layout.Directions p5, boolean p6, android.text.Layout.TabStops p7, int p8, int p9, boolean p10) {}
    void shape(android.text.TextShaper.GlyphsConsumer p0) {}

    private static final class DecorationInfo {
        public int end;
        public boolean isStrikeThruText;
        public boolean isUnderlineText;
        public int start;
        public int underlineColor;
        public float underlineThickness;
        private DecorationInfo() {}
        public android.text.TextLine.DecorationInfo copyInfo() { return null; }
        public boolean hasDecoration() { return false; }
    }

    public static final class LineInfo {
        private int mClusterCount;
        public LineInfo() {}
        public int getClusterCount() { return 0; }
        public void setClusterCount(int p0) {}
    }
}

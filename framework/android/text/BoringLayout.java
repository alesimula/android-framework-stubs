package android.text;

public class BoringLayout extends android.text.Layout implements android.text.TextUtils.EllipsizeCallback {
    int mBottom;
    private int mBottomPadding;
    int mDesc;
    private java.lang.String mDirect;
    private final android.graphics.RectF mDrawingBounds = null;
    private int mEllipsizedCount;
    private int mEllipsizedStart;
    private int mEllipsizedWidth;
    private float mMax;
    private android.graphics.Paint mPaint;
    private int mTopPadding;
    private boolean mUseFallbackLineSpacing;
    public BoringLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    public BoringLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7, android.text.TextUtils.TruncateAt p8, int p9) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    public BoringLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7, android.text.TextUtils.TruncateAt p8, int p9, boolean p10) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    public BoringLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, boolean p6, boolean p7, int p8, android.text.TextUtils.TruncateAt p9, android.text.BoringLayout.Metrics p10, boolean p11, boolean p12, android.graphics.Paint.FontMetrics p13) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    BoringLayout(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, android.text.TextDirectionHeuristic p4, float p5, float p6, boolean p7, boolean p8, int p9, android.text.TextUtils.TruncateAt p10, int p11, int p12, int p13, int[] p14, int[] p15, int p16, android.graphics.text.LineBreakConfig p17, android.text.BoringLayout.Metrics p18, boolean p19, boolean p20, android.graphics.Paint.FontMetrics p21) { super((java.lang.CharSequence)null, (android.text.TextPaint)null, 0, (android.text.Layout.Alignment)null, 0.0f, 0.0f); }
    private static boolean hasAnyInterestingChars(java.lang.CharSequence p0, int p1) { return false; }
    public static android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence p0, android.text.TextPaint p1) { return null; }
    public static android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence p0, android.text.TextPaint p1, android.text.BoringLayout.Metrics p2) { return null; }
    public static android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence p0, android.text.TextPaint p1, android.text.TextDirectionHeuristic p2, android.text.BoringLayout.Metrics p3) { return null; }
    public static android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence p0, android.text.TextPaint p1, android.text.TextDirectionHeuristic p2, boolean p3, android.graphics.Paint.FontMetrics p4, android.text.BoringLayout.Metrics p5) { return null; }
    public static android.text.BoringLayout.Metrics isBoring(java.lang.CharSequence p0, android.text.TextPaint p1, android.text.TextDirectionHeuristic p2, boolean p3, android.text.BoringLayout.Metrics p4) { return null; }
    public static android.text.BoringLayout make(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7) { return null; }
    public static android.text.BoringLayout make(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7, android.text.TextUtils.TruncateAt p8, int p9) { return null; }
    public static android.text.BoringLayout make(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, android.text.BoringLayout.Metrics p4, boolean p5, android.text.TextUtils.TruncateAt p6, int p7, boolean p8) { return null; }
    public android.graphics.RectF computeDrawingBoundingBox() { return null; }
    public void draw(android.graphics.Canvas p0, android.graphics.Path p1, android.graphics.Paint p2, int p3) {}
    public void ellipsized(int p0, int p1) {}
    public int getBottomPadding() { return 0; }
    public int getEllipsisCount(int p0) { return 0; }
    public int getEllipsisStart(int p0) { return 0; }
    public int getEllipsizedWidth() { return 0; }
    public int getHeight() { return 0; }
    public boolean getLineContainsTab(int p0) { return false; }
    public int getLineCount() { return 0; }
    public int getLineDescent(int p0) { return 0; }
    public final android.text.Layout.Directions getLineDirections(int p0) { return null; }
    public float getLineMax(int p0) { return 0.0f; }
    public int getLineStart(int p0) { return 0; }
    public int getLineTop(int p0) { return 0; }
    public float getLineWidth(int p0) { return 0.0f; }
    public int getParagraphDirection(int p0) { return 0; }
    public int getTopPadding() { return 0; }
    void init(java.lang.CharSequence p0, android.text.TextPaint p1, android.text.Layout.Alignment p2, android.text.BoringLayout.Metrics p3, boolean p4, boolean p5, boolean p6) {}
    public boolean isFallbackLineSpacingEnabled() { return false; }
    public android.text.BoringLayout replaceOrMake(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7) { return null; }
    public android.text.BoringLayout replaceOrMake(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7, android.text.TextUtils.TruncateAt p8, int p9) { return null; }
    public android.text.BoringLayout replaceOrMake(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, float p4, float p5, android.text.BoringLayout.Metrics p6, boolean p7, android.text.TextUtils.TruncateAt p8, int p9, boolean p10, boolean p11, android.graphics.Paint.FontMetrics p12) { return null; }
    public android.text.BoringLayout replaceOrMake(java.lang.CharSequence p0, android.text.TextPaint p1, int p2, android.text.Layout.Alignment p3, android.text.BoringLayout.Metrics p4, boolean p5, android.text.TextUtils.TruncateAt p6, int p7, boolean p8) { return null; }

    public static class Metrics extends android.graphics.Paint.FontMetricsInt {
        private final android.graphics.RectF mDrawingBounds = null;
        public int width;
        public Metrics() { super(); }
        private void reset() {}
        public android.graphics.RectF getDrawingBoundingBox() { return null; }
        public java.lang.String toString() { return null; }
    }
}

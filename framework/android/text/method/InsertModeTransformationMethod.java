package android.text.method;

public class InsertModeTransformationMethod implements android.text.method.TransformationMethod, android.text.TextWatcher {
    private int mEnd;
    private final android.text.method.TransformationMethod mOldTransformationMethod = null;
    private final boolean mSingleLine = false;
    private int mStart;
    private InsertModeTransformationMethod(int p0, int p1, boolean p2, android.text.method.TransformationMethod p3) {}
    public InsertModeTransformationMethod(int p0, boolean p1, android.text.method.TransformationMethod p2) {}
    private java.lang.CharSequence getPlaceholderText(android.view.View p0) { return null; }
    private static boolean intersect(int p0, int p1, int p2, int p3) { return false; }
    public void afterTextChanged(android.text.Editable p0) {}
    public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public android.text.method.TransformationMethod getOldTransformationMethod() { return null; }
    public java.lang.CharSequence getTransformation(java.lang.CharSequence p0, android.view.View p1) { return null; }
    public void onFocusChanged(android.view.View p0, java.lang.CharSequence p1, boolean p2, int p3, android.graphics.Rect p4) {}
    public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    public android.text.method.InsertModeTransformationMethod update(android.text.method.TransformationMethod p0, boolean p1) { return null; }

    public static class SingleLinePlaceholderSpan extends android.text.style.ReplacementSpan {
        private final int mWidth = 0;
        SingleLinePlaceholderSpan(int p0) { super(); }
        public void draw(android.graphics.Canvas p0, java.lang.CharSequence p1, int p2, int p3, float p4, int p5, int p6, int p7, android.graphics.Paint p8) {}
        public int getSize(android.graphics.Paint p0, java.lang.CharSequence p1, int p2, int p3, android.graphics.Paint.FontMetricsInt p4) { return 0; }
    }

    public class TransformedText implements android.text.method.OffsetMapping, android.text.Spanned {
        private final java.lang.CharSequence mOriginal = null;
        private final java.lang.CharSequence mPlaceholder = null;
        private final android.text.Spanned mSpannedOriginal = null;
        private final android.text.Spanned mSpannedPlaceholder = null;
        TransformedText(android.text.method.InsertModeTransformationMethod p0, java.lang.CharSequence p1, java.lang.CharSequence p2) {}
        public char charAt(int p0) { return 0; }
        public int getHighlightEnd() { return 0; }
        public int getHighlightStart() { return 0; }
        public int getSpanEnd(java.lang.Object p0) { return 0; }
        public int getSpanFlags(java.lang.Object p0) { return 0; }
        public int getSpanStart(java.lang.Object p0) { return 0; }
        public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
        public int length() { return 0; }
        public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
        public int originalToTransformed(int p0, int p1) { return 0; }
        public void originalToTransformed(android.text.method.OffsetMapping.TextUpdate p0) {}
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public java.lang.String toString() { return null; }
        public int transformedToOriginal(int p0, int p1) { return 0; }
    }
}

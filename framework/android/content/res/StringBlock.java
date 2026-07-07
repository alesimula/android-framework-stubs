package android.content.res;

public final class StringBlock implements java.io.Closeable {
    private static final java.lang.String TAG = "AssetManager";
    private static final boolean localLOGV = false;
    private long mNative;
    private boolean mOpen;
    private final boolean mOwnsNative = false;
    private android.util.SparseArray<java.lang.CharSequence> mSparseStrings;
    private java.lang.CharSequence[] mStrings;
    android.content.res.StringBlock.StyleIDs mStyleIDs;
    private final boolean mUseSparse = false;
    public StringBlock(long p0, boolean p1) {}
    public StringBlock(byte[] p0, int p1, int p2, boolean p3) {}
    public StringBlock(byte[] p0, boolean p1) {}
    private static void addParagraphSpan(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
    private static java.lang.CharSequence applyFontWeightAdjustment(java.lang.CharSequence p0) { return null; }
    private java.lang.CharSequence applyStyles(java.lang.String p0, int[] p1, android.content.res.StringBlock.StyleIDs p2) { return null; }
    private static android.text.style.CharacterStyle getColor(java.lang.String p0, boolean p1) { return null; }
    private static native long nativeCreate(byte[] p0, int p1, int p2);
    private static native void nativeDestroy(long p0);
    private static native int nativeGetSize(long p0);
    private static native java.lang.String nativeGetString(long p0, int p1);
    private static native int[] nativeGetStyle(long p0, int p1);
    private static java.lang.String subtag(java.lang.String p0, java.lang.String p1) { return null; }
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
    @java.lang.Deprecated
    public java.lang.CharSequence get(int p0) { return null; }
    public java.lang.CharSequence getSequence(int p0) { return null; }

    private static class Height implements android.text.style.LineHeightSpan.WithDensity {
        private static float sProportion;
        private int mSize;
        public Height(int p0) {}
        public void chooseHeight(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, android.graphics.Paint.FontMetricsInt p5) {}
        public void chooseHeight(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, android.graphics.Paint.FontMetricsInt p5, android.text.TextPaint p6) {}
    }

    static final class StyleIDs {
        private int bigId;
        private int boldId;
        private int italicId;
        private int listItemId;
        private int mNoBreakId;
        private int mNoHyphenId;
        private int marqueeId;
        private int smallId;
        private int strikeId;
        private int subId;
        private int supId;
        private int ttId;
        private int underlineId;
        StyleIDs() {}
    }
}

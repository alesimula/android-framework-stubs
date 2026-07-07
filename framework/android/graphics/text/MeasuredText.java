package android.graphics.text;

public class MeasuredText {
    private static final java.lang.String TAG = "MeasuredText";
    private final int mBottom = 0;
    private final char[] mChars = null;
    private final boolean mComputeBounds = false;
    private final boolean mComputeHyphenation = false;
    private final boolean mComputeLayout = false;
    private final long mNativePtr = 0L;
    private final int mTop = 0;
    private MeasuredText(long p0, char[] p1, boolean p2, boolean p3, boolean p4, int p5, int p6) {}
    private static native void nGetBounds(long p0, char[] p1, int p2, int p3, android.graphics.Rect p4);
    private static native float nGetCharWidthAt(long p0, int p1);
    private static native long nGetExtent(long p0, char[] p1, int p2, int p3);
    private static native int nGetMemoryUsage(long p0);
    private static native long nGetReleaseFunc();
    private static native float nGetWidth(long p0, int p1, int p2);
    private void offsetCheck(int p0) {}
    private void rangeCheck(int p0, int p1) {}
    private void throwOffsetError(int p0) {}
    private void throwRangeError(int p0, int p1) {}
    public void getBounds(int p0, int p1, android.graphics.Rect p2) {}
    public float getCharWidthAt(int p0) { return 0.0f; }
    public char[] getChars() { return null; }
    public void getFontMetricsInt(int p0, int p1, android.graphics.Paint.FontMetricsInt p2) {}
    public int getMemoryUsage() { return 0; }
    public long getNativePtr() { return 0L; }
    public float getWidth(int p0, int p1) { return 0.0f; }

    public static final class Builder {
        public static final int HYPHENATION_MODE_FAST = 2;
        public static final int HYPHENATION_MODE_NONE = 0;
        public static final int HYPHENATION_MODE_NORMAL = 1;
        private int mBottom;
        private android.graphics.Paint.FontMetricsInt mCachedMetrics;
        private boolean mComputeBounds;
        private boolean mComputeHyphenation;
        private boolean mComputeLayout;
        private int mCurrentOffset;
        private boolean mFastHyphenation;
        private android.graphics.text.MeasuredText mHintMt;
        private long mNativePtr;
        private final char[] mText = null;
        private int mTop;
        public Builder(android.graphics.text.MeasuredText p0) {}
        public Builder(char[] p0) {}
        private void ensureNativePtrNoReuse() {}
        private static native void nAddReplacementRun(long p0, long p1, int p2, int p3, float p4);
        private static native void nAddStyleRun(long p0, long p1, int p2, int p3, boolean p4, int p5, int p6, boolean p7);
        private static native long nBuildMeasuredText(long p0, long p1, char[] p2, boolean p3, boolean p4, boolean p5, boolean p6);
        private static native void nFreeBuilder(long p0);
        private static native long nInitBuilder();
        public android.graphics.text.MeasuredText.Builder appendReplacementRun(android.graphics.Paint p0, int p1, float p2) { return null; }
        public android.graphics.text.MeasuredText.Builder appendStyleRun(android.graphics.Paint p0, int p1, boolean p2) { return null; }
        public android.graphics.text.MeasuredText.Builder appendStyleRun(android.graphics.Paint p0, android.graphics.text.LineBreakConfig p1, int p2, boolean p3) { return null; }
        public android.graphics.text.MeasuredText build() { return null; }
        public android.graphics.text.MeasuredText.Builder setComputeBounds(boolean p0) { return null; }
        public android.graphics.text.MeasuredText.Builder setComputeHyphenation(int p0) { return null; }
        @java.lang.Deprecated
        public android.graphics.text.MeasuredText.Builder setComputeHyphenation(boolean p0) { return null; }
        public android.graphics.text.MeasuredText.Builder setComputeLayout(boolean p0) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HyphenationMode {
        }
    }
}

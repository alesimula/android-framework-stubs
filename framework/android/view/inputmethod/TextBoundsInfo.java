package android.view.inputmethod;

public final class TextBoundsInfo implements android.os.Parcelable {
    private static final int BIDI_LEVEL_MASK = 66584576;
    private static final int BIDI_LEVEL_SHIFT = 19;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.TextBoundsInfo> CREATOR = null;
    public static final int FLAG_CHARACTER_LINEFEED = 2;
    public static final int FLAG_CHARACTER_PUNCTUATION = 4;
    public static final int FLAG_CHARACTER_WHITESPACE = 1;
    private static final int FLAG_GRAPHEME_SEGMENT_END = 67108864;
    private static final int FLAG_GRAPHEME_SEGMENT_START = 134217728;
    public static final int FLAG_LINE_IS_RTL = 8;
    private static final int FLAG_LINE_SEGMENT_END = 1073741824;
    private static final int FLAG_LINE_SEGMENT_START = -2147483648;
    private static final int FLAG_WORD_SEGMENT_END = 268435456;
    private static final int FLAG_WORD_SEGMENT_START = 536870912;
    private static final int KNOWN_CHARACTER_FLAGS = 15;
    private static final java.lang.String TEXT_BOUNDS_INFO_KEY = "android.view.inputmethod.TextBoundsInfo";
    private final float[] mCharacterBounds = null;
    private final int mEnd = 0;
    private final android.text.SegmentFinder mGraphemeSegmentFinder = null;
    private final int[] mInternalCharacterFlags = null;
    private final android.text.SegmentFinder mLineSegmentFinder = null;
    private final float[] mMatrixValues = null;
    private final int mStart = 0;
    private final android.text.SegmentFinder mWordSegmentFinder = null;
    private TextBoundsInfo(android.os.Parcel p0) {}
    private TextBoundsInfo(android.view.inputmethod.TextBoundsInfo.Builder p0) {}
    public static android.view.inputmethod.TextBoundsInfo createFromBundle(android.os.Bundle p0) { return null; }
    private static android.text.SegmentFinder decodeSegmentFinder(int[] p0, int p1, int p2, int p3, int p4) { return null; }
    private static void encodeSegmentFinder(int[] p0, int p1, int p2, int p3, int p4, android.text.SegmentFinder p5) {}
    private void getBoundsForRange(int p0, int p1, android.graphics.RectF p2) {}
    private float getCursorHorizontalPosition(int p0, int p1, int p2, float p3, float p4) { return 0.0f; }
    private int getEndForRectWithinLine(int p0, int p1, android.graphics.RectF p2, android.text.SegmentFinder p3, android.text.Layout.TextInclusionStrategy p4) { return 0; }
    private int getEndForRectWithinRun(int p0, int p1, android.graphics.RectF p2, android.text.SegmentFinder p3, android.text.Layout.TextInclusionStrategy p4) { return 0; }
    private void getLineInfo(float p0, int[] p1, android.graphics.RectF p2) {}
    private int getStartForRectWithinLine(int p0, int p1, android.graphics.RectF p2, android.text.SegmentFinder p3, android.text.Layout.TextInclusionStrategy p4) { return 0; }
    private int getStartForRectWithinRun(int p0, int p1, android.graphics.RectF p2, android.text.SegmentFinder p3, android.text.Layout.TextInclusionStrategy p4) { return 0; }
    private static boolean isLineDirectionFlagConsistent(int[] p0, android.text.SegmentFinder p1, int p2, int p3) { return false; }
    private boolean primaryIsTrailingPrevious(int p0, int p1, int p2) { return false; }
    private static float verticalDistance(android.graphics.RectF p0, float p1) { return 0.0f; }
    public int describeContents() { return 0; }
    public int getCharacterBidiLevel(int p0) { return 0; }
    public void getCharacterBounds(int p0, android.graphics.RectF p1) {}
    public int getCharacterFlags(int p0) { return 0; }
    public int getEndIndex() { return 0; }
    public android.text.SegmentFinder getGraphemeSegmentFinder() { return null; }
    public android.text.SegmentFinder getLineSegmentFinder() { return null; }
    public void getMatrix(android.graphics.Matrix p0) {}
    public int getOffsetForPosition(float p0, float p1) { return 0; }
    public int[] getRangeForRect(android.graphics.RectF p0, android.text.SegmentFinder p1, android.text.Layout.TextInclusionStrategy p2) { return null; }
    public int getStartIndex() { return 0; }
    public android.text.SegmentFinder getWordSegmentFinder() { return null; }
    public android.os.Bundle toBundle() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int[] mCharacterBidiLevels;
        private float[] mCharacterBounds;
        private int[] mCharacterFlags;
        private int mEnd;
        private android.text.SegmentFinder mGraphemeSegmentFinder;
        private android.text.SegmentFinder mLineSegmentFinder;
        private boolean mMatrixInitialized;
        private final float[] mMatrixValues = null;
        private int mStart;
        private android.text.SegmentFinder mWordSegmentFinder;
        public Builder(int p0, int p1) {}
        public android.view.inputmethod.TextBoundsInfo build() { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder clear() { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setCharacterBidiLevel(int[] p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setCharacterBounds(float[] p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setCharacterFlags(int[] p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setGraphemeSegmentFinder(android.text.SegmentFinder p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setLineSegmentFinder(android.text.SegmentFinder p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setMatrix(android.graphics.Matrix p0) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setStartAndEnd(int p0, int p1) { return null; }
        public android.view.inputmethod.TextBoundsInfo.Builder setWordSegmentFinder(android.text.SegmentFinder p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CharacterFlags {
    }
}

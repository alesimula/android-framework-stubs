package android.view.inputmethod;

public final class CursorAnchorInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.CursorAnchorInfo> CREATOR = null;
    public static final int FLAG_HAS_INVISIBLE_REGION = 2;
    public static final int FLAG_HAS_VISIBLE_REGION = 1;
    public static final int FLAG_IS_RTL = 4;
    private final android.view.inputmethod.SparseRectFArray mCharacterBoundsArray = null;
    private final java.lang.CharSequence mComposingText = null;
    private final int mComposingTextStart = 0;
    private final android.view.inputmethod.EditorBoundsInfo mEditorBoundsInfo = null;
    private final int mHashCode = 0;
    private final float mInsertionMarkerBaseline = 0.0f;
    private final float mInsertionMarkerBottom = 0.0f;
    private final int mInsertionMarkerFlags = 0;
    private final float mInsertionMarkerHorizontal = 0.0f;
    private final float mInsertionMarkerTop = 0.0f;
    private final float[] mMatrixValues = null;
    private final int mSelectionEnd = 0;
    private final int mSelectionStart = 0;
    private final android.view.inputmethod.TextAppearanceInfo mTextAppearanceInfo = null;
    private final float[] mVisibleLineBounds = null;
    private CursorAnchorInfo(int p0, int p1, int p2, java.lang.CharSequence p3, int p4, float p5, float p6, float p7, float p8, android.view.inputmethod.SparseRectFArray p9, android.view.inputmethod.EditorBoundsInfo p10, float[] p11, float[] p12, android.view.inputmethod.TextAppearanceInfo p13) {}
    public CursorAnchorInfo(android.os.Parcel p0) {}
    private static boolean areSameFloatImpl(float p0, float p1) { return false; }
    private static float[] computeMatrixValues(android.graphics.Matrix p0, android.view.inputmethod.CursorAnchorInfo p1) { return null; }
    private static android.view.inputmethod.CursorAnchorInfo create(android.view.inputmethod.CursorAnchorInfo.Builder p0) { return null; }
    public static android.view.inputmethod.CursorAnchorInfo createForAdditionalParentMatrix(android.view.inputmethod.CursorAnchorInfo p0, android.graphics.Matrix p1) { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.RectF getCharacterBounds(int p0) { return null; }
    public int getCharacterBoundsFlags(int p0) { return 0; }
    public java.lang.CharSequence getComposingText() { return null; }
    public int getComposingTextStart() { return 0; }
    public android.view.inputmethod.EditorBoundsInfo getEditorBoundsInfo() { return null; }
    public float getInsertionMarkerBaseline() { return 0.0f; }
    public float getInsertionMarkerBottom() { return 0.0f; }
    public int getInsertionMarkerFlags() { return 0; }
    public float getInsertionMarkerHorizontal() { return 0.0f; }
    public float getInsertionMarkerTop() { return 0.0f; }
    public android.graphics.Matrix getMatrix() { return null; }
    public int getSelectionEnd() { return 0; }
    public int getSelectionStart() { return 0; }
    public android.view.inputmethod.TextAppearanceInfo getTextAppearanceInfo() { return null; }
    public java.util.List<android.graphics.RectF> getVisibleLineBounds() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private static final int LINE_BOUNDS_INITIAL_SIZE = 4;
        private android.view.inputmethod.SparseRectFArray.SparseRectFArrayBuilder mCharacterBoundsArrayBuilder;
        private java.lang.CharSequence mComposingText;
        private int mComposingTextStart;
        private android.view.inputmethod.EditorBoundsInfo mEditorBoundsInfo;
        private float mInsertionMarkerBaseline;
        private float mInsertionMarkerBottom;
        private int mInsertionMarkerFlags;
        private float mInsertionMarkerHorizontal;
        private float mInsertionMarkerTop;
        private boolean mMatrixInitialized;
        private float[] mMatrixValues;
        private int mSelectionEnd;
        private int mSelectionStart;
        private android.view.inputmethod.TextAppearanceInfo mTextAppearanceInfo;
        private float[] mVisibleLineBounds;
        private int mVisibleLineBoundsCount;
        public Builder() {}
        public android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(int p0, float p1, float p2, float p3, float p4, int p5) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder addVisibleLineBounds(float p0, float p1, float p2, float p3) { return null; }
        public android.view.inputmethod.CursorAnchorInfo build() { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder clearVisibleLineBounds() { return null; }
        public void reset() {}
        public android.view.inputmethod.CursorAnchorInfo.Builder setComposingText(int p0, java.lang.CharSequence p1) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setEditorBoundsInfo(android.view.inputmethod.EditorBoundsInfo p0) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setInsertionMarkerLocation(float p0, float p1, float p2, float p3, int p4) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setMatrix(android.graphics.Matrix p0) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setSelectionRange(int p0, int p1) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setTextAppearanceInfo(android.view.inputmethod.TextAppearanceInfo p0) { return null; }
    }
}

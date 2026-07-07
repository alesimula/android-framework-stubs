package android.view.inputmethod;

public final class SelectRangeGesture extends android.view.inputmethod.PreviewableHandwritingGesture implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.SelectRangeGesture> CREATOR = null;
    private android.graphics.RectF mEndArea;
    private int mGranularity;
    private android.graphics.RectF mStartArea;
    private SelectRangeGesture(int p0, android.graphics.RectF p1, android.graphics.RectF p2, java.lang.String p3) { super(); }
    private SelectRangeGesture(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getGranularity() { return 0; }
    public android.graphics.RectF getSelectionEndArea() { return null; }
    public android.graphics.RectF getSelectionStartArea() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.graphics.RectF mEndArea;
        private java.lang.String mFallbackText;
        private int mGranularity;
        private android.graphics.RectF mStartArea;
        public Builder() {}
        public android.view.inputmethod.SelectRangeGesture build() { return null; }
        public android.view.inputmethod.SelectRangeGesture.Builder setFallbackText(java.lang.String p0) { return null; }
        public android.view.inputmethod.SelectRangeGesture.Builder setGranularity(int p0) { return null; }
        public android.view.inputmethod.SelectRangeGesture.Builder setSelectionEndArea(android.graphics.RectF p0) { return null; }
        public android.view.inputmethod.SelectRangeGesture.Builder setSelectionStartArea(android.graphics.RectF p0) { return null; }
    }
}

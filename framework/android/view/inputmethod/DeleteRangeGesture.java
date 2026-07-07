package android.view.inputmethod;

public final class DeleteRangeGesture extends android.view.inputmethod.PreviewableHandwritingGesture implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.DeleteRangeGesture> CREATOR = null;
    private android.graphics.RectF mEndArea;
    private int mGranularity;
    private android.graphics.RectF mStartArea;
    private DeleteRangeGesture(int p0, android.graphics.RectF p1, android.graphics.RectF p2, java.lang.String p3) { super(); }
    private DeleteRangeGesture(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.RectF getDeletionEndArea() { return null; }
    public android.graphics.RectF getDeletionStartArea() { return null; }
    public int getGranularity() { return 0; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.graphics.RectF mEndArea;
        private java.lang.String mFallbackText;
        private int mGranularity;
        private android.graphics.RectF mStartArea;
        public Builder() {}
        public android.view.inputmethod.DeleteRangeGesture build() { return null; }
        public android.view.inputmethod.DeleteRangeGesture.Builder setDeletionEndArea(android.graphics.RectF p0) { return null; }
        public android.view.inputmethod.DeleteRangeGesture.Builder setDeletionStartArea(android.graphics.RectF p0) { return null; }
        public android.view.inputmethod.DeleteRangeGesture.Builder setFallbackText(java.lang.String p0) { return null; }
        public android.view.inputmethod.DeleteRangeGesture.Builder setGranularity(int p0) { return null; }
    }
}

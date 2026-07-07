package android.view.inputmethod;

public final class SelectGesture extends android.view.inputmethod.PreviewableHandwritingGesture implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.SelectGesture> CREATOR = null;
    private android.graphics.RectF mArea;
    private int mGranularity;
    private SelectGesture(int p0, android.graphics.RectF p1, java.lang.String p2) { super(); }
    private SelectGesture(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getGranularity() { return 0; }
    public android.graphics.RectF getSelectionArea() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.graphics.RectF mArea;
        private java.lang.String mFallbackText;
        private int mGranularity;
        public Builder() {}
        public android.view.inputmethod.SelectGesture build() { return null; }
        public android.view.inputmethod.SelectGesture.Builder setFallbackText(java.lang.String p0) { return null; }
        public android.view.inputmethod.SelectGesture.Builder setGranularity(int p0) { return null; }
        public android.view.inputmethod.SelectGesture.Builder setSelectionArea(android.graphics.RectF p0) { return null; }
    }
}

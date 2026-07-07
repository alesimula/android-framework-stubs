package android.view.inputmethod;

public final class InsertGesture extends android.view.inputmethod.HandwritingGesture implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InsertGesture> CREATOR = null;
    private android.graphics.PointF mPoint;
    private java.lang.String mTextToInsert;
    private InsertGesture(android.os.Parcel p0) { super(); }
    private InsertGesture(java.lang.String p0, android.graphics.PointF p1, java.lang.String p2) { super(); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.PointF getInsertionPoint() { return null; }
    public java.lang.String getTextToInsert() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mFallbackText;
        private android.graphics.PointF mPoint;
        private java.lang.String mText;
        public Builder() {}
        public android.view.inputmethod.InsertGesture build() { return null; }
        public android.view.inputmethod.InsertGesture.Builder setFallbackText(java.lang.String p0) { return null; }
        public android.view.inputmethod.InsertGesture.Builder setInsertionPoint(android.graphics.PointF p0) { return null; }
        public android.view.inputmethod.InsertGesture.Builder setTextToInsert(java.lang.String p0) { return null; }
    }
}

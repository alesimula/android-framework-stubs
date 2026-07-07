package android.view.inputmethod;

public final class RemoveSpaceGesture extends android.view.inputmethod.HandwritingGesture implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.RemoveSpaceGesture> CREATOR = null;
    private final android.graphics.PointF mEndPoint = null;
    private final android.graphics.PointF mStartPoint = null;
    private RemoveSpaceGesture(android.graphics.PointF p0, android.graphics.PointF p1, java.lang.String p2) { super(); }
    private RemoveSpaceGesture(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.PointF getEndPoint() { return null; }
    public android.graphics.PointF getStartPoint() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.graphics.PointF mEndPoint;
        private java.lang.String mFallbackText;
        private android.graphics.PointF mStartPoint;
        public Builder() {}
        public android.view.inputmethod.RemoveSpaceGesture build() { return null; }
        public android.view.inputmethod.RemoveSpaceGesture.Builder setFallbackText(java.lang.String p0) { return null; }
        public android.view.inputmethod.RemoveSpaceGesture.Builder setPoints(android.graphics.PointF p0, android.graphics.PointF p1) { return null; }
    }
}

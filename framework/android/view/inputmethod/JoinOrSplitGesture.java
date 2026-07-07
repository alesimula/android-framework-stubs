package android.view.inputmethod;

public final class JoinOrSplitGesture extends android.view.inputmethod.HandwritingGesture implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.JoinOrSplitGesture> CREATOR = null;
    private final android.graphics.PointF mPoint = null;
    private JoinOrSplitGesture(android.graphics.PointF p0, java.lang.String p1) { super(); }
    private JoinOrSplitGesture(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.PointF getJoinOrSplitPoint() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mFallbackText;
        private android.graphics.PointF mPoint;
        public Builder() {}
        public android.view.inputmethod.JoinOrSplitGesture build() { return null; }
        public android.view.inputmethod.JoinOrSplitGesture.Builder setFallbackText(java.lang.String p0) { return null; }
        public android.view.inputmethod.JoinOrSplitGesture.Builder setJoinOrSplitPoint(android.graphics.PointF p0) { return null; }
    }
}

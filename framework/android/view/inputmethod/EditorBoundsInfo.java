package android.view.inputmethod;

public final class EditorBoundsInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.EditorBoundsInfo> CREATOR = null;
    private final android.graphics.RectF mEditorBounds = null;
    private final android.graphics.RectF mHandwritingBounds = null;
    private final int mHashCode = 0;
    private EditorBoundsInfo(android.os.Parcel p0) {}
    private EditorBoundsInfo(android.view.inputmethod.EditorBoundsInfo.Builder p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.graphics.RectF getEditorBounds() { return null; }
    public android.graphics.RectF getHandwritingBounds() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.graphics.RectF mEditorBounds;
        private android.graphics.RectF mHandwritingBounds;
        public Builder() {}
        public android.view.inputmethod.EditorBoundsInfo build() { return null; }
        public android.view.inputmethod.EditorBoundsInfo.Builder setEditorBounds(android.graphics.RectF p0) { return null; }
        public android.view.inputmethod.EditorBoundsInfo.Builder setHandwritingBounds(android.graphics.RectF p0) { return null; }
    }
}

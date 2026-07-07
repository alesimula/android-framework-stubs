package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class Text implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.Text> CREATOR = null;
    private final int mMaxLines = 0;
    private final java.lang.CharSequence mText = null;
    private final android.text.TextUtils.TruncateAt mTruncateAtType = null;
    Text(android.os.Parcel p0) {}
    private Text(java.lang.CharSequence p0, android.text.TextUtils.TruncateAt p1, int p2) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getMaxLines() { return 0; }
    public java.lang.CharSequence getText() { return null; }
    public android.text.TextUtils.TruncateAt getTruncateAtType() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder {
        private int mMaxLines;
        private final java.lang.CharSequence mText = null;
        private android.text.TextUtils.TruncateAt mTruncateAtType;
        public Builder(java.lang.CharSequence p0) {}
        public android.app.smartspace.uitemplatedata.Text build() { return null; }
        public android.app.smartspace.uitemplatedata.Text.Builder setMaxLines(int p0) { return null; }
        public android.app.smartspace.uitemplatedata.Text.Builder setTruncateAtType(android.text.TextUtils.TruncateAt p0) { return null; }
    }
}

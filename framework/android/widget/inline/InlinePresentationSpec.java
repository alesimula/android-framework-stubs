package android.widget.inline;

public final class InlinePresentationSpec implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.widget.inline.InlinePresentationSpec> CREATOR = null;
    private final android.util.Size mMaxSize = null;
    private final android.util.Size mMinSize = null;
    private final android.os.Bundle mStyle = null;
    InlinePresentationSpec(android.os.Parcel p0) {}
    InlinePresentationSpec(android.util.Size p0, android.util.Size p1, android.os.Bundle p2) {}
    @java.lang.Deprecated
    private void __metadata() {}
    private static android.os.Bundle defaultStyle() { return null; }
    private boolean styleEquals(android.os.Bundle p0) { return false; }
    private int styleHashCode() { return 0; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void filterContentTypes() {}
    public android.util.Size getMaxSize() { return null; }
    public android.util.Size getMinSize() { return null; }
    public android.os.Bundle getStyle() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    static abstract class BaseBuilder {
        BaseBuilder() {}
    }

    public static final class Builder extends android.widget.inline.InlinePresentationSpec.BaseBuilder {
        private long mBuilderFieldsSet;
        private android.util.Size mMaxSize;
        private android.util.Size mMinSize;
        private android.os.Bundle mStyle;
        public Builder(android.util.Size p0, android.util.Size p1) { super(); }
        private void checkNotUsed() {}
        public android.widget.inline.InlinePresentationSpec build() { return null; }
        public android.widget.inline.InlinePresentationSpec.Builder setStyle(android.os.Bundle p0) { return null; }
    }
}

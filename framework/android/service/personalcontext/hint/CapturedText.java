package android.service.personalcontext.hint;

@android.annotation.SystemApi
public final class CapturedText implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.hint.CapturedText> CREATOR = null;
    private final java.lang.String mResourceId = null;
    private final java.lang.String mViewId = null;
    private final android.graphics.Rect mViewNodeBoundingBox = null;
    private final java.lang.String mViewNodeDescription = null;
    private final java.time.Instant mViewNodeLastSeen = null;
    private final java.time.Instant mViewNodeLastUpdated = null;
    private final java.lang.String mViewNodeText = null;
    private CapturedText(android.os.Parcel p0) {}
    private CapturedText(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.graphics.Rect p3, java.lang.String p4, java.time.Instant p5, java.time.Instant p6) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String getResourceId() { return null; }
    public java.lang.String getViewId() { return null; }
    public android.graphics.Rect getViewNodeBoundingBox() { return null; }
    public java.lang.String getViewNodeDescription() { return null; }
    public java.time.Instant getViewNodeLastSeen() { return null; }
    public java.time.Instant getViewNodeLastUpdated() { return null; }
    public java.lang.String getViewNodeText() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.String mResourceId;
        private java.lang.String mViewId;
        private android.graphics.Rect mViewNodeBoundingBox;
        private java.lang.String mViewNodeDescription;
        private java.time.Instant mViewNodeLastSeen;
        private java.time.Instant mViewNodeLastUpdated;
        private java.lang.String mViewNodeText;
        public Builder() {}
        public android.service.personalcontext.hint.CapturedText build() { return null; }
        public android.service.personalcontext.hint.CapturedText.Builder setResourceId(java.lang.String p0) { return null; }
        public android.service.personalcontext.hint.CapturedText.Builder setViewId(java.lang.String p0) { return null; }
        public android.service.personalcontext.hint.CapturedText.Builder setViewNodeBoundingBox(android.graphics.Rect p0) { return null; }
        public android.service.personalcontext.hint.CapturedText.Builder setViewNodeDescription(java.lang.String p0) { return null; }
        public android.service.personalcontext.hint.CapturedText.Builder setViewNodeLastSeen(java.time.Instant p0) { return null; }
        public android.service.personalcontext.hint.CapturedText.Builder setViewNodeLastUpdated(java.time.Instant p0) { return null; }
        public android.service.personalcontext.hint.CapturedText.Builder setViewNodeText(java.lang.String p0) { return null; }
    }
}

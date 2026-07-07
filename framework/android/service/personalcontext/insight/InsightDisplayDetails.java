package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class InsightDisplayDetails implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.insight.InsightDisplayDetails> CREATOR = null;
    private final java.lang.CharSequence mContentDescription = null;
    private final android.graphics.drawable.Icon mIcon = null;
    private final java.lang.CharSequence mSubtitle = null;
    private final java.lang.CharSequence mTitle = null;
    private InsightDisplayDetails(android.os.Parcel p0) {}
    private InsightDisplayDetails(java.lang.CharSequence p0, android.graphics.drawable.Icon p1, java.lang.CharSequence p2, java.lang.CharSequence p3) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public android.graphics.drawable.Icon getIcon() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getTitle() { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private java.lang.CharSequence mContentDescription;
        private android.graphics.drawable.Icon mIcon;
        private java.lang.CharSequence mSubtitle;
        private java.lang.CharSequence mTitle;
        public Builder(android.graphics.drawable.Icon p0) {}
        public Builder(java.lang.CharSequence p0) {}
        public Builder(java.lang.CharSequence p0, android.graphics.drawable.Icon p1) {}
        public android.service.personalcontext.insight.InsightDisplayDetails build() { return null; }
        public android.service.personalcontext.insight.InsightDisplayDetails.Builder setContentDescription(java.lang.CharSequence p0) { return null; }
        public android.service.personalcontext.insight.InsightDisplayDetails.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
    }
}

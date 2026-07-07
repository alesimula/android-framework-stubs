package android.service.personalcontext.insight.interaction;

@android.annotation.SystemApi
public final class AttributionDetails implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.personalcontext.insight.interaction.AttributionDetails> CREATOR = null;
    private final java.util.List<android.service.personalcontext.insight.interaction.AttributionDetails.AttributionLine> mLines = null;
    private AttributionDetails(android.os.Parcel p0) {}
    public AttributionDetails(java.util.Collection<android.service.personalcontext.insight.interaction.AttributionDetails.AttributionLine> p0) {}
    public int describeContents() { return 0; }
    public java.util.List<android.service.personalcontext.insight.interaction.AttributionDetails.AttributionLine> getLines() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class AttributionLine implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.personalcontext.insight.interaction.AttributionDetails.AttributionLine> CREATOR = null;
        private final java.lang.CharSequence mContentDescription = null;
        private final android.graphics.drawable.Icon mIcon = null;
        private final java.lang.CharSequence mSubtitle = null;
        private final java.lang.CharSequence mTitle = null;
        private AttributionLine(android.os.Parcel p0) {}
        public AttributionLine(java.lang.CharSequence p0, android.graphics.drawable.Icon p1, java.lang.CharSequence p2, java.lang.CharSequence p3) {}
        public int describeContents() { return 0; }
        public java.lang.CharSequence getContentDescription() { return null; }
        public android.graphics.drawable.Icon getIcon() { return null; }
        public java.lang.CharSequence getSubtitle() { return null; }
        public java.lang.CharSequence getTitle() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}

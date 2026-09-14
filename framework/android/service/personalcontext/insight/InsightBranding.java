package android.service.personalcontext.insight;

@android.annotation.SystemApi
public final class InsightBranding implements android.os.Parcelable {
    public static final int COLOR_TYPE_PRIMARY = 0;
    public static final int COLOR_TYPE_SECONDARY = 1;
    public static final android.os.Parcelable.Creator<android.service.personalcontext.insight.InsightBranding> CREATOR = null;
    public static final int ICON_TYPE_BACKGROUND = 2;
    public static final int ICON_TYPE_LEADING = 0;
    public static final int ICON_TYPE_TRAILING = 1;
    private final android.util.SparseIntArray mColors = null;
    private final java.util.Set<android.service.personalcontext.insight.InsightBranding.IconDetails> mIconDetails = null;
    private InsightBranding(android.os.Parcel p0) {}
    private InsightBranding(java.util.Set<android.service.personalcontext.insight.InsightBranding.IconDetails> p0, android.util.SparseIntArray p1) {}
    public int describeContents() { return 0; }
    @android.annotation.SystemApi
    public int getColor(int p0) { return 0; }
    public android.util.SparseIntArray getColors() { return null; }
    public java.util.Set<android.service.personalcontext.insight.InsightBranding.IconDetails> getIconDetails() { return null; }
    @android.annotation.SystemApi
    public android.util.SparseArray<android.graphics.drawable.Icon> getIcons(int p0) { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.util.SparseIntArray mColors = null;
        private final java.util.Set<android.service.personalcontext.insight.InsightBranding.IconDetails> mIconDetails = null;
        public Builder() {}
        public android.service.personalcontext.insight.InsightBranding build() { return null; }
        public android.service.personalcontext.insight.InsightBranding.Builder setColor(int p0, int p1) { return null; }
        public android.service.personalcontext.insight.InsightBranding.Builder setIcon(int p0, int p1, android.graphics.drawable.Icon p2) { return null; }
        public android.service.personalcontext.insight.InsightBranding.Builder setIcon(int p0, android.graphics.drawable.Icon p1) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IconType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ColorType {
    }

    public static final class IconDetails implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.personalcontext.insight.InsightBranding.IconDetails> CREATOR = null;
        private final android.graphics.drawable.Icon mIcon = null;
        private final int mPosition = 0;
        private final int mType = 0;
        public IconDetails(android.graphics.drawable.Icon p0, int p1, int p2) {}
        private IconDetails(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.graphics.drawable.Icon getIcon() { return null; }
        public int getPosition() { return 0; }
        public int getType() { return 0; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}

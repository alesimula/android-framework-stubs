package android.content.theming;

public final class ThemeInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.theming.ThemeInfo> CREATOR = null;
    public final java.lang.Float contrast = null;
    public final java.lang.String platform = null;
    public final java.util.List<android.graphics.Color> seedColors = null;
    public final java.lang.String specVersion = null;
    public final java.lang.Integer style = null;
    private ThemeInfo(android.os.Parcel p0) {}
    private ThemeInfo(java.util.List<android.graphics.Color> p0, java.lang.Integer p1, java.lang.Float p2) {}
    public ThemeInfo(java.util.List<android.graphics.Color> p0, java.lang.Integer p1, java.lang.Float p2, java.lang.String p3, java.lang.String p4) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private java.lang.Float mContrast;
        private java.util.List<android.graphics.Color> mSeedColors;
        private java.lang.Integer mStyle;
        public Builder() {}
        public android.content.theming.ThemeInfo build() { return null; }
        public android.content.theming.ThemeInfo.Builder setContrast(java.lang.Float p0) { return null; }
        public android.content.theming.ThemeInfo.Builder setSeedColors(java.util.List<android.graphics.Color> p0) { return null; }
        public android.content.theming.ThemeInfo.Builder setSeedColors(android.graphics.Color... p0) { return null; }
        public android.content.theming.ThemeInfo.Builder setStyle(java.lang.Integer p0) { return null; }
    }
}

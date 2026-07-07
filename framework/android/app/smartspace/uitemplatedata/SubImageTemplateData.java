package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class SubImageTemplateData extends android.app.smartspace.uitemplatedata.BaseTemplateData {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.SubImageTemplateData> CREATOR = null;
    private final android.app.smartspace.uitemplatedata.TapAction mSubImageAction = null;
    private final java.util.List<android.app.smartspace.uitemplatedata.Text> mSubImageTexts = null;
    private final java.util.List<android.app.smartspace.uitemplatedata.Icon> mSubImages = null;
    private SubImageTemplateData(int p0, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p1, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p2, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p3, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p4, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p5, int p6, java.util.List<android.app.smartspace.uitemplatedata.Text> p7, java.util.List<android.app.smartspace.uitemplatedata.Icon> p8, android.app.smartspace.uitemplatedata.TapAction p9) { super((android.os.Parcel)null); }
    SubImageTemplateData(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.smartspace.uitemplatedata.TapAction getSubImageAction() { return null; }
    public java.util.List<android.app.smartspace.uitemplatedata.Text> getSubImageTexts() { return null; }
    public java.util.List<android.app.smartspace.uitemplatedata.Icon> getSubImages() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder extends android.app.smartspace.uitemplatedata.BaseTemplateData.Builder {
        private android.app.smartspace.uitemplatedata.TapAction mSubImageAction;
        private final java.util.List<android.app.smartspace.uitemplatedata.Text> mSubImageTexts = null;
        private final java.util.List<android.app.smartspace.uitemplatedata.Icon> mSubImages = null;
        public Builder(java.util.List<android.app.smartspace.uitemplatedata.Text> p0, java.util.List<android.app.smartspace.uitemplatedata.Icon> p1) { super(0); }
        public android.app.smartspace.uitemplatedata.SubImageTemplateData build() { return null; }
        public android.app.smartspace.uitemplatedata.SubImageTemplateData.Builder setSubImageAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
    }
}

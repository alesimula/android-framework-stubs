package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class SubListTemplateData extends android.app.smartspace.uitemplatedata.BaseTemplateData {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.SubListTemplateData> CREATOR = null;
    private final android.app.smartspace.uitemplatedata.TapAction mSubListAction = null;
    private final android.app.smartspace.uitemplatedata.Icon mSubListIcon = null;
    private final java.util.List<android.app.smartspace.uitemplatedata.Text> mSubListTexts = null;
    private SubListTemplateData(int p0, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p1, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p2, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p3, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p4, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p5, int p6, android.app.smartspace.uitemplatedata.Icon p7, java.util.List<android.app.smartspace.uitemplatedata.Text> p8, android.app.smartspace.uitemplatedata.TapAction p9) { super((android.os.Parcel)null); }
    SubListTemplateData(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.smartspace.uitemplatedata.TapAction getSubListAction() { return null; }
    public android.app.smartspace.uitemplatedata.Icon getSubListIcon() { return null; }
    public java.util.List<android.app.smartspace.uitemplatedata.Text> getSubListTexts() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder extends android.app.smartspace.uitemplatedata.BaseTemplateData.Builder {
        private android.app.smartspace.uitemplatedata.TapAction mSubListAction;
        private android.app.smartspace.uitemplatedata.Icon mSubListIcon;
        private final java.util.List<android.app.smartspace.uitemplatedata.Text> mSubListTexts = null;
        public Builder(java.util.List<android.app.smartspace.uitemplatedata.Text> p0) { super(0); }
        public android.app.smartspace.uitemplatedata.SubListTemplateData build() { return null; }
        public android.app.smartspace.uitemplatedata.SubListTemplateData.Builder setSubListAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
        public android.app.smartspace.uitemplatedata.SubListTemplateData.Builder setSubListIcon(android.app.smartspace.uitemplatedata.Icon p0) { return null; }
    }
}

package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class SubCardTemplateData extends android.app.smartspace.uitemplatedata.BaseTemplateData {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.SubCardTemplateData> CREATOR = null;
    private final android.app.smartspace.uitemplatedata.TapAction mSubCardAction = null;
    private final android.app.smartspace.uitemplatedata.Icon mSubCardIcon = null;
    private final android.app.smartspace.uitemplatedata.Text mSubCardText = null;
    private SubCardTemplateData(int p0, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p1, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p2, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p3, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p4, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p5, int p6, android.app.smartspace.uitemplatedata.Icon p7, android.app.smartspace.uitemplatedata.Text p8, android.app.smartspace.uitemplatedata.TapAction p9) { super((android.os.Parcel)null); }
    SubCardTemplateData(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.smartspace.uitemplatedata.TapAction getSubCardAction() { return null; }
    public android.app.smartspace.uitemplatedata.Icon getSubCardIcon() { return null; }
    public android.app.smartspace.uitemplatedata.Text getSubCardText() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder extends android.app.smartspace.uitemplatedata.BaseTemplateData.Builder {
        private android.app.smartspace.uitemplatedata.TapAction mSubCardAction;
        private final android.app.smartspace.uitemplatedata.Icon mSubCardIcon = null;
        private android.app.smartspace.uitemplatedata.Text mSubCardText;
        public Builder(android.app.smartspace.uitemplatedata.Icon p0) { super(0); }
        public android.app.smartspace.uitemplatedata.SubCardTemplateData build() { return null; }
        public android.app.smartspace.uitemplatedata.SubCardTemplateData.Builder setSubCardAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
        public android.app.smartspace.uitemplatedata.SubCardTemplateData.Builder setSubCardText(android.app.smartspace.uitemplatedata.Text p0) { return null; }
    }
}

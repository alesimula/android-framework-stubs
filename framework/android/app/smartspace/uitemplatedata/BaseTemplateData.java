package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public class BaseTemplateData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.BaseTemplateData> CREATOR = null;
    private final int mLayoutWeight = 0;
    private final android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo mPrimaryItem = null;
    private final android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo mSubtitleItem = null;
    private final android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo mSubtitleSupplementalItem = null;
    private final android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo mSupplementalAlarmItem = null;
    private final android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo mSupplementalLineItem = null;
    private final int mTemplateType = 0;
    BaseTemplateData(int p0, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p1, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p2, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p3, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p4, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p5, int p6) {}
    BaseTemplateData(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int getLayoutWeight() { return 0; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getPrimaryItem() { return null; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSubtitleItem() { return null; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSubtitleSupplementalItem() { return null; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSupplementalAlarmItem() { return null; }
    public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSupplementalLineItem() { return null; }
    public int getTemplateType() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static class Builder {
        private int mLayoutWeight;
        private android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo mPrimaryItem;
        private android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo mSubtitleItem;
        private android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo mSubtitleSupplementalItem;
        private android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo mSupplementalAlarmItem;
        private android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo mSupplementalLineItem;
        private final int mTemplateType = 0;
        public Builder(int p0) {}
        public android.app.smartspace.uitemplatedata.BaseTemplateData build() { return null; }
        int getLayoutWeight() { return 0; }
        android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getPrimaryItem() { return null; }
        android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSubtitleItem() { return null; }
        android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSubtitleSupplemtnalItem() { return null; }
        android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSupplementalAlarmItem() { return null; }
        android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo getSupplementalLineItem() { return null; }
        int getTemplateType() { return 0; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setLayoutWeight(int p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setPrimaryItem(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setSubtitleItem(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setSubtitleSupplementalItem(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setSupplementalAlarmItem(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p0) { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.Builder setSupplementalLineItem(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p0) { return null; }
    }

    public static final class SubItemInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo> CREATOR = null;
        private final android.app.smartspace.uitemplatedata.Icon mIcon = null;
        private final android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo mLoggingInfo = null;
        private final android.app.smartspace.uitemplatedata.TapAction mTapAction = null;
        private final android.app.smartspace.uitemplatedata.Text mText = null;
        private SubItemInfo(android.app.smartspace.uitemplatedata.Text p0, android.app.smartspace.uitemplatedata.Icon p1, android.app.smartspace.uitemplatedata.TapAction p2, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo p3) {}
        SubItemInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.app.smartspace.uitemplatedata.Icon getIcon() { return null; }
        public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo getLoggingInfo() { return null; }
        public android.app.smartspace.uitemplatedata.TapAction getTapAction() { return null; }
        public android.app.smartspace.uitemplatedata.Text getText() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @android.annotation.SystemApi
        public static final class Builder {
            private android.app.smartspace.uitemplatedata.Icon mIcon;
            private android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo mLoggingInfo;
            private android.app.smartspace.uitemplatedata.TapAction mTapAction;
            private android.app.smartspace.uitemplatedata.Text mText;
            public Builder() {}
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo build() { return null; }
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo.Builder setIcon(android.app.smartspace.uitemplatedata.Icon p0) { return null; }
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo.Builder setLoggingInfo(android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo p0) { return null; }
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo.Builder setTapAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo.Builder setText(android.app.smartspace.uitemplatedata.Text p0) { return null; }
        }
    }

    public static final class SubItemLoggingInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo> CREATOR = null;
        private final int mFeatureType = 0;
        private final int mInstanceId = 0;
        private final java.lang.CharSequence mPackageName = null;
        private SubItemLoggingInfo(int p0, int p1, java.lang.CharSequence p2) {}
        SubItemLoggingInfo(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int getFeatureType() { return 0; }
        public int getInstanceId() { return 0; }
        public java.lang.CharSequence getPackageName() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @android.annotation.SystemApi
        public static final class Builder {
            private final int mFeatureType = 0;
            private final int mInstanceId = 0;
            private java.lang.CharSequence mPackageName;
            public Builder(int p0, int p1) {}
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo build() { return null; }
            public android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemLoggingInfo.Builder setPackageName(java.lang.CharSequence p0) { return null; }
        }
    }
}

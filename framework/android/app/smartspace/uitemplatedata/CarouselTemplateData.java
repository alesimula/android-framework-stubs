package android.app.smartspace.uitemplatedata;

@android.annotation.SystemApi
public final class CarouselTemplateData extends android.app.smartspace.uitemplatedata.BaseTemplateData {
    public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.CarouselTemplateData> CREATOR = null;
    private final android.app.smartspace.uitemplatedata.TapAction mCarouselAction = null;
    private final java.util.List<android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem> mCarouselItems = null;
    private CarouselTemplateData(int p0, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p1, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p2, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p3, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p4, android.app.smartspace.uitemplatedata.BaseTemplateData.SubItemInfo p5, int p6, java.util.List<android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem> p7, android.app.smartspace.uitemplatedata.TapAction p8) { super((android.os.Parcel)null); }
    CarouselTemplateData(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.app.smartspace.uitemplatedata.TapAction getCarouselAction() { return null; }
    public java.util.List<android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem> getCarouselItems() { return null; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.SystemApi
    public static final class Builder extends android.app.smartspace.uitemplatedata.BaseTemplateData.Builder {
        private android.app.smartspace.uitemplatedata.TapAction mCarouselAction;
        private final java.util.List<android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem> mCarouselItems = null;
        public Builder(java.util.List<android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem> p0) { super(0); }
        public android.app.smartspace.uitemplatedata.CarouselTemplateData build() { return null; }
        public android.app.smartspace.uitemplatedata.CarouselTemplateData.Builder setCarouselAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
    }

    public static final class CarouselItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem> CREATOR = null;
        private final android.app.smartspace.uitemplatedata.Icon mImage = null;
        private final android.app.smartspace.uitemplatedata.Text mLowerText = null;
        private final android.app.smartspace.uitemplatedata.TapAction mTapAction = null;
        private final android.app.smartspace.uitemplatedata.Text mUpperText = null;
        private CarouselItem(android.app.smartspace.uitemplatedata.Text p0, android.app.smartspace.uitemplatedata.Icon p1, android.app.smartspace.uitemplatedata.Text p2, android.app.smartspace.uitemplatedata.TapAction p3) {}
        CarouselItem(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public android.app.smartspace.uitemplatedata.Icon getImage() { return null; }
        public android.app.smartspace.uitemplatedata.Text getLowerText() { return null; }
        public android.app.smartspace.uitemplatedata.TapAction getTapAction() { return null; }
        public android.app.smartspace.uitemplatedata.Text getUpperText() { return null; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @android.annotation.SystemApi
        public static final class Builder {
            private android.app.smartspace.uitemplatedata.Icon mImage;
            private android.app.smartspace.uitemplatedata.Text mLowerText;
            private android.app.smartspace.uitemplatedata.TapAction mTapAction;
            private android.app.smartspace.uitemplatedata.Text mUpperText;
            public Builder() {}
            public android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem build() { return null; }
            public android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem.Builder setImage(android.app.smartspace.uitemplatedata.Icon p0) { return null; }
            public android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem.Builder setLowerText(android.app.smartspace.uitemplatedata.Text p0) { return null; }
            public android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem.Builder setTapAction(android.app.smartspace.uitemplatedata.TapAction p0) { return null; }
            public android.app.smartspace.uitemplatedata.CarouselTemplateData.CarouselItem.Builder setUpperText(android.app.smartspace.uitemplatedata.Text p0) { return null; }
        }
    }
}

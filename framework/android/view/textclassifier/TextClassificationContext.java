package android.view.textclassifier;

public final class TextClassificationContext implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassificationContext> CREATOR = null;
    private java.lang.String mPackageName;
    private android.view.textclassifier.SystemTextClassifierMetadata mSystemTcMetadata;
    private final java.lang.String mWidgetType = null;
    private final java.lang.String mWidgetVersion = null;
    private TextClassificationContext(android.os.Parcel p0) {}
    private TextClassificationContext(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public int describeContents() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public android.view.textclassifier.SystemTextClassifierMetadata getSystemTextClassifierMetadata() { return null; }
    public java.lang.String getWidgetType() { return null; }
    public java.lang.String getWidgetVersion() { return null; }
    void setSystemTextClassifierMetadata(android.view.textclassifier.SystemTextClassifierMetadata p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.lang.String mPackageName = null;
        private final java.lang.String mWidgetType = null;
        private java.lang.String mWidgetVersion;
        public Builder(java.lang.String p0, java.lang.String p1) {}
        public android.view.textclassifier.TextClassificationContext build() { return null; }
        public android.view.textclassifier.TextClassificationContext.Builder setWidgetVersion(java.lang.String p0) { return null; }
    }
}

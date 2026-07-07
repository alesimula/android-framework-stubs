package android.view.textclassifier;

public final class TextSelection implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextSelection> CREATOR = null;
    private final int mEndIndex = 0;
    private final android.view.textclassifier.EntityConfidence mEntityConfidence = null;
    private final android.os.Bundle mExtras = null;
    private final java.lang.String mId = null;
    private final int mStartIndex = 0;
    private final android.view.textclassifier.TextClassification mTextClassification = null;
    private TextSelection(int p0, int p1, java.util.Map<java.lang.String, java.lang.Float> p2, java.lang.String p3, android.view.textclassifier.TextClassification p4, android.os.Bundle p5) {}
    private TextSelection(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public float getConfidenceScore(java.lang.String p0) { return 0.0f; }
    public java.lang.String getEntity(int p0) { return null; }
    public int getEntityCount() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String getId() { return null; }
    public int getSelectionEndIndex() { return 0; }
    public int getSelectionStartIndex() { return 0; }
    public android.view.textclassifier.TextClassification getTextClassification() { return null; }
    public android.view.textclassifier.TextSelection.Builder toBuilder() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final int mEndIndex = 0;
        private final java.util.Map<java.lang.String, java.lang.Float> mEntityConfidence = null;
        private android.os.Bundle mExtras;
        private java.lang.String mId;
        private final int mStartIndex = 0;
        private android.view.textclassifier.TextClassification mTextClassification;
        public Builder(int p0, int p1) {}
        public android.view.textclassifier.TextSelection build() { return null; }
        android.view.textclassifier.TextSelection.Builder setEntityConfidence(android.view.textclassifier.EntityConfidence p0) { return null; }
        public android.view.textclassifier.TextSelection.Builder setEntityType(java.lang.String p0, float p1) { return null; }
        public android.view.textclassifier.TextSelection.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.view.textclassifier.TextSelection.Builder setId(java.lang.String p0) { return null; }
        public android.view.textclassifier.TextSelection.Builder setTextClassification(android.view.textclassifier.TextClassification p0) { return null; }
    }

    public static final class Request implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextSelection.Request> CREATOR = null;
        private final boolean mDarkLaunchAllowed = false;
        private final android.os.LocaleList mDefaultLocales = null;
        private final int mEndIndex = 0;
        private final android.os.Bundle mExtras = null;
        private final boolean mIncludeTextClassification = false;
        private final int mStartIndex = 0;
        private android.view.textclassifier.SystemTextClassifierMetadata mSystemTcMetadata;
        private final java.lang.CharSequence mText = null;
        private Request(java.lang.CharSequence p0, int p1, int p2, android.os.LocaleList p3, boolean p4, boolean p5, android.os.Bundle p6) {}
        private static android.view.textclassifier.TextSelection.Request readFromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public java.lang.String getCallingPackageName() { return null; }
        public android.os.LocaleList getDefaultLocales() { return null; }
        public int getEndIndex() { return 0; }
        public android.os.Bundle getExtras() { return null; }
        public int getStartIndex() { return 0; }
        public android.view.textclassifier.SystemTextClassifierMetadata getSystemTextClassifierMetadata() { return null; }
        public java.lang.CharSequence getText() { return null; }
        public boolean isDarkLaunchAllowed() { return false; }
        public void setSystemTextClassifierMetadata(android.view.textclassifier.SystemTextClassifierMetadata p0) {}
        public boolean shouldIncludeTextClassification() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private boolean mDarkLaunchAllowed;
            private android.os.LocaleList mDefaultLocales;
            private final int mEndIndex = 0;
            private android.os.Bundle mExtras;
            private boolean mIncludeTextClassification;
            private final int mStartIndex = 0;
            private final java.lang.CharSequence mText = null;
            public Builder(java.lang.CharSequence p0, int p1, int p2) {}
            public android.view.textclassifier.TextSelection.Request build() { return null; }
            public android.view.textclassifier.TextSelection.Request.Builder setDarkLaunchAllowed(boolean p0) { return null; }
            public android.view.textclassifier.TextSelection.Request.Builder setDefaultLocales(android.os.LocaleList p0) { return null; }
            public android.view.textclassifier.TextSelection.Request.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.TextSelection.Request.Builder setIncludeTextClassification(boolean p0) { return null; }
        }
    }
}

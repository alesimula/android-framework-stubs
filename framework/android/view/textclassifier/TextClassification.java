package android.view.textclassifier;

public final class TextClassification implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassification> CREATOR = null;
    public static final android.view.textclassifier.TextClassification EMPTY = null;
    private static final java.lang.String LOG_TAG = "TextClassification";
    private static final int MAX_LEGACY_ICON_SIZE = 192;
    private final java.util.List<android.app.RemoteAction> mActions = null;
    private final android.view.textclassifier.EntityConfidence mEntityConfidence = null;
    private final android.os.Bundle mExtras = null;
    private final java.lang.String mId = null;
    private final android.graphics.drawable.Drawable mLegacyIcon = null;
    private final android.content.Intent mLegacyIntent = null;
    private final java.lang.String mLegacyLabel = null;
    private final android.view.View.OnClickListener mLegacyOnClickListener = null;
    private final java.lang.String mText = null;
    private TextClassification(android.os.Parcel p0) {}
    private TextClassification(java.lang.String p0, android.graphics.drawable.Drawable p1, java.lang.String p2, android.content.Intent p3, android.view.View.OnClickListener p4, java.util.List<android.app.RemoteAction> p5, android.view.textclassifier.EntityConfidence p6, java.lang.String p7, android.os.Bundle p8) {}
    public static android.view.View.OnClickListener createIntentOnClickListener(android.app.PendingIntent p0) { return null; }
    public static android.app.PendingIntent createPendingIntent(android.content.Context p0, android.content.Intent p1, int p2) { return null; }
    private static android.graphics.drawable.Drawable maybeLoadDrawable(android.graphics.drawable.Icon p0) { return null; }
    public int describeContents() { return 0; }
    public java.util.List<android.app.RemoteAction> getActions() { return null; }
    public float getConfidenceScore(java.lang.String p0) { return 0.0f; }
    public java.lang.String getEntity(int p0) { return null; }
    public int getEntityCount() { return 0; }
    public android.os.Bundle getExtras() { return null; }
    @java.lang.Deprecated
    public android.graphics.drawable.Drawable getIcon() { return null; }
    public java.lang.String getId() { return null; }
    @java.lang.Deprecated
    public android.content.Intent getIntent() { return null; }
    @java.lang.Deprecated
    public java.lang.CharSequence getLabel() { return null; }
    public android.view.View.OnClickListener getOnClickListener() { return null; }
    public java.lang.String getText() { return null; }
    public android.view.textclassifier.TextClassification.Builder toBuilder() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.util.List<android.app.RemoteAction> mActions = null;
        private android.os.Bundle mExtras;
        private java.lang.String mId;
        private android.graphics.drawable.Drawable mLegacyIcon;
        private android.content.Intent mLegacyIntent;
        private java.lang.String mLegacyLabel;
        private android.view.View.OnClickListener mLegacyOnClickListener;
        private java.lang.String mText;
        private final java.util.Map<java.lang.String, java.lang.Float> mTypeScoreMap = null;
        public Builder() {}
        public android.view.textclassifier.TextClassification.Builder addAction(android.app.RemoteAction p0) { return null; }
        public android.view.textclassifier.TextClassification.Builder addActions(java.util.Collection<android.app.RemoteAction> p0) { return null; }
        public android.view.textclassifier.TextClassification build() { return null; }
        public android.view.textclassifier.TextClassification.Builder clearActions() { return null; }
        public android.view.textclassifier.TextClassification.Builder clearEntityTypes() { return null; }
        android.view.textclassifier.TextClassification.Builder setEntityConfidence(android.view.textclassifier.EntityConfidence p0) { return null; }
        public android.view.textclassifier.TextClassification.Builder setEntityType(java.lang.String p0, float p1) { return null; }
        public android.view.textclassifier.TextClassification.Builder setExtras(android.os.Bundle p0) { return null; }
        @java.lang.Deprecated
        public android.view.textclassifier.TextClassification.Builder setIcon(android.graphics.drawable.Drawable p0) { return null; }
        public android.view.textclassifier.TextClassification.Builder setId(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.view.textclassifier.TextClassification.Builder setIntent(android.content.Intent p0) { return null; }
        @java.lang.Deprecated
        public android.view.textclassifier.TextClassification.Builder setLabel(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.view.textclassifier.TextClassification.Builder setOnClickListener(android.view.View.OnClickListener p0) { return null; }
        public android.view.textclassifier.TextClassification.Builder setText(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface IntentType {
        public static final int ACTIVITY = 0;
        public static final int SERVICE = 1;
        public static final int UNSUPPORTED = -1;
    }

    public static final class Request implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassification.Request> CREATOR = null;
        private final android.os.LocaleList mDefaultLocales = null;
        private final int mEndIndex = 0;
        private final android.os.Bundle mExtras = null;
        private final java.time.ZonedDateTime mReferenceTime = null;
        private final int mStartIndex = 0;
        private android.view.textclassifier.SystemTextClassifierMetadata mSystemTcMetadata;
        private final java.lang.CharSequence mText = null;
        private Request(java.lang.CharSequence p0, int p1, int p2, android.os.LocaleList p3, java.time.ZonedDateTime p4, android.os.Bundle p5) {}
        private static android.view.textclassifier.TextClassification.Request readFromParcel(android.os.Parcel p0) { return null; }
        public int describeContents() { return 0; }
        public java.lang.String getCallingPackageName() { return null; }
        public android.os.LocaleList getDefaultLocales() { return null; }
        public int getEndIndex() { return 0; }
        public android.os.Bundle getExtras() { return null; }
        public java.time.ZonedDateTime getReferenceTime() { return null; }
        public int getStartIndex() { return 0; }
        public android.view.textclassifier.SystemTextClassifierMetadata getSystemTextClassifierMetadata() { return null; }
        public java.lang.CharSequence getText() { return null; }
        public void setSystemTextClassifierMetadata(android.view.textclassifier.SystemTextClassifierMetadata p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            private android.os.LocaleList mDefaultLocales;
            private final int mEndIndex = 0;
            private android.os.Bundle mExtras;
            private java.time.ZonedDateTime mReferenceTime;
            private final int mStartIndex = 0;
            private final java.lang.CharSequence mText = null;
            public Builder(java.lang.CharSequence p0, int p1, int p2) {}
            public android.view.textclassifier.TextClassification.Request build() { return null; }
            public android.view.textclassifier.TextClassification.Request.Builder setDefaultLocales(android.os.LocaleList p0) { return null; }
            public android.view.textclassifier.TextClassification.Request.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.TextClassification.Request.Builder setReferenceTime(java.time.ZonedDateTime p0) { return null; }
        }
    }
}

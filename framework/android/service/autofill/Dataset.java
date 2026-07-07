package android.service.autofill;

public final class Dataset implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.Dataset> CREATOR = null;
    public static final int PICK_REASON_NO_PCC = 1;
    public static final int PICK_REASON_PCC_DETECTION_ONLY = 4;
    public static final int PICK_REASON_PCC_DETECTION_PREFERRED_WITH_PROVIDER = 5;
    public static final int PICK_REASON_PROVIDER_DETECTION_ONLY = 2;
    public static final int PICK_REASON_PROVIDER_DETECTION_PREFERRED_WITH_PCC = 3;
    public static final int PICK_REASON_UNKNOWN = 0;
    private final android.content.IntentSender mAuthentication = null;
    private final java.util.ArrayList<java.lang.String> mAutofillDatatypes = null;
    private android.content.Intent mCredentialFillInIntent;
    private final android.widget.RemoteViews mDialogPresentation = null;
    private int mEligibleReason;
    private final android.content.ClipData mFieldContent = null;
    private final java.util.ArrayList<android.widget.RemoteViews> mFieldDialogPresentations = null;
    private final java.util.ArrayList<android.service.autofill.Dataset.DatasetFieldFilter> mFieldFilters = null;
    private final java.util.ArrayList<android.view.autofill.AutofillId> mFieldIds = null;
    private final java.util.ArrayList<android.service.autofill.InlinePresentation> mFieldInlinePresentations = null;
    private final java.util.ArrayList<android.service.autofill.InlinePresentation> mFieldInlineTooltipPresentations = null;
    private final java.util.ArrayList<android.widget.RemoteViews> mFieldPresentations = null;
    private final java.util.ArrayList<android.view.autofill.AutofillValue> mFieldValues = null;
    java.lang.String mId;
    private final android.service.autofill.InlinePresentation mInlinePresentation = null;
    private final android.service.autofill.InlinePresentation mInlineTooltipPresentation = null;
    private final android.widget.RemoteViews mPresentation = null;
    private Dataset(android.service.autofill.Dataset.Builder p0) {}
    public Dataset(android.service.autofill.Dataset p0, java.util.ArrayList<android.view.autofill.AutofillId> p1) {}
    public Dataset(java.util.ArrayList<android.view.autofill.AutofillId> p0, java.util.ArrayList<android.view.autofill.AutofillValue> p1, java.util.ArrayList<android.widget.RemoteViews> p2, java.util.ArrayList<android.widget.RemoteViews> p3, java.util.ArrayList<android.service.autofill.InlinePresentation> p4, java.util.ArrayList<android.service.autofill.InlinePresentation> p5, java.util.ArrayList<android.service.autofill.Dataset.DatasetFieldFilter> p6, java.util.ArrayList<java.lang.String> p7, android.content.ClipData p8, android.widget.RemoteViews p9, android.widget.RemoteViews p10, android.service.autofill.InlinePresentation p11, android.service.autofill.InlinePresentation p12, java.lang.String p13, android.content.IntentSender p14) {}
    public int describeContents() { return 0; }
    public android.content.IntentSender getAuthentication() { return null; }
    public java.util.ArrayList<java.lang.String> getAutofillDatatypes() { return null; }
    public android.content.Intent getCredentialFillInIntent() { return null; }
    public int getEligibleReason() { return 0; }
    public android.content.ClipData getFieldContent() { return null; }
    public android.widget.RemoteViews getFieldDialogPresentation(int p0) { return null; }
    public java.util.ArrayList<android.view.autofill.AutofillId> getFieldIds() { return null; }
    public android.service.autofill.InlinePresentation getFieldInlinePresentation(int p0) { return null; }
    public android.service.autofill.InlinePresentation getFieldInlineTooltipPresentation(int p0) { return null; }
    public android.widget.RemoteViews getFieldPresentation(int p0) { return null; }
    public java.util.ArrayList<android.view.autofill.AutofillValue> getFieldValues() { return null; }
    public android.service.autofill.Dataset.DatasetFieldFilter getFilter(int p0) { return null; }
    public java.lang.String getId() { return null; }
    public boolean isEmpty() { return false; }
    public void setCredentialFillInIntent(android.content.Intent p0) {}
    public void setEligibleReasonReason(int p0) {}
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.content.IntentSender mAuthentication;
        private java.util.ArrayList<java.lang.String> mAutofillDatatypes;
        private android.content.Intent mCredentialFillInIntent;
        private boolean mDestroyed;
        private android.widget.RemoteViews mDialogPresentation;
        private android.content.ClipData mFieldContent;
        private java.util.ArrayList<android.widget.RemoteViews> mFieldDialogPresentations;
        private java.util.ArrayList<android.service.autofill.Dataset.DatasetFieldFilter> mFieldFilters;
        private java.util.ArrayList<android.view.autofill.AutofillId> mFieldIds;
        private java.util.ArrayList<android.service.autofill.InlinePresentation> mFieldInlinePresentations;
        private java.util.ArrayList<android.service.autofill.InlinePresentation> mFieldInlineTooltipPresentations;
        private java.util.ArrayList<android.widget.RemoteViews> mFieldPresentations;
        private android.util.ArrayMap<android.service.autofill.Field, java.lang.Integer> mFieldToIndexdMap;
        private java.util.ArrayList<android.view.autofill.AutofillValue> mFieldValues;
        private java.lang.String mId;
        private android.service.autofill.InlinePresentation mInlinePresentation;
        private android.service.autofill.InlinePresentation mInlineTooltipPresentation;
        private android.widget.RemoteViews mPresentation;
        public Builder() {}
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public Builder(android.service.autofill.InlinePresentation p0) {}
        public Builder(android.service.autofill.Presentations p0) {}
        @java.lang.Deprecated
        public Builder(android.widget.RemoteViews p0) {}
        private void createFromParcel(android.view.autofill.AutofillId p0, java.lang.String p1, android.view.autofill.AutofillValue p2, android.widget.RemoteViews p3, android.service.autofill.InlinePresentation p4, android.service.autofill.InlinePresentation p5, android.service.autofill.Dataset.DatasetFieldFilter p6, android.widget.RemoteViews p7) {}
        private int setLifeTheUniverseAndEverything(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3, android.service.autofill.InlinePresentation p4, android.service.autofill.Dataset.DatasetFieldFilter p5, android.widget.RemoteViews p6) { return 0; }
        private int setLifeTheUniverseAndEverything(java.lang.String p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3, android.service.autofill.InlinePresentation p4, android.service.autofill.Dataset.DatasetFieldFilter p5, android.widget.RemoteViews p6) { return 0; }
        private void throwIfDestroyed() {}
        public android.service.autofill.Dataset build() { return null; }
        public android.service.autofill.Dataset.Builder setAuthentication(android.content.IntentSender p0) { return null; }
        @android.annotation.SystemApi
        public android.service.autofill.Dataset.Builder setContent(android.view.autofill.AutofillId p0, android.content.ClipData p1) { return null; }
        public android.service.autofill.Dataset.Builder setCredentialFillInIntent(android.content.Intent p0) { return null; }
        public android.service.autofill.Dataset.Builder setField(android.view.autofill.AutofillId p0, android.service.autofill.Field p1) { return null; }
        public android.service.autofill.Dataset.Builder setField(java.lang.String p0, android.service.autofill.Field p1) { return null; }
        public android.service.autofill.Dataset.Builder setFieldForAllHints(android.service.autofill.Field p0) { return null; }
        @android.annotation.SystemApi
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setFieldInlinePresentation(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.service.autofill.InlinePresentation p3) { return null; }
        public android.service.autofill.Dataset.Builder setId(java.lang.String p0) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setInlinePresentation(android.service.autofill.InlinePresentation p0) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setInlinePresentation(android.service.autofill.InlinePresentation p0, android.service.autofill.InlinePresentation p1) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3, android.service.autofill.InlinePresentation p4) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.widget.RemoteViews p3) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.widget.RemoteViews p3, android.service.autofill.InlinePresentation p4) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.Dataset.Builder setValue(android.view.autofill.AutofillId p0, android.view.autofill.AutofillValue p1, java.util.regex.Pattern p2, android.widget.RemoteViews p3, android.service.autofill.InlinePresentation p4, android.service.autofill.InlinePresentation p5) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DatasetEligibleReason {
    }

    public static final class DatasetFieldFilter implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.service.autofill.Dataset.DatasetFieldFilter> CREATOR = null;
        public final java.util.regex.Pattern pattern = null;
        DatasetFieldFilter(java.util.regex.Pattern p0) {}
        public int describeContents() { return 0; }
        public java.util.regex.Pattern getPattern() { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}

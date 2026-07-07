package android.service.autofill;

public final class FillResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.FillResponse> CREATOR = null;
    public static final int FLAG_CREDENTIAL_MANAGER_RESPONSE = 8;
    public static final int FLAG_DELAY_FILL = 4;
    public static final int FLAG_DISABLE_ACTIVITY_ONLY = 2;
    public static final int FLAG_TRACK_CONTEXT_COMMITED = 1;
    private final android.content.IntentSender mAuthentication = null;
    private final android.view.autofill.AutofillId[] mAuthenticationIds = null;
    private final int[] mCancelIds = null;
    private final android.os.Bundle mClientState = null;
    private final android.content.pm.ParceledListSlice<android.service.autofill.Dataset> mDatasets = null;
    private final android.service.assist.classification.FieldClassification[] mDetectedFieldTypes = null;
    private final android.widget.RemoteViews mDialogHeader = null;
    private final android.app.PendingIntent mDialogPendingIntent = null;
    private final android.widget.RemoteViews mDialogPresentation = null;
    private final long mDisableDuration = 0L;
    private final android.view.autofill.AutofillId[] mFieldClassificationIds = null;
    private final android.view.autofill.AutofillId[] mFillDialogTriggerIds = null;
    private final int mFlags = 0;
    private final android.widget.RemoteViews mFooter = null;
    private final android.widget.RemoteViews mHeader = null;
    private final int mIconResourceId = 0;
    private final android.view.autofill.AutofillId[] mIgnoredIds = null;
    private final android.service.autofill.InlinePresentation mInlinePresentation = null;
    private final android.service.autofill.InlinePresentation mInlineTooltipPresentation = null;
    private final android.widget.RemoteViews mPresentation = null;
    private int mRequestId;
    private final android.service.autofill.SaveInfo mSaveInfo = null;
    private final int mServiceDisplayNameResourceId = 0;
    private final boolean mShowFillDialogIcon = false;
    private final boolean mShowSaveDialogIcon = false;
    private final boolean mSupportsInlineSuggestions = false;
    private final android.service.autofill.UserData mUserData = null;
    private FillResponse(android.content.pm.ParceledListSlice<android.service.autofill.Dataset> p0, android.service.autofill.SaveInfo p1, android.os.Bundle p2, android.widget.RemoteViews p3, android.service.autofill.InlinePresentation p4, android.service.autofill.InlinePresentation p5, android.widget.RemoteViews p6, android.widget.RemoteViews p7, android.widget.RemoteViews p8, android.widget.RemoteViews p9, android.content.IntentSender p10, android.view.autofill.AutofillId[] p11, android.view.autofill.AutofillId[] p12, android.view.autofill.AutofillId[] p13, long p14, android.view.autofill.AutofillId[] p15, int p16, int p17, android.service.autofill.UserData p18, int[] p19, boolean p20, int p21, int p22, boolean p23, boolean p24, android.service.assist.classification.FieldClassification[] p25, android.app.PendingIntent p26) {}
    private FillResponse(android.service.autofill.FillResponse.Builder p0) {}
    public static android.service.autofill.FillResponse shallowCopy(android.service.autofill.FillResponse p0, java.util.List<android.service.autofill.Dataset> p1, android.service.autofill.SaveInfo p2) { return null; }
    public int describeContents() { return 0; }
    public android.content.IntentSender getAuthentication() { return null; }
    public android.view.autofill.AutofillId[] getAuthenticationIds() { return null; }
    public int[] getCancelIds() { return null; }
    public android.os.Bundle getClientState() { return null; }
    public java.util.List<android.service.autofill.Dataset> getDatasets() { return null; }
    public java.util.Set<android.service.assist.classification.FieldClassification> getDetectedFieldClassifications() { return null; }
    public android.widget.RemoteViews getDialogHeader() { return null; }
    public android.widget.RemoteViews getDialogPresentation() { return null; }
    public long getDisableDuration() { return 0L; }
    public android.view.autofill.AutofillId[] getFieldClassificationIds() { return null; }
    public android.view.autofill.AutofillId[] getFillDialogTriggerIds() { return null; }
    public int getFlags() { return 0; }
    public android.widget.RemoteViews getFooter() { return null; }
    public android.widget.RemoteViews getHeader() { return null; }
    public int getIconResourceId() { return 0; }
    public android.view.autofill.AutofillId[] getIgnoredIds() { return null; }
    public android.service.autofill.InlinePresentation getInlinePresentation() { return null; }
    public android.service.autofill.InlinePresentation getInlineTooltipPresentation() { return null; }
    public android.widget.RemoteViews getPresentation() { return null; }
    public int getRequestId() { return 0; }
    public android.service.autofill.SaveInfo getSaveInfo() { return null; }
    public int getServiceDisplayNameResourceId() { return 0; }
    public boolean getShowFillDialogIcon() { return false; }
    public boolean getShowSaveDialogIcon() { return false; }
    public android.service.autofill.UserData getUserData() { return null; }
    public void setRequestId(int p0) {}
    public boolean supportsInlineSuggestions() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private android.content.IntentSender mAuthentication;
        private android.view.autofill.AutofillId[] mAuthenticationIds;
        private int[] mCancelIds;
        private android.os.Bundle mClientState;
        private java.util.ArrayList<android.service.autofill.Dataset> mDatasets;
        private boolean mDestroyed;
        private android.service.assist.classification.FieldClassification[] mDetectedFieldTypes;
        private android.widget.RemoteViews mDialogHeader;
        private android.app.PendingIntent mDialogPendingIntent;
        private android.widget.RemoteViews mDialogPresentation;
        private long mDisableDuration;
        private android.view.autofill.AutofillId[] mFieldClassificationIds;
        private android.view.autofill.AutofillId[] mFillDialogTriggerIds;
        private int mFlags;
        private android.widget.RemoteViews mFooter;
        private android.widget.RemoteViews mHeader;
        private int mIconResourceId;
        private android.view.autofill.AutofillId[] mIgnoredIds;
        private android.service.autofill.InlinePresentation mInlinePresentation;
        private android.service.autofill.InlinePresentation mInlineTooltipPresentation;
        private android.widget.RemoteViews mPresentation;
        private android.service.autofill.SaveInfo mSaveInfo;
        private int mServiceDisplayNameResourceId;
        private boolean mShowFillDialogIcon;
        private boolean mShowSaveDialogIcon;
        private boolean mSupportsInlineSuggestions;
        private android.service.autofill.UserData mUserData;
        public Builder() {}
        private android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3, android.service.autofill.InlinePresentation p4, android.widget.RemoteViews p5) { return null; }
        private void throwIfAuthenticationCalled() {}
        private void throwIfDestroyed() {}
        private void throwIfDisableAutofillCalled() {}
        public android.service.autofill.FillResponse.Builder addDataset(android.service.autofill.Dataset p0) { return null; }
        public android.service.autofill.FillResponse build() { return null; }
        public android.service.autofill.FillResponse.Builder disableAutofill(long p0) { return null; }
        public android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.service.autofill.Presentations p2) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.widget.RemoteViews p2) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3) { return null; }
        @java.lang.Deprecated
        public android.service.autofill.FillResponse.Builder setAuthentication(android.view.autofill.AutofillId[] p0, android.content.IntentSender p1, android.widget.RemoteViews p2, android.service.autofill.InlinePresentation p3, android.service.autofill.InlinePresentation p4) { return null; }
        public android.service.autofill.FillResponse.Builder setClientState(android.os.Bundle p0) { return null; }
        public android.service.autofill.FillResponse.Builder setDatasets(java.util.ArrayList<android.service.autofill.Dataset> p0) { return null; }
        public android.service.autofill.FillResponse.Builder setDetectedFieldClassifications(java.util.Set<android.service.assist.classification.FieldClassification> p0) { return null; }
        public android.service.autofill.FillResponse.Builder setDialogHeader(android.widget.RemoteViews p0) { return null; }
        public android.service.autofill.FillResponse.Builder setDialogPendingIntent(android.app.PendingIntent p0) { return null; }
        public android.service.autofill.FillResponse.Builder setFieldClassificationIds(android.view.autofill.AutofillId... p0) { return null; }
        public android.service.autofill.FillResponse.Builder setFillDialogTriggerIds(android.view.autofill.AutofillId... p0) { return null; }
        public android.service.autofill.FillResponse.Builder setFlags(int p0) { return null; }
        public android.service.autofill.FillResponse.Builder setFooter(android.widget.RemoteViews p0) { return null; }
        public android.service.autofill.FillResponse.Builder setHeader(android.widget.RemoteViews p0) { return null; }
        public android.service.autofill.FillResponse.Builder setIconResourceId(int p0) { return null; }
        public android.service.autofill.FillResponse.Builder setIgnoredIds(android.view.autofill.AutofillId... p0) { return null; }
        public android.service.autofill.FillResponse.Builder setPresentationCancelIds(int[] p0) { return null; }
        public android.service.autofill.FillResponse.Builder setSaveInfo(android.service.autofill.SaveInfo p0) { return null; }
        public android.service.autofill.FillResponse.Builder setServiceDisplayNameResourceId(int p0) { return null; }
        public android.service.autofill.FillResponse.Builder setShowFillDialogIcon(boolean p0) { return null; }
        public android.service.autofill.FillResponse.Builder setShowSaveDialogIcon(boolean p0) { return null; }
        public android.service.autofill.FillResponse.Builder setUserData(android.service.autofill.UserData p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface FillResponseFlags {
    }
}

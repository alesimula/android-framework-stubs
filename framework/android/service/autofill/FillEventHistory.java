package android.service.autofill;

public final class FillEventHistory implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.FillEventHistory> CREATOR = null;
    private static final java.lang.String TAG = "FillEventHistory";
    private final android.os.Bundle mClientState = null;
    java.util.List<android.service.autofill.FillEventHistory.Event> mEvents;
    private final int mSessionId = 0;
    public FillEventHistory(int p0, android.os.Bundle p1) {}
    public void addEvent(android.service.autofill.FillEventHistory.Event p0) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    @java.lang.Deprecated
    public android.os.Bundle getClientState() { return null; }
    public java.util.List<android.service.autofill.FillEventHistory.Event> getEvents() { return null; }
    public int getSessionId() { return 0; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Event {
        public static final int NO_SAVE_UI_REASON_DATASET_MATCH = 6;
        public static final int NO_SAVE_UI_REASON_FIELD_VALIDATION_FAILED = 5;
        public static final int NO_SAVE_UI_REASON_HAS_EMPTY_REQUIRED = 3;
        public static final int NO_SAVE_UI_REASON_NONE = 0;
        public static final int NO_SAVE_UI_REASON_NO_SAVE_INFO = 1;
        public static final int NO_SAVE_UI_REASON_NO_VALUE_CHANGED = 4;
        public static final int NO_SAVE_UI_REASON_USING_CREDMAN = 7;
        public static final int NO_SAVE_UI_REASON_WITH_DELAY_SAVE_FLAG = 2;
        public static final int TYPE_AUTHENTICATION_SELECTED = 2;
        public static final int TYPE_CONTEXT_COMMITTED = 4;
        public static final int TYPE_DATASETS_SHOWN = 5;
        public static final int TYPE_DATASET_AUTHENTICATION_SELECTED = 1;
        public static final int TYPE_DATASET_SELECTED = 0;
        public static final int TYPE_RESPONSE_DISCARDED = 7;
        public static final int TYPE_SAVE_SHOWN = 3;
        public static final int TYPE_VIEW_REQUESTED_AUTOFILL = 6;
        public static final int UI_TYPE_CREDENTIAL_MANAGER = 4;
        public static final int UI_TYPE_CREDMAN_BOTTOM_SHEET = 4;
        public static final int UI_TYPE_DIALOG = 3;
        public static final int UI_TYPE_INLINE = 2;
        public static final int UI_TYPE_MENU = 1;
        public static final int UI_TYPE_UNKNOWN = 0;
        private final java.util.ArrayList<java.lang.String> mChangedDatasetIds = null;
        private final java.util.ArrayList<android.view.autofill.AutofillId> mChangedFieldIds = null;
        private final android.os.Bundle mClientState = null;
        private final java.lang.String mDatasetId = null;
        private final android.service.autofill.FieldClassification[] mDetectedFieldClassifications = null;
        private final android.view.autofill.AutofillId[] mDetectedFieldIds = null;
        private final int mEventType = 0;
        private final android.view.autofill.AutofillId mFocusedId = null;
        private final android.util.ArraySet<java.lang.String> mIgnoredDatasetIds = null;
        private final java.util.ArrayList<java.util.ArrayList<java.lang.String>> mManuallyFilledDatasetIds = null;
        private final java.util.ArrayList<android.view.autofill.AutofillId> mManuallyFilledFieldIds = null;
        private final int mSaveDialogNotShowReason = 0;
        private final java.util.List<java.lang.String> mSelectedDatasetIds = null;
        private final int mUiType = 0;
        public Event(int p0, java.lang.String p1, android.os.Bundle p2, java.util.List<java.lang.String> p3, android.util.ArraySet<java.lang.String> p4, java.util.ArrayList<android.view.autofill.AutofillId> p5, java.util.ArrayList<java.lang.String> p6, java.util.ArrayList<android.view.autofill.AutofillId> p7, java.util.ArrayList<java.util.ArrayList<java.lang.String>> p8, android.view.autofill.AutofillId[] p9, android.service.autofill.FieldClassification[] p10, int p11, int p12, android.view.autofill.AutofillId p13) {}
        private static java.lang.String eventToString(int p0) { return null; }
        private static java.lang.String uiTypeToString(int p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.util.Map<android.view.autofill.AutofillId, java.lang.String> getChangedFields() { return null; }
        public android.os.Bundle getClientState() { return null; }
        public java.lang.String getDatasetId() { return null; }
        public java.util.Map<android.view.autofill.AutofillId, android.service.autofill.FieldClassification> getFieldsClassification() { return null; }
        public android.view.autofill.AutofillId getFocusedId() { return null; }
        public java.util.Set<java.lang.String> getIgnoredDatasetIds() { return null; }
        public java.util.Map<android.view.autofill.AutofillId, java.util.Set<java.lang.String>> getManuallyEnteredField() { return null; }
        public int getNoSaveUiReason() { return 0; }
        public java.util.Set<java.lang.String> getSelectedDatasetIds() { return null; }
        public java.util.Set<java.lang.String> getShownDatasetIds() { return null; }
        public int getType() { return 0; }
        public int getUiType() { return 0; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        public static final class Builder {
            private java.util.ArrayList<java.lang.String> mChangedDatasetIds;
            private java.util.ArrayList<android.view.autofill.AutofillId> mChangedFieldIds;
            private android.os.Bundle mClientState;
            private java.lang.String mDatasetId;
            private android.service.autofill.FieldClassification[] mDetectedFieldClassifications;
            private android.view.autofill.AutofillId[] mDetectedFieldIds;
            private final int mEventType = 0;
            private android.view.autofill.AutofillId mFocusedId;
            private android.util.ArraySet<java.lang.String> mIgnoredDatasetIds;
            private java.util.ArrayList<java.util.ArrayList<java.lang.String>> mManuallyFilledDatasetIds;
            private java.util.ArrayList<android.view.autofill.AutofillId> mManuallyFilledFieldIds;
            private int mSaveDialogNotShowReason;
            private java.util.List<java.lang.String> mSelectedDatasetIds;
            private int mUiType;
            public Builder(int p0) {}
            public android.service.autofill.FillEventHistory.Event build() { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setChangedDatasetIds(java.util.ArrayList<java.lang.String> p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setChangedFieldIds(java.util.ArrayList<android.view.autofill.AutofillId> p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setClientState(android.os.Bundle p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setDatasetId(java.lang.String p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setDetectedFieldClassifications(android.service.autofill.FieldClassification[] p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setDetectedFieldIds(android.view.autofill.AutofillId[] p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setFocusedId(android.view.autofill.AutofillId p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setIgnoredDatasetIds(android.util.ArraySet<java.lang.String> p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setManuallyFilledDatasetIds(java.util.ArrayList<java.util.ArrayList<java.lang.String>> p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setManuallyFilledFieldIds(java.util.ArrayList<android.view.autofill.AutofillId> p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setSaveDialogNotShowReason(int p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setSelectedDatasetIds(java.util.List<java.lang.String> p0) { return null; }
            public android.service.autofill.FillEventHistory.Event.Builder setUiType(int p0) { return null; }
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        static @interface EventIds {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface NoSaveReason {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface UiType {
        }
    }
}

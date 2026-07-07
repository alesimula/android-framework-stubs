package android.service.personalcontext.hint;

@android.annotation.SystemApi
public class AutofillInlineRequestHint extends android.service.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_ACTIVITY_COMPONENT = "activity_component";
    private static final java.lang.String KEY_AUGMENTED_AUTOFILL_MANAGER_CLIENT = "augmented_autofill_manager_client";
    private static final java.lang.String KEY_AUTOFILL_VALUE = "autofill_value";
    private static final java.lang.String KEY_FILL_EVENT_HISTORY = "fill_event_history";
    private static final java.lang.String KEY_FOCUSED_ID = "focused_id";
    private static final java.lang.String KEY_INLINE_SUGGESTIONS_REQUEST = "inline_suggestions_request";
    private static final java.lang.String KEY_REQUEST_TIMESTAMP = "request_timestamp";
    private static final java.lang.String KEY_SESSION_ID = "session_id";
    private static final java.lang.String KEY_TASK_ID = "task_id";
    private final android.content.ComponentName mActivityComponent = null;
    private final android.service.personalcontext.hint.autofill.AugmentedAutofillProxy mAugmentedAutofillProxy = null;
    private final android.view.autofill.AutofillValue mAutofillValue = null;
    private final android.service.autofill.FillEventHistory mFillEventHistory = null;
    private final android.view.autofill.AutofillId mFocusedId = null;
    private final android.view.inputmethod.InlineSuggestionsRequest mInlineSuggestionsRequest = null;
    private final java.time.Instant mRequestTimestamp = null;
    private final int mSessionId = 0;
    private final int mTaskId = 0;
    private AutofillInlineRequestHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, int p1, int p2, java.time.Instant p3, android.content.ComponentName p4, android.view.autofill.AutofillId p5, android.view.autofill.AutofillValue p6, android.view.inputmethod.InlineSuggestionsRequest p7, android.service.personalcontext.hint.autofill.AugmentedAutofillProxy p8, android.service.autofill.FillEventHistory p9) { super(null); }
    AutofillInlineRequestHint(android.service.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.ComponentName getActivityComponent() { return null; }
    public android.service.personalcontext.hint.autofill.AugmentedAutofillProxy getAugmentedAutofillProxy() { return null; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    public android.service.autofill.FillEventHistory getFillEventHistory() { return null; }
    public android.view.autofill.AutofillId getFocusedId() { return null; }
    int getHintType() { return 0; }
    public android.view.inputmethod.InlineSuggestionsRequest getInlineSuggestionsRequest() { return null; }
    public java.time.Instant getRequestTimestamp() { return null; }
    public int getSessionId() { return 0; }
    public int getTaskId() { return 0; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToSignatureParcel(android.os.Parcel p0) {}

    private static final class AugmentedAutofillProxyImpl implements android.service.personalcontext.hint.autofill.AugmentedAutofillProxy {
        private final android.view.autofill.IAugmentedAutofillManagerClient mClient = null;
        private AugmentedAutofillProxyImpl(android.os.IBinder p0) {}
        public android.os.IBinder asBinder() { return null; }
        public android.app.assist.AssistStructure.ViewNode fetchFocusedViewNode(android.view.autofill.AutofillId p0) { return null; }
        public android.graphics.Rect fetchViewCoordinates(android.view.autofill.AutofillId p0) { return null; }
    }

    public static final class Builder {
        private final android.content.ComponentName mActivityComponent = null;
        private final android.service.personalcontext.hint.autofill.AugmentedAutofillProxy mAugmentedAutofillProxy = null;
        private final android.view.autofill.AutofillValue mAutofillValue = null;
        private final android.service.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private android.service.autofill.FillEventHistory mFillEventHistory;
        private final android.view.autofill.AutofillId mFocusedId = null;
        private final android.view.inputmethod.InlineSuggestionsRequest mInlineSuggestionsRequest = null;
        private final java.time.Instant mRequestTimestamp = null;
        private int mSessionId;
        private int mTaskId;
        public Builder(int p0, int p1, java.time.Instant p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, android.view.inputmethod.InlineSuggestionsRequest p6, android.os.IBinder p7) {}
        public Builder(int p0, int p1, java.time.Instant p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, android.view.inputmethod.InlineSuggestionsRequest p6, android.service.personalcontext.hint.autofill.AugmentedAutofillProxy p7) {}
        public android.service.personalcontext.hint.AutofillInlineRequestHint.Builder addToken(android.service.personalcontext.Token p0) { return null; }
        public android.service.personalcontext.hint.AutofillInlineRequestHint build() { return null; }
        public android.service.personalcontext.hint.AutofillInlineRequestHint.Builder setFillEventHistory(android.service.autofill.FillEventHistory p0) { return null; }
    }
}

package android.app.personalcontext.hint;

public class AutofillInlineRequestHint extends android.app.personalcontext.hint.ContextHint {
    private static final java.lang.String KEY_ACTIVITY_COMPONENT = "activity_component";
    private static final java.lang.String KEY_AUGMENTED_AUTOFILL_MANAGER_CLIENT = "augmented_autofill_manager_client";
    private static final java.lang.String KEY_AUTOFILL_VALUE = "autofill_value";
    private static final java.lang.String KEY_FOCUSED_ID = "focused_id";
    private static final java.lang.String KEY_INLINE_SUGGESTIONS_REQUEST = "inline_suggestions_request";
    private static final java.lang.String KEY_REQUEST_TIMESTAMP = "request_timestamp";
    private static final java.lang.String KEY_SERVICE_COMPAT = "service_compat";
    private static final java.lang.String KEY_SESSION_ID = "session_id";
    private static final java.lang.String KEY_TASK_ID = "task_id";
    private final android.content.ComponentName mActivityComponent = null;
    private final android.app.personalcontext.hint.AugmentedAutofillProxy mAugmentedAutofillProxy = null;
    private final android.view.autofill.AutofillValue mAutofillValue = null;
    private final android.view.autofill.AutofillId mFocusedId = null;
    private final android.view.inputmethod.InlineSuggestionsRequest mInlineSuggestionsRequest = null;
    private final long mRequestTimestampMillis = 0L;
    private final android.os.Bundle mServiceCompat = null;
    private final int mSessionId = 0;
    private final int mTaskId = 0;
    public AutofillInlineRequestHint(int p0, int p1, long p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, android.view.inputmethod.InlineSuggestionsRequest p6, android.app.personalcontext.hint.AugmentedAutofillProxy p7) { super(null); }
    public AutofillInlineRequestHint(int p0, int p1, long p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, android.view.inputmethod.InlineSuggestionsRequest p6, android.os.IBinder p7) { super(null); }
    AutofillInlineRequestHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, int p1, int p2, long p3, android.content.ComponentName p4, android.view.autofill.AutofillId p5, android.view.autofill.AutofillValue p6, android.view.inputmethod.InlineSuggestionsRequest p7, android.app.personalcontext.hint.AugmentedAutofillProxy p8, android.os.Bundle p9) { super(null); }
    AutofillInlineRequestHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Bundle p1) { super(null); }
    AutofillInlineRequestHint(android.app.personalcontext.hint.ContextHint.ConstructorParams p0, android.os.Parcel p1) { super(null); }
    public static android.app.personalcontext.hint.AugmentedAutofillProxy createAugmentedAutofillProxy(android.os.IBinder p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.content.ComponentName getActivityComponent() { return null; }
    public android.app.personalcontext.hint.AugmentedAutofillProxy getAugmentedAutofillProxy() { return null; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    public android.view.autofill.AutofillId getFocusedId() { return null; }
    int getHintType() { return 0; }
    public android.view.inputmethod.InlineSuggestionsRequest getInlineSuggestionsRequest() { return null; }
    public java.time.Instant getRequestTimestamp() { return null; }
    public long getRequestTimestampMillis() { return 0L; }
    public android.os.Bundle getServiceCompat() { return null; }
    public int getSessionId() { return 0; }
    public int getTaskId() { return 0; }
    public int hashCode() { return 0; }
    android.os.Bundle toBundleImpl() { return null; }
    public java.lang.String toString() { return null; }
    void writeImplementationDataToParcel(android.os.Parcel p0, int p1) {}
    public void writeToSignatureParcel(android.os.Parcel p0) {}

    public static final class Builder {
        private final android.content.ComponentName mActivityComponent = null;
        private final android.app.personalcontext.hint.AugmentedAutofillProxy mAugmentedAutofillProxy = null;
        private android.view.autofill.AutofillValue mAutofillValue;
        private final android.app.personalcontext.hint.ContextHint.ConstructorParams.Builder mBaseBuilder = null;
        private final android.view.autofill.AutofillId mFocusedId = null;
        private final android.view.inputmethod.InlineSuggestionsRequest mInlineSuggestionsRequest = null;
        private final long mRequestTimestampMillis = 0L;
        private android.os.Bundle mServiceCompat;
        private int mSessionId;
        private int mTaskId;
        public Builder(int p0, int p1, long p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, android.view.inputmethod.InlineSuggestionsRequest p6, android.app.personalcontext.hint.AugmentedAutofillProxy p7) {}
        public Builder(int p0, int p1, long p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, android.view.inputmethod.InlineSuggestionsRequest p6, android.os.IBinder p7) {}
        public android.app.personalcontext.hint.AutofillInlineRequestHint.Builder addToken(android.app.personalcontext.Token p0) { return null; }
        public android.app.personalcontext.hint.AutofillInlineRequestHint build() { return null; }
        public android.app.personalcontext.hint.AutofillInlineRequestHint.Builder setServiceCompat(android.os.Bundle p0) { return null; }
    }

    private static final class AugmentedAutofillProxyImpl implements android.app.personalcontext.hint.AugmentedAutofillProxy {
        private final android.view.autofill.IAugmentedAutofillManagerClient mClient = null;
        private AugmentedAutofillProxyImpl(android.os.IBinder p0) {}
        public android.os.IBinder asBinder() { return null; }
        public android.app.assist.AssistStructure.ViewNode fetchFocusedViewNode(android.view.autofill.AutofillId p0) { return null; }
        public android.graphics.Rect fetchViewCoordinates(android.view.autofill.AutofillId p0) { return null; }
    }
}

package android.inputmethodservice;

class InlineSuggestionSession {
    static final android.view.inputmethod.InlineSuggestionsResponse EMPTY_RESPONSE = null;
    private static final java.lang.String TAG = "ImsInlineSuggestionSession";
    private boolean mAlwaysNotifyAutofill;
    private final com.android.internal.inputmethod.IInlineSuggestionsRequestCallback mCallback = null;
    private boolean mCallbackInvoked;
    private final java.util.function.Supplier<android.os.IBinder> mHostInputTokenSupplier = null;
    private final android.inputmethodservice.InlineSuggestionSessionController mInlineSuggestionSessionController = null;
    private final android.os.Handler mMainThreadHandler = null;
    private java.lang.Boolean mPreviousResponseIsEmpty;
    private final com.android.internal.inputmethod.InlineSuggestionsRequestInfo mRequestInfo = null;
    private final java.util.function.Function<android.os.Bundle, android.view.inputmethod.InlineSuggestionsRequest> mRequestSupplier = null;
    private android.inputmethodservice.InlineSuggestionSession.InlineSuggestionsResponseCallbackImpl mResponseCallback;
    private final java.util.function.Consumer<android.view.inputmethod.InlineSuggestionsResponse> mResponseConsumer = null;
    InlineSuggestionSession(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0, com.android.internal.inputmethod.IInlineSuggestionsRequestCallback p1, java.util.function.Function<android.os.Bundle, android.view.inputmethod.InlineSuggestionsRequest> p2, java.util.function.Supplier<android.os.IBinder> p3, java.util.function.Consumer<android.view.inputmethod.InlineSuggestionsResponse> p4, android.inputmethodservice.InlineSuggestionSessionController p5, android.os.Handler p6) {}
    void consumeInlineSuggestionsResponse(android.view.inputmethod.InlineSuggestionsResponse p0) {}
    com.android.internal.inputmethod.IInlineSuggestionsRequestCallback getRequestCallback() { return null; }
    com.android.internal.inputmethod.InlineSuggestionsRequestInfo getRequestInfo() { return null; }
    void handleOnInlineSuggestionsResponse(android.view.autofill.AutofillId p0, android.view.inputmethod.InlineSuggestionsResponse p1) {}
    void invalidate() {}
    boolean isCallbackInvoked() { return false; }
    void makeInlineSuggestionRequestUncheck() {}
    boolean shouldSendImeStatus() { return false; }

    private static final class InlineSuggestionsResponseCallbackImpl extends com.android.internal.inputmethod.IInlineSuggestionsResponseCallback.Stub {
        private volatile boolean mInvalid;
        private final java.lang.ref.WeakReference<android.inputmethodservice.InlineSuggestionSession> mSession = null;
        private InlineSuggestionsResponseCallbackImpl(android.inputmethodservice.InlineSuggestionSession p0) { super(); }
        void invalidate() {}
        public void onInlineSuggestionsResponse(android.view.autofill.AutofillId p0, android.view.inputmethod.InlineSuggestionsResponse p1) {}
    }
}

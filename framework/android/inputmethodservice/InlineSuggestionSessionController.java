package android.inputmethodservice;

class InlineSuggestionSessionController {
    private static final java.lang.String TAG = "InlineSuggestionSessionController";
    private final java.util.function.Supplier<android.os.IBinder> mHostInputTokenSupplier = null;
    private android.view.autofill.AutofillId mImeClientFieldId;
    private java.lang.String mImeClientPackageName;
    private boolean mImeInputStarted;
    private boolean mImeInputViewStarted;
    private final android.os.Handler mMainThreadHandler = null;
    private final java.util.function.Function<android.os.Bundle, android.view.inputmethod.InlineSuggestionsRequest> mRequestSupplier = null;
    private final java.util.function.Consumer<android.view.inputmethod.InlineSuggestionsResponse> mResponseConsumer = null;
    private android.inputmethodservice.InlineSuggestionSession mSession;
    InlineSuggestionSessionController(java.util.function.Function<android.os.Bundle, android.view.inputmethod.InlineSuggestionsRequest> p0, java.util.function.Supplier<android.os.IBinder> p1, java.util.function.Consumer<android.view.inputmethod.InlineSuggestionsResponse> p2) {}
    private static boolean match(android.view.autofill.AutofillId p0, android.view.autofill.AutofillId p1) { return false; }
    private static boolean match(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0, java.lang.String p1, android.view.autofill.AutofillId p2) { return false; }
    boolean match(android.view.autofill.AutofillId p0) { return false; }
    boolean match(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0) { return false; }
    void notifyOnFinishInput() {}
    void notifyOnFinishInputView() {}
    void notifyOnShowInputRequested(boolean p0) {}
    void notifyOnStartInput(java.lang.String p0, android.view.autofill.AutofillId p1) {}
    void notifyOnStartInputView() {}
    void onMakeInlineSuggestionsRequest(com.android.internal.inputmethod.InlineSuggestionsRequestInfo p0, com.android.internal.inputmethod.IInlineSuggestionsRequestCallback p1) {}
}

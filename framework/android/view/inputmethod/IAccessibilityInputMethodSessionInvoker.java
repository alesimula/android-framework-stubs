package android.view.inputmethod;

final class IAccessibilityInputMethodSessionInvoker {
    private static final java.lang.String TAG = "IAccessibilityInputMethodSessionInvoker";
    private static android.os.Handler sAsyncBinderEmulationHandler;
    private static final java.lang.Object sAsyncBinderEmulationHandlerLock = null;
    private final android.os.Handler mCustomHandler = null;
    private final com.android.internal.inputmethod.IAccessibilityInputMethodSession mSession = null;
    private IAccessibilityInputMethodSessionInvoker(com.android.internal.inputmethod.IAccessibilityInputMethodSession p0, android.os.Handler p1) {}
    public static android.view.inputmethod.IAccessibilityInputMethodSessionInvoker createOrNull(com.android.internal.inputmethod.IAccessibilityInputMethodSession p0) { return null; }
    private void finishInputInternal() {}
    private void invalidateInputInternal(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2) {}
    private void updateSelectionInternal(int p0, int p1, int p2, int p3, int p4, int p5) {}
    void finishInput() {}
    void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p1, int p2) {}
    void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
}

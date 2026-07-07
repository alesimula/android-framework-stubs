package android.view.inputmethod;

final class IInputMethodSessionInvoker {
    private static final java.lang.String TAG = "InputMethodSessionWrapper";
    private static android.os.Handler sAsyncBinderEmulationHandler;
    private static final java.lang.Object sAsyncBinderEmulationHandlerLock = null;
    private final android.os.Handler mCustomHandler = null;
    private final com.android.internal.inputmethod.IInputMethodSession mSession = null;
    private IInputMethodSessionInvoker(com.android.internal.inputmethod.IInputMethodSession p0, android.os.Handler p1) {}
    private void appPrivateCommandInternal(java.lang.String p0, android.os.Bundle p1) {}
    public static android.view.inputmethod.IInputMethodSessionInvoker createOrNull(com.android.internal.inputmethod.IInputMethodSession p0) { return null; }
    private void finishInputInternal() {}
    private void invalidateInputInternal(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) {}
    private void updateCursorAnchorInfoInternal(android.view.inputmethod.CursorAnchorInfo p0) {}
    private void updateCursorInternal(android.graphics.Rect p0) {}
    private void updateExtractedTextInternal(int p0, android.view.inputmethod.ExtractedText p1) {}
    private void updateSelectionInternal(int p0, int p1, int p2, int p3, int p4, int p5) {}
    private void viewClickedInternal(boolean p0) {}
    void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
    void displayCompletionsInternal(android.view.inputmethod.CompletionInfo[] p0) {}
    void finishInput() {}
    void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) {}
    public java.lang.String toString() { return null; }
    void updateCursor(android.graphics.Rect p0) {}
    void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
    void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
    void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    void viewClicked(boolean p0) {}
}

package android.view.inputmethod;

public class BaseInputConnection implements android.view.inputmethod.InputConnection {
    static final java.lang.Object COMPOSING = null;
    private static final boolean DEBUG = false;
    private static int INVALID_INDEX;
    private static final java.lang.String TAG = "BaseInputConnection";
    private java.lang.Object[] mDefaultComposingSpans;
    android.text.Editable mEditable;
    final boolean mFallbackMode = false;
    protected final android.view.inputmethod.InputMethodManager mIMM = null;
    android.view.KeyCharacterMap mKeyCharacterMap;
    final android.view.View mTargetView = null;
    public BaseInputConnection(android.view.View p0, boolean p1) {}
    BaseInputConnection(android.view.inputmethod.InputMethodManager p0, boolean p1) {}
    private void ensureDefaultComposingSpans() {}
    private static int findIndexBackward(java.lang.CharSequence p0, int p1, int p2) { return 0; }
    private static int findIndexForward(java.lang.CharSequence p0, int p1, int p2) { return 0; }
    public static int getComposingSpanEnd(android.text.Spannable p0) { return 0; }
    public static int getComposingSpanStart(android.text.Spannable p0) { return 0; }
    public static final void removeComposingSpans(android.text.Spannable p0) {}
    private void replaceText(java.lang.CharSequence p0, int p1, boolean p2) {}
    private void replaceTextInternal(int p0, int p1, java.lang.CharSequence p2, int p3, boolean p4) {}
    private void sendCurrentText() {}
    public static void setComposingSpans(android.text.Spannable p0) {}
    public static void setComposingSpans(android.text.Spannable p0, int p1, int p2) {}
    public boolean beginBatchEdit() { return false; }
    public boolean clearMetaKeyStates(int p0) { return false; }
    public void closeConnection() {}
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) { return false; }
    public boolean commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2) { return false; }
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) { return false; }
    public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean deleteSurroundingText(int p0, int p1) { return false; }
    public boolean deleteSurroundingTextInCodePoints(int p0, int p1) { return false; }
    public boolean endBatchEdit() { return false; }
    public void endComposingRegionEditInternal() {}
    public boolean finishComposingText() { return false; }
    public int getCursorCapsMode(int p0) { return 0; }
    public android.text.Editable getEditable() { return null; }
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
    public android.os.Handler getHandler() { return null; }
    public java.lang.CharSequence getSelectedText(int p0) { return null; }
    public android.view.inputmethod.SurroundingText getSurroundingText(int p0, int p1, int p2) { return null; }
    public java.lang.CharSequence getTextAfterCursor(int p0, int p1) { return null; }
    public java.lang.CharSequence getTextBeforeCursor(int p0, int p1) { return null; }
    public boolean performContextMenuAction(int p0) { return false; }
    public boolean performEditorAction(int p0) { return false; }
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
    public boolean replaceText(int p0, int p1, java.lang.CharSequence p2, int p3, android.view.inputmethod.TextAttribute p4) { return false; }
    public boolean reportFullscreenMode(boolean p0) { return false; }
    public boolean requestCursorUpdates(int p0) { return false; }
    public boolean sendKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean setComposingRegion(int p0, int p1) { return false; }
    public boolean setComposingText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean setSelection(int p0, int p1) { return false; }
    public android.view.inputmethod.TextSnapshot takeSnapshot() { return null; }
}

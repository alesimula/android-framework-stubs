package com.android.internal.inputmethod;

public final class EditableInputConnection extends android.view.inputmethod.BaseInputConnection implements android.view.inputmethod.DumpableInputConnection {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "EditableInputConnection";
    private int mBatchEditNesting;
    private final android.widget.TextView mTextView = null;
    public EditableInputConnection(android.widget.TextView p0) { super((android.view.View)null, false); }
    public boolean beginBatchEdit() { return false; }
    public boolean clearMetaKeyStates(int p0) { return false; }
    public void closeConnection() {}
    public boolean commitCompletion(android.view.inputmethod.CompletionInfo p0) { return false; }
    public boolean commitCorrection(android.view.inputmethod.CorrectionInfo p0) { return false; }
    public boolean commitText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean commitText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean endBatchEdit() { return false; }
    public void endComposingRegionEditInternal() {}
    public android.text.Editable getEditable() { return null; }
    public android.view.inputmethod.ExtractedText getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1) { return null; }
    public boolean performContextMenuAction(int p0) { return false; }
    public boolean performEditorAction(int p0) { return false; }
    public void performHandwritingGesture(android.view.inputmethod.HandwritingGesture p0, java.util.concurrent.Executor p1, java.util.function.IntConsumer p2) {}
    public boolean performPrivateCommand(java.lang.String p0, android.os.Bundle p1) { return false; }
    public boolean performSpellCheck() { return false; }
    public boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture p0, android.os.CancellationSignal p1) { return false; }
    public boolean requestCursorUpdates(int p0) { return false; }
    public boolean requestCursorUpdates(int p0, int p1) { return false; }
    public void requestTextBoundsInfo(android.graphics.RectF p0, java.util.concurrent.Executor p1, java.util.function.Consumer<android.view.inputmethod.TextBoundsInfoResult> p2) {}
    public boolean setComposingText(java.lang.CharSequence p0, int p1) { return false; }
    public boolean setComposingText(java.lang.CharSequence p0, int p1, android.view.inputmethod.TextAttribute p2) { return false; }
    public boolean setImeConsumesInput(boolean p0) { return false; }
}

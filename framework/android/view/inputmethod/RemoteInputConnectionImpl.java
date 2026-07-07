package android.view.inputmethod;

final class RemoteInputConnectionImpl extends com.android.internal.inputmethod.IRemoteInputConnection.Stub {
    private static final boolean DEBUG = false;
    private static final int MAX_END_BATCH_EDIT_RETRY = 16;
    private static final java.lang.String TAG = "RemoteInputConnectionImpl";
    private final com.android.internal.inputmethod.IRemoteAccessibilityInputConnection mAccessibilityInputConnection = null;
    private android.os.CancellationSignalBeamer.Receiver mBeamer;
    private final com.android.internal.inputmethod.IRemoteComputerControlInputConnection mComputerControlInputConnection = null;
    private final java.util.concurrent.atomic.AtomicInteger mCurrentSessionId = null;
    private final java.util.concurrent.atomic.AtomicBoolean mDeactivateRequested = null;
    private final android.os.Handler mH = null;
    private final java.util.concurrent.atomic.AtomicBoolean mHasPendingImmediateCursorAnchorInfoUpdate = null;
    private final java.util.concurrent.atomic.AtomicBoolean mHasPendingInvalidation = null;
    private final java.util.concurrent.atomic.AtomicReference<android.view.inputmethod.InputConnection> mInputConnectionRef = null;
    private final java.util.concurrent.atomic.AtomicBoolean mIsCursorAnchorInfoMonitoring = null;
    private final android.os.Looper mLooper = null;
    private final android.view.inputmethod.InputMethodManager mParentInputMethodManager = null;
    private final java.lang.ref.WeakReference<android.view.View> mServedView = null;
    RemoteInputConnectionImpl(android.os.Looper p0, android.view.inputmethod.InputConnection p1, android.view.inputmethod.InputMethodManager p2, android.view.View p3) { super(); }
    private boolean checkSessionId(com.android.internal.inputmethod.InputConnectionCommandHeader p0) { return false; }
    private void dispatch(java.lang.Runnable p0) {}
    private <T extends java.lang.Object> void dispatchWithTracing(java.lang.String p0, com.android.internal.infra.AndroidFuture p1, java.util.function.Supplier<T> p2) {}
    private <T extends java.lang.Object> void dispatchWithTracing(java.lang.String p0, com.android.internal.infra.AndroidFuture p1, java.util.function.Supplier<T> p2, java.util.function.Function<T, byte[]> p3) {}
    private void dispatchWithTracing(java.lang.String p0, java.lang.Runnable p1) {}
    private android.os.CancellationSignalBeamer.Receiver getCancellationSignalBeamer() { return null; }
    private android.view.View getServedView() { return null; }
    private boolean isFinished() { return false; }
    private boolean requestCursorUpdatesInternal(int p0, int p1, int p2) { return false; }
    private static boolean useImeTracing() { return false; }
    public com.android.internal.inputmethod.IRemoteAccessibilityInputConnection asIRemoteAccessibilityInputConnection() { return null; }
    public com.android.internal.inputmethod.IRemoteComputerControlInputConnection asIRemoteComputerControlInputConnection() { return null; }
    public void beginBatchEdit(com.android.internal.inputmethod.InputConnectionCommandHeader p0) {}
    public void cancelCancellationSignal(android.os.IBinder p0) {}
    public void clearMetaKeyStates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) {}
    public void commitCompletion(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.CompletionInfo p1) {}
    public void commitContent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.InputContentInfo p1, int p2, android.os.Bundle p3, com.android.internal.infra.AndroidFuture p4) {}
    public void commitCorrection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.CorrectionInfo p1) {}
    public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) {}
    public void commitTextWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) {}
    public void deactivate() {}
    public void deleteSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) {}
    public void deleteSurroundingTextInCodePoints(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) {}
    public void dispatchReportFullscreenMode(boolean p0) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void endBatchEdit(com.android.internal.inputmethod.InputConnectionCommandHeader p0) {}
    public void finishComposingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0) {}
    public void finishComposingTextFromImm() {}
    public void forgetCancellationSignal(android.os.IBinder p0) {}
    public void getCursorCapsMode(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) {}
    public void getExtractedText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ExtractedTextRequest p1, int p2, com.android.internal.infra.AndroidFuture p3) {}
    public android.view.inputmethod.InputConnection getInputConnection() { return null; }
    public void getSelectedText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) {}
    public void getSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) {}
    public void getTextAfterCursor(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) {}
    public void getTextBeforeCursor(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) {}
    public boolean hasPendingInvalidation() { return false; }
    public boolean isAssociatedWith(android.view.View p0) { return false; }
    public boolean isCursorAnchorInfoMonitoring() { return false; }
    public void performContextMenuAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) {}
    public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) {}
    public void performHandwritingGesture(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ParcelableHandwritingGesture p1, android.os.ResultReceiver p2) {}
    public void performPrivateCommand(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.String p1, android.os.Bundle p2) {}
    public void performSpellCheck(com.android.internal.inputmethod.InputConnectionCommandHeader p0) {}
    public void previewHandwritingGesture(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ParcelableHandwritingGesture p1, android.os.IBinder p2) {}
    public void replaceText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, java.lang.CharSequence p3, int p4, android.view.inputmethod.TextAttribute p5) {}
    public void requestCursorUpdates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) {}
    public void requestCursorUpdatesWithFilter(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) {}
    public void requestTextBoundsInfo(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.graphics.RectF p1, android.os.ResultReceiver p2) {}
    public boolean resetHasPendingImmediateCursorAnchorInfoUpdate() { return false; }
    public void scheduleInvalidateInput() {}
    void scheduleInvalidateInput(boolean p0) {}
    public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) {}
    public void setComposingRegion(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) {}
    public void setComposingRegionWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, android.view.inputmethod.TextAttribute p3) {}
    public void setComposingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) {}
    public void setComposingTextWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) {}
    public void setImeConsumesInput(com.android.internal.inputmethod.InputConnectionCommandHeader p0, boolean p1) {}
    public void setSelection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface Dispatching {
        public boolean cancellable();
    }

    private static final class KnownAlwaysTrueEndBatchEditCache {
        private static volatile java.lang.Class<?>[] sArray;
        private static volatile java.lang.Class<?> sElement;
        private KnownAlwaysTrueEndBatchEditCache() {}
        static void add(java.lang.Class<? extends android.view.inputmethod.InputConnection> p0) {}
        static boolean contains(java.lang.Class<? extends android.view.inputmethod.InputConnection> p0) { return false; }
    }
}

package android.view.contentcapture;

public final class ChildContentCaptureSession extends android.view.contentcapture.ContentCaptureSession {
    private final android.view.contentcapture.ContentCaptureSession mParent = null;
    public ChildContentCaptureSession(android.view.contentcapture.ContentCaptureSession p0, android.view.contentcapture.ContentCaptureContext p1) { super(); }
    protected void flush(int p0) {}
    public int getContentCaptureVersion() { return 0; }
    protected android.view.contentcapture.ContentCaptureSession getMainCaptureSession() { return null; }
    protected void internalNotifyChildSessionFinished(int p0, int p1) {}
    protected void internalNotifyChildSessionStarted(int p0, int p1, android.view.contentcapture.ContentCaptureContext p2) {}
    protected void internalNotifyContentInteractionEvent(int p0, android.view.autofill.AutofillId p1) {}
    protected void internalNotifyContextUpdated(int p0, android.view.contentcapture.ContentCaptureContext p1) {}
    protected void internalNotifySessionFlushEvent(int p0) {}
    protected void internalNotifySessionPaused() {}
    protected void internalNotifySessionResumed() {}
    protected void internalNotifyViewAppeared(int p0, android.view.contentcapture.ViewNode.ViewStructureImpl p1) {}
    protected void internalNotifyViewDisappeared(int p0, android.view.autofill.AutofillId p1) {}
    protected void internalNotifyViewInsetsChanged(int p0, android.graphics.Insets p1) {}
    protected void internalNotifyViewTextChanged(int p0, android.view.autofill.AutofillId p1, java.lang.CharSequence p2) {}
    protected void internalNotifyViewTreeEvent(int p0, boolean p1) {}
    protected boolean isContentCaptureEnabled() { return false; }
    protected boolean isDisabled() { return false; }
    protected android.view.contentcapture.ContentCaptureSession newChild(android.view.contentcapture.ContentCaptureContext p0) { return null; }
    public void notifyContentCaptureEvents(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0) {}
    public void notifyContentCaptureInteractionEvents(android.util.SparseArray<java.util.ArrayList<java.lang.Object>> p0) {}
    public void notifyWindowBoundsChanged(int p0, android.graphics.Rect p1) {}
    protected void onDestroy() {}
    protected boolean setDisabled(boolean p0) { return false; }
    protected void start(android.os.IBinder p0, android.os.IBinder p1, android.content.ComponentName p2, int p3) {}
    public void updateContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0) {}
}

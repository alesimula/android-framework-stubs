package android.view.contentcapture;

@android.annotation.SystemApi
public final class SharedContentCaptureFrame extends android.view.contentcapture.ContentCaptureFrame implements java.lang.AutoCloseable {
    private final android.view.contentcapture.ContentCaptureDoubleBuffer mDoubleBuffer = null;
    private boolean mIsClosed;
    public SharedContentCaptureFrame(android.view.contentcapture.ContentCaptureDoubleBuffer p0, android.view.contentcapture.ContentCaptureSingleBuffer p1, int p2) { super(null, 0); }
    public void checkIsActive() {}
    public void close() {}
    public android.view.contentcapture.LocalContentCaptureFrame copy() { return null; }
    public boolean isActive() { return false; }
}

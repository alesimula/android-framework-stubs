package android.view.contentcapture;

@android.annotation.SystemApi
public final class ContentCaptureFrameCharSequence implements java.lang.CharSequence {
    private static final int MAX_STRING_LENGTH_BYTES = 500000;
    private java.nio.ByteBuffer mBuffer;
    private android.view.contentcapture.ContentCaptureFrame mFrame;
    private int mLength;
    private int mStartOffset;
    public ContentCaptureFrameCharSequence() {}
    private void checkIsActive() {}
    public char charAt(int p0) { return 0; }
    public int length() { return 0; }
    public void pointTo(android.view.contentcapture.ContentCaptureFrame p0, java.nio.ByteBuffer p1, int p2) {}
    public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
    public java.lang.String toString() { return null; }
}

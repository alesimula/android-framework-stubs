package android.view.contentcapture;

@android.annotation.SystemApi
public abstract class ContentCaptureFrame {
    final android.view.contentcapture.ContentCaptureSingleBuffer mSingleBuffer = null;
    final int mVersion = 0;
    public ContentCaptureFrame(android.view.contentcapture.ContentCaptureSingleBuffer p0, int p1) {}
    private static void checkChunkOffsetIsValid(java.nio.ByteBuffer p0, int p1) {}
    private static void checkNodeOffsetIsValid(java.nio.ByteBuffer p0, int p1) {}
    private static void checkNodeOffsetListCountIsValid(java.nio.ByteBuffer p0, int p1, int p2) {}
    private int getCountFromNodeOffsetList(int p0) { return 0; }
    private int getOffsetFromNodeOffsetList(int p0, int p1) { return 0; }
    public abstract void checkIsActive();
    public android.view.contentcapture.ContentCaptureFrame.Cursor createCursor(int p0) { return null; }
    public final int getByteCount() { return 0; }
    public int getChangedNodeListItemOffset(int p0) { return 0; }
    public int getChangedNodeListSize() { return 0; }
    public int getRootNodeListItemOffset(int p0) { return 0; }
    public int getRootNodeListSize() { return 0; }
    public final android.view.contentcapture.ContentCaptureSingleBuffer getSingleBuffer() { return null; }
    public int getTextNodeListItemOffset(int p0) { return 0; }
    public int getTextNodeListSize() { return 0; }
    public final int getVersion() { return 0; }
    public abstract boolean isActive();

    @android.annotation.SystemApi
    public static final class Cursor {
        public static final int CHANGE_BOUNDS = 4;
        public static final int CHANGE_CONTENT_DESCRIPTION = 16;
        public static final int CHANGE_INSERTED = 1;
        public static final int CHANGE_REMOVED = 2;
        private static final int CHANGE_ROLE = 32;
        public static final int CHANGE_TEXT = 8;
        private final java.nio.ByteBuffer mByteBuffer = null;
        private final android.view.contentcapture.ContentCaptureFrame mContentCaptureFrame = null;
        private int mPhysicalOffset;
        Cursor(android.view.contentcapture.ContentCaptureFrame p0, android.view.contentcapture.ContentCaptureSingleBuffer p1, int p2) {}
        private void checkOffsetIsValid(int p0) {}
        private int getRole() { return 0; }
        private void moveToOffsetInternal(int p0) {}
        public android.view.autofill.AutofillId getAutofillId() { return null; }
        public void getBounds(android.graphics.Rect p0) {}
        public int getFlags() { return 0; }
        public int getOffset() { return 0; }
        public boolean isValid() { return false; }
        public boolean moveToFirstChild() { return false; }
        public boolean moveToLastChild() { return false; }
        public boolean moveToNextSibling() { return false; }
        public void moveToOffset(int p0) {}
        public boolean moveToParent() { return false; }
        public boolean moveToPrevSibling() { return false; }
        public void readContentDescription(android.view.contentcapture.ContentCaptureFrameCharSequence p0) {}
        public void readText(android.view.contentcapture.ContentCaptureFrameCharSequence p0) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ChangeFlags {
        }
    }
}

package android.view.contentcapture;

public final class ContentCaptureSingleBuffer {
    static final int CHANGES_NODE_OFFSET_LIST_HEAD = 4;
    public static final int CHANGE_BOUNDS = 4;
    public static final int CHANGE_CONTENT_DESCRIPTION = 16;
    public static final int CHANGE_INSERTED = 1;
    public static final int CHANGE_REMOVED = 2;
    static final int CHANGE_ROLE = 32;
    public static final int CHANGE_TEXT = 8;
    private static final int CHUNK_HDR_COUNT = 4;
    private static final int CHUNK_HDR_NEXT = 0;
    private static final int CHUNK_HDR_SIZE = 8;
    private static final int CHUNK_SIZE_BYTES = 512;
    public static final int FLAG_PLACEHOLDER = 256;
    static final int FLAG_SELF_IS_VIRTUAL_LONG = 64;
    static final int MISC_HEADER_SIZE = 16;
    static final int NODE_SIZE = 64;
    static final int OFF_BOUNDS = 40;
    static final int OFF_BOUNDS_BOTTOM = 52;
    static final int OFF_BOUNDS_LEFT = 40;
    static final int OFF_BOUNDS_RIGHT = 48;
    static final int OFF_BOUNDS_TOP = 44;
    static final int OFF_CONTENT_DESCRIPTION_PTR = 36;
    static final int OFF_FIRST_CHILD_OFFSET = 20;
    static final int OFF_FLAGS = 56;
    static final int OFF_NEXT_SIBLING_OFFSET = 24;
    static final int OFF_PARENT_OFFSET = 16;
    static final int OFF_PREV_SIBLING_OFFSET = 28;
    static final int OFF_ROLE = 60;
    static final int OFF_SELF_ID = 0;
    static final int OFF_SELF_ID_SESSION_ID = 12;
    static final int OFF_SELF_ID_VIEW_ID = 8;
    static final int OFF_SELF_ID_VIRTUAL_ID = 0;
    static final int OFF_TEXT_PTR = 32;
    static final int ROOT_NODE_OFFSET_LIST_HEAD = 8;
    static final int TEXT_NODE_OFFSET_LIST_HEAD = 0;
    private static final int TRANSIENT_FLAGS_MASK = 63;
    final java.nio.ByteBuffer mBuffer = null;
    private final android.util.SparseArray<android.view.autofill.AutofillId> mChangedNodes = null;
    public android.view.contentcapture.ContentCaptureSingleBufferMemoryManager mMemoryManager;
    final long mNativeAddress = 0L;
    private final android.view.contentcapture.AutofillIdOffsetMap mNodeMap = null;
    private boolean mRootDirty;
    private final android.util.SparseBooleanArray mRootNodes = null;
    private final android.graphics.Rect mTempRect = null;
    private boolean mTextDirty;
    private final android.util.SparseBooleanArray mTextNodes = null;
    public ContentCaptureSingleBuffer(java.nio.ByteBuffer p0, long p1, android.view.contentcapture.AutofillIdOffsetMap p2, android.util.SparseBooleanArray p3, android.util.SparseArray<android.view.autofill.AutofillId> p4, android.util.SparseBooleanArray p5, boolean p6) {}
    private void addChild(int p0, int p1) {}
    private int addToNodeOffsetList(int p0, int p1, int p2, int p3) { return 0; }
    private int allocateAndRegisterNode(android.view.autofill.AutofillId p0) { return 0; }
    private void deleteRootNode(int p0) {}
    private void detachFromParent(int p0) {}
    private void flushOffsetList(int p0, android.util.SparseBooleanArray p1) {}
    private void freeNode(int p0) {}
    private int getNodeOffsetIfNotRemoved(android.view.autofill.AutofillId p0) { return 0; }
    private void putRootNode(int p0) {}
    public static android.view.autofill.AutofillId readAutofillId(java.nio.ByteBuffer p0, int p1) { return null; }
    private void resetChunkList(int p0) {}
    private void unlinkNode(int p0) {}
    private void updateBounds(android.view.autofill.AutofillId p0, int p1, int p2, int p3, int p4, int p5) {}
    private void updateContentDescription(android.view.autofill.AutofillId p0, int p1, java.lang.CharSequence p2) {}
    private void updateParent(int p0, android.view.autofill.AutofillId p1) {}
    private void updateStringProperty(android.view.autofill.AutofillId p0, int p1, java.lang.CharSequence p2, int p3, int p4, java.lang.String p5) {}
    private void updateText(android.view.autofill.AutofillId p0, int p1, java.lang.CharSequence p2) {}
    public static void writeAutofillId(java.nio.ByteBuffer p0, int p1, android.view.autofill.AutofillId p2) {}
    public void commit() {}
    public void copyStateFrom(android.view.contentcapture.ContentCaptureSingleBuffer p0) {}
    public void generateLookupTables() {}
    public java.nio.ByteBuffer getBuffer() { return null; }
    int getMiscHeaderOffset() { return 0; }
    int getUsedSize() { return 0; }
    public android.view.contentcapture.ContentCaptureSingleBuffer moveTo(java.nio.ByteBuffer p0, long p1) { return null; }
    public void nodeAppearedOrChanged(android.view.autofill.AutofillId p0, android.view.contentcapture.ContentCaptureNodeProperties p1) {}
    public boolean removeNode(android.view.autofill.AutofillId p0) { return false; }
    public void startFrame() {}

    public static final class ContentCaptureOutOfMemory extends java.lang.RuntimeException {
        public ContentCaptureOutOfMemory(java.lang.String p0) { super(); }
    }
}

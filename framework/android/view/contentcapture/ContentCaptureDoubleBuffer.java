package android.view.contentcapture;

public final class ContentCaptureDoubleBuffer {
    private static final int AVAILABLE_MASK = 1;
    private static final int AVAILABLE_SHIFT = 4;
    private static final int DATA_START_OFFSET = 8;
    private static final int INITIAL_CHANGED_NODES_SIZE = 64;
    private static final int INITIAL_NODE_MAP_SIZE_IN_POWER_OF_TWO = 7;
    private static final int INITIAL_TEXT_NODES_SIZE = 64;
    private static final int LOCK_REGION_SIZE = 4;
    public static final int MIN_SHARED_MEMORY_SIZE = 48;
    private static final int OOM_MASK = 1;
    private static final int OOM_SHIFT = 5;
    private static final int READ_MASK = 3;
    private static final int READ_SHIFT = 0;
    private static final int SECTION_A = 1;
    private static final int SECTION_B = 2;
    private static final int SECTION_NONE = 0;
    private static final int STATE_AND_VERSION_REGION_OFFSET = 4;
    private static final java.lang.String TAG = "CCDoubleBuffer";
    private static final int WRITE_MASK = 3;
    private static final int WRITE_SHIFT = 2;
    private final android.util.SparseArray<android.view.autofill.AutofillId> mChangedNodes = null;
    private boolean mHasChange;
    private final java.nio.ByteBuffer mMainBuffer = null;
    private final long mMainBufferAddress = 0L;
    private final android.view.contentcapture.AutofillIdOffsetMap mNodeMap = null;
    private final android.util.SparseBooleanArray mRootNodes = null;
    private final android.view.contentcapture.ContentCaptureSingleBuffer mSectionA = null;
    private final android.view.contentcapture.ContentCaptureSingleBuffer mSectionB = null;
    private final android.util.SparseBooleanArray mTextNodes = null;
    private android.view.contentcapture.ContentCaptureSingleBuffer mWritableBuffer;
    private ContentCaptureDoubleBuffer(java.nio.ByteBuffer p0, android.view.contentcapture.AutofillIdOffsetMap p1, android.util.SparseBooleanArray p2, android.util.SparseArray<android.view.autofill.AutofillId> p3, android.util.SparseBooleanArray p4, android.view.contentcapture.ContentCaptureSingleBuffer p5, android.view.contentcapture.ContentCaptureSingleBuffer p6) {}
    private ContentCaptureDoubleBuffer(java.nio.ByteBuffer p0, android.view.contentcapture.AutofillIdOffsetMap p1, android.util.SparseBooleanArray p2, android.util.SparseArray<android.view.autofill.AutofillId> p3, android.util.SparseBooleanArray p4, boolean p5) {}
    public static android.view.contentcapture.ContentCaptureDoubleBuffer attach(java.nio.ByteBuffer p0) { return null; }
    private void beginFrame() {}
    public static android.view.contentcapture.ContentCaptureDoubleBuffer create(java.nio.ByteBuffer p0) { return null; }
    private int getAvailableSection(int p0) { return 0; }
    private boolean getOom(int p0) { return false; }
    private int getReadSection(int p0) { return 0; }
    private int getVersion(int p0) { return 0; }
    private int getWriteSection(int p0) { return 0; }
    private void nativeLock() {}
    private void nativeUnlock() {}
    private void setWritableBuffer(int p0) {}
    private int updateStateAndVersion(int p0, int p1, int p2, int p3, boolean p4) { return 0; }
    public android.view.contentcapture.SharedContentCaptureFrame beginRead() { return null; }
    public boolean commitFrame() { return false; }
    public android.view.contentcapture.ContentCaptureDoubleBuffer copyTo(java.nio.ByteBuffer p0) { return null; }
    void endRead() {}
    public java.nio.ByteBuffer getBuffer() { return null; }
    public int getVersion() { return 0; }
    public void nodeAppearedOrChanged(android.view.autofill.AutofillId p0, android.view.contentcapture.ContentCaptureNodeProperties p1) {}
    public boolean removeNode(android.view.autofill.AutofillId p0) { return false; }
    public void setOomLimitReached() {}
    public void unmap() {}
}

package android.view.contentcapture;

public final class ContentCaptureSingleBufferMemoryManager {
    private static final int ALLOCATOR_HEADER_SIZE = 8;
    private static final int BLOCK_FOOTER_SIZE_BYTES = 4;
    public static final int BLOCK_HEADER_SIZE_BYTES = 4;
    public static final int BLOCK_OVERHEAD_BYTES = 8;
    public static final byte BLOCK_TYPE_BLOB = 3;
    public static final byte BLOCK_TYPE_NODE = 1;
    public static final byte BLOCK_TYPE_STRING = 2;
    private static final int HEADER_ARENA_START = 4;
    private static final int HEADER_ARENA_TOP = 0;
    private static final int MIN_BLOCK_SIZE = Integer.valueOf(0);
    private static final int MISC_HEADER_OFFSET = 8;
    private static final int PREALLOCATED_NODE_COUNT = 100;
    private static final java.lang.String TAG = "CCSingleBufferMemMgr";
    private final int mArenaStart = 0;
    private int mArenaTop;
    private final java.nio.ByteBuffer mBuffer = null;
    private final android.util.IntArray mGeneralFreeList = null;
    private final android.util.IntArray mNodeFreeList = null;
    private final int mNodeSize = 0;
    public ContentCaptureSingleBufferMemoryManager(java.nio.ByteBuffer p0, int p1, int p2) {}
    private ContentCaptureSingleBufferMemoryManager(java.nio.ByteBuffer p0, int p1, int p2, int p3) {}
    public static int alignBytes(int p0) { return 0; }
    private int allocateGeneral(int p0, byte p1) { return 0; }
    public static int getArenaStart(java.nio.ByteBuffer p0) { return 0; }
    public static int getBlockSize(java.nio.ByteBuffer p0, int p1) { return 0; }
    public static byte getBlockType(java.nio.ByteBuffer p0, int p1) { return 0; }
    public static int getNextAllocatedPayload(java.nio.ByteBuffer p0, int p1) { return 0; }
    public static int getStringLength(java.nio.ByteBuffer p0, int p1) { return 0; }
    private static int packMetadata(int p0, byte p1, boolean p2) { return 0; }
    private void preallocateNodes() {}
    private void removeFromFreeLists(int p0) {}
    private static boolean unpackIsFree(int p0) { return false; }
    private static int unpackSize(int p0) { return 0; }
    private static byte unpackType(int p0) { return 0; }
    public static void verifyIntegrity(java.nio.ByteBuffer p0) {}
    private void writeBlockMetadata(int p0, int p1, byte p2, boolean p3) {}
    public int allocateBlob(int p0) { return 0; }
    public int allocateNode() { return 0; }
    public int allocateString(int p0) { return 0; }
    public void commit() {}
    public void free(int p0) {}
    public int getMiscHeaderOffset() { return 0; }
    public android.view.contentcapture.ContentCaptureSingleBufferMemoryManager moveTo(java.nio.ByteBuffer p0) { return null; }
}

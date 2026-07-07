package android.util.proto;

public final class ProtoInputStream extends android.util.proto.ProtoStream {
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    public static final int NO_MORE_FIELDS = -1;
    private static final byte STATE_FIELD_MISS = 4;
    private static final byte STATE_READING_PACKED = 2;
    private static final byte STATE_STARTED_FIELD_READ = 1;
    private byte[] mBuffer;
    private final int mBufferSize = 0;
    private int mDepth;
    private int mDiscardedBytes;
    private int mEnd;
    private android.util.LongArray mExpectedObjectTokenStack;
    private int mFieldNumber;
    private int mOffset;
    private int mPackedEnd;
    private byte mState;
    private java.io.InputStream mStream;
    private int mWireType;
    public ProtoInputStream(java.io.InputStream p0) { super(); }
    public ProtoInputStream(java.io.InputStream p0, int p1) { super(); }
    public ProtoInputStream(byte[] p0) { super(); }
    private void assertFieldNumber(long p0) {}
    private void assertFreshData() {}
    private void assertWireType(int p0) {}
    private void checkPacked(long p0) throws java.io.IOException {}
    private void fillBuffer() throws java.io.IOException {}
    private void incOffset(int p0) {}
    private int readFixed32() throws java.io.IOException { return 0; }
    private long readFixed64() throws java.io.IOException { return 0L; }
    private byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
    private java.lang.String readRawString(int p0) throws java.io.IOException { return null; }
    private void readTag() throws java.io.IOException {}
    private long readVarint() throws java.io.IOException { return 0L; }
    public int decodeZigZag32(int p0) { return 0; }
    public long decodeZigZag64(long p0) { return 0L; }
    public java.lang.String dumpDebugData() { return null; }
    public void end(long p0) {}
    public int getFieldNumber() { return 0; }
    public int getOffset() { return 0; }
    public int getWireType() { return 0; }
    public int nextField() throws java.io.IOException { return 0; }
    public boolean nextField(long p0) throws java.io.IOException { return false; }
    public boolean readBoolean(long p0) throws java.io.IOException { return false; }
    public byte[] readBytes(long p0) throws java.io.IOException { return null; }
    public double readDouble(long p0) throws java.io.IOException { return 0.0; }
    public float readFloat(long p0) throws java.io.IOException { return 0.0f; }
    public int readInt(long p0) throws java.io.IOException { return 0; }
    public long readLong(long p0) throws java.io.IOException { return 0L; }
    public java.lang.String readString(long p0) throws java.io.IOException { return null; }
    public void skip() throws java.io.IOException {}
    public long start(long p0) throws java.io.IOException { return 0L; }
}

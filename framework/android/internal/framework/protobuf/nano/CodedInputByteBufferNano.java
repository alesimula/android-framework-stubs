package android.internal.framework.protobuf.nano;

public final class CodedInputByteBufferNano {
    private static final int DEFAULT_RECURSION_LIMIT = 64;
    private static final int DEFAULT_SIZE_LIMIT = 67108864;
    private final byte[] buffer = null;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int bufferStart;
    private int currentLimit;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private int sizeLimit;
    private CodedInputByteBufferNano(byte[] p0, int p1, int p2) {}
    public static int decodeZigZag32(int p0) { return 0; }
    public static long decodeZigZag64(long p0) { return 0L; }
    public static android.internal.framework.protobuf.nano.CodedInputByteBufferNano newInstance(byte[] p0) { return null; }
    public static android.internal.framework.protobuf.nano.CodedInputByteBufferNano newInstance(byte[] p0, int p1, int p2) { return null; }
    private void recomputeBufferSizeAfterLimit() {}
    public void checkLastTagWas(int p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException {}
    public int getBytesUntilLimit() { return 0; }
    public byte[] getData(int p0, int p1) { return null; }
    public int getPosition() { return 0; }
    public boolean isAtEnd() { return false; }
    public void popLimit(int p0) {}
    public int pushLimit(int p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return 0; }
    public boolean readBool() throws java.io.IOException { return false; }
    public byte[] readBytes() throws java.io.IOException { return null; }
    public double readDouble() throws java.io.IOException { return 0.0; }
    public int readEnum() throws java.io.IOException { return 0; }
    public int readFixed32() throws java.io.IOException { return 0; }
    public long readFixed64() throws java.io.IOException { return 0L; }
    public float readFloat() throws java.io.IOException { return 0.0f; }
    public void readGroup(android.internal.framework.protobuf.nano.MessageNano p0, int p1) throws java.io.IOException {}
    public int readInt32() throws java.io.IOException { return 0; }
    public long readInt64() throws java.io.IOException { return 0L; }
    public void readMessage(android.internal.framework.protobuf.nano.MessageNano p0) throws java.io.IOException {}
    java.lang.Object readPrimitiveField(int p0) throws java.io.IOException { return null; }
    public byte readRawByte() throws java.io.IOException { return 0; }
    public byte[] readRawBytes(int p0) throws java.io.IOException { return null; }
    public int readRawLittleEndian32() throws java.io.IOException { return 0; }
    public long readRawLittleEndian64() throws java.io.IOException { return 0L; }
    public int readRawVarint32() throws java.io.IOException { return 0; }
    public long readRawVarint64() throws java.io.IOException { return 0L; }
    public int readSFixed32() throws java.io.IOException { return 0; }
    public long readSFixed64() throws java.io.IOException { return 0L; }
    public int readSInt32() throws java.io.IOException { return 0; }
    public long readSInt64() throws java.io.IOException { return 0L; }
    public java.lang.String readString() throws java.io.IOException { return null; }
    public int readTag() throws java.io.IOException { return 0; }
    public int readUInt32() throws java.io.IOException { return 0; }
    public long readUInt64() throws java.io.IOException { return 0L; }
    public void resetSizeCounter() {}
    public void rewindToPosition(int p0) {}
    public int setRecursionLimit(int p0) { return 0; }
    public int setSizeLimit(int p0) { return 0; }
    public boolean skipField(int p0) throws java.io.IOException { return false; }
    public void skipMessage() throws java.io.IOException {}
    public void skipRawBytes(int p0) throws java.io.IOException {}
}

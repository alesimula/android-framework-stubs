package android.internal.framework.protobuf.nano;

public abstract class MessageNano {
    protected volatile int cachedSize;
    public MessageNano() {}
    public static final <T extends android.internal.framework.protobuf.nano.MessageNano> T mergeFrom(T p0, byte[] p1) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
    public static final <T extends android.internal.framework.protobuf.nano.MessageNano> T mergeFrom(T p0, byte[] p1, int p2, int p3) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
    public static final boolean messageNanoEquals(android.internal.framework.protobuf.nano.MessageNano p0, android.internal.framework.protobuf.nano.MessageNano p1) { return false; }
    public static final void toByteArray(android.internal.framework.protobuf.nano.MessageNano p0, byte[] p1, int p2, int p3) {}
    public static final byte[] toByteArray(android.internal.framework.protobuf.nano.MessageNano p0) { return null; }
    public android.internal.framework.protobuf.nano.MessageNano clone() throws java.lang.CloneNotSupportedException { return null; }
    protected int computeSerializedSize() { return 0; }
    public int getCachedSize() { return 0; }
    public int getSerializedSize() { return 0; }
    public abstract android.internal.framework.protobuf.nano.MessageNano mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException;
    public java.lang.String toString() { return null; }
    public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
}

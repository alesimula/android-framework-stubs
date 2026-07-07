package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
abstract class BinaryReader implements com.android.framework.protobuf.Reader {
    private static final int FIXED32_MULTIPLE_MASK = 3;
    private static final int FIXED64_MULTIPLE_MASK = 7;
    private BinaryReader() {}
    public static com.android.framework.protobuf.BinaryReader newInstance(java.nio.ByteBuffer p0, boolean p1) { return null; }
    public abstract int getTotalBytesRead();
    public boolean shouldDiscardUnknownFields() { return false; }

    private static final class SafeHeapReader extends com.android.framework.protobuf.BinaryReader {
        private final byte[] buffer = null;
        private final boolean bufferIsImmutable = false;
        private int endGroupTag;
        private final int initialPos = 0;
        private int limit;
        private int pos;
        private int tag;
        public SafeHeapReader(java.nio.ByteBuffer p0, boolean p1) { super(); }
        private boolean isAtEnd() { return false; }
        private byte readByte() throws java.io.IOException { return 0; }
        private java.lang.Object readField(com.android.framework.protobuf.WireFormat.FieldType p0, java.lang.Class<?> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException { return null; }
        private <T extends java.lang.Object> T readGroup(com.android.framework.protobuf.Schema<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        private int readLittleEndian32() throws java.io.IOException { return 0; }
        private int readLittleEndian32_NoCheck() { return 0; }
        private long readLittleEndian64() throws java.io.IOException { return 0L; }
        private long readLittleEndian64_NoCheck() { return 0L; }
        private <T extends java.lang.Object> T readMessage(com.android.framework.protobuf.Schema<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        private int readVarint32() throws java.io.IOException { return 0; }
        private long readVarint64SlowPath() throws java.io.IOException { return 0L; }
        private void requireBytes(int p0) throws java.io.IOException {}
        private void requirePosition(int p0) throws java.io.IOException {}
        private void requireWireType(int p0) throws java.io.IOException {}
        private void skipBytes(int p0) throws java.io.IOException {}
        private void skipGroup() throws java.io.IOException {}
        private void skipVarint() throws java.io.IOException {}
        private void skipVarintSlowPath() throws java.io.IOException {}
        private void verifyPackedFixed32Length(int p0) throws java.io.IOException {}
        private void verifyPackedFixed64Length(int p0) throws java.io.IOException {}
        public int getFieldNumber() throws java.io.IOException { return 0; }
        public int getTag() { return 0; }
        public int getTotalBytesRead() { return 0; }
        public <T extends java.lang.Object> void mergeGroupField(T p0, com.android.framework.protobuf.Schema<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        public <T extends java.lang.Object> void mergeMessageField(T p0, com.android.framework.protobuf.Schema<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        public boolean readBool() throws java.io.IOException { return false; }
        public void readBoolList(java.util.List<java.lang.Boolean> p0) throws java.io.IOException {}
        public com.android.framework.protobuf.ByteString readBytes() throws java.io.IOException { return null; }
        public void readBytesList(java.util.List<com.android.framework.protobuf.ByteString> p0) throws java.io.IOException {}
        public double readDouble() throws java.io.IOException { return 0.0; }
        public void readDoubleList(java.util.List<java.lang.Double> p0) throws java.io.IOException {}
        public int readEnum() throws java.io.IOException { return 0; }
        public void readEnumList(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
        public int readFixed32() throws java.io.IOException { return 0; }
        public void readFixed32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
        public long readFixed64() throws java.io.IOException { return 0L; }
        public void readFixed64List(java.util.List<java.lang.Long> p0) throws java.io.IOException {}
        public float readFloat() throws java.io.IOException { return 0.0f; }
        public void readFloatList(java.util.List<java.lang.Float> p0) throws java.io.IOException {}
        @java.lang.Deprecated
        public <T extends java.lang.Object> T readGroup(java.lang.Class<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        @java.lang.Deprecated
        public <T extends java.lang.Object> T readGroupBySchemaWithCheck(com.android.framework.protobuf.Schema<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        @java.lang.Deprecated
        public <T extends java.lang.Object> void readGroupList(java.util.List<T> p0, com.android.framework.protobuf.Schema<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        @java.lang.Deprecated
        public <T extends java.lang.Object> void readGroupList(java.util.List<T> p0, java.lang.Class<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        public int readInt32() throws java.io.IOException { return 0; }
        public void readInt32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
        public long readInt64() throws java.io.IOException { return 0L; }
        public void readInt64List(java.util.List<java.lang.Long> p0) throws java.io.IOException {}
        public <K extends java.lang.Object, V extends java.lang.Object> void readMap(java.util.Map<K, V> p0, com.android.framework.protobuf.MapEntryLite.Metadata<K, V> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        public <T extends java.lang.Object> T readMessage(java.lang.Class<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        public <T extends java.lang.Object> T readMessageBySchemaWithCheck(com.android.framework.protobuf.Schema<T> p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException { return null; }
        public <T extends java.lang.Object> void readMessageList(java.util.List<T> p0, com.android.framework.protobuf.Schema<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        public <T extends java.lang.Object> void readMessageList(java.util.List<T> p0, java.lang.Class<T> p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException {}
        public int readSFixed32() throws java.io.IOException { return 0; }
        public void readSFixed32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
        public long readSFixed64() throws java.io.IOException { return 0L; }
        public void readSFixed64List(java.util.List<java.lang.Long> p0) throws java.io.IOException {}
        public int readSInt32() throws java.io.IOException { return 0; }
        public void readSInt32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
        public long readSInt64() throws java.io.IOException { return 0L; }
        public void readSInt64List(java.util.List<java.lang.Long> p0) throws java.io.IOException {}
        public java.lang.String readString() throws java.io.IOException { return null; }
        public java.lang.String readStringInternal(boolean p0) throws java.io.IOException { return null; }
        public void readStringList(java.util.List<java.lang.String> p0) throws java.io.IOException {}
        public void readStringListInternal(java.util.List<java.lang.String> p0, boolean p1) throws java.io.IOException {}
        public void readStringListRequireUtf8(java.util.List<java.lang.String> p0) throws java.io.IOException {}
        public java.lang.String readStringRequireUtf8() throws java.io.IOException { return null; }
        public int readUInt32() throws java.io.IOException { return 0; }
        public void readUInt32List(java.util.List<java.lang.Integer> p0) throws java.io.IOException {}
        public long readUInt64() throws java.io.IOException { return 0L; }
        public void readUInt64List(java.util.List<java.lang.Long> p0) throws java.io.IOException {}
        public long readVarint64() throws java.io.IOException { return 0L; }
        public boolean skipField() throws java.io.IOException { return false; }
    }
}

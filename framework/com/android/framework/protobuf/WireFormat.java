package com.android.framework.protobuf;

public final class WireFormat {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_ITEM_END_TAG = Integer.valueOf(0);
    static final int MESSAGE_SET_ITEM_TAG = Integer.valueOf(0);
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_MESSAGE_TAG = Integer.valueOf(0);
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int MESSAGE_SET_TYPE_ID_TAG = Integer.valueOf(0);
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;
    private WireFormat() {}
    public static int getTagFieldNumber(int p0) { return 0; }
    public static int getTagWireType(int p0) { return 0; }
    static int makeTag(int p0, int p1) { return 0; }

    public static enum FieldType {
        BOOL,
        BYTES,
        DOUBLE,
        ENUM,
        FIXED32,
        FIXED64,
        FLOAT,
        GROUP,
        INT32,
        INT64,
        MESSAGE,
        SFIXED32,
        SFIXED64,
        SINT32,
        SINT64,
        STRING,
        UINT32,
        UINT64;
        private static final com.android.framework.protobuf.WireFormat.FieldType[] $VALUES = null;
        private final com.android.framework.protobuf.WireFormat.JavaType javaType = null;
        private final int wireType = 0;
        private FieldType() {}
        public com.android.framework.protobuf.WireFormat.JavaType getJavaType() { return null; }
        public int getWireType() { return 0; }
        public boolean isPackable() { return false; }
    }

    public static enum JavaType {
        BOOLEAN,
        BYTE_STRING,
        DOUBLE,
        ENUM,
        FLOAT,
        INT,
        LONG,
        MESSAGE,
        STRING;
        private static final com.android.framework.protobuf.WireFormat.JavaType[] $VALUES = null;
        private final java.lang.Object defaultDefault = null;
        private JavaType() {}
        java.lang.Object getDefaultDefault() { return null; }
    }

    static enum Utf8Validation {
        LAZY,
        LOOSE,
        STRICT;
        private static final com.android.framework.protobuf.WireFormat.Utf8Validation[] $VALUES = null;
        private Utf8Validation() {}
    }
}

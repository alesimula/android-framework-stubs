package android.aconfig.nano;

public interface Aconfig {
    public static final int DISABLED = 2;
    public static final int ENABLED = 1;
    public static final int FLAG_TYPE_BOOLEAN = 1;
    public static final int FLAG_TYPE_INTEGER = 2;
    public static final int FLAG_TYPE_UNSPECIFIED = 0;
    public static final int READ_ONLY = 1;
    public static final int READ_WRITE = 2;

    public static final class FlagReference extends android.internal.framework.protobuf.nano.MessageNano {
        private static volatile android.aconfig.nano.Aconfig.FlagReference[] _emptyArray;
        public java.lang.String name;
        public java.lang.String package_;
        public FlagReference() { super(); }
        public static android.aconfig.nano.Aconfig.FlagReference[] emptyArray() { return null; }
        public static android.aconfig.nano.Aconfig.FlagReference parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.FlagReference parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public android.aconfig.nano.Aconfig.FlagReference clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.FlagReference mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class flag_declaration extends android.internal.framework.protobuf.nano.MessageNano {
        private static volatile android.aconfig.nano.Aconfig.flag_declaration[] _emptyArray;
        public java.lang.String[] bug;
        public java.lang.String description;
        public android.aconfig.nano.Aconfig.FlagReference group;
        public boolean isExported;
        public boolean isFixedReadOnly;
        public android.aconfig.nano.Aconfig.flag_metadata metadata;
        public java.lang.String name;
        public java.lang.String namespace;
        public int type;
        public flag_declaration() { super(); }
        public static android.aconfig.nano.Aconfig.flag_declaration[] emptyArray() { return null; }
        public static android.aconfig.nano.Aconfig.flag_declaration parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.flag_declaration parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public android.aconfig.nano.Aconfig.flag_declaration clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.flag_declaration mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class flag_declarations extends android.internal.framework.protobuf.nano.MessageNano {
        private static volatile android.aconfig.nano.Aconfig.flag_declarations[] _emptyArray;
        public java.lang.String container;
        public android.aconfig.nano.Aconfig.flag_declaration[] flag;
        public java.lang.String package_;
        public flag_declarations() { super(); }
        public static android.aconfig.nano.Aconfig.flag_declarations[] emptyArray() { return null; }
        public static android.aconfig.nano.Aconfig.flag_declarations parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.flag_declarations parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public android.aconfig.nano.Aconfig.flag_declarations clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.flag_declarations mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class flag_metadata extends android.internal.framework.protobuf.nano.MessageNano {
        public static final int ACONFIGD = 1;
        public static final int DEVICE_CONFIG = 2;
        public static final int NONE = 3;
        public static final int PURPOSE_BUGFIX = 2;
        public static final int PURPOSE_FEATURE = 1;
        public static final int PURPOSE_FLAG_GROUP = 3;
        public static final int PURPOSE_UNSPECIFIED = 0;
        public static final int UNSPECIFIED = 0;
        private static volatile android.aconfig.nano.Aconfig.flag_metadata[] _emptyArray;
        public int purpose;
        public int storage;
        public flag_metadata() { super(); }
        public static android.aconfig.nano.Aconfig.flag_metadata[] emptyArray() { return null; }
        public static android.aconfig.nano.Aconfig.flag_metadata parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.flag_metadata parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public android.aconfig.nano.Aconfig.flag_metadata clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.flag_metadata mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class flag_value extends android.internal.framework.protobuf.nano.MessageNano {
        private static volatile android.aconfig.nano.Aconfig.flag_value[] _emptyArray;
        public android.aconfig.nano.Aconfig.FlagReference groupedBy;
        public java.lang.String name;
        public java.lang.String package_;
        public int permission;
        public int state;
        public long valueInt;
        public flag_value() { super(); }
        public static android.aconfig.nano.Aconfig.flag_value[] emptyArray() { return null; }
        public static android.aconfig.nano.Aconfig.flag_value parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.flag_value parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public android.aconfig.nano.Aconfig.flag_value clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.flag_value mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class flag_values extends android.internal.framework.protobuf.nano.MessageNano {
        private static volatile android.aconfig.nano.Aconfig.flag_values[] _emptyArray;
        public android.aconfig.nano.Aconfig.flag_value[] flagValue;
        public flag_values() { super(); }
        public static android.aconfig.nano.Aconfig.flag_values[] emptyArray() { return null; }
        public static android.aconfig.nano.Aconfig.flag_values parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.flag_values parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public android.aconfig.nano.Aconfig.flag_values clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.flag_values mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class parsed_flag extends android.internal.framework.protobuf.nano.MessageNano {
        private static volatile android.aconfig.nano.Aconfig.parsed_flag[] _emptyArray;
        public java.lang.String[] bug;
        public java.lang.String container;
        public java.lang.String description;
        public android.aconfig.nano.Aconfig.FlagReference group;
        public android.aconfig.nano.Aconfig.FlagReference groupedBy;
        public boolean isExported;
        public boolean isFixedReadOnly;
        public android.aconfig.nano.Aconfig.flag_metadata metadata;
        public java.lang.String name;
        public java.lang.String namespace;
        public java.lang.String package_;
        public int permission;
        public int state;
        public android.aconfig.nano.Aconfig.tracepoint[] trace;
        public int type;
        public long valueInt;
        public parsed_flag() { super(); }
        public static android.aconfig.nano.Aconfig.parsed_flag[] emptyArray() { return null; }
        public static android.aconfig.nano.Aconfig.parsed_flag parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.parsed_flag parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public android.aconfig.nano.Aconfig.parsed_flag clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.parsed_flag mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class parsed_flags extends android.internal.framework.protobuf.nano.MessageNano {
        private static volatile android.aconfig.nano.Aconfig.parsed_flags[] _emptyArray;
        public android.aconfig.nano.Aconfig.parsed_flag[] parsedFlag;
        public parsed_flags() { super(); }
        public static android.aconfig.nano.Aconfig.parsed_flags[] emptyArray() { return null; }
        public static android.aconfig.nano.Aconfig.parsed_flags parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.parsed_flags parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public android.aconfig.nano.Aconfig.parsed_flags clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.parsed_flags mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }

    public static final class tracepoint extends android.internal.framework.protobuf.nano.MessageNano {
        private static volatile android.aconfig.nano.Aconfig.tracepoint[] _emptyArray;
        public int permission;
        public java.lang.String source;
        public int state;
        public long valueInt;
        public tracepoint() { super(); }
        public static android.aconfig.nano.Aconfig.tracepoint[] emptyArray() { return null; }
        public static android.aconfig.nano.Aconfig.tracepoint parseFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static android.aconfig.nano.Aconfig.tracepoint parseFrom(byte[] p0) throws android.internal.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public android.aconfig.nano.Aconfig.tracepoint clear() { return null; }
        protected int computeSerializedSize() { return 0; }
        public android.aconfig.nano.Aconfig.tracepoint mergeFrom(android.internal.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public void writeTo(android.internal.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    }
}

package com.android.server.criticalevents.nano;

public final class CriticalEventLogProto extends com.android.framework.protobuf.nano.MessageNano {
    private static volatile com.android.server.criticalevents.nano.CriticalEventLogProto[] _emptyArray;
    public int capacity;
    public com.android.server.criticalevents.nano.CriticalEventProto[] events;
    public long timestampMs;
    public int windowMs;
    public CriticalEventLogProto() { super(); }
    public static com.android.server.criticalevents.nano.CriticalEventLogProto[] emptyArray() { return null; }
    public static com.android.server.criticalevents.nano.CriticalEventLogProto parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    public static com.android.server.criticalevents.nano.CriticalEventLogProto parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
    public com.android.server.criticalevents.nano.CriticalEventLogProto clear() { return null; }
    protected int computeSerializedSize() { return 0; }
    public com.android.server.criticalevents.nano.CriticalEventLogProto mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
}

package com.android.server.am.nano;

public final class Capabilities extends com.android.framework.protobuf.nano.MessageNano {
    private static volatile com.android.server.am.nano.Capabilities[] _emptyArray;
    public com.android.server.am.nano.FrameworkCapability[] frameworkCapabilities;
    public com.android.server.am.nano.Capability[] values;
    public com.android.server.am.nano.VMCapability[] vmCapabilities;
    public com.android.server.am.nano.VMInfo vmInfo;
    public Capabilities() { super(); }
    public static com.android.server.am.nano.Capabilities[] emptyArray() { return null; }
    public static com.android.server.am.nano.Capabilities parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    public static com.android.server.am.nano.Capabilities parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
    public com.android.server.am.nano.Capabilities clear() { return null; }
    protected int computeSerializedSize() { return 0; }
    public com.android.server.am.nano.Capabilities mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
}

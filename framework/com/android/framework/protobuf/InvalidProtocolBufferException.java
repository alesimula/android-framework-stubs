package com.android.framework.protobuf;

public class InvalidProtocolBufferException extends java.io.IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private com.android.framework.protobuf.MessageLite unfinishedMessage;
    private boolean wasThrownFromInputStream;
    public InvalidProtocolBufferException(java.io.IOException p0) { super(); }
    public InvalidProtocolBufferException(java.lang.Exception p0) { super(); }
    public InvalidProtocolBufferException(java.lang.String p0) { super(); }
    public InvalidProtocolBufferException(java.lang.String p0, java.io.IOException p1) { super(); }
    public InvalidProtocolBufferException(java.lang.String p0, java.lang.Exception p1) { super(); }
    static com.android.framework.protobuf.InvalidProtocolBufferException invalidEndTag() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException invalidTag() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException invalidUtf8() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException.InvalidWireTypeException invalidWireType() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException malformedVarint() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException negativeSize() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException parseFailure() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException recursionLimitExceeded() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException sizeLimitExceeded() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException truncatedMessage() { return null; }
    boolean getThrownFromInputStream() { return false; }
    public com.android.framework.protobuf.MessageLite getUnfinishedMessage() { return null; }
    void setThrownFromInputStream() {}
    public com.android.framework.protobuf.InvalidProtocolBufferException setUnfinishedMessage(com.android.framework.protobuf.MessageLite p0) { return null; }
    public java.io.IOException unwrapIOException() { return null; }

    public static class InvalidWireTypeException extends com.android.framework.protobuf.InvalidProtocolBufferException {
        private static final long serialVersionUID = 3283890091615336259L;
        public InvalidWireTypeException(java.lang.String p0) { super((java.io.IOException)null); }
    }
}

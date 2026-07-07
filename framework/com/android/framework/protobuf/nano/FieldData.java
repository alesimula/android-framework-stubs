package com.android.framework.protobuf.nano;

class FieldData implements java.lang.Cloneable {
    private com.android.framework.protobuf.nano.Extension<?, ?> cachedExtension;
    private java.util.List<com.android.framework.protobuf.nano.UnknownFieldData> unknownFieldData;
    private java.lang.Object value;
    FieldData() {}
    <T extends java.lang.Object> FieldData(com.android.framework.protobuf.nano.Extension<?, T> p0, T p1) {}
    private byte[] toByteArray() throws java.io.IOException { return null; }
    void addUnknownField(com.android.framework.protobuf.nano.UnknownFieldData p0) {}
    public final com.android.framework.protobuf.nano.FieldData clone() { return null; }
    int computeSerializedSize() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    com.android.framework.protobuf.nano.UnknownFieldData getUnknownField(int p0) { return null; }
    int getUnknownFieldSize() { return 0; }
    <T extends java.lang.Object> T getValue(com.android.framework.protobuf.nano.Extension<?, T> p0) { return null; }
    public int hashCode() { return 0; }
    <T extends java.lang.Object> void setValue(com.android.framework.protobuf.nano.Extension<?, T> p0, T p1) {}
    void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
}

package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
abstract class AllocatedBuffer {
    AllocatedBuffer() {}
    public static com.android.framework.protobuf.AllocatedBuffer wrap(java.nio.ByteBuffer p0) { return null; }
    public static com.android.framework.protobuf.AllocatedBuffer wrap(byte[] p0) { return null; }
    public static com.android.framework.protobuf.AllocatedBuffer wrap(byte[] p0, int p1, int p2) { return null; }
    private static com.android.framework.protobuf.AllocatedBuffer wrapNoCheck(byte[] p0, int p1, int p2) { return null; }
    public abstract byte[] array();
    public abstract int arrayOffset();
    public abstract boolean hasArray();
    public abstract boolean hasNioBuffer();
    public abstract int limit();
    public abstract java.nio.ByteBuffer nioBuffer();
    public abstract int position();
    public abstract com.android.framework.protobuf.AllocatedBuffer position(int p0);
    public abstract int remaining();
}

package com.android.internal.widget.remotecompose.core;

public class WireBuffer {
    byte[] mBuffer;
    int mIndex;
    int mMaxSize;
    int mSize;
    int mStartingIndex;
    com.android.internal.widget.remotecompose.core.SystemInfo mSystemInfo;
    boolean[] mValidOperations;
    public WireBuffer() {}
    public WireBuffer(int p0) {}
    private void resize(int p0) {}
    public boolean available() { return false; }
    public byte[] cloneBytes() { return null; }
    public void endWithSize() {}
    public byte[] getBuffer() { return null; }
    public int getIndex() { return 0; }
    public int getMax_size() { return 0; }
    public int getSize() { return 0; }
    public com.android.internal.widget.remotecompose.core.SystemInfo getSystemInfo() { return null; }
    public void moveBlock(int p0, int p1) {}
    public void overwriteInt(int p0, int p1) {}
    public int peekInt() { return 0; }
    public boolean readBoolean() { return false; }
    public byte[] readBuffer() { return null; }
    public byte[] readBuffer(int p0) { return null; }
    public int readByte() { return 0; }
    public double readDouble() { return 0.0; }
    public float readFloat() { return 0.0f; }
    public int readInt() { return 0; }
    public long readLong() { return 0L; }
    public int readOperationType() { return 0; }
    public int readShort() { return 0; }
    public java.lang.String readUTF8() { return null; }
    public java.lang.String readUTF8(int p0) { return null; }
    public void reset(int p0) {}
    public void setIndex(int p0) {}
    public void setSystemInfo(com.android.internal.widget.remotecompose.core.SystemInfo p0) {}
    public void setValidOperations(java.util.Set<java.lang.Integer> p0) {}
    public void setVersion(int p0, int p1) {}
    public int size() { return 0; }
    public void start(int p0) {}
    public void startWithSize(int p0) {}
    public void writeBoolean(boolean p0) {}
    public void writeBuffer(byte[] p0) {}
    public void writeByte(int p0) {}
    public void writeDouble(double p0) {}
    public void writeFloat(float p0) {}
    public void writeInt(int p0) {}
    public void writeLong(long p0) {}
    public void writeShort(int p0) {}
    public void writeUTF8(java.lang.String p0) {}
}

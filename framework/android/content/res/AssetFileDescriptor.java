package android.content.res;

public class AssetFileDescriptor implements android.os.Parcelable, java.io.Closeable {
    public static final android.os.Parcelable.Creator<android.content.res.AssetFileDescriptor> CREATOR = null;
    public static final long UNKNOWN_LENGTH = -1L;
    private final android.os.Bundle mExtras = null;
    private final android.os.ParcelFileDescriptor mFd = null;
    private final long mLength = 0L;
    private final long mStartOffset = 0L;
    AssetFileDescriptor(android.os.Parcel p0) {}
    public AssetFileDescriptor(android.os.ParcelFileDescriptor p0, long p1, long p2) {}
    public AssetFileDescriptor(android.os.ParcelFileDescriptor p0, long p1, long p2, android.os.Bundle p3) {}
    public void close() throws java.io.IOException {}
    public java.io.FileInputStream createInputStream() throws java.io.IOException { return null; }
    public java.io.FileOutputStream createOutputStream() throws java.io.IOException { return null; }
    public int describeContents() { return 0; }
    public long getDeclaredLength() { return 0L; }
    public android.os.Bundle getExtras() { return null; }
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    public long getLength() { return 0L; }
    public android.os.ParcelFileDescriptor getParcelFileDescriptor() { return null; }
    public long getStartOffset() { return 0L; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class AutoCloseInputStream extends android.os.ParcelFileDescriptor.AutoCloseInputStream {
        private android.os.ParcelFileDescriptor.AutoCloseInputStream mDelegateInputStream;
        public AutoCloseInputStream(android.content.res.AssetFileDescriptor p0) throws java.io.IOException { super(null); }
        public int available() throws java.io.IOException { return 0; }
        public void close() throws java.io.IOException {}
        public java.nio.channels.FileChannel getChannel() { return null; }
        public void mark(int p0) {}
        public boolean markSupported() { return false; }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public void reset() throws java.io.IOException {}
        public long skip(long p0) throws java.io.IOException { return 0L; }
    }

    public static class AutoCloseOutputStream extends android.os.ParcelFileDescriptor.AutoCloseOutputStream {
        private long mRemaining;
        public AutoCloseOutputStream(android.content.res.AssetFileDescriptor p0) throws java.io.IOException { super(null); }
        public void write(int p0) throws java.io.IOException {}
        public void write(byte[] p0) throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
    }

    private static class NonSeekableAutoCloseInputStream extends android.os.ParcelFileDescriptor.AutoCloseInputStream {
        private long mRemaining;
        NonSeekableAutoCloseInputStream(android.content.res.AssetFileDescriptor p0) throws java.io.IOException { super(null); }
        private long skipRaw(long p0) throws java.io.IOException { return 0L; }
        private long skipRaw$ravenwood(long p0) throws java.io.IOException { return 0L; }
        public int available() throws java.io.IOException { return 0; }
        public void mark(int p0) {}
        public boolean markSupported() { return false; }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public void reset() throws java.io.IOException {}
        public long skip(long p0) throws java.io.IOException { return 0L; }
    }

    private static class SeekableAutoCloseInputStream extends android.os.ParcelFileDescriptor.AutoCloseInputStream {
        private final long mFileOffset = 0L;
        private long mOffset;
        private android.content.res.AssetFileDescriptor.SeekableAutoCloseInputStream.OffsetCorrectFileChannel mOffsetCorrectFileChannel;
        private long mTotalSize;
        SeekableAutoCloseInputStream(android.content.res.AssetFileDescriptor p0) throws java.io.IOException { super(null); }
        private void updateChannelPosition(long p0) throws java.io.IOException {}
        public int available() throws java.io.IOException { return 0; }
        public java.nio.channels.FileChannel getChannel() { return null; }
        public void mark(int p0) {}
        public boolean markSupported() { return false; }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public void reset() throws java.io.IOException {}
        public long skip(long p0) throws java.io.IOException { return 0L; }

        private class OffsetCorrectFileChannel extends java.nio.channels.FileChannel {
            private static final java.lang.String METHOD_NOT_SUPPORTED_MESSAGE = "This Method is not supported in AutoCloseInputStream FileChannel.";
            private final java.nio.channels.FileChannel mDelegate = null;
            OffsetCorrectFileChannel(android.content.res.AssetFileDescriptor.SeekableAutoCloseInputStream p0, java.nio.channels.FileChannel p1) { super(); }
            public void force(boolean p0) throws java.io.IOException {}
            protected void implCloseChannel() throws java.io.IOException {}
            public java.nio.channels.FileLock lock(long p0, long p1, boolean p2) throws java.io.IOException { return null; }
            public java.nio.MappedByteBuffer map(java.nio.channels.FileChannel.MapMode p0, long p1, long p2) throws java.io.IOException { return null; }
            public long position() throws java.io.IOException { return 0L; }
            public java.nio.channels.FileChannel position(long p0) throws java.io.IOException { return null; }
            public int read(java.nio.ByteBuffer p0) throws java.io.IOException { return 0; }
            public int read(java.nio.ByteBuffer p0, long p1) throws java.io.IOException { return 0; }
            public long read(java.nio.ByteBuffer[] p0, int p1, int p2) throws java.io.IOException { return 0L; }
            public long size() throws java.io.IOException { return 0L; }
            public long transferFrom(java.nio.channels.ReadableByteChannel p0, long p1, long p2) throws java.io.IOException { return 0L; }
            public long transferTo(long p0, long p1, java.nio.channels.WritableByteChannel p2) throws java.io.IOException { return 0L; }
            public java.nio.channels.FileChannel truncate(long p0) throws java.io.IOException { return null; }
            public java.nio.channels.FileLock tryLock(long p0, long p1, boolean p2) throws java.io.IOException { return null; }
            public int write(java.nio.ByteBuffer p0) throws java.io.IOException { return 0; }
            public int write(java.nio.ByteBuffer p0, long p1) throws java.io.IOException { return 0; }
            public long write(java.nio.ByteBuffer[] p0, int p1, int p2) throws java.io.IOException { return 0L; }
        }
    }
}

package com.android.internal.os;

public class FuseAppLoop implements android.os.Handler.Callback {
    private static final int ARGS_POOL_SIZE = 50;
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final int FUSE_FSYNC = 20;
    private static final int FUSE_GETATTR = 3;
    private static final int FUSE_LOOKUP = 1;
    private static final int FUSE_MAX_WRITE = 131072;
    private static final int FUSE_OK = 0;
    private static final int FUSE_OPEN = 14;
    private static final int FUSE_READ = 15;
    private static final int FUSE_RELEASE = 18;
    private static final int FUSE_WRITE = 16;
    private static final int MIN_INODE = 2;
    public static final int ROOT_INODE = 1;
    private static final java.lang.String TAG = "FuseAppLoop";
    private static final java.util.concurrent.ThreadFactory sDefaultThreadFactory = null;
    private final java.util.LinkedList<com.android.internal.os.FuseAppLoop.Args> mArgsPool = null;
    private final com.android.internal.os.FuseAppLoop.BytesMap mBytesMap = null;
    private final android.util.SparseArray<com.android.internal.os.FuseAppLoop.CallbackEntry> mCallbackMap = null;
    private long mInstance;
    private final java.lang.Object mLock = null;
    private final int mMountPointId = 0;
    private int mNextInode;
    private final java.lang.Thread mThread = null;
    public FuseAppLoop(int p0, android.os.ParcelFileDescriptor p1, java.util.concurrent.ThreadFactory p2) {}
    private static int checkInode(long p0) { return 0; }
    private com.android.internal.os.FuseAppLoop.CallbackEntry getCallbackEntryOrThrowLocked(long p0) throws android.system.ErrnoException { return null; }
    private static int getError(java.lang.Exception p0) { return 0; }
    private void onCommand(int p0, long p1, long p2, long p3, int p4, byte[] p5) {}
    private byte[] onOpen(long p0, long p1) { return null; }
    private void recycleLocked(com.android.internal.os.FuseAppLoop.Args p0) {}
    private void replySimpleLocked(long p0, int p1) {}
    public int getMountPointId() { return 0; }
    public boolean handleMessage(android.os.Message p0) { return false; }
    native void native_delete(long p0);
    native long native_new(int p0);
    native void native_replyGetAttr(long p0, long p1, long p2, long p3);
    native void native_replyLookup(long p0, long p1, long p2, long p3);
    native void native_replyOpen(long p0, long p1, long p2);
    native void native_replyRead(long p0, long p1, int p2, byte[] p3);
    native void native_replySimple(long p0, long p1, int p2);
    native void native_replyWrite(long p0, long p1, int p2);
    native void native_start(long p0);
    public int registerCallback(android.os.ProxyFileDescriptorCallback p0, android.os.Handler p1) throws com.android.internal.os.FuseUnavailableMountException { return 0; }
    public void unregisterCallback(int p0) {}

    private static class Args {
        byte[] data;
        com.android.internal.os.FuseAppLoop.CallbackEntry entry;
        long inode;
        long offset;
        int size;
        long unique;
        private Args() {}
    }

    private static class BytesMap {
        final java.util.Map<java.lang.Long, com.android.internal.os.FuseAppLoop.BytesMapEntry> mEntries = null;
        private BytesMap() {}
        void clear() {}
        byte[] startUsing(long p0) { return null; }
        void stopUsing(long p0) {}
    }

    private static class BytesMapEntry {
        byte[] bytes;
        int counter;
        private BytesMapEntry() {}
    }

    private static class CallbackEntry {
        final android.os.ProxyFileDescriptorCallback callback = null;
        final android.os.Handler handler = null;
        boolean opened;
        CallbackEntry(android.os.ProxyFileDescriptorCallback p0, android.os.Handler p1) {}
        long getThreadId() { return 0L; }
    }

    public static class UnmountedException extends java.lang.Exception {
        public UnmountedException() { super(); }
    }
}

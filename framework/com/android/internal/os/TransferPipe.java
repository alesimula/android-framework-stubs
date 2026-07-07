package com.android.internal.os;

public class TransferPipe implements java.lang.Runnable, java.io.Closeable {
    static final boolean DEBUG = false;
    static final int DEFAULT_BUFFER_SIZE = 1024;
    static final long DEFAULT_TIMEOUT = 5000L;
    static final java.lang.String TAG = "TransferPipe";
    java.lang.String mBufferPrefix;
    final int mBufferSize = 0;
    boolean mComplete;
    long mEndTime;
    java.lang.String mFailure;
    final android.os.ParcelFileDescriptor[] mFds = null;
    java.io.FileDescriptor mOutFd;
    final java.lang.Thread mThread = null;
    final long mTimeout = 0L;
    public TransferPipe() throws java.io.IOException {}
    public TransferPipe(java.lang.String p0) throws java.io.IOException {}
    protected TransferPipe(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    protected TransferPipe(java.lang.String p0, java.lang.String p1, int p2, long p3) throws java.io.IOException {}
    public static void dumpAsync(android.os.IBinder p0, java.io.FileDescriptor p1, java.lang.String[] p2) throws java.io.IOException, android.os.RemoteException {}
    public static byte[] dumpAsync(android.os.IBinder p0, java.lang.String... p1) throws java.io.IOException, android.os.RemoteException { return null; }
    static void go(com.android.internal.os.TransferPipe.Caller p0, android.os.IInterface p1, java.io.FileDescriptor p2, java.lang.String p3, java.lang.String[] p4) throws java.io.IOException, android.os.RemoteException {}
    static void go(com.android.internal.os.TransferPipe.Caller p0, android.os.IInterface p1, java.io.FileDescriptor p2, java.lang.String p3, java.lang.String[] p4, long p5) throws java.io.IOException, android.os.RemoteException {}
    static void goDump(android.os.IBinder p0, java.io.FileDescriptor p1, java.lang.String[] p2) throws java.io.IOException, android.os.RemoteException {}
    static void goDump(android.os.IBinder p0, java.io.FileDescriptor p1, java.lang.String[] p2, long p3) throws java.io.IOException, android.os.RemoteException {}
    public void close() {}
    void closeFd(int p0) {}
    protected java.io.OutputStream getNewOutputStream() { return null; }
    android.os.ParcelFileDescriptor getReadFd() { return null; }
    public android.os.ParcelFileDescriptor getWriteFd() { return null; }
    public void go(java.io.FileDescriptor p0) throws java.io.IOException {}
    public void go(java.io.FileDescriptor p0, long p1) throws java.io.IOException {}
    public void kill() {}
    public void run() {}
    public void setBufferPrefix(java.lang.String p0) {}

    static interface Caller {
        public void go(android.os.IInterface p0, java.io.FileDescriptor p1, java.lang.String p2, java.lang.String[] p3) throws android.os.RemoteException;
    }
}

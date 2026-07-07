package com.android.internal.os;

public class ProcLocksReader {
    private final java.lang.String mPath = null;
    private android.util.IntArray mPids;
    private com.android.internal.util.ProcFileReader mReader;
    public ProcLocksReader() {}
    public ProcLocksReader(java.lang.String p0) {}
    private void readAndAddPid(boolean p0) throws java.io.IOException {}
    public void handleBlockingFileLocks(com.android.internal.os.ProcLocksReader.ProcLocksReaderCallback p0) throws java.io.IOException {}

    public static interface ProcLocksReaderCallback {
        public void onBlockingFileLock(android.util.IntArray p0);
    }
}

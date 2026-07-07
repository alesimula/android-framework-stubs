package com.android.internal.os;

public final class AtomicDirectory {
    private static final java.lang.String LOG_TAG = null;
    private final java.io.File mBackupDirectory = null;
    private final java.io.File mBaseDirectory = null;
    private final android.util.ArrayMap<java.io.File, java.io.FileOutputStream> mOpenFiles = null;
    public AtomicDirectory(java.io.File p0) {}
    private void backup() throws java.io.IOException {}
    private static boolean deleteDirectory(java.io.File p0) { return false; }
    private void ensureBaseDirectory() throws java.io.IOException {}
    private void restore() throws java.io.IOException {}
    private static void syncDirectory(java.io.File p0) {}
    private void syncParentDirectory() {}
    private void throwIfSomeFilesOpen() {}
    public void closeWrite(java.io.FileOutputStream p0) {}
    public void delete() {}
    public boolean exists() { return false; }
    public void failWrite() {}
    public void failWrite(java.io.FileOutputStream p0) {}
    public void finishRead() {}
    public void finishWrite() {}
    public java.io.File getBackupDirectory() { return null; }
    public java.io.FileOutputStream openWrite(java.io.File p0) throws java.io.IOException { return null; }
    public java.io.File startRead() throws java.io.IOException { return null; }
    public java.io.File startWrite() throws java.io.IOException { return null; }
}

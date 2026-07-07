package android.util;

public class AtomicFileOutputStream extends java.io.FileOutputStream implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "AtomicFileOutputStream";
    private boolean mClosed;
    private final android.util.AtomicFile mFile = null;
    private final java.io.FileOutputStream mOutStream = null;
    private boolean mWritingSuccessful;
    public AtomicFileOutputStream(android.util.AtomicFile p0) throws java.io.IOException { super((java.io.FileDescriptor)null); }
    private AtomicFileOutputStream(android.util.AtomicFile p0, java.io.FileOutputStream p1) throws java.io.IOException { super((java.io.FileDescriptor)null); }
    public void close() throws java.io.IOException {}
    public void markSuccess() {}
    public java.lang.String toString() { return null; }
}

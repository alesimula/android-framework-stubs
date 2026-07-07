package com.android.modules.utils;

public abstract class BasicShellCommandHandler {
    protected static final boolean DEBUG = false;
    protected static final java.lang.String TAG = "ShellCommand";
    private int mArgPos;
    private java.lang.String[] mArgs;
    private java.lang.String mCmd;
    private java.lang.String mCurArgData;
    private java.io.FileDescriptor mErr;
    private java.io.PrintWriter mErrPrintWriter;
    private java.io.FileOutputStream mFileErr;
    private java.io.FileInputStream mFileIn;
    private java.io.FileOutputStream mFileOut;
    private java.io.FileDescriptor mIn;
    private java.io.InputStream mInputStream;
    private java.io.FileDescriptor mOut;
    private java.io.PrintWriter mOutPrintWriter;
    private android.os.Binder mTarget;
    public BasicShellCommandHandler() {}
    public int exec(android.os.Binder p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, java.lang.String[] p4) { return 0; }
    public java.lang.String[] getAllArgs() { return null; }
    public java.io.InputStream getBufferedInputStream() { return null; }
    public java.io.FileDescriptor getErrFileDescriptor() { return null; }
    public java.io.PrintWriter getErrPrintWriter() { return null; }
    public java.io.FileDescriptor getInFileDescriptor() { return null; }
    public java.lang.String getNextArg() { return null; }
    public java.lang.String getNextArgRequired() { return null; }
    public java.lang.String getNextOption() { return null; }
    public java.io.FileDescriptor getOutFileDescriptor() { return null; }
    public java.io.PrintWriter getOutPrintWriter() { return null; }
    public java.io.OutputStream getRawErrorStream() { return null; }
    public java.io.InputStream getRawInputStream() { return null; }
    public java.io.OutputStream getRawOutputStream() { return null; }
    public int getRemainingArgsCount() { return 0; }
    public android.os.Binder getTarget() { return null; }
    public int handleDefaultCommands(java.lang.String p0) { return 0; }
    public void init(android.os.Binder p0, java.io.FileDescriptor p1, java.io.FileDescriptor p2, java.io.FileDescriptor p3, java.lang.String[] p4, int p5) {}
    public abstract int onCommand(java.lang.String p0);
    public abstract void onHelp();
    public java.lang.String peekNextArg() { return null; }
    public java.lang.String[] peekRemainingArgs() { return null; }
}

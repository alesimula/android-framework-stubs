package android.util;

public class IndentingPrintWriter extends java.io.PrintWriter {
    private char[] mCurrentIndent;
    private int mCurrentLength;
    private boolean mEmptyLine;
    private java.lang.StringBuilder mIndentBuilder;
    private char[] mSingleChar;
    private final java.lang.String mSingleIndent = null;
    private final int mWrapLength = 0;
    public IndentingPrintWriter(java.io.Writer p0) { super((java.io.Writer)null); }
    public IndentingPrintWriter(java.io.Writer p0, java.lang.String p1) { super((java.io.Writer)null); }
    public IndentingPrintWriter(java.io.Writer p0, java.lang.String p1, int p2) { super((java.io.Writer)null); }
    public IndentingPrintWriter(java.io.Writer p0, java.lang.String p1, java.lang.String p2) { super((java.io.Writer)null); }
    public IndentingPrintWriter(java.io.Writer p0, java.lang.String p1, java.lang.String p2, int p3) { super((java.io.Writer)null); }
    private void maybeWriteIndent() {}
    public android.util.IndentingPrintWriter decreaseIndent() { return null; }
    public android.util.IndentingPrintWriter increaseIndent() { return null; }
    public android.util.IndentingPrintWriter print(java.lang.String p0, java.lang.Object p1) { return null; }
    public android.util.IndentingPrintWriter printHexInt(java.lang.String p0, int p1) { return null; }
    public void println() {}
    @java.lang.Deprecated
    public android.util.IndentingPrintWriter setIndent(int p0) { return null; }
    @java.lang.Deprecated
    public android.util.IndentingPrintWriter setIndent(java.lang.String p0) { return null; }
    public void write(int p0) {}
    public void write(java.lang.String p0, int p1, int p2) {}
    public void write(char[] p0, int p1, int p2) {}
}

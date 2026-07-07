package com.android.internal.os;

public abstract class LoggingPrintStream extends java.io.PrintStream {
    private final java.lang.StringBuilder builder = null;
    private java.nio.CharBuffer decodedChars;
    private java.nio.charset.CharsetDecoder decoder;
    private java.nio.ByteBuffer encodedBytes;
    private final java.util.Formatter formatter = null;
    protected LoggingPrintStream() { super((java.io.OutputStream)null); }
    public java.io.PrintStream append(char p0) { return null; }
    public java.io.PrintStream append(java.lang.CharSequence p0) { return null; }
    public java.io.PrintStream append(java.lang.CharSequence p0, int p1, int p2) { return null; }
    public boolean checkError() { return false; }
    public void close() {}
    public void flush() {}
    protected void flush(boolean p0) {}
    public java.io.PrintStream format(java.lang.String p0, java.lang.Object... p1) { return null; }
    public java.io.PrintStream format(java.util.Locale p0, java.lang.String p1, java.lang.Object... p2) { return null; }
    protected abstract void log(java.lang.String p0);
    public void print(char p0) {}
    public void print(double p0) {}
    public void print(float p0) {}
    public void print(int p0) {}
    public void print(long p0) {}
    public void print(java.lang.Object p0) {}
    public void print(java.lang.String p0) {}
    public void print(boolean p0) {}
    public void print(char[] p0) {}
    public java.io.PrintStream printf(java.lang.String p0, java.lang.Object... p1) { return null; }
    public java.io.PrintStream printf(java.util.Locale p0, java.lang.String p1, java.lang.Object... p2) { return null; }
    public void println() {}
    public void println(char p0) {}
    public void println(double p0) {}
    public void println(float p0) {}
    public void println(int p0) {}
    public void println(long p0) {}
    public void println(java.lang.Object p0) {}
    public void println(java.lang.String p0) {}
    public void println(boolean p0) {}
    public void println(char[] p0) {}
    protected void setError() {}
    public void write(int p0) {}
    public void write(byte[] p0) {}
    public void write(byte[] p0, int p1, int p2) {}
}

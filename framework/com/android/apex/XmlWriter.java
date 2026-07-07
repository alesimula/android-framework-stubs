package com.android.apex;

public class XmlWriter implements java.io.Closeable {
    static final boolean $assertionsDisabled = false;
    private int indent;
    private java.io.PrintWriter out;
    private java.lang.StringBuilder outBuffer;
    private boolean startLine;
    public XmlWriter(java.io.PrintWriter p0) {}
    private void printIndent() {}
    public static void write(com.android.apex.XmlWriter p0, com.android.apex.ApexInfoList p1) throws java.io.IOException {}
    public void close() {}
    void decreaseIndent() {}
    void increaseIndent() {}
    void print(java.lang.String p0) {}
    void printXml() {}
}

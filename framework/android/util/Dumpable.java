package android.util;

public interface Dumpable {
    public void dump(java.io.PrintWriter p0, java.lang.String[] p1);
    default public java.lang.String getDumpableName() { return null; }
}

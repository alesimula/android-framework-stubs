package android.renderscript;

@java.lang.Deprecated
public class BaseObj {
    private boolean mDestroyed;
    private long mID;
    private java.lang.String mName;
    android.renderscript.RenderScript mRS;
    BaseObj(long p0, android.renderscript.RenderScript p1) {}
    private void helpDestroy() {}
    void checkValid() {}
    public void destroy() {}
    public boolean equals(java.lang.Object p0) { return false; }
    protected void finalize() throws java.lang.Throwable {}
    long getID(android.renderscript.RenderScript p0) { return 0L; }
    public java.lang.String getName() { return null; }
    public int hashCode() { return 0; }
    void setID(long p0) {}
    public void setName(java.lang.String p0) {}
    void updateFromNative() {}
}

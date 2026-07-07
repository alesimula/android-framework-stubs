package android.filterfw.core;

public class StreamPort extends android.filterfw.core.InputPort {
    private android.filterfw.core.Frame mFrame;
    private boolean mPersistent;
    public StreamPort(android.filterfw.core.Filter p0, java.lang.String p1) { super(null, null); }
    protected void assignFrame(android.filterfw.core.Frame p0, boolean p1) {}
    public void clear() {}
    public boolean hasFrame() { return false; }
    public android.filterfw.core.Frame pullFrame() { return null; }
    public void pushFrame(android.filterfw.core.Frame p0) {}
    public void setFrame(android.filterfw.core.Frame p0) {}
    public java.lang.String toString() { return null; }
    public void transfer(android.filterfw.core.FilterContext p0) {}
}

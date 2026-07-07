package android.filterfw.core;

public abstract class FilterPort {
    private static final java.lang.String TAG = "FilterPort";
    protected boolean mChecksType;
    protected android.filterfw.core.Filter mFilter;
    protected boolean mIsBlocking;
    protected boolean mIsOpen;
    private boolean mLogVerbose;
    protected java.lang.String mName;
    protected android.filterfw.core.FrameFormat mPortFormat;
    public FilterPort(android.filterfw.core.Filter p0, java.lang.String p1) {}
    protected void assertPortIsOpen() {}
    protected void checkFrameManager(android.filterfw.core.Frame p0, android.filterfw.core.FilterContext p1) {}
    protected void checkFrameType(android.filterfw.core.Frame p0, boolean p1) {}
    public abstract void clear();
    public void close() {}
    public abstract boolean filterMustClose();
    public android.filterfw.core.Filter getFilter() { return null; }
    public java.lang.String getName() { return null; }
    public android.filterfw.core.FrameFormat getPortFormat() { return null; }
    public abstract boolean hasFrame();
    public boolean isAttached() { return false; }
    public boolean isBlocking() { return false; }
    public boolean isOpen() { return false; }
    public abstract boolean isReady();
    public void open() {}
    public abstract android.filterfw.core.Frame pullFrame();
    public abstract void pushFrame(android.filterfw.core.Frame p0);
    public void setBlocking(boolean p0) {}
    public void setChecksType(boolean p0) {}
    public abstract void setFrame(android.filterfw.core.Frame p0);
    public void setPortFormat(android.filterfw.core.FrameFormat p0) {}
    public java.lang.String toString() { return null; }
}

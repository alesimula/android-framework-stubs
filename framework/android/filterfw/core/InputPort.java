package android.filterfw.core;

public abstract class InputPort extends android.filterfw.core.FilterPort {
    protected android.filterfw.core.OutputPort mSourcePort;
    public InputPort(android.filterfw.core.Filter p0, java.lang.String p1) { super(null, null); }
    public boolean acceptsFrame() { return false; }
    public void close() {}
    public boolean filterMustClose() { return false; }
    public android.filterfw.core.Filter getSourceFilter() { return null; }
    public android.filterfw.core.FrameFormat getSourceFormat() { return null; }
    public android.filterfw.core.OutputPort getSourcePort() { return null; }
    public java.lang.Object getTarget() { return null; }
    public boolean isConnected() { return false; }
    public boolean isReady() { return false; }
    public void open() {}
    public void setSourcePort(android.filterfw.core.OutputPort p0) {}
    public abstract void transfer(android.filterfw.core.FilterContext p0);
}

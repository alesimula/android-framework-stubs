package android.filterfw.core;

public class FilterGraph {
    public static final int AUTOBRANCH_OFF = 0;
    public static final int AUTOBRANCH_SYNCED = 1;
    public static final int AUTOBRANCH_UNSYNCED = 2;
    public static final int TYPECHECK_DYNAMIC = 1;
    public static final int TYPECHECK_OFF = 0;
    public static final int TYPECHECK_STRICT = 2;
    private java.lang.String TAG;
    private int mAutoBranchMode;
    private boolean mDiscardUnconnectedOutputs;
    private java.util.HashSet<android.filterfw.core.Filter> mFilters;
    private boolean mIsReady;
    private boolean mLogVerbose;
    private java.util.HashMap<java.lang.String, android.filterfw.core.Filter> mNameMap;
    private java.util.HashMap<android.filterfw.core.OutputPort, java.util.LinkedList<android.filterfw.core.InputPort>> mPreconnections;
    private int mTypeCheckMode;
    public FilterGraph() {}
    private void checkConnections() {}
    private void connectPorts() {}
    private void discardUnconnectedOutputs() {}
    private java.util.HashSet<android.filterfw.core.Filter> getSourceFilters() { return null; }
    private void preconnect(android.filterfw.core.OutputPort p0, android.filterfw.core.InputPort p1) {}
    private boolean readyForProcessing(android.filterfw.core.Filter p0, java.util.Set<android.filterfw.core.Filter> p1) { return false; }
    private void removeFilter(android.filterfw.core.Filter p0) {}
    private void runTypeCheck() {}
    private void runTypeCheckOn(android.filterfw.core.Filter p0) {}
    private void updateOutputs(android.filterfw.core.Filter p0) {}
    public boolean addFilter(android.filterfw.core.Filter p0) { return false; }
    public void beginProcessing() {}
    public void closeFilters(android.filterfw.core.FilterContext p0) {}
    public void connect(android.filterfw.core.Filter p0, java.lang.String p1, android.filterfw.core.Filter p2, java.lang.String p3) {}
    public void connect(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public boolean containsFilter(android.filterfw.core.Filter p0) { return false; }
    public void flushFrames() {}
    public android.filterfw.core.Filter getFilter(java.lang.String p0) { return null; }
    public java.util.Set<android.filterfw.core.Filter> getFilters() { return null; }
    public boolean isReady() { return false; }
    public void setAutoBranchMode(int p0) {}
    public void setDiscardUnconnectedOutputs(boolean p0) {}
    public void setTypeCheckMode(int p0) {}
    void setupFilters() {}
    public void tearDown(android.filterfw.core.FilterContext p0) {}
}

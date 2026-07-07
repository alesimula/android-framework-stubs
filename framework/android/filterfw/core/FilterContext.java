package android.filterfw.core;

public class FilterContext {
    private android.filterfw.core.FrameManager mFrameManager;
    private android.filterfw.core.GLEnvironment mGLEnvironment;
    private java.util.Set<android.filterfw.core.FilterGraph> mGraphs;
    private java.util.HashMap<java.lang.String, android.filterfw.core.Frame> mStoredFrames;
    public FilterContext() {}
    final void addGraph(android.filterfw.core.FilterGraph p0) {}
    public android.filterfw.core.Frame fetchFrame(java.lang.String p0) { return null; }
    public android.filterfw.core.FrameManager getFrameManager() { return null; }
    public android.filterfw.core.GLEnvironment getGLEnvironment() { return null; }
    public void initGLEnvironment(android.filterfw.core.GLEnvironment p0) {}
    public void removeFrame(java.lang.String p0) {}
    public void setFrameManager(android.filterfw.core.FrameManager p0) {}
    public void storeFrame(java.lang.String p0, android.filterfw.core.Frame p1) {}
    public void tearDown() {}

    public static interface OnFrameReceivedListener {
        public void onFrameReceived(android.filterfw.core.Filter p0, android.filterfw.core.Frame p1, java.lang.Object p2);
    }
}

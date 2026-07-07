package android.filterfw.core;

public abstract class GraphRunner {
    public static final int RESULT_BLOCKED = 4;
    public static final int RESULT_ERROR = 6;
    public static final int RESULT_FINISHED = 2;
    public static final int RESULT_RUNNING = 1;
    public static final int RESULT_SLEEPING = 3;
    public static final int RESULT_STOPPED = 5;
    public static final int RESULT_UNKNOWN = 0;
    protected android.filterfw.core.FilterContext mFilterContext;
    public GraphRunner(android.filterfw.core.FilterContext p0) {}
    protected boolean activateGlContext() { return false; }
    public abstract void close();
    protected void deactivateGlContext() {}
    public android.filterfw.core.FilterContext getContext() { return null; }
    public abstract java.lang.Exception getError();
    public abstract android.filterfw.core.FilterGraph getGraph();
    public abstract boolean isRunning();
    public abstract void run();
    public abstract void setDoneCallback(android.filterfw.core.GraphRunner.OnRunnerDoneListener p0);
    public abstract void stop();

    public static interface OnRunnerDoneListener {
        public void onRunnerDone(int p0);
    }
}

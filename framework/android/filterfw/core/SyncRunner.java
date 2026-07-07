package android.filterfw.core;

public class SyncRunner extends android.filterfw.core.GraphRunner {
    private static final java.lang.String TAG = "SyncRunner";
    private android.filterfw.core.GraphRunner.OnRunnerDoneListener mDoneListener;
    private final boolean mLogVerbose = false;
    private android.filterfw.core.Scheduler mScheduler;
    private android.filterfw.core.StopWatchMap mTimer;
    private android.os.ConditionVariable mWakeCondition;
    private java.util.concurrent.ScheduledThreadPoolExecutor mWakeExecutor;
    public SyncRunner(android.filterfw.core.FilterContext p0, android.filterfw.core.FilterGraph p1, java.lang.Class p2) { super(null); }
    void assertReadyToStep() {}
    public void beginProcessing() {}
    public void close() {}
    protected int determinePostRunState() { return 0; }
    public java.lang.Exception getError() { return null; }
    public android.filterfw.core.FilterGraph getGraph() { return null; }
    public boolean isRunning() { return false; }
    boolean performStep() { return false; }
    protected void processFilterNode(android.filterfw.core.Filter p0) {}
    public void run() {}
    protected void scheduleFilterWake(android.filterfw.core.Filter p0, int p1) {}
    public void setDoneCallback(android.filterfw.core.GraphRunner.OnRunnerDoneListener p0) {}
    public int step() { return 0; }
    public void stop() {}
    protected void waitUntilWake() {}
}

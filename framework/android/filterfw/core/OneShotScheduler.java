package android.filterfw.core;

public class OneShotScheduler extends android.filterfw.core.RoundRobinScheduler {
    private static final java.lang.String TAG = "OneShotScheduler";
    private final boolean mLogVerbose = false;
    private java.util.HashMap<java.lang.String, java.lang.Integer> scheduled;
    public OneShotScheduler(android.filterfw.core.FilterGraph p0) { super(null); }
    public void reset() {}
    public android.filterfw.core.Filter scheduleNextNode() { return null; }
}

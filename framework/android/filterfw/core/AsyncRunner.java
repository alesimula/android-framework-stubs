package android.filterfw.core;

public class AsyncRunner extends android.filterfw.core.GraphRunner {
    private static final java.lang.String TAG = "AsyncRunner";
    private boolean isProcessing;
    private android.filterfw.core.GraphRunner.OnRunnerDoneListener mDoneListener;
    private java.lang.Exception mException;
    private boolean mLogVerbose;
    private android.filterfw.core.AsyncRunner.AsyncRunnerTask mRunTask;
    private android.filterfw.core.SyncRunner mRunner;
    private java.lang.Class mSchedulerClass;
    public AsyncRunner(android.filterfw.core.FilterContext p0) { super(null); }
    public AsyncRunner(android.filterfw.core.FilterContext p0, java.lang.Class p1) { super(null); }
    private void setException(java.lang.Exception p0) {}
    private void setRunning(boolean p0) {}
    public void close() {}
    public java.lang.Exception getError() { return null; }
    public android.filterfw.core.FilterGraph getGraph() { return null; }
    public boolean isRunning() { return false; }
    public void run() {}
    public void setDoneCallback(android.filterfw.core.GraphRunner.OnRunnerDoneListener p0) {}
    public void setGraph(android.filterfw.core.FilterGraph p0) {}
    public void stop() {}

    private class AsyncRunnerTask extends android.os.AsyncTask<android.filterfw.core.SyncRunner, java.lang.Void, android.filterfw.core.AsyncRunner.RunnerResult> {
        private static final java.lang.String TAG = "AsyncRunnerTask";
        private AsyncRunnerTask(android.filterfw.core.AsyncRunner p0) { super(); }
        protected android.filterfw.core.AsyncRunner.RunnerResult doInBackground(android.filterfw.core.SyncRunner... p0) { return null; }
        protected void onCancelled(android.filterfw.core.AsyncRunner.RunnerResult p0) {}
        protected void onPostExecute(android.filterfw.core.AsyncRunner.RunnerResult p0) {}
    }

    private class RunnerResult {
        public java.lang.Exception exception;
        public int status;
        private RunnerResult(android.filterfw.core.AsyncRunner p0) {}
    }
}

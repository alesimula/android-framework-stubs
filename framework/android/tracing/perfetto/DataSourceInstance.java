package android.tracing.perfetto;

public abstract class DataSourceInstance implements java.lang.AutoCloseable {
    private final android.tracing.perfetto.DataSource mDataSource = null;
    private final int mInstanceIndex = 0;
    public DataSourceInstance(android.tracing.perfetto.DataSource p0, int p1) {}
    public final void close() {}
    public final android.tracing.perfetto.DataSource getDataSource() { return null; }
    public final int getInstanceIndex() { return 0; }
    protected void onFlush(android.tracing.perfetto.FlushCallbackArguments p0) {}
    protected void onStart(android.tracing.perfetto.StartCallbackArguments p0) {}
    protected void onStop(android.tracing.perfetto.StopCallbackArguments p0) {}
    public void release() {}
    public void stopDone() {}
}

package android.tracing.perfetto;

public abstract class DataSource<DataSourceInstanceType extends android.tracing.perfetto.DataSourceInstance, TlsStateType extends java.lang.Object, IncrementalStateType extends java.lang.Object> {
    protected final long mNativeObj = 0L;
    protected final java.util.Set<android.tracing.perfetto.DataSource.TracingInstanceFlushCallback> mOnFlushCallbacks = null;
    protected final java.util.Set<android.tracing.perfetto.DataSource.TracingInstanceStartCallback> mOnStartCallbacks = null;
    protected final java.util.Set<android.tracing.perfetto.DataSource.TracingInstanceStopCallback> mOnStopCallbacks = null;
    protected final java.util.Set<java.lang.Integer> mRunningInstances = null;
    public final java.lang.String name = null;
    public DataSource(java.lang.String p0) {}
    private DataSourceInstanceType createInstance(byte[] p0, int p1) { return null; }
    private static native long nativeCreate(android.tracing.perfetto.DataSource p0, java.lang.String p1);
    private static native void nativeFlushAll(long p0);
    private static native long nativeGetFinalizer();
    private static native int nativeGetPerfettoDsInstanceIndex(long p0);
    private static native android.tracing.perfetto.DataSourceInstance nativeGetPerfettoInstanceLocked(long p0, int p1);
    private static native boolean nativePerfettoDsTraceIterateBegin(long p0);
    private static native void nativePerfettoDsTraceIterateBreak(long p0);
    private static native boolean nativePerfettoDsTraceIterateNext(long p0);
    private static native void nativeRegisterDataSource(long p0, int p1, boolean p2, boolean p3, boolean p4, byte[] p5);
    private static native void nativeReleasePerfettoInstanceLocked(long p0, int p1);
    private static native void nativeStopDonePerfettoInstanceLocked(long p0, int p1);
    private static native void nativeWritePackets(long p0, byte[][] p1);
    public IncrementalStateType createIncrementalState(android.tracing.perfetto.CreateIncrementalStateArgs<DataSourceInstanceType> p0) { return null; }
    public abstract DataSourceInstanceType createInstance(android.util.proto.ProtoInputStream p0, int p1);
    public TlsStateType createTlsState(android.tracing.perfetto.CreateTlsStateArgs<DataSourceInstanceType> p0) { return null; }
    public final void flush() {}
    public DataSourceInstanceType getDataSourceInstanceLocked(int p0) { return null; }
    protected void onInstanceCreateFailed(int p0, java.lang.String p1) {}
    public void register(android.tracing.perfetto.DataSourceParams p0) {}
    public void registerOnFlushCallback(android.tracing.perfetto.DataSource.TracingInstanceFlushCallback p0) {}
    public void registerOnStartCallback(android.tracing.perfetto.DataSource.TracingInstanceStartCallback p0) {}
    public void registerOnStopCallback(android.tracing.perfetto.DataSource.TracingInstanceStopCallback p0) {}
    protected void releaseDataSourceInstance(int p0) {}
    protected void stopDoneDataSourceInstance(int p0) {}
    public final void trace(android.tracing.perfetto.TraceFunction<DataSourceInstanceType, TlsStateType, IncrementalStateType> p0) {}
    public void unregisterOnFlushCallback(android.tracing.perfetto.DataSource.TracingInstanceFlushCallback p0) {}
    public void unregisterOnStartCallback(android.tracing.perfetto.DataSource.TracingInstanceStartCallback p0) {}
    public void unregisterOnStopCallback(android.tracing.perfetto.DataSource.TracingInstanceStopCallback p0) {}

    @java.lang.FunctionalInterface
    public static interface TracingInstanceFlushCallback {
        public void onTracingFlush();
    }

    @java.lang.FunctionalInterface
    public static interface TracingInstanceStartCallback {
        public void onTracingInstanceStart(int p0);
    }

    @java.lang.FunctionalInterface
    public static interface TracingInstanceStopCallback {
        public void onTracingInstanceStop(int p0);
    }
}

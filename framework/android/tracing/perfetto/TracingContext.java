package android.tracing.perfetto;

public class TracingContext<DataSourceInstanceType extends android.tracing.perfetto.DataSourceInstance, TlsStateType extends java.lang.Object, IncrementalStateType extends java.lang.Object> {
    private final android.tracing.perfetto.DataSource<DataSourceInstanceType, TlsStateType, IncrementalStateType> mDataSource = null;
    private final int mInstanceIndex = 0;
    private final java.util.List<android.util.proto.ProtoOutputStream> mTracePackets = null;
    TracingContext(android.tracing.perfetto.DataSource<DataSourceInstanceType, TlsStateType, IncrementalStateType> p0, int p1) {}
    private static native java.lang.Object nativeGetCustomTls(long p0);
    private static native java.lang.Object nativeGetIncrementalState(long p0);
    private static native void nativeSetCustomTls(long p0, java.lang.Object p1);
    private static native void nativeSetIncrementalState(long p0, java.lang.Object p1);
    protected byte[][] getAndClearAllPendingTracePackets() { return null; }
    public TlsStateType getCustomTlsState() { return null; }
    public DataSourceInstanceType getDataSourceInstanceLocked() { return null; }
    public IncrementalStateType getIncrementalState() { return null; }
    public int getInstanceIndex() { return 0; }
    public android.util.proto.ProtoOutputStream newTracePacket() { return null; }
    public android.util.proto.ProtoOutputStream newTracePacket(int p0) { return null; }
    public void stopDone() {}
}

package com.android.internal.protolog;

public class ProtoLogViewerConfigDataSource extends android.tracing.perfetto.DataSource<android.tracing.perfetto.DataSourceInstance, java.lang.Void, java.lang.Void> {
    private static final java.lang.String DATASOURCE_NAME = "android.protolog.viewer";
    private byte[] mViewerConfig;
    public ProtoLogViewerConfigDataSource() { super(null); }
    public android.tracing.perfetto.DataSourceInstance createInstance(android.util.proto.ProtoInputStream p0, int p1) { return null; }
    public void setViewerConfig(byte[] p0) {}
}

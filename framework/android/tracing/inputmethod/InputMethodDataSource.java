package android.tracing.inputmethod;

public final class InputMethodDataSource extends android.tracing.perfetto.DataSource<android.tracing.inputmethod.InputMethodDataSource.Instance, android.tracing.inputmethod.InputMethodDataSource.TlsState, java.lang.Void> {
    public static final java.lang.String DATA_SOURCE_NAME = "android.inputmethod";
    private static final java.lang.String TAG = "InputMethodDataSource";
    public InputMethodDataSource(java.lang.Runnable p0, java.lang.Runnable p1) { super(null); }
    private android.tracing.inputmethod.InputMethodDataSource.Config parseDataSourceConfig(android.util.proto.ProtoInputStream p0) { return null; }
    private android.tracing.inputmethod.InputMethodDataSource.Config parseInputMethodConfig(android.util.proto.ProtoInputStream p0) { return null; }
    public android.tracing.inputmethod.InputMethodDataSource.Instance createInstance(android.util.proto.ProtoInputStream p0, int p1) { return null; }
    public android.tracing.inputmethod.InputMethodDataSource.TlsState createTlsState(android.tracing.perfetto.CreateTlsStateArgs<android.tracing.inputmethod.InputMethodDataSource.Instance> p0) { return null; }

    public static class Config {
        public final boolean mIsClientEnabled = false;
        public final boolean mIsManagerServiceEnabled = false;
        public final boolean mIsServiceEnabled = false;
        private Config(boolean p0, boolean p1, boolean p2) {}
    }

    public class Instance extends android.tracing.perfetto.DataSourceInstance {
        public final android.tracing.inputmethod.InputMethodDataSource.Config mConfig = null;
        public Instance(android.tracing.inputmethod.InputMethodDataSource p0, android.tracing.perfetto.DataSource p1, int p2, android.tracing.inputmethod.InputMethodDataSource.Config p3) { super(null, 0); }
    }

    public static class TlsState {
        public final android.tracing.inputmethod.InputMethodDataSource.Config mConfig = null;
        private TlsState(android.tracing.inputmethod.InputMethodDataSource.Config p0) {}
    }
}

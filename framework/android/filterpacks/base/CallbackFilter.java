package android.filterpacks.base;

public class CallbackFilter extends android.filterfw.core.Filter {
    @android.filterfw.core.GenerateFinalPort(hasDefault=true, name="callUiThread")
    private boolean mCallbacksOnUiThread;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="listener")
    private android.filterfw.core.FilterContext.OnFrameReceivedListener mListener;
    private android.os.Handler mUiThreadHandler;
    @android.filterfw.core.GenerateFieldPort(hasDefault=true, name="userData")
    private java.lang.Object mUserData;
    public CallbackFilter(java.lang.String p0) { super(null); }
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void setupPorts() {}

    private class CallbackRunnable implements java.lang.Runnable {
        private android.filterfw.core.Filter mFilter;
        private android.filterfw.core.Frame mFrame;
        private android.filterfw.core.FilterContext.OnFrameReceivedListener mListener;
        private java.lang.Object mUserData;
        public CallbackRunnable(android.filterpacks.base.CallbackFilter p0, android.filterfw.core.FilterContext.OnFrameReceivedListener p1, android.filterfw.core.Filter p2, android.filterfw.core.Frame p3, java.lang.Object p4) {}
        public void run() {}
    }
}

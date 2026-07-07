package android.print;

public class PrintServicesLoader extends android.content.Loader<java.util.List<android.printservice.PrintServiceInfo>> {
    private final android.os.Handler mHandler = null;
    private android.print.PrintManager.PrintServicesChangeListener mListener;
    private final android.print.PrintManager mPrintManager = null;
    private final int mSelectionFlags = 0;
    public PrintServicesLoader(android.print.PrintManager p0, android.content.Context p1, int p2) { super(null); }
    private void queueNewResult() {}
    protected void onForceLoad() {}
    protected void onReset() {}
    protected void onStartLoading() {}
    protected void onStopLoading() {}

    private class MyHandler extends android.os.Handler {
        public MyHandler(android.print.PrintServicesLoader p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}

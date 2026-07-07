package android.printservice;

public abstract class PrinterDiscoverySession {
    private static final java.lang.String LOG_TAG = "PrinterDiscoverySession";
    private static int sIdCounter;
    private final int mId = 0;
    private boolean mIsDestroyed;
    private boolean mIsDiscoveryStarted;
    private android.util.ArrayMap<android.print.PrinterId, android.print.PrinterInfo> mLastSentPrinters;
    private android.printservice.IPrintServiceClient mObserver;
    private final android.util.ArrayMap<android.print.PrinterId, android.print.PrinterInfo> mPrinters = null;
    private final java.util.List<android.print.PrinterId> mTrackedPrinters = null;
    public PrinterDiscoverySession() {}
    private void sendOutOfDiscoveryPeriodPrinterChanges() {}
    public final void addPrinters(java.util.List<android.print.PrinterInfo> p0) {}
    void destroy() {}
    int getId() { return 0; }
    public final java.util.List<android.print.PrinterInfo> getPrinters() { return null; }
    public final java.util.List<android.print.PrinterId> getTrackedPrinters() { return null; }
    public final boolean isDestroyed() { return false; }
    public final boolean isPrinterDiscoveryStarted() { return false; }
    public abstract void onDestroy();
    public void onRequestCustomPrinterIcon(android.print.PrinterId p0, android.os.CancellationSignal p1, android.printservice.CustomPrinterIconCallback p2) {}
    public abstract void onStartPrinterDiscovery(java.util.List<android.print.PrinterId> p0);
    public abstract void onStartPrinterStateTracking(android.print.PrinterId p0);
    public abstract void onStopPrinterDiscovery();
    public abstract void onStopPrinterStateTracking(android.print.PrinterId p0);
    public abstract void onValidatePrinters(java.util.List<android.print.PrinterId> p0);
    public final void removePrinters(java.util.List<android.print.PrinterId> p0) {}
    void requestCustomPrinterIcon(android.print.PrinterId p0) {}
    void setObserver(android.printservice.IPrintServiceClient p0) {}
    void startPrinterDiscovery(java.util.List<android.print.PrinterId> p0) {}
    void startPrinterStateTracking(android.print.PrinterId p0) {}
    void stopPrinterDiscovery() {}
    void stopPrinterStateTracking(android.print.PrinterId p0) {}
    void validatePrinters(java.util.List<android.print.PrinterId> p0) {}
}

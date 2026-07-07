package com.android.internal.util;

public class ScreenshotHelper {
    public static final int SCREENSHOT_MSG_PROCESS_COMPLETE = 2;
    public static final int SCREENSHOT_MSG_URI = 1;
    private static final java.lang.String TAG = "ScreenshotHelper";
    private final int SCREENSHOT_TIMEOUT_MS = 0;
    private final android.content.BroadcastReceiver mBroadcastReceiver = null;
    private final android.content.Context mContext = null;
    private android.content.ServiceConnection mScreenshotConnection;
    private final java.lang.Object mScreenshotLock = null;
    private android.os.IBinder mScreenshotService;
    public ScreenshotHelper(android.content.Context p0) {}
    private void notifyScreenshotError() {}
    private void resetConnection() {}
    public void takeScreenshot(int p0, android.os.Handler p1, java.util.function.Consumer<android.net.Uri> p2) {}
    public void takeScreenshot(com.android.internal.util.ScreenshotRequest p0, android.os.Handler p1, java.util.function.Consumer<android.net.Uri> p2) {}
    public void takeScreenshotInternal(com.android.internal.util.ScreenshotRequest p0, android.os.Handler p1, java.util.function.Consumer<android.net.Uri> p2, long p3) {}
}

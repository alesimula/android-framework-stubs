package android.view.contentcapture;

public interface ContentCaptureFrameScheduler {
    public long getFrameTime();
    public long getLastFrameTimeNanos();
    public void postCallbackDelayed(java.lang.Runnable p0, long p1);
    public void removeCallbacks(java.lang.Runnable p0);
}

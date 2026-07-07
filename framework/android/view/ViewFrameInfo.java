package android.view;

public class ViewFrameInfo {
    public long drawStart;
    public long flags;
    private int mInputEventId;
    private int mViewsMeasuredCounts;
    public ViewFrameInfo() {}
    public int getAndIncreaseViewMeasuredCount() { return 0; }
    public void markDrawStart() {}
    public void populateFrameInfo(android.graphics.FrameInfo p0) {}
    public void reset() {}
    public void setInputEvent(int p0) {}
}

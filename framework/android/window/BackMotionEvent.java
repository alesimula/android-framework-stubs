package android.window;

public final class BackMotionEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.window.BackMotionEvent> CREATOR = null;
    private final long mFrameTimeMillis = 0L;
    private final float mProgress = 0.0f;
    private final int mSwipeEdge = 0;
    private final float mTouchX = 0.0f;
    private final float mTouchY = 0.0f;
    private final boolean mTriggerBack = false;
    public BackMotionEvent(float p0, float p1, long p2, float p3, boolean p4, int p5) {}
    private BackMotionEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public long getFrameTimeMillis() { return 0L; }
    public float getProgress() { return 0.0f; }
    public int getSwipeEdge() { return 0; }
    public float getTouchX() { return 0.0f; }
    public float getTouchY() { return 0.0f; }
    public boolean getTriggerBack() { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

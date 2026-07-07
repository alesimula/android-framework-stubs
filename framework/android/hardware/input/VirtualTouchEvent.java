package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualTouchEvent implements android.os.Parcelable {
    public static final int ACTION_CANCEL = 3;
    public static final int ACTION_DOWN = 0;
    public static final int ACTION_MOVE = 2;
    public static final int ACTION_UNKNOWN = -1;
    public static final int ACTION_UP = 1;
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualTouchEvent> CREATOR = null;
    private static final int MAX_POINTERS = 16;
    public static final int TOOL_TYPE_FINGER = 1;
    public static final int TOOL_TYPE_PALM = 5;
    public static final int TOOL_TYPE_UNKNOWN = 0;
    private final int mAction = 0;
    private final long mEventTimeNanos = 0L;
    private final float mMajorAxisSize = 0.0f;
    private final int mPointerId = 0;
    private final float mPressure = 0.0f;
    private final int mToolType = 0;
    private final float mX = 0.0f;
    private final float mY = 0.0f;
    private VirtualTouchEvent(int p0, int p1, int p2, float p3, float p4, float p5, float p6, long p7) {}
    private VirtualTouchEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getAction() { return 0; }
    public long getEventTimeNanos() { return 0L; }
    public float getMajorAxisSize() { return 0.0f; }
    public int getPointerId() { return 0; }
    public float getPressure() { return 0.0f; }
    public int getToolType() { return 0; }
    public float getX() { return 0.0f; }
    public float getY() { return 0.0f; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    public static final class Builder {
        private int mAction;
        private long mEventTimeNanos;
        private float mMajorAxisSize;
        private int mPointerId;
        private float mPressure;
        private int mToolType;
        private float mX;
        private float mY;
        public Builder() {}
        public android.hardware.input.VirtualTouchEvent build() { return null; }
        public android.hardware.input.VirtualTouchEvent.Builder setAction(int p0) { return null; }
        public android.hardware.input.VirtualTouchEvent.Builder setEventTimeNanos(long p0) { return null; }
        public android.hardware.input.VirtualTouchEvent.Builder setMajorAxisSize(float p0) { return null; }
        public android.hardware.input.VirtualTouchEvent.Builder setPointerId(int p0) { return null; }
        public android.hardware.input.VirtualTouchEvent.Builder setPressure(float p0) { return null; }
        public android.hardware.input.VirtualTouchEvent.Builder setToolType(int p0) { return null; }
        public android.hardware.input.VirtualTouchEvent.Builder setX(float p0) { return null; }
        public android.hardware.input.VirtualTouchEvent.Builder setY(float p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ToolType {
    }
}

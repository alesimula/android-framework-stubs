package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualStylusMotionEvent implements android.os.Parcelable {
    public static final int ACTION_DOWN = 0;
    public static final int ACTION_MOVE = 2;
    public static final int ACTION_UNKNOWN = -1;
    public static final int ACTION_UP = 1;
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualStylusMotionEvent> CREATOR = null;
    private static final int PRESSURE_MAX = 255;
    private static final int PRESSURE_MIN = 0;
    private static final int TILT_MAX = 90;
    private static final int TILT_MIN = -90;
    public static final int TOOL_TYPE_ERASER = 4;
    public static final int TOOL_TYPE_STYLUS = 2;
    public static final int TOOL_TYPE_UNKNOWN = 0;
    private final int mAction = 0;
    private final long mEventTimeNanos = 0L;
    private final int mPressure = 0;
    private final int mTiltX = 0;
    private final int mTiltY = 0;
    private final int mToolType = 0;
    private final int mX = 0;
    private final int mY = 0;
    private VirtualStylusMotionEvent(int p0, int p1, int p2, int p3, int p4, int p5, int p6, long p7) {}
    private VirtualStylusMotionEvent(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public int getAction() { return 0; }
    public long getEventTimeNanos() { return 0L; }
    public int getPressure() { return 0; }
    public int getTiltX() { return 0; }
    public int getTiltY() { return 0; }
    public int getToolType() { return 0; }
    public int getX() { return 0; }
    public int getY() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    public static final class Builder {
        private int mAction;
        private long mEventTimeNanos;
        private boolean mIsXSet;
        private boolean mIsYSet;
        private int mPressure;
        private int mTiltX;
        private int mTiltY;
        private int mToolType;
        private int mX;
        private int mY;
        public Builder() {}
        private void validateTilt(int p0) {}
        public android.hardware.input.VirtualStylusMotionEvent build() { return null; }
        public android.hardware.input.VirtualStylusMotionEvent.Builder setAction(int p0) { return null; }
        public android.hardware.input.VirtualStylusMotionEvent.Builder setEventTimeNanos(long p0) { return null; }
        public android.hardware.input.VirtualStylusMotionEvent.Builder setPressure(int p0) { return null; }
        public android.hardware.input.VirtualStylusMotionEvent.Builder setTiltX(int p0) { return null; }
        public android.hardware.input.VirtualStylusMotionEvent.Builder setTiltY(int p0) { return null; }
        public android.hardware.input.VirtualStylusMotionEvent.Builder setToolType(int p0) { return null; }
        public android.hardware.input.VirtualStylusMotionEvent.Builder setX(int p0) { return null; }
        public android.hardware.input.VirtualStylusMotionEvent.Builder setY(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ToolType {
    }
}

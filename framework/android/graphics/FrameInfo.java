package android.graphics;

public final class FrameInfo {
    public static final int ANIMATION_COUNTER = 14;
    public static final int ANIMATION_START = 6;
    public static final int ANIMATION_TIME = 13;
    public static final int DRAW_START = 8;
    public static final int FLAGS = 0;
    public static final long FLAG_SURFACE_CANVAS = 4L;
    public static final long FLAG_WINDOW_VISIBILITY_CHANGED = 1L;
    public static final int FRAME_DEADLINE = 9;
    private static final int FRAME_INFO_SIZE = 15;
    public static final int FRAME_INTERVAL = 11;
    public static final int FRAME_START_TIME = 10;
    public static final int FRAME_TIMELINE_VSYNC_ID = 1;
    public static final int HANDLE_INPUT_START = 5;
    public static final int INPUT_EVENT_ID = 4;
    public static final int INTENDED_VSYNC = 2;
    public static final long INVALID_VSYNC_ID = -1L;
    public static final int PERFORM_TRAVERSALS_START = 7;
    public static final int VSYNC = 3;
    public static final int WORKLOAD_TARGET = 12;
    public long[] frameInfo;
    public FrameInfo() {}
    public void addFlags(long p0) {}
    public void markAnimationsStart() {}
    public void markInputHandlingStart() {}
    public void markPerformTraversalsStart() {}
    public void setVsync(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrameInfoFlags {
    }
}

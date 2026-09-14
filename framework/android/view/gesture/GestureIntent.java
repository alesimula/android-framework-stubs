package android.view.gesture;

public final class GestureIntent {
    public static final int ACTION_DISMISS = 2;
    public static final int ACTION_MAX = 2;
    public static final int ACTION_PRIMARY = 1;
    private final android.view.gesture.AidlGestureIntent mAidlGestureIntent = null;
    public GestureIntent(int p0, long p1) {}
    public GestureIntent(android.view.gesture.AidlGestureIntent p0) {}
    public int getAction() { return 0; }
    public android.view.gesture.AidlGestureIntent getAidlObject() { return null; }
    public long getEventTime() { return 0L; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GestureAction {
    }
}

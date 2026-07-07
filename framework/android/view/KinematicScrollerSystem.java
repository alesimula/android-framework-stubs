package android.view;

public interface KinematicScrollerSystem {
    public static android.view.KinematicScrollerSystem createDefaultScroller(float p0, float p1, float p2, float p3, float p4, long p5) { return null; }
    public static android.view.KinematicScrollerSystem createDefaultScroller(android.content.Context p0) { return null; }
    public void accumulateVelocityOrRestart(float p0, float p1, long p2);
    public void advanceTo(long p0);
    public void copyFrom(android.view.KinematicScrollerSystem p0);
    public float estimateStablePosition();
    public long estimateStableTimeMillis();
    public float getCurrentPosition();
    public long getCurrentTimeMillis();
    public float getCurrentVelocity();
    public boolean isAccumulatingVelocity();
    public boolean isStable();
    public void reset();
    public void setInitialState(float p0, float p1, long p2);
}

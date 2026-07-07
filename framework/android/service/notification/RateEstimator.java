package android.service.notification;

public class RateEstimator {
    private static final double MINIMUM_DT = 0.0005;
    private static final double RATE_ALPHA = 0.7;
    private double mInterarrivalTime;
    private java.lang.Long mLastEventTime;
    public RateEstimator() {}
    private double getInterarrivalEstimate(long p0) { return 0.0; }
    public float getRate(long p0) { return 0.0f; }
    public void update(long p0) {}
}

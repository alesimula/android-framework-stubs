package android.media.metrics;

public abstract class Event {
    android.os.Bundle mMetricsBundle;
    final long mTimeSinceCreatedMillis = 0L;
    Event() {}
    Event(long p0, android.os.Bundle p1) {}
    public android.os.Bundle getMetricsBundle() { return null; }
    public long getTimeSinceCreatedMillis() { return 0L; }
}

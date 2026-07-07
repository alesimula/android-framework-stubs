package android.media;

public final class MediaTimestamp {
    public static final android.media.MediaTimestamp TIMESTAMP_UNKNOWN = null;
    public final float clockRate = 0.0f;
    public final long mediaTimeUs = 0L;
    public final long nanoTime = 0L;
    MediaTimestamp() {}
    public MediaTimestamp(long p0, long p1, float p2) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public long getAnchorMediaTimeUs() { return 0L; }
    public long getAnchorSystemNanoTime() { return 0L; }
    @java.lang.Deprecated
    public long getAnchorSytemNanoTime() { return 0L; }
    public float getMediaClockRate() { return 0.0f; }
    public java.lang.String toString() { return null; }
}

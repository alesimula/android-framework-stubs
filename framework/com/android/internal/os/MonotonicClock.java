package com.android.internal.os;

public class MonotonicClock {
    private static final java.lang.String TAG = "MonotonicClock";
    public static final long UNDEFINED = -1L;
    private static final java.lang.String XML_ATTR_TIMESHIFT = "timeshift";
    private static final java.lang.String XML_TAG_MONOTONIC_TIME = "monotonic_time";
    private final com.android.internal.os.Clock mClock = null;
    private final android.util.AtomicFile mFile = null;
    private final long mTimeshift = 0L;
    public MonotonicClock(long p0, com.android.internal.os.Clock p1) {}
    public MonotonicClock(java.io.File p0) {}
    public MonotonicClock(java.io.File p0, long p1, com.android.internal.os.Clock p2) {}
    private long read(long p0) { return 0L; }
    private long readXml(java.io.InputStream p0, com.android.modules.utils.TypedXmlPullParser p1) throws java.io.IOException { return 0L; }
    private void writeXml(java.io.OutputStream p0, com.android.modules.utils.TypedXmlSerializer p1) throws java.io.IOException {}
    public long monotonicTime() { return 0L; }
    public long monotonicTime(long p0) { return 0L; }
    public void write() {}
}

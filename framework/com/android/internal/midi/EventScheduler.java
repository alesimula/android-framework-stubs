package com.android.internal.midi;

public class EventScheduler {
    public static final long NANOS_PER_MILLI = 1000000L;
    private boolean mClosed;
    protected volatile java.util.SortedMap<java.lang.Long, com.android.internal.midi.EventScheduler.FastEventQueue> mEventBuffer;
    protected com.android.internal.midi.EventScheduler.FastEventQueue mEventPool;
    private final java.lang.Object mLock = null;
    private int mMaxPoolSize;
    public EventScheduler() {}
    public void add(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
    public void addEventToPool(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
    public void close() {}
    protected void flush() {}
    protected java.lang.Object getLock() { return null; }
    public com.android.internal.midi.EventScheduler.SchedulableEvent getNextEvent(long p0) { return null; }
    public com.android.internal.midi.EventScheduler.SchedulableEvent removeEventfromPool() { return null; }
    protected com.android.internal.midi.EventScheduler.SchedulableEvent removeNextEventLocked(long p0) { return null; }
    public com.android.internal.midi.EventScheduler.SchedulableEvent waitNextEvent() throws java.lang.InterruptedException { return null; }

    public static class FastEventQueue {
        volatile long mEventsAdded;
        volatile long mEventsRemoved;
        volatile com.android.internal.midi.EventScheduler.SchedulableEvent mFirst;
        volatile com.android.internal.midi.EventScheduler.SchedulableEvent mLast;
        public FastEventQueue(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
        public void add(com.android.internal.midi.EventScheduler.SchedulableEvent p0) {}
        public com.android.internal.midi.EventScheduler.SchedulableEvent remove() { return null; }
        int size() { return 0; }
    }

    public static class SchedulableEvent {
        private volatile com.android.internal.midi.EventScheduler.SchedulableEvent mNext;
        private long mTimestamp;
        public SchedulableEvent(long p0) {}
        public long getTimestamp() { return 0L; }
        public void setTimestamp(long p0) {}
    }
}

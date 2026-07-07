package com.android.internal.midi;

public class MidiEventMultiScheduler {
    private com.android.internal.midi.MidiEventMultiScheduler.MultiLockMidiEventScheduler[] mMidiEventSchedulers;
    private final java.lang.Object mMultiLock = null;
    private int mNumClosedSchedulers;
    private int mNumEventSchedulers;
    public MidiEventMultiScheduler(int p0) {}
    public void close() {}
    public com.android.internal.midi.MidiEventScheduler getEventScheduler(int p0) { return null; }
    public int getNumEventSchedulers() { return 0; }
    public boolean waitNextEvent() throws java.lang.InterruptedException { return false; }

    private class MultiLockMidiEventScheduler extends com.android.internal.midi.MidiEventScheduler {
        private MultiLockMidiEventScheduler(com.android.internal.midi.MidiEventMultiScheduler p0) { super(); }
        public void close() {}
        protected java.lang.Object getLock() { return null; }
        public long getLowestTimeLocked() { return 0L; }
        public boolean isEventBufferEmptyLocked() { return false; }
    }
}

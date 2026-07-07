package android.media;

public abstract class SubtitleTrack implements android.media.MediaTimeProvider.OnMediaTimeListener {
    private static final java.lang.String TAG = "SubtitleTrack";
    public boolean DEBUG;
    protected final java.util.Vector<android.media.SubtitleTrack.Cue> mActiveCues = null;
    protected android.media.SubtitleTrack.CueList mCues;
    private android.media.MediaFormat mFormat;
    protected android.os.Handler mHandler;
    private long mLastTimeMs;
    private long mLastUpdateTimeMs;
    private long mNextScheduledTimeMs;
    private java.lang.Runnable mRunnable;
    protected final android.util.LongSparseArray<android.media.SubtitleTrack.Run> mRunsByEndTime = null;
    protected final android.util.LongSparseArray<android.media.SubtitleTrack.Run> mRunsByID = null;
    protected android.media.MediaTimeProvider mTimeProvider;
    protected boolean mVisible;
    public SubtitleTrack(android.media.MediaFormat p0) {}
    private void removeRunsByEndTimeIndex(int p0) {}
    private void takeTime(long p0) {}
    protected boolean addCue(android.media.SubtitleTrack.Cue p0) { return false; }
    protected void clearActiveCues() {}
    protected void finalize() throws java.lang.Throwable {}
    protected void finishedRun(long p0) {}
    public final android.media.MediaFormat getFormat() { return null; }
    public abstract android.media.SubtitleTrack.RenderingWidget getRenderingWidget();
    public int getTrackType() { return 0; }
    public void hide() {}
    protected void onData(android.media.SubtitleData p0) {}
    public abstract void onData(byte[] p0, boolean p1, long p2);
    public void onSeek(long p0) {}
    public void onStop() {}
    public void onTimedEvent(long p0) {}
    protected void scheduleTimedEvents() {}
    public void setRunDiscardTimeMs(long p0, long p1) {}
    public void setTimeProvider(android.media.MediaTimeProvider p0) {}
    public void show() {}
    protected void updateActiveCues(boolean p0, long p1) {}
    public abstract void updateView(java.util.Vector<android.media.SubtitleTrack.Cue> p0);

    public static class Cue {
        public long mEndTimeMs;
        public long[] mInnerTimesMs;
        public android.media.SubtitleTrack.Cue mNextInRun;
        public long mRunID;
        public long mStartTimeMs;
        public Cue() {}
        public void onTime(long p0) {}
    }

    static class CueList {
        private static final java.lang.String TAG = "CueList";
        public boolean DEBUG;
        private java.util.SortedMap<java.lang.Long, java.util.Vector<android.media.SubtitleTrack.Cue>> mCues;
        CueList() {}
        private boolean addEvent(android.media.SubtitleTrack.Cue p0, long p1) { return false; }
        private void removeEvent(android.media.SubtitleTrack.Cue p0, long p1) {}
        public void add(android.media.SubtitleTrack.Cue p0) {}
        public java.lang.Iterable<android.util.Pair<java.lang.Long, android.media.SubtitleTrack.Cue>> entriesBetween(long p0, long p1) { return null; }
        public long nextTimeAfter(long p0) { return 0L; }
        public void remove(android.media.SubtitleTrack.Cue p0) {}

        class EntryIterator implements java.util.Iterator<android.util.Pair<java.lang.Long, android.media.SubtitleTrack.Cue>> {
            private long mCurrentTimeMs;
            private boolean mDone;
            private android.util.Pair<java.lang.Long, android.media.SubtitleTrack.Cue> mLastEntry;
            private java.util.Iterator<android.media.SubtitleTrack.Cue> mLastListIterator;
            private java.util.Iterator<android.media.SubtitleTrack.Cue> mListIterator;
            private java.util.SortedMap<java.lang.Long, java.util.Vector<android.media.SubtitleTrack.Cue>> mRemainingCues;
            public EntryIterator(java.util.SortedMap<java.lang.Long, java.util.Vector<android.media.SubtitleTrack.Cue>> p0) {}
            private void nextKey() {}
            public boolean hasNext() { return false; }
            public android.util.Pair<java.lang.Long, android.media.SubtitleTrack.Cue> next() { return null; }
            public void remove() {}
        }
    }

    public static interface RenderingWidget {
        public void draw(android.graphics.Canvas p0);
        public void onAttachedToWindow();
        public void onDetachedFromWindow();
        public void setOnChangedListener(android.media.SubtitleTrack.RenderingWidget.OnChangedListener p0);
        public void setSize(int p0, int p1);
        public void setVisible(boolean p0);

        public static interface OnChangedListener {
            public void onChanged(android.media.SubtitleTrack.RenderingWidget p0);
        }
    }

    private static class Run {
        static final boolean $assertionsDisabled = false;
        public long mEndTimeMs;
        public android.media.SubtitleTrack.Cue mFirstCue;
        public android.media.SubtitleTrack.Run mNextRunAtEndTimeMs;
        public android.media.SubtitleTrack.Run mPrevRunAtEndTimeMs;
        public long mRunID;
        private long mStoredEndTimeMs;
        private Run() {}
        public void removeAtEndTimeMs() {}
        public void storeByEndTimeMs(android.util.LongSparseArray<android.media.SubtitleTrack.Run> p0) {}
    }
}

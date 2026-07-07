package com.android.internal.util;

public class ProgressReporter {
    private static final int STATE_FINISHED = 2;
    private static final int STATE_INIT = 0;
    private static final int STATE_STARTED = 1;
    private android.os.Bundle mExtras;
    private final int mId = 0;
    private final android.os.RemoteCallbackList<android.os.IProgressListener> mListeners = null;
    private int mProgress;
    private int[] mSegmentRange;
    private int mState;
    public ProgressReporter(int p0) {}
    private void notifyFinished(int p0, android.os.Bundle p1) {}
    private void notifyProgress(int p0, int p1, android.os.Bundle p2) {}
    private void notifyStarted(int p0, android.os.Bundle p1) {}
    public void addListener(android.os.IProgressListener p0) {}
    public void endSegment(int[] p0) {}
    public void finish() {}
    public int getProgress() { return 0; }
    int[] getSegmentRange() { return null; }
    public void setProgress(int p0) {}
    public void setProgress(int p0, int p1) {}
    public void setProgress(int p0, int p1, java.lang.CharSequence p2) {}
    public void setProgress(int p0, java.lang.CharSequence p1) {}
    public void start() {}
    public int[] startSegment(int p0) { return null; }
}

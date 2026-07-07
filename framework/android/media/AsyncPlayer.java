package android.media;

public class AsyncPlayer {
    private static final int PLAY = 1;
    private static final int STOP = 2;
    private static final boolean mDebug = false;
    private final java.util.LinkedList<android.media.AsyncPlayer.Command> mCmdQueue = null;
    private android.media.MediaPlayer mPlayer;
    private int mState;
    private java.lang.String mTag;
    private android.media.AsyncPlayer.Thread mThread;
    private android.os.PowerManager.WakeLock mWakeLock;
    public AsyncPlayer(java.lang.String p0) {}
    private void acquireWakeLock() {}
    private void enqueueLocked(android.media.AsyncPlayer.Command p0) {}
    private void releaseWakeLock() {}
    private void startSound(android.media.AsyncPlayer.Command p0) {}
    public void play(android.content.Context p0, android.net.Uri p1, boolean p2, int p3) {}
    public void play(android.content.Context p0, android.net.Uri p1, boolean p2, android.media.AudioAttributes p3) throws java.lang.IllegalArgumentException {}
    public void setUsesWakeLock(android.content.Context p0) {}
    public void stop() {}

    private static final class Command {
        android.media.AudioAttributes attributes;
        int code;
        android.content.Context context;
        boolean looping;
        long requestTime;
        android.net.Uri uri;
        private Command() {}
        public java.lang.String toString() { return null; }
    }

    private final class Thread extends java.lang.Thread {
        Thread(android.media.AsyncPlayer p0) { super(); }
        public void run() {}
    }
}

package android.speech.tts;

class AudioPlaybackHandler {
    private static final boolean DBG = false;
    private static final java.lang.String TAG = "TTS.AudioPlaybackHandler";
    private volatile android.speech.tts.PlaybackQueueItem mCurrentWorkItem;
    private final java.lang.Thread mHandlerThread = null;
    private final java.util.concurrent.LinkedBlockingQueue<android.speech.tts.PlaybackQueueItem> mQueue = null;
    AudioPlaybackHandler() {}
    private void removeAllMessages() {}
    private void removeWorkItemsFor(java.lang.Object p0) {}
    private void stop(android.speech.tts.PlaybackQueueItem p0) {}
    public void enqueue(android.speech.tts.PlaybackQueueItem p0) {}
    public boolean isSpeaking() { return false; }
    public void quit() {}
    public void start() {}
    public void stop() {}
    public void stopForApp(java.lang.Object p0) {}

    private final class MessageLoop implements java.lang.Runnable {
        private MessageLoop(android.speech.tts.AudioPlaybackHandler p0) {}
        public void run() {}
    }
}

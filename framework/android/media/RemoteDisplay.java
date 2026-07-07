package android.media;

public final class RemoteDisplay {
    public static final int DISPLAY_ERROR_CONNECTION_DROPPED = 2;
    public static final int DISPLAY_ERROR_UNKOWN = 1;
    public static final int DISPLAY_FLAG_SECURE = 1;
    private final android.os.Handler mHandler = null;
    private final android.media.RemoteDisplay.Listener mListener = null;
    private final java.lang.String mOpPackageName = null;
    private long mPtr;
    private RemoteDisplay(android.media.RemoteDisplay.Listener p0, android.os.Handler p1, java.lang.String p2) {}
    private void dispose(boolean p0) {}
    public static android.media.RemoteDisplay listen(java.lang.String p0, android.media.RemoteDisplay.Listener p1, android.os.Handler p2, java.lang.String p3) { return null; }
    private native void nativeDispose(long p0);
    private native long nativeListen(java.lang.String p0, java.lang.String p1);
    private native void nativePause(long p0);
    private native void nativeResume(long p0);
    private void notifyDisplayConnected(android.view.Surface p0, int p1, int p2, int p3, int p4) {}
    private void notifyDisplayDisconnected() {}
    private void notifyDisplayError(int p0) {}
    private void startListening(java.lang.String p0) {}
    public void dispose() {}
    protected void finalize() throws java.lang.Throwable {}
    public void pause() {}
    public void resume() {}

    public static interface Listener {
        public void onDisplayConnected(android.view.Surface p0, int p1, int p2, int p3, int p4);
        public void onDisplayDisconnected();
        public void onDisplayError(int p0);
    }
}

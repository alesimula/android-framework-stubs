package android.media;

class NativeRoutingEventHandlerDelegate {
    private android.media.AudioRouting mAudioRouting;
    private android.os.Handler mHandler;
    private android.media.AudioRouting.OnRoutingChangedListener mOnRoutingChangedListener;
    NativeRoutingEventHandlerDelegate(android.media.AudioRouting p0, android.media.AudioRouting.OnRoutingChangedListener p1, android.os.Handler p2) {}
    void notifyClient() {}
}

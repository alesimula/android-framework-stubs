package com.android.internal.widget.remotecompose.player.platform;

public class SoundSupport {
    private static final int SC_HEADER_SIZE = 11;
    private static final byte SC_MAGIC_0 = 83;
    private static final byte SC_MAGIC_1 = 67;
    private static final java.lang.String TAG = "SoundSupport";
    private static final int WAV_HEADER_SIZE = 44;
    private android.content.Context mAttributionContext;
    private final android.media.AudioAttributes mAudioAttrs = null;
    private int mNativeSampleRate;
    private final java.util.Map<java.lang.Integer, android.media.AudioTrack> mTracks = null;
    public SoundSupport() {}
    private void loadPcm(int p0, byte[] p1, int p2, int p3, int p4) {}
    private static byte[] resample16BitMono(byte[] p0, int p1, int p2) { return null; }
    public com.android.internal.widget.remotecompose.core.CoreDocument.SoundEngine buildEngine() { return null; }
    public void init(android.content.Context p0) {}
    public void loadSound(int p0, byte[] p1) {}
    public void playSound(int p0) {}
    public void release() {}
}

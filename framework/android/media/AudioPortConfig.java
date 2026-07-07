package android.media;

public class AudioPortConfig {
    static final int CHANNEL_MASK = 2;
    static final int FORMAT = 4;
    static final int GAIN = 8;
    static final int SAMPLE_RATE = 1;
    private final android.media.AudioFormat.ChannelMasks mChannelMasks = null;
    int mConfigMask;
    private final int mFormat = 0;
    private final android.media.AudioGainConfig mGain = null;
    final android.media.AudioPort mPort = null;
    private final int mSamplingRate = 0;
    AudioPortConfig(android.media.AudioPort p0, int p1, int p2, int p3, android.media.AudioGainConfig p4) {}
    AudioPortConfig(android.media.AudioPort p0, int p1, android.media.AudioFormat.ChannelMasks p2, int p3, android.media.AudioGainConfig p4) {}
    public int channelMask() { return 0; }
    public android.media.AudioFormat.ChannelMasks channelMasks() { return null; }
    public int format() { return 0; }
    public android.media.AudioGainConfig gain() { return null; }
    public android.media.AudioPort port() { return null; }
    public int samplingRate() { return 0; }
    public java.lang.String toString() { return null; }
}

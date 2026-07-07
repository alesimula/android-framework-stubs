package android.media;

public class AudioGain {
    public static final int MODE_CHANNELS = 2;
    public static final int MODE_JOINT = 1;
    public static final int MODE_RAMP = 4;
    private final android.media.AudioFormat.ChannelMasks mChannelMasks = null;
    private final int mDefaultValue = 0;
    private final int mIndex = 0;
    private final int mMaxValue = 0;
    private final int mMinValue = 0;
    private final int mMode = 0;
    private final int mRampDurationMaxMs = 0;
    private final int mRampDurationMinMs = 0;
    private final int mStepValue = 0;
    AudioGain(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
    AudioGain(int p0, int p1, android.media.AudioFormat.ChannelMasks p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
    public android.media.AudioGainConfig buildConfig(int p0, int p1, int[] p2, int p3) { return null; }
    public android.media.AudioGainConfig buildConfig(int p0, android.media.AudioFormat.ChannelMasks p1, int[] p2, int p3) { return null; }
    public int channelMask() { return 0; }
    public android.media.AudioFormat.ChannelMasks channelMasks() { return null; }
    public int defaultValue() { return 0; }
    public int maxValue() { return 0; }
    public int minValue() { return 0; }
    public int mode() { return 0; }
    public int rampDurationMaxMs() { return 0; }
    public int rampDurationMinMs() { return 0; }
    public int stepValue() { return 0; }
}

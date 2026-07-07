package android.media;

public class AudioPort {
    public static final int ROLE_NONE = 0;
    public static final int ROLE_SINK = 2;
    public static final int ROLE_SOURCE = 1;
    private static final java.lang.String TAG = "AudioPort";
    public static final int TYPE_DEVICE = 1;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_SESSION = 3;
    public static final int TYPE_SUBMIX = 2;
    private android.media.AudioPortConfig mActiveConfig;
    private final android.media.AudioFormat.ChannelMasksArray mChannelMasks = null;
    private final java.util.List<android.media.AudioDescriptor> mDescriptors = null;
    private final int[] mFormats = null;
    private final android.media.AudioGain[] mGains = null;
    android.media.AudioHandle mHandle;
    private final java.lang.String mName = null;
    private final java.util.List<android.media.AudioProfile> mProfiles = null;
    protected final int mRole = 0;
    private final int[] mSamplingRates = null;
    AudioPort(android.media.AudioHandle p0, int p1, java.lang.String p2, java.util.List<android.media.AudioProfile> p3, android.media.AudioGain[] p4, java.util.List<android.media.AudioDescriptor> p5) {}
    AudioPort(android.media.AudioHandle p0, int p1, java.lang.String p2, int[] p3, android.media.AudioFormat.ChannelMasksArray p4, int[] p5, android.media.AudioGain[] p6) {}
    AudioPort(android.media.AudioHandle p0, int p1, java.lang.String p2, int[] p3, int[] p4, int[] p5, int[] p6, android.media.AudioGain[] p7) {}
    public android.media.AudioPortConfig activeConfig() { return null; }
    public java.util.List<android.media.AudioDescriptor> audioDescriptors() { return null; }
    public android.media.AudioPortConfig buildConfig(int p0, int p1, int p2, android.media.AudioGainConfig p3) { return null; }
    public android.media.AudioPortConfig buildConfig(int p0, android.media.AudioFormat.ChannelMasks p1, int p2, android.media.AudioGainConfig p3) { return null; }
    public int[] channelAcnMasks() { return null; }
    public int[] channelIndexMasks() { return null; }
    public int[] channelMasks() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int[] formats() { return null; }
    android.media.AudioGain gain(int p0) { return null; }
    public android.media.AudioGain[] gains() { return null; }
    public android.media.AudioFormat.ChannelMasksArray getChannelMasks() { return null; }
    android.media.AudioHandle handle() { return null; }
    public int hashCode() { return 0; }
    public int id() { return 0; }
    public java.lang.String name() { return null; }
    public java.util.List<android.media.AudioProfile> profiles() { return null; }
    public int role() { return 0; }
    public int[] samplingRates() { return null; }
    public java.lang.String toString() { return null; }
}

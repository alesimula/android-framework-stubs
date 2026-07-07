package android.hardware.display;

public final class DisplayedContentSample {
    private long mNumFrames;
    private long[] mSamplesComponent0;
    private long[] mSamplesComponent1;
    private long[] mSamplesComponent2;
    private long[] mSamplesComponent3;
    public DisplayedContentSample(long p0, long[] p1, long[] p2, long[] p3, long[] p4) {}
    public long getNumFrames() { return 0L; }
    public long[] getSampleComponent(android.hardware.display.DisplayedContentSample.ColorComponent p0) { return null; }

    public static enum ColorComponent {
        CHANNEL0,
        CHANNEL1,
        CHANNEL2,
        CHANNEL3;
        private static final android.hardware.display.DisplayedContentSample.ColorComponent[] $VALUES = null;
        private ColorComponent() {}
    }
}

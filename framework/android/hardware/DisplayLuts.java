package android.hardware;

public final class DisplayLuts {
    private java.util.ArrayList<android.hardware.DisplayLuts.Entry> mEntries;
    private android.util.IntArray mOffsets;
    private int mTotalLength;
    public DisplayLuts() {}
    private void addEntry(android.hardware.DisplayLuts.Entry p0) {}
    private void clear() {}
    public float[] getLutBuffers() { return null; }
    public int[] getLutDimensions() { return null; }
    public int[] getLutSamplingKeys() { return null; }
    public int[] getLutSizes() { return null; }
    public int[] getOffsets() { return null; }
    public void set(android.hardware.DisplayLuts.Entry p0) {}
    public void set(android.hardware.DisplayLuts.Entry p0, android.hardware.DisplayLuts.Entry p1) {}
    public java.lang.String toString() { return null; }
    public boolean valid() { return false; }

    public static class Entry {
        private static final int LUT_LENGTH_LIMIT = 100000;
        private float[] mBuffer;
        private int mDimension;
        private int mSamplingKey;
        private int mSize;
        public Entry(float[] p0, int p1, int p2) {}
        private static java.lang.String dimensionToString(int p0) { return null; }
        private static java.lang.String samplingKeyToString(int p0) { return null; }
        public float[] getBuffer() { return null; }
        public int getDimension() { return 0; }
        public int getSamplingKey() { return 0; }
        public int getSize() { return 0; }
        public java.lang.String toString() { return null; }
    }
}

package android.text;

public abstract class SegmentFinder {
    public static final int DONE = -1;
    public SegmentFinder() {}
    public abstract int nextEndBoundary(int p0);
    public abstract int nextStartBoundary(int p0);
    public abstract int previousEndBoundary(int p0);
    public abstract int previousStartBoundary(int p0);

    public static class PrescribedSegmentFinder extends android.text.SegmentFinder {
        private final int[] mSegments = null;
        public PrescribedSegmentFinder(int[] p0) { super(); }
        private static void checkSegmentsValid(int[] p0) {}
        private int findNext(int p0, boolean p1) { return 0; }
        private int findPrevious(int p0, boolean p1) { return 0; }
        public int nextEndBoundary(int p0) { return 0; }
        public int nextStartBoundary(int p0) { return 0; }
        public int previousEndBoundary(int p0) { return 0; }
        public int previousStartBoundary(int p0) { return 0; }
    }
}

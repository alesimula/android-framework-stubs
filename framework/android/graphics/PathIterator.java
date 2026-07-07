package android.graphics;

public class PathIterator implements java.util.Iterator<android.graphics.PathIterator.Segment> {
    private static final boolean IS_DALVIK = Boolean.valueOf(false);
    private static final int POINT_ARRAY_SIZE = 8;
    public static final int VERB_CLOSE = 5;
    public static final int VERB_CONIC = 3;
    public static final int VERB_CUBIC = 4;
    public static final int VERB_DONE = 6;
    public static final int VERB_LINE = 1;
    public static final int VERB_MOVE = 0;
    public static final int VERB_QUAD = 2;
    private int mCachedVerb;
    private boolean mDone;
    private final long mNativeIterator = 0L;
    private final android.graphics.Path mPath = null;
    private final int mPathGenerationId = 0;
    private final long mPointsAddress = 0L;
    private final float[] mPointsArray = null;
    PathIterator(android.graphics.Path p0) {}
    private int getReturnVerb(int p0) { return 0; }
    private static native long nCreate(long p0);
    private static native long nGetFinalizer();
    private static native int nNext(long p0, long p1);
    private static native int nNextHost(long p0, float[] p1);
    private static native int nPeek(long p0);
    private int nextInternal() { return 0; }
    public boolean hasNext() { return false; }
    public int next(float[] p0, int p1) { return 0; }
    public android.graphics.PathIterator.Segment next() { return null; }
    public int peek() { return 0; }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }

    public static class Segment {
        private final float mConicWeight = 0.0f;
        private final float[] mPoints = null;
        private final int mVerb = 0;
        Segment(int p0, float[] p1, float p2) {}
        public float getConicWeight() { return 0.0f; }
        public float[] getPoints() { return null; }
        public int getVerb() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface Verb {
    }
}

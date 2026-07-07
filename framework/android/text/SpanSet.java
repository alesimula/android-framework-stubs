package android.text;

public class SpanSet<E extends java.lang.Object> {
    private final java.lang.Class<? extends E> classType = null;
    int numberOfSpans;
    int[] spanEnds;
    int[] spanFlags;
    int[] spanStarts;
    E[] spans;
    SpanSet(java.lang.Class<? extends E> p0) {}
    int getNextTransition(int p0, int p1) { return 0; }
    public boolean hasSpansIntersecting(int p0, int p1) { return false; }
    public void init(android.text.Spanned p0, int p1, int p2) {}
    public void recycle() {}
}

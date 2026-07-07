package android.widget;

class RtlSpacingHelper {
    public static final int UNDEFINED = -2147483648;
    private int mEnd;
    private int mExplicitLeft;
    private int mExplicitRight;
    private boolean mIsRelative;
    private boolean mIsRtl;
    private int mLeft;
    private int mRight;
    private int mStart;
    RtlSpacingHelper() {}
    public int getEnd() { return 0; }
    public int getLeft() { return 0; }
    public int getRight() { return 0; }
    public int getStart() { return 0; }
    public void setAbsolute(int p0, int p1) {}
    public void setDirection(boolean p0) {}
    public void setRelative(int p0, int p1) {}
}

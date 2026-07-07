package android.view.animation;

public class AnimationSet extends android.view.animation.Animation {
    private static final int PROPERTY_CHANGE_BOUNDS_MASK = 128;
    private static final int PROPERTY_DURATION_MASK = 32;
    private static final int PROPERTY_FILL_AFTER_MASK = 1;
    private static final int PROPERTY_FILL_BEFORE_MASK = 2;
    private static final int PROPERTY_MORPH_MATRIX_MASK = 64;
    private static final int PROPERTY_REPEAT_MODE_MASK = 4;
    private static final int PROPERTY_SHARE_INTERPOLATOR_MASK = 16;
    private static final int PROPERTY_START_OFFSET_MASK = 8;
    private java.util.ArrayList<android.view.animation.Animation> mAnimations;
    private boolean mDirty;
    private int mFlags;
    private boolean mHasAlpha;
    private long mLastEnd;
    private long[] mStoredOffsets;
    private android.view.animation.Transformation mTempTransformation;
    public AnimationSet(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public AnimationSet(boolean p0) { super(); }
    private void init() {}
    private void setFlag(int p0, boolean p1) {}
    public void addAnimation(android.view.animation.Animation p0) {}
    protected android.view.animation.AnimationSet clone() throws java.lang.CloneNotSupportedException { return null; }
    public long computeDurationHint() { return 0L; }
    public java.util.List<android.view.animation.Animation> getAnimations() { return null; }
    public long getDuration() { return 0L; }
    public int getExtensionEdges() { return 0; }
    public long getStartTime() { return 0L; }
    public boolean getTransformation(long p0, android.view.animation.Transformation p1) { return false; }
    public void getTransformationAt(float p0, android.view.animation.Transformation p1) {}
    public boolean hasAlpha() { return false; }
    public void initialize(int p0, int p1, int p2, int p3) {}
    public void initializeInvalidateRegion(int p0, int p1, int p2, int p3) {}
    public void reset() {}
    void restoreChildrenStartOffset() {}
    public void restrictDuration(long p0) {}
    public void scaleCurrentDuration(float p0) {}
    public void setDuration(long p0) {}
    public void setFillAfter(boolean p0) {}
    public void setFillBefore(boolean p0) {}
    public void setRepeatMode(int p0) {}
    public void setStartOffset(long p0) {}
    public void setStartTime(long p0) {}
    public boolean willChangeBounds() { return false; }
    public boolean willChangeTransformationMatrix() { return false; }
}

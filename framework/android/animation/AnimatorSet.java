package android.animation;

public final class AnimatorSet extends android.animation.Animator implements android.animation.AnimationHandler.AnimationFrameCallback {
    private static final java.lang.String TAG = "AnimatorSet";
    private android.animation.AnimatorListenerAdapter mAnimationEndListener;
    private long[] mChildStartAndStopTimes;
    private boolean mChildrenInitialized;
    private android.animation.ValueAnimator mDelayAnim;
    private boolean mDependencyDirty;
    private long mDuration;
    private final boolean mEndCanBeCalled = false;
    private java.util.ArrayList<android.animation.AnimatorSet.AnimationEvent> mEvents;
    private long mFirstFrame;
    private android.animation.TimeInterpolator mInterpolator;
    private int mLastEventId;
    private long mLastFrameTime;
    private android.util.ArrayMap<android.animation.Animator, android.animation.AnimatorSet.Node> mNodeMap;
    private java.util.ArrayList<android.animation.AnimatorSet.Node> mNodes;
    private long mPauseTime;
    private java.util.ArrayList<android.animation.AnimatorSet.Node> mPlayingSet;
    private boolean mReversing;
    private android.animation.AnimatorSet.Node mRootNode;
    private android.animation.AnimatorSet.SeekState mSeekState;
    private boolean mSelfPulse;
    private final boolean mShouldIgnoreEndWithoutStart = false;
    private final boolean mShouldResetValuesAtStart = false;
    private long mStartDelay;
    private boolean mStarted;
    private long mTotalDuration;
    public AnimatorSet() { super(); }
    private void addAnimationCallback(long p0) {}
    private void addAnimationEndListener() {}
    private void animateBasedOnPlayTime(long p0, long p1, boolean p2) {}
    private void callOnPlayingSet(java.util.function.Consumer<android.animation.Animator> p0) {}
    private void createDependencyGraph() {}
    private void endAnimation() {}
    private void endAnimation(boolean p0) {}
    private void endAnimationAndNotifyEndListenersImmediately() {}
    private long[] ensureChildStartAndEndTimes() { return null; }
    private int findLatestEventIdForTime(long p0) { return 0; }
    private int findNextIndex(long p0, long[] p1) { return 0; }
    private void findSiblings(android.animation.AnimatorSet.Node p0, java.util.ArrayList<android.animation.AnimatorSet.Node> p1) {}
    private void forceToEnd() {}
    private android.animation.AnimatorSet.Node getNodeForAnimation(android.animation.Animator p0) { return null; }
    private long getPlayTimeForNodeIncludingDelay(long p0, android.animation.AnimatorSet.Node p1) { return 0L; }
    private long getPlayTimeForNodeIncludingDelay(long p0, android.animation.AnimatorSet.Node p1, boolean p2) { return 0L; }
    private void handleAnimationEvents(int p0, int p1, long p2) {}
    private void initAnimation() {}
    private void initChildren() {}
    private static boolean isEmptySet(android.animation.AnimatorSet p0) { return false; }
    private void printChildCount() {}
    private void pulseFrame(android.animation.AnimatorSet.Node p0, long p1) {}
    private void removeAnimationCallback() {}
    private void removeAnimationEndListener() {}
    private void sortAnimationEvents() {}
    private void start(boolean p0, boolean p1) {}
    private void startAnimation() {}
    private void updateAnimatorsDuration() {}
    private void updatePlayTime(android.animation.AnimatorSet.Node p0, java.util.ArrayList<android.animation.AnimatorSet.Node> p1) {}
    void animateSkipToEnds(long p0, long p1) {}
    void animateValuesInRange(long p0, long p1) {}
    public boolean canReverse() { return false; }
    public void cancel() {}
    public android.animation.AnimatorSet clone() { return null; }
    void completeEndAnimation(boolean p0, java.lang.String p1) {}
    public boolean doAnimationFrame(long p0) { return false; }
    public void end() {}
    public int getChangingConfigurations() { return 0; }
    public java.util.ArrayList<android.animation.Animator> getChildAnimations() { return null; }
    public long getCurrentPlayTime() { return 0L; }
    public long getDuration() { return 0L; }
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    void getStartAndEndTimes(android.util.LongArray p0, long p1) {}
    public long getStartDelay() { return 0L; }
    public long getTotalDuration() { return 0L; }
    boolean isInitialized() { return false; }
    public boolean isRunning() { return false; }
    public boolean isStarted() { return false; }
    public void pause() {}
    public android.animation.AnimatorSet.Builder play(android.animation.Animator p0) { return null; }
    public void playSequentially(java.util.List<android.animation.Animator> p0) {}
    public void playSequentially(android.animation.Animator... p0) {}
    public void playTogether(java.util.Collection<android.animation.Animator> p0) {}
    public void playTogether(android.animation.Animator... p0) {}
    boolean pulseAnimationFrame(long p0) { return false; }
    public void resume() {}
    public void reverse() {}
    public void setCurrentPlayTime(long p0) {}
    public android.animation.AnimatorSet setDuration(long p0) { return null; }
    public void setInterpolator(android.animation.TimeInterpolator p0) {}
    public void setStartDelay(long p0) {}
    public void setTarget(java.lang.Object p0) {}
    public void setupEndValues() {}
    public void setupStartValues() {}
    public boolean shouldPlayTogether() { return false; }
    void skipToEndValue(boolean p0) {}
    public void start() {}
    void startWithoutPulsing(boolean p0) {}
    public java.lang.String toString() { return null; }

    private static class AnimationEvent {
        static final int ANIMATION_DELAY_ENDED = 1;
        static final int ANIMATION_END = 2;
        static final int ANIMATION_START = 0;
        final int mEvent = 0;
        final android.animation.AnimatorSet.Node mNode = null;
        AnimationEvent(android.animation.AnimatorSet.Node p0, int p1) {}
        long getTime() { return 0L; }
        public java.lang.String toString() { return null; }
    }

    public class Builder {
        private android.animation.AnimatorSet.Node mCurrentNode;
        Builder(android.animation.AnimatorSet p0, android.animation.Animator p1) {}
        public android.animation.AnimatorSet.Builder after(long p0) { return null; }
        public android.animation.AnimatorSet.Builder after(android.animation.Animator p0) { return null; }
        public android.animation.AnimatorSet.Builder before(android.animation.Animator p0) { return null; }
        public android.animation.AnimatorSet.Builder with(android.animation.Animator p0) { return null; }
    }

    private static class Node implements java.lang.Cloneable {
        android.animation.Animator mAnimation;
        java.util.ArrayList<android.animation.AnimatorSet.Node> mChildNodes;
        long mEndTime;
        boolean mEnded;
        android.animation.AnimatorSet.Node mLatestParent;
        java.util.ArrayList<android.animation.AnimatorSet.Node> mParents;
        boolean mParentsAdded;
        java.util.ArrayList<android.animation.AnimatorSet.Node> mSiblings;
        long mStartTime;
        long mTotalDuration;
        public Node(android.animation.Animator p0) {}
        void addChild(android.animation.AnimatorSet.Node p0) {}
        public void addParent(android.animation.AnimatorSet.Node p0) {}
        public void addParents(java.util.ArrayList<android.animation.AnimatorSet.Node> p0) {}
        public void addSibling(android.animation.AnimatorSet.Node p0) {}
        public android.animation.AnimatorSet.Node clone() { return null; }
    }

    private class SeekState {
        private long mPlayTime;
        private boolean mSeekingInReverse;
        private SeekState(android.animation.AnimatorSet p0) {}
        long getPlayTime() { return 0L; }
        long getPlayTimeNormalized() { return 0L; }
        boolean isActive() { return false; }
        void reset() {}
        void setPlayTime(long p0, boolean p1) {}
        void updateSeekDirection(boolean p0) {}
    }
}

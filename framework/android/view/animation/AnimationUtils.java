package android.view.animation;

public class AnimationUtils {
    private static final int SEQUENTIALLY = 1;
    private static final int TOGETHER = 0;
    private static java.lang.ThreadLocal<android.view.animation.AnimationUtils.AnimationState> sAnimationState;
    private static java.lang.ThreadLocal<android.view.animation.AnimationUtils.AnimationTime> sAnimationTime;
    public AnimationUtils() {}
    private static android.view.animation.Animation createAnimationFromXml(android.content.Context p0, org.xmlpull.v1.XmlPullParser p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    private static android.view.animation.Animation createAnimationFromXml(android.content.Context p0, org.xmlpull.v1.XmlPullParser p1, android.view.animation.AnimationSet p2, android.util.AttributeSet p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, android.view.InflateException { return null; }
    private static android.view.animation.Interpolator createInterpolatorFromXml(android.content.res.Resources p0, android.content.res.Resources.Theme p1, org.xmlpull.v1.XmlPullParser p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, android.view.InflateException { return null; }
    private static android.view.animation.LayoutAnimationController createLayoutAnimationFromXml(android.content.Context p0, org.xmlpull.v1.XmlPullParser p1) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, android.view.InflateException { return null; }
    private static android.view.animation.LayoutAnimationController createLayoutAnimationFromXml(android.content.Context p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, android.view.InflateException { return null; }
    public static long currentAnimationTimeMillis() { return 0L; }
    public static android.view.animation.AnimationUtils.AnimationTime getAnimationTime() { return null; }
    private static android.view.animation.AnimationUtils.AnimationTime getAnimationTime$ravenwood() { return null; }
    public static android.view.animation.Animation loadAnimation(android.content.Context p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    public static android.view.animation.Interpolator loadInterpolator(android.content.Context p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    public static android.view.animation.Interpolator loadInterpolator(android.content.res.Resources p0, android.content.res.Resources.Theme p1, int p2) throws android.content.res.Resources.NotFoundException { return null; }
    public static android.view.animation.LayoutAnimationController loadLayoutAnimation(android.content.Context p0, int p1) throws android.content.res.Resources.NotFoundException { return null; }
    public static void lockAnimationClock(long p0, long p1) {}
    public static android.view.animation.Animation makeInAnimation(android.content.Context p0, boolean p1) { return null; }
    public static android.view.animation.Animation makeInChildBottomAnimation(android.content.Context p0) { return null; }
    public static android.view.animation.Animation makeOutAnimation(android.content.Context p0, boolean p1) { return null; }
    public static void unlockAnimationClock() {}

    private static class AnimationState {
        boolean animationClockLocked;
        long currentVsyncTimeMillis;
        long lastReportedTimeMillis;
        private AnimationState() {}
    }

    public static class AnimationTime {
        private static final int EXTRA_SEVERE_JANK_FRAMES = 6;
        private static final long MAX_RECENT_JANK_FRAMES = 10L;
        private static final java.util.concurrent.atomic.AtomicLong sAnimationCounter = null;
        private boolean mAnimating;
        private long mAnimationId;
        private long mAnimationTime;
        private boolean mInCallbacks;
        private android.view.animation.AnimationUtils.AnimationTime.JankHistory mJankHistory;
        private long mLastFrameIntervalNanos;
        private long mLastVsyncNanos;
        private java.util.concurrent.atomic.AtomicBoolean mVsyncScheduled;
        private long mVsyncTimeOfAnimationStart;
        public AnimationTime() {}
        public long elapsedSinceAnimationStart() { return 0L; }
        public long getAnimationCounter() { return 0L; }
        public long getCurrent() { return 0L; }
        public long getCurrentNanos() { return 0L; }
        public long getLastVsyncNanos() { return 0L; }
        public void onCallbacksCompleted() {}
        public void onVsyncScheduled() {}
        void reset() {}
        public long tick(long p0, long p1) { return 0L; }

        public static class JankHistory {
            private static final int SIZE = 16;
            private final long[] mHistory = null;
            private int mLast;
            private long mTotalJank;
            public JankHistory() {}
            public void clear() {}
            public long getTotalJankOverWindow() { return 0L; }
            public boolean push(long p0, long p1) { return false; }
            public void resetMostRecent() {}
        }
    }
}

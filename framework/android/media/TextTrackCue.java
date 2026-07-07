package android.media;

class TextTrackCue extends android.media.SubtitleTrack.Cue {
    static final int ALIGNMENT_END = 202;
    static final int ALIGNMENT_LEFT = 203;
    static final int ALIGNMENT_MIDDLE = 200;
    static final int ALIGNMENT_RIGHT = 204;
    static final int ALIGNMENT_START = 201;
    private static final java.lang.String TAG = "TTCue";
    static final int WRITING_DIRECTION_HORIZONTAL = 100;
    static final int WRITING_DIRECTION_VERTICAL_LR = 102;
    static final int WRITING_DIRECTION_VERTICAL_RL = 101;
    int mAlignment;
    boolean mAutoLinePosition;
    java.lang.String mId;
    java.lang.Integer mLinePosition;
    android.media.TextTrackCueSpan[][] mLines;
    boolean mPauseOnExit;
    android.media.TextTrackRegion mRegion;
    java.lang.String mRegionId;
    int mSize;
    boolean mSnapToLines;
    java.lang.String[] mStrings;
    int mTextPosition;
    int mWritingDirection;
    TextTrackCue() { super(); }
    public java.lang.StringBuilder appendLinesToBuilder(java.lang.StringBuilder p0) { return null; }
    public java.lang.StringBuilder appendStringsToBuilder(java.lang.StringBuilder p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void onTime(long p0) {}
    public java.lang.String toString() { return null; }
}

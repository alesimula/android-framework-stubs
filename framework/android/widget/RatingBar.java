package android.widget;

public class RatingBar extends android.widget.AbsSeekBar {
    public static final java.lang.String PLURALS_MAX = "max";
    public static final java.lang.String PLURALS_RATING = "rating";
    private int mNumStars;
    private android.widget.RatingBar.OnRatingBarChangeListener mOnRatingBarChangeListener;
    private int mProgressOnStartTracking;
    public RatingBar(android.content.Context p0) { super((android.content.Context)null); }
    public RatingBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RatingBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public RatingBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private float getProgressPerStar() { return 0.0f; }
    private void updateSecondaryProgress(int p0) {}
    boolean canUserSetProgress() { return false; }
    void dispatchRatingChange(boolean p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    android.graphics.drawable.shapes.Shape getDrawableShape() { return null; }
    public int getNumStars() { return 0; }
    public android.widget.RatingBar.OnRatingBarChangeListener getOnRatingBarChangeListener() { return null; }
    public float getRating() { return 0.0f; }
    public float getStepSize() { return 0.0f; }
    public boolean isIndicator() { return false; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    void onKeyChange() {}
    protected void onMeasure(int p0, int p1) {}
    void onProgressRefresh(float p0, boolean p1, int p2) {}
    void onStartTrackingTouch() {}
    void onStopTrackingTouch() {}
    public void setIsIndicator(boolean p0) {}
    public void setMax(int p0) {}
    public void setNumStars(int p0) {}
    public void setOnRatingBarChangeListener(android.widget.RatingBar.OnRatingBarChangeListener p0) {}
    public void setRating(float p0) {}
    public void setStepSize(float p0) {}

    public static interface OnRatingBarChangeListener {
        public void onRatingChanged(android.widget.RatingBar p0, float p1, boolean p2);
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.RatingBar> {
        private int mIsIndicatorId;
        private int mNumStarsId;
        private boolean mPropertiesMapped;
        private int mRatingId;
        private int mStepSizeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.RatingBar p0, android.view.inspector.PropertyReader p1) {}
    }
}

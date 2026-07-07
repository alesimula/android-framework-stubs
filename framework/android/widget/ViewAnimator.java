package android.widget;

public class ViewAnimator extends android.widget.FrameLayout {
    boolean mAnimateFirstTime;
    boolean mFirstTime;
    android.view.animation.Animation mInAnimation;
    android.view.animation.Animation mOutAnimation;
    int mWhichChild;
    public ViewAnimator(android.content.Context p0) { super((android.content.Context)null); }
    public ViewAnimator(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void initViewAnimator(android.content.Context p0, android.util.AttributeSet p1) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public boolean getAnimateFirstView() { return false; }
    public int getBaseline() { return 0; }
    public android.view.View getCurrentView() { return null; }
    public int getDisplayedChild() { return 0; }
    public android.view.animation.Animation getInAnimation() { return null; }
    public android.view.animation.Animation getOutAnimation() { return null; }
    public void removeAllViews() {}
    public void removeView(android.view.View p0) {}
    public void removeViewAt(int p0) {}
    public void removeViewInLayout(android.view.View p0) {}
    public void removeViews(int p0, int p1) {}
    public void removeViewsInLayout(int p0, int p1) {}
    public void setAnimateFirstView(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setDisplayedChild(int p0) {}
    public void setInAnimation(android.content.Context p0, int p1) {}
    public void setInAnimation(android.view.animation.Animation p0) {}
    public void setOutAnimation(android.content.Context p0, int p1) {}
    public void setOutAnimation(android.view.animation.Animation p0) {}
    @android.view.RemotableViewMethod
    public void showNext() {}
    void showOnly(int p0) {}
    void showOnly(int p0, boolean p1) {}
    @android.view.RemotableViewMethod
    public void showPrevious() {}

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ViewAnimator> {
        private int mAnimateFirstViewId;
        private int mInAnimationId;
        private int mOutAnimationId;
        private boolean mPropertiesMapped;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ViewAnimator p0, android.view.inspector.PropertyReader p1) {}
    }
}

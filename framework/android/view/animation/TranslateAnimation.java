package android.view.animation;

public class TranslateAnimation extends android.view.animation.Animation {
    protected float mFromXDelta;
    private int mFromXType;
    protected float mFromXValue;
    protected float mFromYDelta;
    private int mFromYType;
    protected float mFromYValue;
    private int mParentWidth;
    protected float mToXDelta;
    private int mToXType;
    protected float mToXValue;
    protected float mToYDelta;
    private int mToYType;
    protected float mToYValue;
    private int mWidth;
    public TranslateAnimation(float p0, float p1, float p2, float p3) { super(); }
    public TranslateAnimation(int p0, float p1, int p2, float p3, int p4, float p5, int p6, float p7) { super(); }
    public TranslateAnimation(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    private boolean endsXEnclosedWithinParent() { return false; }
    private boolean isSlideInLeft() { return false; }
    private boolean isSlideInRight() { return false; }
    private boolean isSlideOutLeft() { return false; }
    private boolean isSlideOutRight() { return false; }
    private boolean startsXEnclosedWithinParent() { return false; }
    protected void applyTransformation(float p0, android.view.animation.Transformation p1) {}
    public void initialize(int p0, int p1, int p2, int p3) {}
    public boolean isFullWidthTranslate() { return false; }
    public boolean isXAxisTransition() { return false; }
}

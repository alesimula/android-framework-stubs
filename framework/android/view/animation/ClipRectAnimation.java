package android.view.animation;

public class ClipRectAnimation extends android.view.animation.Animation {
    private int mFromBottomType;
    private float mFromBottomValue;
    private int mFromLeftType;
    private float mFromLeftValue;
    protected final android.graphics.Rect mFromRect = null;
    private int mFromRightType;
    private float mFromRightValue;
    private int mFromTopType;
    private float mFromTopValue;
    private int mToBottomType;
    private float mToBottomValue;
    private int mToLeftType;
    private float mToLeftValue;
    protected final android.graphics.Rect mToRect = null;
    private int mToRightType;
    private float mToRightValue;
    private int mToTopType;
    private float mToTopValue;
    public ClipRectAnimation(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) { super(); }
    public ClipRectAnimation(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public ClipRectAnimation(android.graphics.Rect p0, android.graphics.Rect p1) { super(); }
    protected void applyTransformation(float p0, android.view.animation.Transformation p1) {}
    public void initialize(int p0, int p1, int p2, int p3) {}
    public boolean willChangeTransformationMatrix() { return false; }
}

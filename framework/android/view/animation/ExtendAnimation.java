package android.view.animation;

public class ExtendAnimation extends android.view.animation.Animation {
    private int mFromBottomType;
    private float mFromBottomValue;
    protected android.graphics.Insets mFromInsets;
    private int mFromLeftType;
    private float mFromLeftValue;
    private int mFromRightType;
    private float mFromRightValue;
    private int mFromTopType;
    private float mFromTopValue;
    private int mToBottomType;
    private float mToBottomValue;
    protected android.graphics.Insets mToInsets;
    private int mToLeftType;
    private float mToLeftValue;
    private int mToRightType;
    private float mToRightValue;
    private int mToTopType;
    private float mToTopValue;
    public ExtendAnimation(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) { super(); }
    public ExtendAnimation(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public ExtendAnimation(android.graphics.Insets p0, android.graphics.Insets p1) { super(); }
    protected void applyTransformation(float p0, android.view.animation.Transformation p1) {}
    public int getExtensionEdges() { return 0; }
    public void initialize(int p0, int p1, int p2, int p3) {}
    public boolean willChangeTransformationMatrix() { return false; }
}

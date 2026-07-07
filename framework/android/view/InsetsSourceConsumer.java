package android.view;

public class InsetsSourceConsumer {
    protected static final int ANIMATION_STATE_HIDE = 2;
    protected static final int ANIMATION_STATE_NONE = 0;
    protected static final int ANIMATION_STATE_SHOW = 1;
    private static final java.lang.String TAG = "InsetsSourceConsumer";
    protected int mAnimationState;
    protected final android.view.InsetsController mController = null;
    private boolean mHasViewFocusWhenWindowFocusGain;
    private boolean mHasWindowFocus;
    private final int mId = 0;
    private android.graphics.Rect mPendingFrame;
    private android.graphics.Rect mPendingVisibleFrame;
    private android.view.InsetsSourceControl mSourceControl;
    protected final android.view.InsetsState mState = null;
    private android.view.InsetsAnimationControlRunner.SurfaceParamsApplier mSurfaceParamsApplier;
    private final android.graphics.Matrix mTmpMatrix = null;
    private final int mType = 0;
    public InsetsSourceConsumer(int p0, int p1, android.view.InsetsState p2, android.view.InsetsController p3) {}
    private void applyRequestedVisibilityAndPositionToControl() {}
    private boolean isRequestedVisible() { return false; }
    public boolean applyLocalVisibilityOverride() { return false; }
    void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public android.view.InsetsSourceControl getControl() { return null; }
    int getId() { return 0; }
    int getType() { return 0; }
    boolean hasViewFocusWhenWindowFocusGain() { return false; }
    public boolean onAnimationStateChanged(boolean p0) { return false; }
    public void onPerceptible(boolean p0) {}
    public void onWindowFocusGained(boolean p0) {}
    public void onWindowFocusLost() {}
    public void removeSurface() {}
    public boolean setControl(android.view.InsetsSourceControl p0, int[] p1, int[] p2, int[] p3, int[] p4) { return false; }
    void setSurfaceParamsApplier(android.view.InsetsAnimationControlRunner.SurfaceParamsApplier p0) {}
    public void updateSource(android.view.InsetsSource p0, int p1) {}
}

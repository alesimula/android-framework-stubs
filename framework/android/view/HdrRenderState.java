package android.view;

class HdrRenderState implements java.util.function.Consumer<android.view.Display> {
    private static final float TRANSITION_PER_MS = 0.009999999776482582f;
    private float mDesiredHdrSdrRatio;
    private boolean mIsHdrEnabled;
    private boolean mIsListenerRegistered;
    private long mLastUpdateMillis;
    private float mPreviousRenderRatio;
    private float mRenderHdrSdrRatio;
    private float mTargetDesiredHdrSdrRatio;
    private float mTargetHdrSdrRatio;
    private boolean mUpdateHdrSdrRatioInfo;
    private final android.view.ViewRootImpl mViewRoot = null;
    HdrRenderState(android.view.ViewRootImpl p0) {}
    public void accept(android.view.Display p0) {}
    void forceUpdateHdrSdrRatio() {}
    float getDesiredHdrSdrRatio() { return 0.0f; }
    float getRenderHdrSdrRatio() { return 0.0f; }
    boolean isHdrEnabled() { return false; }
    void setDesiredHdrSdrRatio(boolean p0, float p1) {}
    void startListening() {}
    void stopListening() {}
    boolean updateForFrame(long p0) { return false; }
}
